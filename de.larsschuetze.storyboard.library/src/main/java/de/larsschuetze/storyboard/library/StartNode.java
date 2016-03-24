package de.larsschuetze.storyboard.library;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StartNode extends Node {

	private static final Logger logger = LogManager.getLogger(StartNode.class);

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
