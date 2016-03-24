package de.larsschuetze.storyboard.library.execution;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import de.larsschuetze.storyboard.library.Token;

public class TokenManager {

	private Set<Token> tokens;
	private BigInteger nextId;
	private EventManager eventManager;

	public TokenManager(EventManager eventManager) {
		tokens = new HashSet<>();
		nextId = BigInteger.ZERO;
		// TODO implement manager registry for lookup to reduce coupling
		this.eventManager = eventManager;
	}

	public Token createToken() {
		nextId = nextId.add(BigInteger.ONE);
		Token token = new Token(this, nextId);
		tokens.add(token);
		return token;
	}

	public Token copyToken(Token token) {
		Token copy = createToken();
		// TODO copy token values
		return copy;
	}

	public void destroy(Token token) {
		// Add internal VM events about token destruction
		// so runtime can remove it (implementing listeners)
		tokens.remove(token);
	}

	public void setStalled(Token token, String eventType) {
		token.setStalled(true);
		eventManager.addWaitingToken(eventType, token);
	}
}
