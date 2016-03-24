package de.larsschuetze.storyboard.library;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EndNode extends Node {

	private static final Logger logger = LogManager.getLogger(EndNode.class);

	@Override
	public boolean addOutgoingTransition(Transition transition) {
		throw new IllegalArgumentException(
				"An EndNode cannot have outgoing edges but found " + transition);
	}

	@Override
	public void consume(Token token) {
		token.destroy();
		// TODO If there are Activity Groups this should make the activity group
		// end and not the whole program
		runtime.stop();
	}
}
