/**
 */
package de.larsschuetze.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.larsschuetze.metamodel.Node#getIn <em>In</em>}</li>
 *   <li>{@link de.larsschuetze.metamodel.Node#getOut <em>Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.larsschuetze.metamodel.MetamodelPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link de.larsschuetze.metamodel.Edge}.
	 * It is bidirectional and its opposite is '{@link de.larsschuetze.metamodel.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see de.larsschuetze.metamodel.MetamodelPackage#getNode_In()
	 * @see de.larsschuetze.metamodel.Edge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Edge> getIn();

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link de.larsschuetze.metamodel.Edge}.
	 * It is bidirectional and its opposite is '{@link de.larsschuetze.metamodel.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see de.larsschuetze.metamodel.MetamodelPackage#getNode_Out()
	 * @see de.larsschuetze.metamodel.Edge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Edge> getOut();

} // Node
