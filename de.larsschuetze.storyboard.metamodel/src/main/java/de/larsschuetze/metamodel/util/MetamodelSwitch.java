/**
 */
package de.larsschuetze.metamodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.larsschuetze.metamodel.*;

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
 * @see de.larsschuetze.metamodel.MetamodelPackage
 * @generated
 */
public class MetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = MetamodelPackage.eINSTANCE;
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
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MetamodelPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.ROLE_STORY_BOARD: {
				RoleStoryBoard roleStoryBoard = (RoleStoryBoard)theEObject;
				T result = caseRoleStoryBoard(roleStoryBoard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.TRANSITION_CONSTRAINT: {
				TransitionConstraint transitionConstraint = (TransitionConstraint)theEObject;
				T result = caseTransitionConstraint(transitionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.GUARD: {
				Guard guard = (Guard)theEObject;
				T result = caseGuard(guard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.STORY_PATTERN_NODE: {
				StoryPatternNode storyPatternNode = (StoryPatternNode)theEObject;
				T result = caseStoryPatternNode(storyPatternNode);
				if (result == null) result = caseNode(storyPatternNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.CONTROL_NODE: {
				ControlNode controlNode = (ControlNode)theEObject;
				T result = caseControlNode(controlNode);
				if (result == null) result = caseNode(controlNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.ROLE_MODEL_NODE: {
				RoleModelNode roleModelNode = (RoleModelNode)theEObject;
				T result = caseRoleModelNode(roleModelNode);
				if (result == null) result = caseNode(roleModelNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.ROLE_MODEL_ELEMENT: {
				RoleModelElement roleModelElement = (RoleModelElement)theEObject;
				T result = caseRoleModelElement(roleModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.ROLE_NODE: {
				RoleNode roleNode = (RoleNode)theEObject;
				T result = caseRoleNode(roleNode);
				if (result == null) result = caseRoleModelElement(roleNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.NATURAL_NODE: {
				NaturalNode naturalNode = (NaturalNode)theEObject;
				T result = caseNaturalNode(naturalNode);
				if (result == null) result = caseRoleModelElement(naturalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.SUCCESS_NODE: {
				SuccessNode successNode = (SuccessNode)theEObject;
				T result = caseSuccessNode(successNode);
				if (result == null) result = caseControlNode(successNode);
				if (result == null) result = caseNode(successNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.FAIL_NODE: {
				FailNode failNode = (FailNode)theEObject;
				T result = caseFailNode(failNode);
				if (result == null) result = caseControlNode(failNode);
				if (result == null) result = caseNode(failNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.FORK_NODE: {
				ForkNode forkNode = (ForkNode)theEObject;
				T result = caseForkNode(forkNode);
				if (result == null) result = caseControlNode(forkNode);
				if (result == null) result = caseNode(forkNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.JOIN_NODE: {
				JoinNode joinNode = (JoinNode)theEObject;
				T result = caseJoinNode(joinNode);
				if (result == null) result = caseControlNode(joinNode);
				if (result == null) result = caseNode(joinNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.START_NODE: {
				StartNode startNode = (StartNode)theEObject;
				T result = caseStartNode(startNode);
				if (result == null) result = caseControlNode(startNode);
				if (result == null) result = caseNode(startNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.END_NOTE: {
				EndNote endNote = (EndNote)theEObject;
				T result = caseEndNote(endNote);
				if (result == null) result = caseControlNode(endNote);
				if (result == null) result = caseNode(endNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.SINK_NODE: {
				SinkNode sinkNode = (SinkNode)theEObject;
				T result = caseSinkNode(sinkNode);
				if (result == null) result = caseControlNode(sinkNode);
				if (result == null) result = caseNode(sinkNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.PLAY_ROLE_NODE: {
				PlayRoleNode playRoleNode = (PlayRoleNode)theEObject;
				T result = casePlayRoleNode(playRoleNode);
				if (result == null) result = caseConditionRoleNode(playRoleNode);
				if (result == null) result = caseRoleNode(playRoleNode);
				if (result == null) result = caseRoleModelElement(playRoleNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.ADD_ROLE_NODE: {
				AddRoleNode addRoleNode = (AddRoleNode)theEObject;
				T result = caseAddRoleNode(addRoleNode);
				if (result == null) result = caseRewriteRoleNode(addRoleNode);
				if (result == null) result = caseRoleNode(addRoleNode);
				if (result == null) result = caseRoleModelElement(addRoleNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.CONDITION_ROLE_NODE: {
				ConditionRoleNode conditionRoleNode = (ConditionRoleNode)theEObject;
				T result = caseConditionRoleNode(conditionRoleNode);
				if (result == null) result = caseRoleNode(conditionRoleNode);
				if (result == null) result = caseRoleModelElement(conditionRoleNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.REWRITE_ROLE_NODE: {
				RewriteRoleNode rewriteRoleNode = (RewriteRoleNode)theEObject;
				T result = caseRewriteRoleNode(rewriteRoleNode);
				if (result == null) result = caseRoleNode(rewriteRoleNode);
				if (result == null) result = caseRoleModelElement(rewriteRoleNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.REMOVE_ROLE_NODE: {
				RemoveRoleNode removeRoleNode = (RemoveRoleNode)theEObject;
				T result = caseRemoveRoleNode(removeRoleNode);
				if (result == null) result = caseRewriteRoleNode(removeRoleNode);
				if (result == null) result = caseRoleNode(removeRoleNode);
				if (result == null) result = caseRoleModelElement(removeRoleNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.RENEW_ROLE_NODE: {
				RenewRoleNode renewRoleNode = (RenewRoleNode)theEObject;
				T result = caseRenewRoleNode(renewRoleNode);
				if (result == null) result = caseRewriteRoleNode(renewRoleNode);
				if (result == null) result = caseRoleNode(renewRoleNode);
				if (result == null) result = caseRoleModelElement(renewRoleNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.PROHIBITED_ROLE_NODE: {
				ProhibitedRoleNode prohibitedRoleNode = (ProhibitedRoleNode)theEObject;
				T result = caseProhibitedRoleNode(prohibitedRoleNode);
				if (result == null) result = caseConditionRoleNode(prohibitedRoleNode);
				if (result == null) result = caseRoleNode(prohibitedRoleNode);
				if (result == null) result = caseRoleModelElement(prohibitedRoleNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.GENERIC_EVENT: {
				GenericEvent genericEvent = (GenericEvent)theEObject;
				T result = caseGenericEvent(genericEvent);
				if (result == null) result = caseEvent(genericEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.COMPARTMENT: {
				Compartment compartment = (Compartment)theEObject;
				T result = caseCompartment(compartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.JOIN_SPEC: {
				JoinSpec joinSpec = (JoinSpec)theEObject;
				T result = caseJoinSpec(joinSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
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
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Story Board</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Story Board</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleStoryBoard(RoleStoryBoard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionConstraint(TransitionConstraint object) {
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
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuard(Guard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
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
	public T caseStoryPatternNode(StoryPatternNode object) {
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
	public T caseControlNode(ControlNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Model Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Model Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleModelNode(RoleModelNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleModelElement(RoleModelElement object) {
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
	public T caseRoleNode(RoleNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Natural Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Natural Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaturalNode(NaturalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Success Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Success Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccessNode(SuccessNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fail Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fail Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailNode(FailNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkNode(ForkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinNode(JoinNode object) {
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
	public T caseStartNode(StartNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndNote(EndNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sink Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinkNode(SinkNode object) {
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
	public T casePlayRoleNode(PlayRoleNode object) {
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
	public T caseAddRoleNode(AddRoleNode object) {
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
	public T caseConditionRoleNode(ConditionRoleNode object) {
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
	public T caseRewriteRoleNode(RewriteRoleNode object) {
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
	public T caseRemoveRoleNode(RemoveRoleNode object) {
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
	public T caseRenewRoleNode(RenewRoleNode object) {
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
	public T caseProhibitedRoleNode(ProhibitedRoleNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericEvent(GenericEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartment(Compartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinSpec(JoinSpec object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //MetamodelSwitch
