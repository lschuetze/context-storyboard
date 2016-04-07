package de.larsschuetze.storyboard.library;

import java.math.BigInteger;

import de.larsschuetze.storyboard.library.execution.TokenManager;

public class Token implements NamedElement {

	private TokenManager manager;
	private BigInteger id;
	private String name;
	private boolean isStalled; // TODO

	private Event<?> carriedEvent;

	public Token(TokenManager manager, BigInteger id) {
		this.manager = manager;
		this.id = id;
		this.isStalled = false;
	}

	public Token copy() {
		return manager.copyToken(this);
	}

	public void destroy() {
		carriedEvent = null;
		manager.destroy(this);
	}

	public Token merge(Token token, Token... more) {
		// TODO eventually there is information that needs to be merged
		return copy();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String string) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + ", ID: " + id.toString();
	}

	public boolean isStalled() {
		return isStalled;
	}

	public void stallUntilEventOccurs(String eventType) {
		manager.setStalled(this, eventType);
	}

	public void setStalled(boolean isStalled) {
		this.isStalled = isStalled;
	}

	public void carryEvent(Event<?> event) {
		carriedEvent = event;
	}

	public boolean carriesEvent() {
		return carriedEvent != null;
	}

	public Event<?> getEvent() {
		return carriedEvent;
	}
}
