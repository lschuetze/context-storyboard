package de.larsschuetze.storyboard.library;

public class MergeNode extends ControlNode {

	@Override
	public void consume(Token token) {
		Transition target = outgoingTransitions.iterator().next();
		runtime.yield(token, target);
	}

}
