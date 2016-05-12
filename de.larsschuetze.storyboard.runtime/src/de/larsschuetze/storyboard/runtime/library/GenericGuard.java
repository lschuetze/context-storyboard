package de.larsschuetze.storyboard.runtime.library;

public class GenericGuard<T, R> extends Guard<T, R> {
	
	@Override
	public boolean checkConstraint(R methodResult) {
		return false;
	}

}
