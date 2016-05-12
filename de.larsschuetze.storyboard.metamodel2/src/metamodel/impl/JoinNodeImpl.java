/**
 */
package metamodel.impl;

import metamodel.JoinNode;
import metamodel.JoinSpec;
import metamodel.MetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metamodel.impl.JoinNodeImpl#getJoinSpec <em>Join Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinNodeImpl extends ControlNodeImpl implements JoinNode {
	/**
	 * The cached value of the '{@link #getJoinSpec() <em>Join Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinSpec()
	 * @generated
	 * @ordered
	 */
	protected JoinSpec joinSpec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.JOIN_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinSpec getJoinSpec() {
		return joinSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinSpec(JoinSpec newJoinSpec, NotificationChain msgs) {
		JoinSpec oldJoinSpec = joinSpec;
		joinSpec = newJoinSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.JOIN_NODE__JOIN_SPEC, oldJoinSpec, newJoinSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinSpec(JoinSpec newJoinSpec) {
		if (newJoinSpec != joinSpec) {
			NotificationChain msgs = null;
			if (joinSpec != null)
				msgs = ((InternalEObject)joinSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.JOIN_NODE__JOIN_SPEC, null, msgs);
			if (newJoinSpec != null)
				msgs = ((InternalEObject)newJoinSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.JOIN_NODE__JOIN_SPEC, null, msgs);
			msgs = basicSetJoinSpec(newJoinSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.JOIN_NODE__JOIN_SPEC, newJoinSpec, newJoinSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.JOIN_NODE__JOIN_SPEC:
				return basicSetJoinSpec(null, msgs);
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
			case MetamodelPackage.JOIN_NODE__JOIN_SPEC:
				return getJoinSpec();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetamodelPackage.JOIN_NODE__JOIN_SPEC:
				setJoinSpec((JoinSpec)newValue);
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
			case MetamodelPackage.JOIN_NODE__JOIN_SPEC:
				setJoinSpec((JoinSpec)null);
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
			case MetamodelPackage.JOIN_NODE__JOIN_SPEC:
				return joinSpec != null;
		}
		return super.eIsSet(featureID);
	}

} //JoinNodeImpl
