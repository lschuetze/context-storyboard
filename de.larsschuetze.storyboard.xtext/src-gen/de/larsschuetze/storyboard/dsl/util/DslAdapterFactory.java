/**
 * generated by Xtext 2.9.1
 */
package de.larsschuetze.storyboard.dsl.util;

import de.larsschuetze.storyboard.dsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.larsschuetze.storyboard.dsl.DslPackage
 * @generated
 */
public class DslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DslSwitch<Adapter> modelSwitch =
    new DslSwitch<Adapter>()
    {
      @Override
      public Adapter caseStoryboard(Storyboard object)
      {
        return createStoryboardAdapter();
      }
      @Override
      public Adapter caseAbstractElement(AbstractElement object)
      {
        return createAbstractElementAdapter();
      }
      @Override
      public Adapter caseNode(Node object)
      {
        return createNodeAdapter();
      }
      @Override
      public Adapter caseControlNode(ControlNode object)
      {
        return createControlNodeAdapter();
      }
      @Override
      public Adapter caseStartNode(StartNode object)
      {
        return createStartNodeAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseStoryPatternNode(StoryPatternNode object)
      {
        return createStoryPatternNodeAdapter();
      }
      @Override
      public Adapter caseRoleNode(RoleNode object)
      {
        return createRoleNodeAdapter();
      }
      @Override
      public Adapter caseRewriteRoleNode(RewriteRoleNode object)
      {
        return createRewriteRoleNodeAdapter();
      }
      @Override
      public Adapter caseRemoveRoleNode(RemoveRoleNode object)
      {
        return createRemoveRoleNodeAdapter();
      }
      @Override
      public Adapter caseRenewRoleNode(RenewRoleNode object)
      {
        return createRenewRoleNodeAdapter();
      }
      @Override
      public Adapter caseAddRoleNode(AddRoleNode object)
      {
        return createAddRoleNodeAdapter();
      }
      @Override
      public Adapter caseConditionRoleNode(ConditionRoleNode object)
      {
        return createConditionRoleNodeAdapter();
      }
      @Override
      public Adapter caseProhibitedRoleNode(ProhibitedRoleNode object)
      {
        return createProhibitedRoleNodeAdapter();
      }
      @Override
      public Adapter casePlayRoleNode(PlayRoleNode object)
      {
        return createPlayRoleNodeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.larsschuetze.storyboard.dsl.Storyboard <em>Storyboard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.larsschuetze.storyboard.dsl.Storyboard
   * @generated
   */
  public Adapter createStoryboardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.larsschuetze.storyboard.dsl.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.larsschuetze.storyboard.dsl.AbstractElement
   * @generated
   */
  public Adapter createAbstractElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.larsschuetze.storyboard.dsl.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.larsschuetze.storyboard.dsl.Node
   * @generated
   */
  public Adapter createNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.larsschuetze.storyboard.dsl.ControlNode <em>Control Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.larsschuetze.storyboard.dsl.ControlNode
   * @generated
   */
  public Adapter createControlNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.larsschuetze.storyboard.dsl.StartNode <em>Start Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.larsschuetze.storyboard.dsl.StartNode
   * @generated
   */
  public Adapter createStartNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.larsschuetze.storyboard.dsl.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.larsschuetze.storyboard.dsl.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.larsschuetze.storyboard.dsl.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.larsschuetze.storyboard.dsl.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.larsschuetze.storyboard.dsl.StoryPatternNode <em>Story Pattern Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.larsschuetze.storyboard.dsl.StoryPatternNode
   * @generated
   */
  public Adapter createStoryPatternNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.larsschuetze.storyboard.dsl.RoleNode <em>Role Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.larsschuetze.storyboard.dsl.RoleNode
   * @generated
   */
  public Adapter createRoleNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.larsschuetze.storyboard.dsl.RewriteRoleNode <em>Rewrite Role Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.larsschuetze.storyboard.dsl.RewriteRoleNode
   * @generated
   */
  public Adapter createRewriteRoleNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.larsschuetze.storyboard.dsl.RemoveRoleNode <em>Remove Role Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.larsschuetze.storyboard.dsl.RemoveRoleNode
   * @generated
   */
  public Adapter createRemoveRoleNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.larsschuetze.storyboard.dsl.RenewRoleNode <em>Renew Role Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.larsschuetze.storyboard.dsl.RenewRoleNode
   * @generated
   */
  public Adapter createRenewRoleNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.larsschuetze.storyboard.dsl.AddRoleNode <em>Add Role Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.larsschuetze.storyboard.dsl.AddRoleNode
   * @generated
   */
  public Adapter createAddRoleNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.larsschuetze.storyboard.dsl.ConditionRoleNode <em>Condition Role Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.larsschuetze.storyboard.dsl.ConditionRoleNode
   * @generated
   */
  public Adapter createConditionRoleNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.larsschuetze.storyboard.dsl.ProhibitedRoleNode <em>Prohibited Role Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.larsschuetze.storyboard.dsl.ProhibitedRoleNode
   * @generated
   */
  public Adapter createProhibitedRoleNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.larsschuetze.storyboard.dsl.PlayRoleNode <em>Play Role Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.larsschuetze.storyboard.dsl.PlayRoleNode
   * @generated
   */
  public Adapter createPlayRoleNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DslAdapterFactory
