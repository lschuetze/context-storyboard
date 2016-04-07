package de.larsschuetze.storyboard.execution;

import de.larsschuetze.storyboard.library.Guard;

public class TestGuard extends Guard<TestClass, Integer> {

	@Override
	public boolean checkConstraint(Integer methodResult) {
		logger.debug("Int i = " + methodResult);
		return methodResult < 50;
	}

}
