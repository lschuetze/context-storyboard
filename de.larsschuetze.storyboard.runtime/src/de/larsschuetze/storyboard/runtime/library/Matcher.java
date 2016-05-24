package de.larsschuetze.storyboard.runtime.library;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import de.larsschuetze.storyboard.manager.roles.IQueryModelInstance;
import de.larsschuetze.storyboard.model.crom.crom_l0.Player;

public abstract class Matcher {

	protected Player matchResult;
	protected Map<String, Map<String, List<String>>> adaptionActions;

	public abstract boolean execute(IQueryModelInstance query);

	protected void setMatchResult(Player matchResult) {
		this.matchResult = matchResult;
	}

	public Player getMatchResult() {
		return matchResult;
	}

	protected void putAdaptionAction(String adaptionType,
			String compartmentType, String roleType) {
		Map<String, List<String>> adaption = adaptionActions.get(adaptionType);
		if (adaption == null) {
			adaption = new HashMap<>();
		}
		List<String> adaptedRoles = adaption.get(compartmentType);
		if (adaptedRoles == null) {
			adaptedRoles = new LinkedList<>();
		}
		adaptedRoles.add(roleType);
		adaption.put(compartmentType, adaptedRoles);
	}
}
