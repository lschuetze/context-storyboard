package de.larsschuetze.storyboard.runtime.library;

public class StartNode extends Node {

	@Override
	public boolean addIncomingTransition(Transition transition) {
		throw new IllegalArgumentException(
				"A StartNode cannot have incoming edges but found "
						+ transition);
	}

	@Override
	public boolean addOutgoingTransition(Transition transition) {
		if (outgoingTransitions.size() == 0) {
			return outgoingTransitions.add(transition);
		}
		return false;
	}

	@Override
	public void consume(Token token) {
		Transition target = outgoingTransitions.iterator().next();
		runtime.yield(token, target);
	}
}
