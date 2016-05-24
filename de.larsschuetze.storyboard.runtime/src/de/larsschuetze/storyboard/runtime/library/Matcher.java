package de.larsschuetze.storyboard.runtime.library;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.larsschuetze.storyboard.manager.roles.IQueryModelInstance;
import de.larsschuetze.storyboard.model.crom.crom_l0.Compartment;
import de.larsschuetze.storyboard.model.crom.crom_l0.Player;
import de.larsschuetze.storyboard.model.crom.crom_l0.Role;

public abstract class Matcher {

	protected Player matchResult;
	protected Map<String, List<String>> requiredRoles;
	protected Map<String, List<String>> prohibitedRoles;
	protected IQueryModelInstance query;

	public Matcher() {
		requiredRoles = new HashMap<>();
		prohibitedRoles = new HashMap<>();
	}
	
	public void setQuery(IQueryModelInstance query) {
		this.query = query;
	}

	public abstract boolean execute();

	protected void setMatchResult(Player matchResult) {
		this.matchResult = matchResult;
	}

	public Player getMatchResult() {
		return matchResult;
	}

	protected void putProhibition(String compartmentType, String roleType) {
		List<String> roles = prohibitedRoles.get(compartmentType);
		if (roles == null) {
			roles = new LinkedList<>();
		}
		roles.add(roleType);
		prohibitedRoles.put(compartmentType, roles);
	}

	protected void putRequirement(String compartmentType, String roleType) {
		List<String> roles = requiredRoles.get(compartmentType);
		if (roles == null) {
			roles = new LinkedList<>();
		}
		roles.add(roleType);
		requiredRoles.put(compartmentType, roles);
	}

	protected Set<Player> getCandidates(String className) {
		Set<Player> removeCandidates = new HashSet<>();
		Set<Player> candidates = new HashSet<>();
		// check all players of the same class type
		for (Player player : query.getPlayers(className)) {
			for (Map.Entry<String, List<String>> entry : prohibitedRoles
					.entrySet()) {
				// get all compartments of the compartment type
				for (Compartment compartment : query.getCompartments(entry
						.getKey())) {
					for (Role role : query.getRoleByCompartment(compartment)) {
						// check if that role is prohibited
						if (entry.getValue().contains(role.getRoleType())) {
							if (!query.plays(player, role, compartment)) {
								candidates.add(player);
							} else {
								removeCandidates.add(player);
							}
						}
					}
				}
			}
		}
		candidates.removeAll(removeCandidates);
		return candidates;
	}

	protected Set<Player> getMatchingPlayers(Set<Player> candidates) {
		Set<Player> removeResult = new HashSet<>();
		Set<Player> result = new HashSet<>();
		for (Player player : candidates) {
			for (Map.Entry<String, List<String>> entry : requiredRoles
					.entrySet()) {
				for (Compartment compartment : query.getCompartments(entry
						.getKey())) {
					for (Role role : query.getRoleByCompartment(compartment)) {
						if (entry.getValue().contains(role.getRoleType())) {
							if (query.plays(player, role, compartment)) {
								result.add(player);
							} else {
								removeResult.add(player);
							}
						}
					}
				}
			}
		}
		result.removeAll(removeResult);
		return result;
	}

	// protected void putAdaptionAction(String adaptionType,
	// String compartmentType, String roleType) {
	// Map<String, List<String>> adaption = adaptionActions.get(adaptionType);
	// if (adaption == null) {
	// adaption = new HashMap<>();
	// }
	// List<String> adaptedRoles = adaption.get(compartmentType);
	// if (adaptedRoles == null) {
	// adaptedRoles = new LinkedList<>();
	// }
	// adaptedRoles.add(roleType);
	// adaption.put(compartmentType, adaptedRoles);
	// }
}
