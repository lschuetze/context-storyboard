/**
 */
package de.larsschuetze.storyboard.model.crom.crom_l1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.Part#getRoles <em>Roles</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.Part#getWhole <em>Whole</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getPart()
 * @model
 * @generated
 */
public interface Part extends EObject {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference.
	 * @see #setRoles(AbstractRole)
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getPart_Roles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractRole getRoles();

	/**
	 * Sets the value of the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Part#getRoles <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roles</em>' containment reference.
	 * @see #getRoles()
	 * @generated
	 */
	void setRoles(AbstractRole value);

	/**
	 * Returns the value of the '<em><b>Whole</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.larsschuetze.storyboard.model.crom.crom_l1.CompartmentType#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whole</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whole</em>' container reference.
	 * @see #setWhole(CompartmentType)
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getPart_Whole()
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.CompartmentType#getParts
	 * @model opposite="parts" required="true" transient="false"
	 * @generated
	 */
	CompartmentType getWhole();

	/**
	 * Sets the value of the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Part#getWhole <em>Whole</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whole</em>' container reference.
	 * @see #getWhole()
	 * @generated
	 */
	void setWhole(CompartmentType value);

} // Part
