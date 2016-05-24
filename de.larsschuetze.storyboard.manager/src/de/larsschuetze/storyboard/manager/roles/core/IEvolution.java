package de.larsschuetze.storyboard.manager.roles.core;


public interface IEvolution {

	public boolean register(EKind kind, String t, Class<?> clazz);

	// public Class<?> get(EKind kind,String t);

	// public Set<String> getRoleTypes();

	// public Set<String> getRelationshipTypes();

	// public Set<String> getCompartmentTypes();

	public boolean relate(String rst, String roleType1, String roleType2);

	public boolean fill(String clazz, String roleType);

	public boolean fills(String clazz, String roleType);

	public void playedby(String roleType, String... classes);

	public void filledby(String clazz, String... roleTypes);

	public boolean part(String compartmentType, String roleType);

	public boolean partof(String compartmentType, String roleType);

}
