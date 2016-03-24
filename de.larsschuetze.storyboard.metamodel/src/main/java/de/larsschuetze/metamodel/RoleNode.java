/**
 */
package de.larsschuetze.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.larsschuetze.metamodel.RoleNode#getRelations <em>Relations</em>}</li>
 *   <li>{@link de.larsschuetze.metamodel.RoleNode#getName <em>Name</em>}</li>
 *   <li>{@link de.larsschuetze.metamodel.RoleNode#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link de.larsschuetze.metamodel.RoleNode#getPlayer <em>Player</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.larsschuetze.metamodel.MetamodelPackage#getRoleNode()
 * @model abstract="true"
 * @generated
 */
public interface RoleNode extends RoleModelElement {
	/**
	 * Returns the value of the '<em><b>Relations</b></em>' reference list.
	 * The list contents are of type {@link de.larsschuetze.metamodel.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' reference list.
	 * @see de.larsschuetze.metamodel.MetamodelPackage#getRoleNode_Relations()
	 * @model
	 * @generated
	 */
	EList<Relation> getRelations();

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
	 * @see de.larsschuetze.metamodel.MetamodelPackage#getRoleNode_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.larsschuetze.metamodel.RoleNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment</em>' reference.
	 * @see #setCompartment(Compartment)
	 * @see de.larsschuetze.metamodel.MetamodelPackage#getRoleNode_Compartment()
	 * @model required="true"
	 * @generated
	 */
	Compartment getCompartment();

	/**
	 * Sets the value of the '{@link de.larsschuetze.metamodel.RoleNode#getCompartment <em>Compartment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment</em>' reference.
	 * @see #getCompartment()
	 * @generated
	 */
	void setCompartment(Compartment value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.larsschuetze.metamodel.NaturalNode#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(NaturalNode)
	 * @see de.larsschuetze.metamodel.MetamodelPackage#getRoleNode_Player()
	 * @see de.larsschuetze.metamodel.NaturalNode#getRoles
	 * @model opposite="roles" required="true"
	 * @generated
	 */
	NaturalNode getPlayer();

	/**
	 * Sets the value of the '{@link de.larsschuetze.metamodel.RoleNode#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(NaturalNode value);

} // RoleNode
