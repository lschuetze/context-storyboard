package de.larsschuetze.storyboard.library;

import de.larsschuetze.storyboard.execution.ExecutionManager;

public abstract class StoryboardElement implements NamedElement {

	private String name;
	protected ExecutionManager runtime;

	public abstract void consume(Token token);

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " : " + name;
	}

	public void setRuntimeManager(ExecutionManager runtime) {
		this.runtime = runtime;
	}
}
