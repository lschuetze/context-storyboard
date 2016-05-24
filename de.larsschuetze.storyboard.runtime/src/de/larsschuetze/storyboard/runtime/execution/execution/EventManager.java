package de.larsschuetze.storyboard.runtime.execution.execution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.larsschuetze.storyboard.runtime.library.Event;
import de.larsschuetze.storyboard.runtime.library.Token;

public class EventManager {

	// private Map<String, List<Event>> registeredEvents;
	/**
	 * Tokens that are awaiting a special event in order to progress further.
	 * Those tokens are waiting at transitions that require a special event to
	 * be fired.
	 */
	private Map<String, List<Token>> waitingTokens;
	private List<Event> waitingEvents;

	public EventManager() {
		// registeredEvents = new HashMap<>();
		waitingTokens = new HashMap<>();
		waitingEvents = new ArrayList<>();
	}

	// public void register(Event event, String eventType) {
	// List<Event> events = new ArrayList<>();
	// if (registeredEvents.containsKey(eventType)) {
	// events = registeredEvents.get(eventType);
	// }
	// events.add(event);
	// registeredEvents.put(eventType, events);
	// }

	public void eventOccurance(Event event) {
		System.out.println("Event occured: " + event);
		String eventTypeName = event.getEventClass().getName();
		final List<Token> tokens = waitingTokens.get(eventTypeName);
		if (tokens != null) {
			for (Token token : tokens) {
				token.setStalled(false);
				token.carryEvent(event);
			}
		} else {
			waitingEvents.add(event);
		}
		waitingTokens.remove(eventTypeName);
	}

	public void addWaitingToken(String eventType, Token token) {
		List<Token> tokens = waitingTokens.get(eventType);
		if (tokens == null) {
			tokens = new ArrayList<>();
		}
		tokens.add(token);
		waitingTokens.put(eventType, tokens);
	}

	public void shutdown() {
		waitingTokens.clear();
		waitingEvents.clear();
	}

	public void lookForStaleEvents() {
		for (Event e : waitingEvents) {
			String eventName = e.getEventClass().getName();
			final List<Token> tokens = waitingTokens.get(eventName);
			if (tokens != null) {
				for (Token token : tokens) {
					token.setStalled(false);
					token.carryEvent(e);
				}
			}
			waitingTokens.remove(e.getEventClass().getName());
		}
	}
}
