package de.larsschuetze.storyboard.library.util;

import java.util.List;
import java.util.Set;

public interface IAdaption1<O, C extends O, R, N extends O> {

	public C newCompartment(String ct, Object... args);

	public C newCompartment(Class<?> c, Object... args);

	public R newRole(String rt, Object... args);

	public R newRole(Class<?> clazz, Object... args);

	public N newNatural(String nt, Object... args);

	public N newNatural(Class<?> clazz, Object... args);

	public boolean link(String relationshipType, C compartment, R first,
			R second);

	public boolean unlink(String relationshipType, C compartment, R first,
			R second);

	public Set<R> navigateFrom(String relationshipType, C compartment, R role);

	public Object invoke(O player, String method, Object... args);

	public Object invoke(O player, C compartment, String method, Object... args);

	public Object invoke(O player, R role, C compartment, String method,
			Object... args);

	public Object invoke(O player, String roleType, C compartment,
			String method, Object... args);

//	public boolean transfer(R role, O player);
//
//	public boolean migrate(R role, C compartment);
//
//	public boolean bind(O player, R role, C compartment);
//
//	public boolean unbind(R role);
//
//	public O getPlayer(R role);
//
//	public C getCompartment(R role);
//
//	public List<R> getRoleByCompartment(C compartment);
//
//	public List<R> getRoleByPlayer(O player);
//
//	public List<R> getPlayedRoles(O player, C compartment);
}
