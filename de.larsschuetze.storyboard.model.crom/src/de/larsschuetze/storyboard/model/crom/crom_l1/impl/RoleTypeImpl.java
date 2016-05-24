/**
 */
package de.larsschuetze.storyboard.model.crom.crom_l1.impl;

import de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package;
import de.larsschuetze.storyboard.model.crom.crom_l1.NamedElement;
import de.larsschuetze.storyboard.model.crom.crom_l1.Player;
import de.larsschuetze.storyboard.model.crom.crom_l1.Relation;
import de.larsschuetze.storyboard.model.crom.crom_l1.RelationTarget;
import de.larsschuetze.storyboard.model.crom.crom_l1.RoleType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.RoleTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.RoleTypeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.RoleTypeImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleTypeImpl extends MinimalEObjectImpl.Container implements RoleType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> outgoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Crom_l1Package.Literals.ROLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1Package.ROLE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectResolvingEList<Relation>(Relation.class, this, Crom_l1Package.ROLE_TYPE__INCOMING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectResolvingEList<Relation>(Relation.class, this, Crom_l1Package.ROLE_TYPE__OUTGOING);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Crom_l1Package.ROLE_TYPE__NAME:
				return getName();
			case Crom_l1Package.ROLE_TYPE__INCOMING:
				return getIncoming();
			case Crom_l1Package.ROLE_TYPE__OUTGOING:
				return getOutgoing();
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
			case Crom_l1Package.ROLE_TYPE__NAME:
				setName((String)newValue);
				return;
			case Crom_l1Package.ROLE_TYPE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Relation>)newValue);
				return;
			case Crom_l1Package.ROLE_TYPE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Relation>)newValue);
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
			case Crom_l1Package.ROLE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Crom_l1Package.ROLE_TYPE__INCOMING:
				getIncoming().clear();
				return;
			case Crom_l1Package.ROLE_TYPE__OUTGOING:
				getOutgoing().clear();
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
			case Crom_l1Package.ROLE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Crom_l1Package.ROLE_TYPE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case Crom_l1Package.ROLE_TYPE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case Crom_l1Package.ROLE_TYPE__NAME: return Crom_l1Package.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == RelationTarget.class) {
			switch (derivedFeatureID) {
				case Crom_l1Package.ROLE_TYPE__INCOMING: return Crom_l1Package.RELATION_TARGET__INCOMING;
				case Crom_l1Package.ROLE_TYPE__OUTGOING: return Crom_l1Package.RELATION_TARGET__OUTGOING;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case Crom_l1Package.NAMED_ELEMENT__NAME: return Crom_l1Package.ROLE_TYPE__NAME;
				default: return -1;
			}
		}
		if (baseClass == RelationTarget.class) {
			switch (baseFeatureID) {
				case Crom_l1Package.RELATION_TARGET__INCOMING: return Crom_l1Package.ROLE_TYPE__INCOMING;
				case Crom_l1Package.RELATION_TARGET__OUTGOING: return Crom_l1Package.ROLE_TYPE__OUTGOING;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RoleTypeImpl
