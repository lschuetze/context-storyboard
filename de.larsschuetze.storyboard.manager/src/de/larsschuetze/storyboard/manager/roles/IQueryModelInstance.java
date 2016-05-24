package de.larsschuetze.storyboard.manager.roles;

import java.util.List;
import java.util.Set;

import de.larsschuetze.storyboard.model.crom.crom_l0.Compartment;
import de.larsschuetze.storyboard.model.crom.crom_l0.Player;
import de.larsschuetze.storyboard.model.crom.crom_l0.Role;

public interface IQueryModelInstance { //<O, C extends O, R, N extends O> {
	
	public boolean plays(Player player, Role role, Compartment compartment);

	public Set<Player> getPlayers();
	
	public Set<Player> getPlayers(String className);

	public Set<Compartment> getCompartments();
	
	public Set<Compartment> getCompartments(String compartmentType);

	public Set<Role> getRoles();
	
	public Set<Role> getRoles(String roleType);

	public Player getPlayer(Role role);

	public Compartment getCompartment(Role role);

	public List<Role> getRoleByCompartment(Compartment compartment);

	public List<Role> getRoleByPlayer(Player player);

	public List<Role> getPlayedRoles(Player player, Compartment compartment);
}
