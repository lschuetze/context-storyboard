/**
 */
package de.larsschuetze.storyboard.model.crom.crom_l1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.Attribute#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Type#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Type)
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getAttribute_Owner()
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Type#getAttributes
	 * @model opposite="attributes" required="true" transient="false"
	 * @generated
	 */
	Type getOwner();

	/**
	 * Sets the value of the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Attribute#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Type value);

} // Attribute
