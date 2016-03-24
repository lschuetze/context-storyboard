/**
 */
package de.larsschuetze.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.larsschuetze.metamodel.MetamodelPackage;
import de.larsschuetze.metamodel.NaturalNode;
import de.larsschuetze.metamodel.RoleNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Natural Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.larsschuetze.metamodel.impl.NaturalNodeImpl#getPlayingObject <em>Playing Object</em>}</li>
 *   <li>{@link de.larsschuetze.metamodel.impl.NaturalNodeImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NaturalNodeImpl extends RoleModelElementImpl implements NaturalNode {
	/**
	 * The default value of the '{@link #getPlayingObject() <em>Playing Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayingObject()
	 * @generated
	 * @ordered
	 */
	protected static final Object PLAYING_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlayingObject() <em>Playing Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayingObject()
	 * @generated
	 * @ordered
	 */
	protected Object playingObject = PLAYING_OBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleNode> roles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NaturalNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.NATURAL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPlayingObject() {
		return playingObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayingObject(Object newPlayingObject) {
		Object oldPlayingObject = playingObject;
		playingObject = newPlayingObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.NATURAL_NODE__PLAYING_OBJECT, oldPlayingObject, playingObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleNode> getRoles() {
		if (roles == null) {
			roles = new EObjectWithInverseResolvingEList<RoleNode>(RoleNode.class, this, MetamodelPackage.NATURAL_NODE__ROLES, MetamodelPackage.ROLE_NODE__PLAYER);
		}
		return roles;
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
			case MetamodelPackage.NATURAL_NODE__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
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
			case MetamodelPackage.NATURAL_NODE__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case MetamodelPackage.NATURAL_NODE__PLAYING_OBJECT:
				return getPlayingObject();
			case MetamodelPackage.NATURAL_NODE__ROLES:
				return getRoles();
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
			case MetamodelPackage.NATURAL_NODE__PLAYING_OBJECT:
				setPlayingObject(newValue);
				return;
			case MetamodelPackage.NATURAL_NODE__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends RoleNode>)newValue);
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
			case MetamodelPackage.NATURAL_NODE__PLAYING_OBJECT:
				setPlayingObject(PLAYING_OBJECT_EDEFAULT);
				return;
			case MetamodelPackage.NATURAL_NODE__ROLES:
				getRoles().clear();
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
			case MetamodelPackage.NATURAL_NODE__PLAYING_OBJECT:
				return PLAYING_OBJECT_EDEFAULT == null ? playingObject != null : !PLAYING_OBJECT_EDEFAULT.equals(playingObject);
			case MetamodelPackage.NATURAL_NODE__ROLES:
				return roles != null && !roles.isEmpty();
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
		result.append(" (playingObject: ");
		result.append(playingObject);
		result.append(')');
		return result.toString();
	}

} //NaturalNodeImpl
