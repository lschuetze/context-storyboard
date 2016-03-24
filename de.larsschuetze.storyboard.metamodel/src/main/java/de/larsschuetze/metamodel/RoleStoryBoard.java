/**
 */
package de.larsschuetze.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Story Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.larsschuetze.metamodel.RoleStoryBoard#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.larsschuetze.metamodel.RoleStoryBoard#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.larsschuetze.metamodel.MetamodelPackage#getRoleStoryBoard()
 * @model
 * @generated
 */
public interface RoleStoryBoard extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link de.larsschuetze.metamodel.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see de.larsschuetze.metamodel.MetamodelPackage#getRoleStoryBoard_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link de.larsschuetze.metamodel.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see de.larsschuetze.metamodel.MetamodelPackage#getRoleStoryBoard_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

} // RoleStoryBoard
