package de.larsschuetze.storyboard.execution;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.larsschuetze.storyboard.library.Event;
import de.larsschuetze.storyboard.library.Storyboard;
import de.larsschuetze.storyboard.library.StoryboardElement;
import de.larsschuetze.storyboard.library.Token;
import de.larsschuetze.storyboard.library.execution.AdaptionManager;
import de.larsschuetze.storyboard.library.execution.EventManager;
import de.larsschuetze.storyboard.library.execution.TokenManager;

public class ExecutionManager {

	private static final Logger logger = LogManager
			.getLogger(ExecutionManager.class);

	private AdaptionManager adaptionManager;
	private EventManager eventManager;
	private TokenManager tokenManager;
	private Map<Token, StoryboardElement> nextTokenLocations;
	private Map<Token, StoryboardElement> lastTokenLocations;
	private Queue<Token> executionQueue;
	private volatile boolean isRunning;

	public ExecutionManager(EventManager eventManager) {
		this.nextTokenLocations = new HashMap<>();
		this.lastTokenLocations = new HashMap<>();
		this.tokenManager = new TokenManager(eventManager);
		this.eventManager = eventManager;
		this.adaptionManager = new AdaptionManager();
		// Switch to priority queue when event management is implemented
		this.executionQueue = new LinkedList<>();
		this.isRunning = false;
	}

	public void nextOperation() {
		Token nextToken = executionQueue.poll();
		if (!nextToken.isStalled()) {
			// Check if removal is needed
			StoryboardElement nextElement = nextTokenLocations.get(nextToken);
			logger.debug("Next: " + nextElement);
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
	}
}
