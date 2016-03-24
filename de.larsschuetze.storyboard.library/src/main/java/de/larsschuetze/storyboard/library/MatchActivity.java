package de.larsschuetze.storyboard.library;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MatchActivity extends Activity {

	private static final Logger logger = LogManager
			.getLogger(MatchActivity.class);

	private Matcher matcher;
	private Token currentToken;

	public MatchActivity(Matcher matcher) {
		this.matcher = matcher;
	}

	@Override
	public void execute() {
		logger.debug("Execute");
		if (matcher.execute()) {
			fire(currentToken);
		} else {
			currentToken.destroy();
		}
		currentToken = null;
	}

	@Override
	public void consume(Token token) {
		currentToken = token;
		execute();
	}
}
