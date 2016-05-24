package de.larsschuetze.storyboard.runtime.library;

// ev : TokenEvent [ev.size > 50]
public abstract class Guard {

	public boolean genericAccept(Event event) {
		return accept(event);
	}

	public abstract boolean accept(Event event);
}
