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

	public EventManager() {
		// registeredEvents = new HashMap<>();
		waitingTokens = new HashMap<>();
	}

	// public void register(Event event, String eventType) {
	// List<Event> events = new ArrayList<>();
	// if (registeredEvents.containsKey(eventType)) {
	// events = registeredEvents.get(eventType);
	// }
	// events.add(event);
	// registeredEvents.put(eventType, events);
	// }

	public void eventOccurance(Event<?> event) {
		final List<Token> tokens = waitingTokens.get(event.getEventType());
		if (tokens != null) {
			for (Token token : tokens) {
				token.setStalled(false);
				token.carryEvent(event);
			}
		}
		waitingTokens.remove(event.getEventType());
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
	}
}
