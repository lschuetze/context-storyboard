package de.larsschuetze.storyboard.library;

public class ForkNode extends ControlNode {

	@Override
	public void consume(Token token) {
		for (Transition out : outgoingTransitions) {
			// multiply token for every outgoing transition
			runtime.yield(token.copy(), out);
		}
	}
}
