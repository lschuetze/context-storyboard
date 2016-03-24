package de.larsschuetze.storyboard.execution;

import de.larsschuetze.storyboard.library.Guard;

public class TestGuard extends Guard {

	@Override
	public boolean checkConstraint(Object methodResult) {
		if (methodResult instanceof Integer) {
			int i = ((Integer) methodResult);
			logger.debug("Int i = " + i);
			return i < 50;
		}
		return false;
	}

}
