/**
 */
package de.larsschuetze.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Model Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.larsschuetze.metamodel.RoleModelNode#getElements <em>Elements</em>}</li>
 *   <li>{@link de.larsschuetze.metamodel.RoleModelNode#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.larsschuetze.metamodel.MetamodelPackage#getRoleModelNode()
 * @model
 * @generated
 */
public interface RoleModelNode extends Node {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.larsschuetze.metamodel.RoleModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see de.larsschuetze.metamodel.MetamodelPackage#getRoleModelNode_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleModelElement> getElements();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.larsschuetze.metamodel.MetamodelPackage#getRoleModelNode_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.larsschuetze.metamodel.RoleModelNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RoleModelNode
