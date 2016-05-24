/**
 * generated by Xtext 2.9.1
 */
package de.larsschuetze.storyboard.dsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.larsschuetze.storyboard.dsl.DslPackage
 * @generated
 */
public interface DslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DslFactory eINSTANCE = de.larsschuetze.storyboard.dsl.impl.DslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Storyboard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Storyboard</em>'.
   * @generated
   */
  Storyboard createStoryboard();

  /**
   * Returns a new object of class '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Element</em>'.
   * @generated
   */
  AbstractElement createAbstractElement();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  Node createNode();

  /**
   * Returns a new object of class '<em>Control Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control Node</em>'.
   * @generated
   */
  ControlNode createControlNode();

  /**
   * Returns a new object of class '<em>Start Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start Node</em>'.
   * @generated
   */
  StartNode createStartNode();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();

  /**
   * Returns a new object of class '<em>Story Pattern Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Story Pattern Node</em>'.
   * @generated
   */
  StoryPatternNode createStoryPatternNode();

  /**
   * Returns a new object of class '<em>Role Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role Node</em>'.
   * @generated
   */
  RoleNode createRoleNode();

  /**
   * Returns a new object of class '<em>Rewrite Role Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rewrite Role Node</em>'.
   * @generated
   */
  RewriteRoleNode createRewriteRoleNode();

  /**
   * Returns a new object of class '<em>Remove Role Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove Role Node</em>'.
   * @generated
   */
  RemoveRoleNode createRemoveRoleNode();

  /**
   * Returns a new object of class '<em>Renew Role Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Renew Role Node</em>'.
   * @generated
   */
  RenewRoleNode createRenewRoleNode();

  /**
   * Returns a new object of class '<em>Add Role Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Role Node</em>'.
   * @generated
   */
  AddRoleNode createAddRoleNode();

  /**
   * Returns a new object of class '<em>Condition Role Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition Role Node</em>'.
   * @generated
   */
  ConditionRoleNode createConditionRoleNode();

  /**
   * Returns a new object of class '<em>Prohibited Role Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prohibited Role Node</em>'.
   * @generated
   */
  ProhibitedRoleNode createProhibitedRoleNode();

  /**
   * Returns a new object of class '<em>Play Role Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Play Role Node</em>'.
   * @generated
   */
  PlayRoleNode createPlayRoleNode();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DslPackage getDslPackage();

} //DslFactory