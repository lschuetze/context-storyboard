/**
 */
package de.larsschuetze.storyboard.model.crom.crom_l1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Natural Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.NaturalInheritance#getSuper <em>Super</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.NaturalInheritance#getSub <em>Sub</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getNaturalInheritance()
 * @model
 * @generated
 */
public interface NaturalInheritance extends Inheritance {
	/**
	 * Returns the value of the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' reference.
	 * @see #setSuper(NaturalType)
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getNaturalInheritance_Super()
	 * @model required="true"
	 * @generated
	 */
	NaturalType getSuper();

	/**
	 * Sets the value of the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.NaturalInheritance#getSuper <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' reference.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(NaturalType value);

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' reference.
	 * @see #setSub(NaturalType)
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getNaturalInheritance_Sub()
	 * @model required="true"
	 * @generated
	 */
	NaturalType getSub();

	/**
	 * Sets the value of the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.NaturalInheritance#getSub <em>Sub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub</em>' reference.
	 * @see #getSub()
	 * @generated
	 */
	void setSub(NaturalType value);

} // NaturalInheritance
