/**
 */
package de.larsschuetze.storyboard.model.crom.crom_l1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.ModelElement#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getModelElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ModelElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Relations</b></em>' reference list.
	 * The list contents are of type {@link de.larsschuetze.storyboard.model.crom.crom_l1.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' reference list.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getModelElement_Relations()
	 * @model
	 * @generated
	 */
	EList<Relation> getRelations();

} // ModelElement
