package de.larsschuetze.storyboard.library;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Matcher {
	
	//TODO add getMatchedObject()
	//Liefert die Objekte zurück welches im Match gefunden wurde und adaptiert werden muss

	private static final Logger logger = LogManager.getLogger(Matcher.class);

	public abstract boolean execute();
}
