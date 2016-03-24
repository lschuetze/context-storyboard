/**
 */
package metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.Relation#getFirst <em>First</em>}</li>
 *   <li>{@link metamodel.Relation#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(RoleNode)
	 * @see metamodel.MetamodelPackage#getRelation_First()
	 * @model required="true"
	 * @generated
	 */
	RoleNode getFirst();

	/**
	 * Sets the value of the '{@link metamodel.Relation#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(RoleNode value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' reference.
	 * @see #setSecond(RoleNode)
	 * @see metamodel.MetamodelPackage#getRelation_Second()
	 * @model required="true"
	 * @generated
	 */
	RoleNode getSecond();

	/**
	 * Sets the value of the '{@link metamodel.Relation#getSecond <em>Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(RoleNode value);

} // Relation
