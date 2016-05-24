package de.larsschuetze.storyboard.runtime.library;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import de.larsschuetze.storyboard.manager.roles.IAdaptModelInstance;
import de.larsschuetze.storyboard.manager.roles.IQueryModelInstance;
import de.larsschuetze.storyboard.model.crom.crom_l0.Compartment;
import de.larsschuetze.storyboard.model.crom.crom_l0.Player;
import de.larsschuetze.storyboard.model.crom.crom_l0.Role;

public abstract class Adapter {

	protected Map<String, List<String>> additions;
	protected Map<String, List<String>> removals;
	private IAdaptModelInstance adaption;
	private IQueryModelInstance query;

	public Adapter() {
		additions = new HashMap<>();
		removals = new HashMap<>();
	}

	protected void setAdaption(IAdaptModelInstance adaption) {
		this.adaption = adaption;
	}

	protected void setQuery(IQueryModelInstance query) {
		this.query = query;
	}

	public void adapt(Player adaptee) {
		for (Map.Entry<String, List<String>> entry : additions.entrySet()) {
			for (Compartment c : query.getCompartments(entry.getKey())) {
				for (String roleName : entry.getValue()) {
					Role r = adaption.newRole(roleName);
					adaption.bind(adaptee, r, c);
				}
			}
		}

		for (Role r : findRemovals(adaptee)) {
			adaption.unbind(r);
		}
	}

	protected void putAddition(String compartment, String role) {
		List<String> roles = additions.get(compartment);
		if (roles == null) {
			roles = new LinkedList<>();
		}
		roles.add(role);
		additions.put(compartment, roles);
	}

	protected void putRemoval(String compartment, String role) {
		List<String> roles = removals.get(compartment);
		if (roles == null) {
			roles = new LinkedList<>();
		}
		roles.add(role);
		removals.put(compartment, roles);
	}

	protected List<Role> findRemovals(Player p) {
		List<Role> result = new LinkedList<>();
		for (Map.Entry<String, List<String>> entry : removals.entrySet()) {
			for (Compartment c : query.getCompartments(entry.getKey())) {
				for (Role r : query.getRoleByCompartment(c)) {
					if (entry.getValue().contains(r.getRoleType())) {
						result.add(r);
					}
				}
			}
		}
		return result;
	}
}
