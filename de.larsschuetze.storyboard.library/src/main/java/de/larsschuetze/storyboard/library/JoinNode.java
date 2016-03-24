package de.larsschuetze.storyboard.library;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JoinNode extends ControlNode {

	private static final Logger logger = LogManager.getLogger(JoinNode.class);

	private Map<StoryboardElement, Token> incomingTokens;

	public JoinNode() {
		incomingTokens = new HashMap<>();
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
		// TODO check this method
		StoryboardElement lastTokenLocation = runtime
				.getLastTokenLocation(token);
		if (!incomingTokens.containsKey(lastTokenLocation)) {
			incomingTokens.put(lastTokenLocation, token);

			if (incomingTokens.entrySet().size() == incomingTransitions.size()) {
				for (Token in : incomingTokens.values()) {
					if (in != token) {
						token.merge(in);
						in.destroy();
					}
				}
				incomingTokens.clear();
				Transition target = outgoingTransitions.iterator().next();
				runtime.yield(token, target);
			}
		}
	}
}
