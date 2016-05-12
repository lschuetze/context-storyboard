package de.larsschuetze.storyboard.runtime.execution;

import de.larsschuetze.storyboard.runtime.library.Guard;

public class TestGuard extends Guard<TestClass, Integer> {

	public TestGuard(String methodName) {
		this.setMethod(methodName);
	}

	@Override
	public boolean checkConstraint(Integer methodResult) {
		return methodResult < 50;
	}

}
