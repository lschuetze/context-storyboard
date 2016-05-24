package de.larsschuetze.storyboard.runtime.library;

public class MatchActivity extends Activity {

	private Matcher matcher;
	private Adapter adapter;
	private Token currentToken;

	public MatchActivity(Matcher matcher, Adapter adapter) {
		this.matcher = matcher;
		this.adapter = adapter;
	}

	@Override
	public void execute() {
		if (matcher.execute(runtime.getModelInstanceQuery())) {
			adapt();
			fireSuccess(currentToken);
		} else {
			fireFailure(currentToken);
		}
	}

	private void adapt() {
		adapter.adapt(matcher.getMatchResult(),
				runtime.getModelInstanceAdapter(),
				runtime.getModelInstanceQuery());
	}

	@Override
	public void consume(Token token) {
		currentToken = token;
		execute();
	}
}
