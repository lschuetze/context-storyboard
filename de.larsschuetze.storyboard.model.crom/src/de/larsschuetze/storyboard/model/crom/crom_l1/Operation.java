/**
 */
package de.larsschuetze.storyboard.model.crom.crom_l1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.Operation#getParams <em>Params</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.Operation#getOperation <em>Operation</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.Operation#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getOperation()
 * @model
 * @generated
 */
public interface Operation extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Params</b></em>' reference list.
	 * The list contents are of type {@link de.larsschuetze.storyboard.model.crom.crom_l1.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' reference list.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getOperation_Params()
	 * @model
	 * @generated
	 */
	EList<Parameter> getParams();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see #setOperation(String)
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getOperation_Operation()
	 * @model
	 * @generated
	 */
	String getOperation();

	/**
	 * Sets the value of the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Operation#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Type#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Type)
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getOperation_Owner()
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Type#getOperations
	 * @model opposite="operations" required="true" transient="false"
	 * @generated
	 */
	Type getOwner();

	/**
	 * Sets the value of the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Operation#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Type value);

} // Operation
