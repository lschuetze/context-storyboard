package de.larsschuetze.storyboard.runtime.library;

public class MatchActivity extends Activity {

	private Matcher matcher;
	private Token currentToken;

	public MatchActivity(Matcher matcher) {
		this.matcher = matcher;
	}

	@Override
	public void execute() {
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
