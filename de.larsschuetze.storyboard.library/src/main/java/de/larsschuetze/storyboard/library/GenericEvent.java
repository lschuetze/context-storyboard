package de.larsschuetze.storyboard.library;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import de.larsschuetze.storyboard.library.execution.EventManager;

public class GenericEvent<T> extends Event<T> {

	protected T eventObject;

	public GenericEvent(String eventType, T eventObject, Class<T> eventClazz) {
		super(eventType, eventClazz);
		this.eventObject = eventObject;
	}

	public Object getEventObject() {
		return eventObject;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <R> R callMethod(String methodName) {
		try {
			Method method = eventClazz.getMethod(methodName);
			return (R) method.invoke(eventObject);
		} catch (NoSuchMethodException | SecurityException
				| IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
}
