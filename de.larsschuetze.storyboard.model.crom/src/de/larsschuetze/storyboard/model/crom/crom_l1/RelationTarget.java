/**
 */
package de.larsschuetze.storyboard.model.crom.crom_l1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.RelationTarget#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.model.crom.crom_l1.RelationTarget#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getRelationTarget()
 * @model abstract="true"
 * @generated
 */
public interface RelationTarget extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link de.larsschuetze.storyboard.model.crom.crom_l1.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getRelationTarget_Incoming()
	 * @model
	 * @generated
	 */
	EList<Relation> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link de.larsschuetze.storyboard.model.crom.crom_l1.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Package#getRelationTarget_Outgoing()
	 * @model
	 * @generated
	 */
	EList<Relation> getOutgoing();

} // RelationTarget
