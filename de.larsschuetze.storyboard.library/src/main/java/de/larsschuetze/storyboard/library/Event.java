package de.larsschuetze.storyboard.library;

import de.larsschuetze.storyboard.library.execution.EventManager;

public abstract class Event {

	private String eventType;

	public Event(String eventType) {
		this.eventType = eventType;
	}

	public abstract Object callMethod(String methodName);

	public String getEventType() {
		return eventType;
	}
}
