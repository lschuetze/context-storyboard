package de.larsschuetze.storyboard.library;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import de.larsschuetze.storyboard.library.execution.EventManager;

public class GenericEvent extends Event {

	protected Object eventObject;
	protected Class<?> eventObjectClass;

	public GenericEvent(String eventType, Object eventObject,
			Class<?> eventObjectClass) {
		super(eventType);
		this.eventObject = eventObject;
		this.eventObjectClass = eventObjectClass;
	}

	public Object getEventObject() {
		return eventObject;
	}

	public Class<?> getEventObjectClass() {
		return eventObjectClass;
	}

	@Override
	public Object callMethod(String methodName) {
		Object result = null;
		try {
			Method method = eventObjectClass.getMethod(methodName);
			result = method.invoke(eventObject);
		} catch (NoSuchMethodException | SecurityException
				| IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		return result;
	}
}
