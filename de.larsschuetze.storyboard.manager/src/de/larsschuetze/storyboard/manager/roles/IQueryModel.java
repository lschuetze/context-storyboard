package de.larsschuetze.storyboard.manager.roles;

import java.util.Set;

import de.larsschuetze.storyboard.manager.roles.core.EKind;

public interface IQueryModel {
	public Class<?> get(EKind kind, String t);

	public Set<String> getRoleTypes();

	// public Set<String> getRelationshipTypes();

	public Set<String> getCompartmentTypes();

	// public boolean isRelated(String relationshipType, String roleType1,
	// String roleType2);
}
