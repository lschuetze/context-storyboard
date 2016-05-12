/**
 * generated by Xtext 2.9.1
 */
package de.larsschuetze.storyboard.dsl;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.larsschuetze.storyboard.dsl.Transition#getName <em>Name</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.dsl.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.dsl.Transition#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.dsl.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.dsl.Transition#getEvent <em>Event</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.dsl.Transition#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.larsschuetze.storyboard.dsl.DslPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.larsschuetze.storyboard.dsl.DslPackage#getTransition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.larsschuetze.storyboard.dsl.Transition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Node)
   * @see de.larsschuetze.storyboard.dsl.DslPackage#getTransition_Source()
   * @model
   * @generated
   */
  Node getSource();

  /**
   * Sets the value of the '{@link de.larsschuetze.storyboard.dsl.Transition#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Node value);

  /**
   * Returns the value of the '<em><b>Source Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Port</em>' attribute.
   * @see #setSourcePort(String)
   * @see de.larsschuetze.storyboard.dsl.DslPackage#getTransition_SourcePort()
   * @model
   * @generated
   */
  String getSourcePort();

  /**
   * Sets the value of the '{@link de.larsschuetze.storyboard.dsl.Transition#getSourcePort <em>Source Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Port</em>' attribute.
   * @see #getSourcePort()
   * @generated
   */
  void setSourcePort(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Node)
   * @see de.larsschuetze.storyboard.dsl.DslPackage#getTransition_Target()
   * @model
   * @generated
   */
  Node getTarget();

  /**
   * Sets the value of the '{@link de.larsschuetze.storyboard.dsl.Transition#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Node value);

  /**
   * Returns the value of the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' reference.
   * @see #setEvent(Event)
   * @see de.larsschuetze.storyboard.dsl.DslPackage#getTransition_Event()
   * @model
   * @generated
   */
  Event getEvent();

  /**
   * Sets the value of the '{@link de.larsschuetze.storyboard.dsl.Transition#getEvent <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Event value);

  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(XExpression)
   * @see de.larsschuetze.storyboard.dsl.DslPackage#getTransition_Guard()
   * @model containment="true"
   * @generated
   */
  XExpression getGuard();

  /**
   * Sets the value of the '{@link de.larsschuetze.storyboard.dsl.Transition#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(XExpression value);

} // Transition
