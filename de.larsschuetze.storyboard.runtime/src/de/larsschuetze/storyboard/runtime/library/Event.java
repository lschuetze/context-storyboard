package de.larsschuetze.storyboard.runtime.library;


public class Event {

	protected Object eventObject;
	protected Class<?> eventClass;

	public Event(Class<?> eventClass, Object eventObject) {
		this.eventObject = eventObject;
		this.eventClass = eventClass;
	}

	public Object getEventObject() {
		return eventObject;
	}
	
	public Class<?> getEventClass() {
		return eventClass;
	}
}
