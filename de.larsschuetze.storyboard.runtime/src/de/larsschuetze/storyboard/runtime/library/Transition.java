package de.larsschuetze.storyboard.runtime.library;

public class Transition extends StoryboardElement {

	private Node source;
	private Node target;
	private Guard guard;
	private String triggerEventType;

	public Transition(Node source, Node target) {
		this.source = source;
		this.target = target;

		source.addOutgoingTransition(this);
		target.addIncomingTransition(this);
	}
	
	public Transition(Node source, Node target, String name) {
		this(source, target);
		this.setName(name);
	}

	public void setGuard(Guard guard) {
		this.guard = guard;
	}

	@Override
	public void consume(Token token) {
		System.out.println(getName() + " consumes token " + token);
		if (triggerEventType == null || token.carriesEvent()) {
			if (guard == null
					|| guard.accept(token.getEvent())) {
				token.carryEvent(null);
				runtime.yield(token, target);
			} else {
				token.destroy();
			}
		} else {
			// reenter later when the event has been fired
			token.stallUntilEventOccurs(triggerEventType);
			runtime.yield(token, this);
		}
	}

	public void setTriggerEventType(String eventType) {
		this.triggerEventType = eventType;
	}
}
