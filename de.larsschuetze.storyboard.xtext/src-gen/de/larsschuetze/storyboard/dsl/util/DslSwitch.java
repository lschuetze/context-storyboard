/**
 * generated by Xtext 2.9.1
 */
package de.larsschuetze.storyboard.dsl.util;

import de.larsschuetze.storyboard.dsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.larsschuetze.storyboard.dsl.DslPackage
 * @generated
 */
public class DslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DslPackage.STORYBOARD:
      {
        Storyboard storyboard = (Storyboard)theEObject;
        T result = caseStoryboard(storyboard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ABSTRACT_ELEMENT:
      {
        AbstractElement abstractElement = (AbstractElement)theEObject;
        T result = caseAbstractElement(abstractElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.NODE:
      {
        Node node = (Node)theEObject;
        T result = caseNode(node);
        if (result == null) result = caseAbstractElement(node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CONTROL_NODE:
      {
        ControlNode controlNode = (ControlNode)theEObject;
        T result = caseControlNode(controlNode);
        if (result == null) result = caseNode(controlNode);
        if (result == null) result = caseAbstractElement(controlNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.START_NODE:
      {
        StartNode startNode = (StartNode)theEObject;
        T result = caseStartNode(startNode);
        if (result == null) result = caseControlNode(startNode);
        if (result == null) result = caseNode(startNode);
        if (result == null) result = caseAbstractElement(startNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.TRANSITION:
      {
        Transition transition = (Transition)theEObject;
        T result = caseTransition(transition);
        if (result == null) result = caseAbstractElement(transition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.STORY_PATTERN_NODE:
      {
        StoryPatternNode storyPatternNode = (StoryPatternNode)theEObject;
        T result = caseStoryPatternNode(storyPatternNode);
        if (result == null) result = caseNode(storyPatternNode);
        if (result == null) result = caseAbstractElement(storyPatternNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ROLE_NODE:
      {
        RoleNode roleNode = (RoleNode)theEObject;
        T result = caseRoleNode(roleNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.REWRITE_ROLE_NODE:
      {
        RewriteRoleNode rewriteRoleNode = (RewriteRoleNode)theEObject;
        T result = caseRewriteRoleNode(rewriteRoleNode);
        if (result == null) result = caseRoleNode(rewriteRoleNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.REMOVE_ROLE_NODE:
      {
        RemoveRoleNode removeRoleNode = (RemoveRoleNode)theEObject;
        T result = caseRemoveRoleNode(removeRoleNode);
        if (result == null) result = caseRewriteRoleNode(removeRoleNode);
        if (result == null) result = caseRoleNode(removeRoleNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.RENEW_ROLE_NODE:
      {
        RenewRoleNode renewRoleNode = (RenewRoleNode)theEObject;
        T result = caseRenewRoleNode(renewRoleNode);
        if (result == null) result = caseRewriteRoleNode(renewRoleNode);
        if (result == null) result = caseRoleNode(renewRoleNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ADD_ROLE_NODE:
      {
        AddRoleNode addRoleNode = (AddRoleNode)theEObject;
        T result = caseAddRoleNode(addRoleNode);
        if (result == null) result = caseRewriteRoleNode(addRoleNode);
        if (result == null) result = caseRoleNode(addRoleNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CONDITION_ROLE_NODE:
      {
        ConditionRoleNode conditionRoleNode = (ConditionRoleNode)theEObject;
        T result = caseConditionRoleNode(conditionRoleNode);
        if (result == null) result = caseRoleNode(conditionRoleNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.PROHIBITED_ROLE_NODE:
      {
        ProhibitedRoleNode prohibitedRoleNode = (ProhibitedRoleNode)theEObject;
        T result = caseProhibitedRoleNode(prohibitedRoleNode);
        if (result == null) result = caseConditionRoleNode(prohibitedRoleNode);
        if (result == null) result = caseRoleNode(prohibitedRoleNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.PLAY_ROLE_NODE:
      {
        PlayRoleNode playRoleNode = (PlayRoleNode)theEObject;
        T result = casePlayRoleNode(playRoleNode);
        if (result == null) result = caseConditionRoleNode(playRoleNode);
        if (result == null) result = caseRoleNode(playRoleNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Storyboard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Storyboard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStoryboard(Storyboard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElement(AbstractElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNode(Node object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControlNode(ControlNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Start Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Start Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStartNode(StartNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransition(Transition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Story Pattern Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Story Pattern Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStoryPatternNode(StoryPatternNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleNode(RoleNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rewrite Role Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rewrite Role Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRewriteRoleNode(RewriteRoleNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Remove Role Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Remove Role Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRemoveRoleNode(RemoveRoleNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Renew Role Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Renew Role Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRenewRoleNode(RenewRoleNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Role Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Role Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddRoleNode(AddRoleNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition Role Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition Role Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionRoleNode(ConditionRoleNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prohibited Role Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prohibited Role Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProhibitedRoleNode(ProhibitedRoleNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Play Role Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Play Role Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlayRoleNode(PlayRoleNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DslSwitch
