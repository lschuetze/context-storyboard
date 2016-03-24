/**
 */
package metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.JoinNode#getJoinSpec <em>Join Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getJoinNode()
 * @model
 * @generated
 */
public interface JoinNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Join Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Spec</em>' containment reference.
	 * @see #setJoinSpec(JoinSpec)
	 * @see metamodel.MetamodelPackage#getJoinNode_JoinSpec()
	 * @model containment="true"
	 * @generated
	 */
	JoinSpec getJoinSpec();

	/**
	 * Sets the value of the '{@link metamodel.JoinNode#getJoinSpec <em>Join Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Spec</em>' containment reference.
	 * @see #getJoinSpec()
	 * @generated
	 */
	void setJoinSpec(JoinSpec value);

} // JoinNode
