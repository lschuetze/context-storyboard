package de.larsschuetze.storyboard.model.crom.crom_l0;

public class Compartment extends Player {

	private String compartmentType;

	public Compartment(String compartmentType) {
		super();
		this.compartmentType = compartmentType;
	}
	
	public String getCompartmentType() {
		return compartmentType;
	}
}
