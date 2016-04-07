package de.larsschuetze.storyboard.library;


public abstract class Event<T> {

	protected String eventType;
	protected Class<T> eventClazz;

	public Event(String eventType, Class<T> eventClazz) {
		this.eventType = eventType;
		this.eventClazz = eventClazz;
	}

	public abstract <R> R callMethod(String methodName);

	public String getEventType() {
		return eventType;
	}
	
	public Class<T> getEventClazz() {
		return eventClazz;
	}
}
