package de.larsschuetze.storyboard.runtime.library;

public class DecisionNode extends ControlNode {

	@Override
	public void consume(Token token) {
		for (Transition out : outgoingTransitions) {
			runtime.yield(token, out);
		}
	}

	/**
	 * The decision node has two outgoing transition whose guards are true and
	 * false. Both are getting the result and only one must fire.
	 */
	@Override
	public boolean addOutgoingTransition(Transition transition) {
		if (outgoingTransitions.size() < 2) {
			return super.addOutgoingTransition(transition);
		}
		return false;
	}

}
