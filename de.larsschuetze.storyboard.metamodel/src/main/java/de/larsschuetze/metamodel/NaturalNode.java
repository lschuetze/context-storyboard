/**
 */
package de.larsschuetze.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Natural Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.larsschuetze.metamodel.NaturalNode#getPlayingObject <em>Playing Object</em>}</li>
 *   <li>{@link de.larsschuetze.metamodel.NaturalNode#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.larsschuetze.metamodel.MetamodelPackage#getNaturalNode()
 * @model
 * @generated
 */
public interface NaturalNode extends RoleModelElement {
	/**
	 * Returns the value of the '<em><b>Playing Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Playing Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Playing Object</em>' attribute.
	 * @see #setPlayingObject(Object)
	 * @see de.larsschuetze.metamodel.MetamodelPackage#getNaturalNode_PlayingObject()
	 * @model id="true"
	 * @generated
	 */
	Object getPlayingObject();

	/**
	 * Sets the value of the '{@link de.larsschuetze.metamodel.NaturalNode#getPlayingObject <em>Playing Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Playing Object</em>' attribute.
	 * @see #getPlayingObject()
	 * @generated
	 */
	void setPlayingObject(Object value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link de.larsschuetze.metamodel.RoleNode}.
	 * It is bidirectional and its opposite is '{@link de.larsschuetze.metamodel.RoleNode#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see de.larsschuetze.metamodel.MetamodelPackage#getNaturalNode_Roles()
	 * @see de.larsschuetze.metamodel.RoleNode#getPlayer
	 * @model opposite="player"
	 * @generated
	 */
	EList<RoleNode> getRoles();

} // NaturalNode
