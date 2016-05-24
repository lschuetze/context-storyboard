package de.larsschuetze.storyboard.runtime.library;

public abstract class Activity extends Node {

	protected Node successNode;
	protected Node failureNode;

	public abstract void execute();

	public Node getSuccessNode() {
		if (successNode == null) {
			successNode = new Node() {
				@Override
				public void consume(Token token) {
					fire(token);
				}
			};
		}
		return successNode;
	}

	public Node getFailNode() {
		if (failureNode == null) {
			failureNode = new Node() {
				@Override
				public void consume(Token token) {
					fire(token);
				}
			};
		}
		return failureNode;
	}

	@Override
	public boolean addOutgoingTransition(Transition transition) {
		throw new UnsupportedOperationException(
				"You should not use this operation on Activities.");
	}

	@Override
	/**
	 * Please use fireSuccess(Token) or fireFailure(Token) instead!
	 */
	protected void fire(Token token) {
		throw new UnsupportedOperationException(
				"You should not use this operation on Activities.");
	}

	protected void fireSuccess(Token token) {
		successNode.setRuntimeManager(runtime);
		successNode.fire(token);
	}

	protected void fireFailure(Token token) {
		failureNode.setRuntimeManager(runtime);
		failureNode.fire(token);
	}
}
