/**
 */
package metamodel.impl;

import java.util.Collection;

import metamodel.MetamodelPackage;
import metamodel.RoleModelNode;
import metamodel.StoryPatternNode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Story Pattern Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metamodel.impl.StoryPatternNodeImpl#getRoleModelNodes <em>Role Model Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoryPatternNodeImpl extends NodeImpl implements StoryPatternNode {
	/**
	 * The cached value of the '{@link #getRoleModelNodes() <em>Role Model Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleModelNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleModelNode> roleModelNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryPatternNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.STORY_PATTERN_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleModelNode> getRoleModelNodes() {
		if (roleModelNodes == null) {
			roleModelNodes = new EObjectResolvingEList<RoleModelNode>(RoleModelNode.class, this, MetamodelPackage.STORY_PATTERN_NODE__ROLE_MODEL_NODES);
		}
		return roleModelNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.STORY_PATTERN_NODE__ROLE_MODEL_NODES:
				return getRoleModelNodes();
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
			case MetamodelPackage.STORY_PATTERN_NODE__ROLE_MODEL_NODES:
				getRoleModelNodes().clear();
				getRoleModelNodes().addAll((Collection<? extends RoleModelNode>)newValue);
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
			case MetamodelPackage.STORY_PATTERN_NODE__ROLE_MODEL_NODES:
				getRoleModelNodes().clear();
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
			case MetamodelPackage.STORY_PATTERN_NODE__ROLE_MODEL_NODES:
				return roleModelNodes != null && !roleModelNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StoryPatternNodeImpl
