/**
 */
package metamodel.impl;

import java.util.Collection;

import metamodel.Compartment;
import metamodel.MetamodelPackage;
import metamodel.NaturalNode;
import metamodel.Relation;
import metamodel.RoleNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metamodel.impl.RoleNodeImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link metamodel.impl.RoleNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link metamodel.impl.RoleNodeImpl#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link metamodel.impl.RoleNodeImpl#getPlayer <em>Player</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RoleNodeImpl extends RoleModelElementImpl implements RoleNode {
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
	 * The cached value of the '{@link #getCompartment() <em>Compartment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartment()
	 * @generated
	 * @ordered
	 */
	protected Compartment compartment;

	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected NaturalNode player;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.ROLE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectResolvingEList<Relation>(Relation.class, this, MetamodelPackage.ROLE_NODE__RELATIONS);
		}
		return relations;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ROLE_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment getCompartment() {
		if (compartment != null && compartment.eIsProxy()) {
			InternalEObject oldCompartment = (InternalEObject)compartment;
			compartment = (Compartment)eResolveProxy(oldCompartment);
			if (compartment != oldCompartment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.ROLE_NODE__COMPARTMENT, oldCompartment, compartment));
			}
		}
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment basicGetCompartment() {
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompartment(Compartment newCompartment) {
		Compartment oldCompartment = compartment;
		compartment = newCompartment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ROLE_NODE__COMPARTMENT, oldCompartment, compartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalNode getPlayer() {
		if (player != null && player.eIsProxy()) {
			InternalEObject oldPlayer = (InternalEObject)player;
			player = (NaturalNode)eResolveProxy(oldPlayer);
			if (player != oldPlayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.ROLE_NODE__PLAYER, oldPlayer, player));
			}
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalNode basicGetPlayer() {
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayer(NaturalNode newPlayer, NotificationChain msgs) {
		NaturalNode oldPlayer = player;
		player = newPlayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.ROLE_NODE__PLAYER, oldPlayer, newPlayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayer(NaturalNode newPlayer) {
		if (newPlayer != player) {
			NotificationChain msgs = null;
			if (player != null)
				msgs = ((InternalEObject)player).eInverseRemove(this, MetamodelPackage.NATURAL_NODE__ROLES, NaturalNode.class, msgs);
			if (newPlayer != null)
				msgs = ((InternalEObject)newPlayer).eInverseAdd(this, MetamodelPackage.NATURAL_NODE__ROLES, NaturalNode.class, msgs);
			msgs = basicSetPlayer(newPlayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ROLE_NODE__PLAYER, newPlayer, newPlayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.ROLE_NODE__PLAYER:
				if (player != null)
					msgs = ((InternalEObject)player).eInverseRemove(this, MetamodelPackage.NATURAL_NODE__ROLES, NaturalNode.class, msgs);
				return basicSetPlayer((NaturalNode)otherEnd, msgs);
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
			case MetamodelPackage.ROLE_NODE__PLAYER:
				return basicSetPlayer(null, msgs);
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
			case MetamodelPackage.ROLE_NODE__RELATIONS:
				return getRelations();
			case MetamodelPackage.ROLE_NODE__NAME:
				return getName();
			case MetamodelPackage.ROLE_NODE__COMPARTMENT:
				if (resolve) return getCompartment();
				return basicGetCompartment();
			case MetamodelPackage.ROLE_NODE__PLAYER:
				if (resolve) return getPlayer();
				return basicGetPlayer();
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
			case MetamodelPackage.ROLE_NODE__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case MetamodelPackage.ROLE_NODE__NAME:
				setName((String)newValue);
				return;
			case MetamodelPackage.ROLE_NODE__COMPARTMENT:
				setCompartment((Compartment)newValue);
				return;
			case MetamodelPackage.ROLE_NODE__PLAYER:
				setPlayer((NaturalNode)newValue);
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
			case MetamodelPackage.ROLE_NODE__RELATIONS:
				getRelations().clear();
				return;
			case MetamodelPackage.ROLE_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetamodelPackage.ROLE_NODE__COMPARTMENT:
				setCompartment((Compartment)null);
				return;
			case MetamodelPackage.ROLE_NODE__PLAYER:
				setPlayer((NaturalNode)null);
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
			case MetamodelPackage.ROLE_NODE__RELATIONS:
				return relations != null && !relations.isEmpty();
			case MetamodelPackage.ROLE_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetamodelPackage.ROLE_NODE__COMPARTMENT:
				return compartment != null;
			case MetamodelPackage.ROLE_NODE__PLAYER:
				return player != null;
		}
		return super.eIsSet(featureID);
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

} //RoleNodeImpl
