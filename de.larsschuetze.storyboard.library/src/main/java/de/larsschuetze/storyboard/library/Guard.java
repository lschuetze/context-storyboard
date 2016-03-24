package de.larsschuetze.storyboard.library;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// ev : TokenEvent [ev.size > 50]
public abstract class Guard {

	protected static final Logger logger = LogManager.getLogger(Guard.class);

	private String methodName;

	// TODO
	public void setMethod(String methodName) {
		this.methodName = methodName;
	}

	public boolean accept(Event event) {
		Object methodResult = event.callMethod(methodName);
		if (methodResult != null) {
			return checkConstraint(methodResult);
		}
		return false;
	}

	public abstract boolean checkConstraint(Object methodResult);

}
