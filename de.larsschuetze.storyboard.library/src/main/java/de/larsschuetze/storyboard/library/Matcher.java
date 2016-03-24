package de.larsschuetze.storyboard.library;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Matcher {

	private static final Logger logger = LogManager.getLogger(Matcher.class);

	public abstract boolean execute();
}
