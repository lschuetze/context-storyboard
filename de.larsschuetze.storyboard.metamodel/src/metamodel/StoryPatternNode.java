/**
 */
package metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Story Pattern Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.StoryPatternNode#getRoleModelNodes <em>Role Model Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getStoryPatternNode()
 * @model
 * @generated
 */
public interface StoryPatternNode extends Node {
	/**
	 * Returns the value of the '<em><b>Role Model Nodes</b></em>' reference list.
	 * The list contents are of type {@link metamodel.RoleModelNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Model Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Model Nodes</em>' reference list.
	 * @see metamodel.MetamodelPackage#getStoryPatternNode_RoleModelNodes()
	 * @model
	 * @generated
	 */
	EList<RoleModelNode> getRoleModelNodes();

} // StoryPatternNode
