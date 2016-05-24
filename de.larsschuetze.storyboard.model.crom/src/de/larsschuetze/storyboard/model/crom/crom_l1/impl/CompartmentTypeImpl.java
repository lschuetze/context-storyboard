/**
 */
package de.larsschuetze.storyboard.model.crom.crom_l1.impl;

import de.larsschuetze.storyboard.model.crom.crom_l1.CompartmentType;
import de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package;
import de.larsschuetze.storyboard.model.crom.crom_l1.Fulfillment;
import de.larsschuetze.storyboard.model.crom.crom_l1.ModelElement;
import de.larsschuetze.storyboard.model.crom.crom_l1.Part;
import de.larsschuetze.storyboard.model.crom.crom_l1.Player;
import de.larsschuetze.storyboard.model.crom.crom_l1.Relation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.CompartmentTypeImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.CompartmentTypeImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.CompartmentTypeImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.CompartmentTypeImpl#getFulfillments <em>Fulfillments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompartmentTypeImpl extends RelationTargetImpl implements CompartmentType {
	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> parts;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<CompartmentType> contains;

	/**
	 * The cached value of the '{@link #getFulfillments() <em>Fulfillments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillments()
	 * @generated
	 * @ordered
	 */
	protected EList<Fulfillment> fulfillments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Crom_l1Package.Literals.COMPARTMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectResolvingEList<Relation>(Relation.class, this, Crom_l1Package.COMPARTMENT_TYPE__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentWithInverseEList<Part>(Part.class, this, Crom_l1Package.COMPARTMENT_TYPE__PARTS, Crom_l1Package.PART__WHOLE);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompartmentType> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<CompartmentType>(CompartmentType.class, this, Crom_l1Package.COMPARTMENT_TYPE__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fulfillment> getFulfillments() {
		if (fulfillments == null) {
			fulfillments = new EObjectContainmentEList<Fulfillment>(Fulfillment.class, this, Crom_l1Package.COMPARTMENT_TYPE__FULFILLMENTS);
		}
		return fulfillments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Crom_l1Package.COMPARTMENT_TYPE__PARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParts()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Crom_l1Package.COMPARTMENT_TYPE__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
			case Crom_l1Package.COMPARTMENT_TYPE__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case Crom_l1Package.COMPARTMENT_TYPE__FULFILLMENTS:
				return ((InternalEList<?>)getFulfillments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Crom_l1Package.COMPARTMENT_TYPE__RELATIONS:
				return getRelations();
			case Crom_l1Package.COMPARTMENT_TYPE__PARTS:
				return getParts();
			case Crom_l1Package.COMPARTMENT_TYPE__CONTAINS:
				return getContains();
			case Crom_l1Package.COMPARTMENT_TYPE__FULFILLMENTS:
				return getFulfillments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Crom_l1Package.COMPARTMENT_TYPE__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case Crom_l1Package.COMPARTMENT_TYPE__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends Part>)newValue);
				return;
			case Crom_l1Package.COMPARTMENT_TYPE__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends CompartmentType>)newValue);
				return;
			case Crom_l1Package.COMPARTMENT_TYPE__FULFILLMENTS:
				getFulfillments().clear();
				getFulfillments().addAll((Collection<? extends Fulfillment>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Crom_l1Package.COMPARTMENT_TYPE__RELATIONS:
				getRelations().clear();
				return;
			case Crom_l1Package.COMPARTMENT_TYPE__PARTS:
				getParts().clear();
				return;
			case Crom_l1Package.COMPARTMENT_TYPE__CONTAINS:
				getContains().clear();
				return;
			case Crom_l1Package.COMPARTMENT_TYPE__FULFILLMENTS:
				getFulfillments().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Crom_l1Package.COMPARTMENT_TYPE__RELATIONS:
				return relations != null && !relations.isEmpty();
			case Crom_l1Package.COMPARTMENT_TYPE__PARTS:
				return parts != null && !parts.isEmpty();
			case Crom_l1Package.COMPARTMENT_TYPE__CONTAINS:
				return contains != null && !contains.isEmpty();
			case Crom_l1Package.COMPARTMENT_TYPE__FULFILLMENTS:
				return fulfillments != null && !fulfillments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
				case Crom_l1Package.COMPARTMENT_TYPE__RELATIONS: return Crom_l1Package.MODEL_ELEMENT__RELATIONS;
				default: return -1;
			}
		}
		if (baseClass == Player.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
				case Crom_l1Package.MODEL_ELEMENT__RELATIONS: return Crom_l1Package.COMPARTMENT_TYPE__RELATIONS;
				default: return -1;
			}
		}
		if (baseClass == Player.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CompartmentTypeImpl
