package de.larsschuetze.storyboard.manager.roles;

import de.larsschuetze.storyboard.model.crom.crom_l0.Compartment;
import de.larsschuetze.storyboard.model.crom.crom_l0.NaturalType;
import de.larsschuetze.storyboard.model.crom.crom_l0.Player;
import de.larsschuetze.storyboard.model.crom.crom_l0.Role;

public interface IAdaptModelInstance {

	public Compartment newCompartment(String compartmentType, Object... args);

	public Role newRole(String roleType, Object... args);

	public NaturalType newNatural(String nt, Object... args);

	// public boolean migrate(Role role, Compartment compartment);

	public boolean bind(Player player, Role role, Compartment compartment);

	public boolean unbind(Role role);
}
