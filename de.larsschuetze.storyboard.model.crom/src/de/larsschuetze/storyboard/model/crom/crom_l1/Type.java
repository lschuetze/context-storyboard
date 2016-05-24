/**
 */
package de.larsschuetze.storyboard.model.crom.crom_l1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.Type#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.Type#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getType()
 * @model
 * @generated
 */
public interface Type extends RelationTarget {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link de.larsschuetze.storyboard.model.crom.crom_l1.Attribute}.
	 * It is bidirectional and its opposite is '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Attribute#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getType_Attributes()
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Attribute#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link de.larsschuetze.storyboard.model.crom.crom_l1.Operation}.
	 * It is bidirectional and its opposite is '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Operation#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getType_Operations()
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Operation#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // Type
