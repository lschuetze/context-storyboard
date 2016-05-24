package de.larsschuetze.storyboard.runtime.library;

import de.larsschuetze.storyboard.manager.roles.IAdaptModelInstance;
import de.larsschuetze.storyboard.manager.roles.IQueryModelInstance;
import de.larsschuetze.storyboard.model.crom.crom_l0.Player;

public abstract class Adapter {

	public abstract void adapt(Player adaptee,
			IAdaptModelInstance adaption, IQueryModelInstance query);
}
