package de.larsschuetze.storyboard.library;

public class MergeNode extends ControlNode {

	@Override
	public void consume(Token token) {
		Transition target = outgoingTransitions.iterator().next();
		runtime.yield(token, target);
	}

	@Override
	public boolean addOutgoingTransition(Transition transition) {
		if (outgoingTransitions.size() == 0) {
			return super.addOutgoingTransition(transition);
		}
		return false;
	}
}
