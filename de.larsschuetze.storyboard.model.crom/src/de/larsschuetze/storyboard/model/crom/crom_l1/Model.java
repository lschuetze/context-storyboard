/**
 */
package de.larsschuetze.storyboard.model.crom.crom_l1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.Model#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.larsschuetze.storyboard.model.crom.crom_l1.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElement> getElements();

} // Model
