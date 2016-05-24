package de.larsschuetze.storyboard.runtime.execution;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import de.larsschuetze.storyboard.manager.roles.IAdaptModelInstance;
import de.larsschuetze.storyboard.manager.roles.IQueryModelInstance;
import de.larsschuetze.storyboard.runtime.execution.execution.EventManager;
import de.larsschuetze.storyboard.runtime.execution.execution.TokenManager;
import de.larsschuetze.storyboard.runtime.library.Storyboard;
import de.larsschuetze.storyboard.runtime.library.StoryboardElement;
import de.larsschuetze.storyboard.runtime.library.Token;

public class ExecutionManager {

	private EventManager eventManager;
	private TokenManager tokenManager;
	private Map<Token, StoryboardElement> nextTokenLocations;
	private Map<Token, StoryboardElement> lastTokenLocations;
	private IQueryModelInstance modelInstanceQuery;
	private IAdaptModelInstance adaptModelInstance;
	private Queue<Token> executionQueue;
	private volatile boolean isRunning;

	public ExecutionManager(IQueryModelInstance modelInstanceQuery,
			IAdaptModelInstance adaptModelInstance) {
		this.nextTokenLocations = new HashMap<>();
		this.lastTokenLocations = new HashMap<>();
		this.modelInstanceQuery = modelInstanceQuery;
		this.adaptModelInstance = adaptModelInstance;
		this.eventManager = new EventManager();
		this.tokenManager = new TokenManager(eventManager);
		// Switch to priority queue later
		this.executionQueue = new LinkedList<>();
		this.isRunning = false;
	}

	public void nextOperation() {
		eventManager.lookForStaleEvents();
		Token nextToken = executionQueue.poll();
		if (!nextToken.isStalled()) {
			// Check if removal is needed
			StoryboardElement nextElement = nextTokenLocations.get(nextToken);
			// TODO remove this dependency hack
			nextElement.setRuntimeManager(this);
			nextElement.consume(nextToken);
		} else {
			// add again since the token is stalled
			executionQueue.add(nextToken);
		}
	}

	public void yield(Token token, StoryboardElement element) {
		// TODO: Should I support waiting lists at elements?
		StoryboardElement lastElement = nextTokenLocations.put(token, element);
		lastTokenLocations.put(token, lastElement);
		executionQueue.add(token);
	}

	public void execute(Storyboard storyboard) {
		System.out.println("Starting ...");
		isRunning = true;
		yield(tokenManager.createToken(), storyboard.getStartNode());
		while (!executionQueue.isEmpty() && isRunning) {
			nextOperation();
		}
		lastTokenLocations.clear();
		nextTokenLocations.clear();
		executionQueue.clear();
	}

	public StoryboardElement getLastTokenLocation(Token token) {
		return lastTokenLocations.get(token);
	}

	public void stop() {
		isRunning = false;
		System.out.println("Stopping ...");
	}

	public IQueryModelInstance getModelInstanceQuery() {
		return modelInstanceQuery;
	}

	public IAdaptModelInstance getModelInstanceAdapter() {
		return adaptModelInstance;
	}
	
	//TODO: Fassade
	public EventManager getEventManager() {
		return eventManager;
	}
}
