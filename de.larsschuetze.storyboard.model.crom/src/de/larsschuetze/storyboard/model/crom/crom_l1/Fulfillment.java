/**
 */
package de.larsschuetze.storyboard.model.crom.crom_l1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fulfillment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.Fulfillment#getFilled <em>Filled</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.Fulfillment#getFiller <em>Filler</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getFulfillment()
 * @model
 * @generated
 */
public interface Fulfillment extends Relation {
	/**
	 * Returns the value of the '<em><b>Filled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filled</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filled</em>' reference.
	 * @see #setFilled(AbstractRole)
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getFulfillment_Filled()
	 * @model required="true"
	 * @generated
	 */
	AbstractRole getFilled();

	/**
	 * Sets the value of the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Fulfillment#getFilled <em>Filled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filled</em>' reference.
	 * @see #getFilled()
	 * @generated
	 */
	void setFilled(AbstractRole value);

	/**
	 * Returns the value of the '<em><b>Filler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filler</em>' reference.
	 * @see #setFiller(Player)
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getFulfillment_Filler()
	 * @model required="true"
	 * @generated
	 */
	Player getFiller();

	/**
	 * Sets the value of the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Fulfillment#getFiller <em>Filler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filler</em>' reference.
	 * @see #getFiller()
	 * @generated
	 */
	void setFiller(Player value);

} // Fulfillment
