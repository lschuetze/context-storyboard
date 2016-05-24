/**
 */
package de.larsschuetze.storyboard.model.crom.crom_l1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.CompartmentType#getParts <em>Parts</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.CompartmentType#getContains <em>Contains</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.CompartmentType#getFulfillments <em>Fulfillments</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getCompartmentType()
 * @model
 * @generated
 */
public interface CompartmentType extends RelationTarget, ModelElement, Player {
	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link de.larsschuetze.storyboard.model.crom.crom_l1.Part}.
	 * It is bidirectional and its opposite is '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Part#getWhole <em>Whole</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getCompartmentType_Parts()
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Part#getWhole
	 * @model opposite="whole" containment="true"
	 * @generated
	 */
	EList<Part> getParts();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link de.larsschuetze.storyboard.model.crom.crom_l1.CompartmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getCompartmentType_Contains()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CompartmentType> getContains();

	/**
	 * Returns the value of the '<em><b>Fulfillments</b></em>' containment reference list.
	 * The list contents are of type {@link de.larsschuetze.storyboard.model.crom.crom_l1.Fulfillment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fulfillments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillments</em>' containment reference list.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getCompartmentType_Fulfillments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fulfillment> getFulfillments();

} // CompartmentType
