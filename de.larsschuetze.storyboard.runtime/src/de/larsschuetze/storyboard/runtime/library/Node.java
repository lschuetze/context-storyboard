package de.larsschuetze.storyboard.runtime.library;

import java.util.HashSet;
import java.util.Set;

public abstract class Node extends StoryboardElement {


	protected Set<Transition> incomingTransitions;
	protected Set<Transition> outgoingTransitions;

	public Node() {
		incomingTransitions = new HashSet<>();
		outgoingTransitions = new HashSet<>();
	}

	public boolean addIncomingTransition(Transition transition) {
		return incomingTransitions.add(transition);
	}

	public boolean addOutgoingTransition(Transition transition) {
		return outgoingTransitions.add(transition);
	}

	protected void fire(Token token) {
		if (outgoingTransitions.size() > 1) {
			for (Transition out : outgoingTransitions) {
				runtime.yield(token.copy(), out);
			}
		} else {
			Transition target = outgoingTransitions.iterator().next();
			runtime.yield(token, target);
		}

	}
}
