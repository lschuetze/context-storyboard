package de.larsschuetze.storyboard.runtime.library;

// ev : TokenEvent [ev.size > 50]
public abstract class Guard<T, R> {

	private String methodName;

	// TODO
	public void setMethod(String methodName) {
		this.methodName = methodName;
	}

	public boolean genericAccept(Event<?> event, Class<?> eventClazz) {
		if (eventClazz.isAssignableFrom(event.getEventClazz())) {
			@SuppressWarnings("unchecked")
			Event<T> castedEvent = Event.class.cast(event);
			return accept(castedEvent);
		}
		return false;
	}

	public boolean accept(Event<T> event) {
		R methodResult = event.<R> callMethod(methodName);
		if (methodResult != null) {
			return checkConstraint(methodResult);
		}
		return false;
	}

	public abstract boolean checkConstraint(R methodResult);

}
