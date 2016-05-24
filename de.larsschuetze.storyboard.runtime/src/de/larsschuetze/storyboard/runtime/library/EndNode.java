package de.larsschuetze.storyboard.runtime.library;

public class EndNode extends Node {

	@Override
	public boolean addOutgoingTransition(Transition transition) {
		throw new IllegalArgumentException(
				"An EndNode cannot have outgoing edges but found " + transition);
	}

	@Override
	public void consume(Token token) {
		System.out.println("EndNode consume");
		token.destroy();
		// TODO If there are Activity Groups this should make the activity group
		// end and not the whole program
		runtime.stop();
	}
}
