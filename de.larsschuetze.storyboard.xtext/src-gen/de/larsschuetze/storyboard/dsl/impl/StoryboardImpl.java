/**
 * generated by Xtext 2.9.1
 */
package de.larsschuetze.storyboard.dsl.impl;

import de.larsschuetze.storyboard.dsl.AbstractElement;
import de.larsschuetze.storyboard.dsl.DslPackage;
import de.larsschuetze.storyboard.dsl.Event;
import de.larsschuetze.storyboard.dsl.Storyboard;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storyboard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.larsschuetze.storyboard.dsl.impl.StoryboardImpl#getImportedEvents <em>Imported Events</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.dsl.impl.StoryboardImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.larsschuetze.storyboard.dsl.impl.StoryboardImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoryboardImpl extends MinimalEObjectImpl.Container implements Storyboard
{
  /**
   * The cached value of the '{@link #getImportedEvents() <em>Imported Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedEvents()
   * @generated
   * @ordered
   */
  protected EList<Event> importedEvents;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<AbstractElement> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StoryboardImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DslPackage.Literals.STORYBOARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getImportedEvents()
  {
    if (importedEvents == null)
    {
      importedEvents = new EObjectContainmentEList<Event>(Event.class, this, DslPackage.STORYBOARD__IMPORTED_EVENTS);
    }
    return importedEvents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.STORYBOARD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<AbstractElement>(AbstractElement.class, this, DslPackage.STORYBOARD__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DslPackage.STORYBOARD__IMPORTED_EVENTS:
        return ((InternalEList<?>)getImportedEvents()).basicRemove(otherEnd, msgs);
      case DslPackage.STORYBOARD__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DslPackage.STORYBOARD__IMPORTED_EVENTS:
        return getImportedEvents();
      case DslPackage.STORYBOARD__NAME:
        return getName();
      case DslPackage.STORYBOARD__ELEMENTS:
        return getElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslPackage.STORYBOARD__IMPORTED_EVENTS:
        getImportedEvents().clear();
        getImportedEvents().addAll((Collection<? extends Event>)newValue);
        return;
      case DslPackage.STORYBOARD__NAME:
        setName((String)newValue);
        return;
      case DslPackage.STORYBOARD__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends AbstractElement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.STORYBOARD__IMPORTED_EVENTS:
        getImportedEvents().clear();
        return;
      case DslPackage.STORYBOARD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DslPackage.STORYBOARD__ELEMENTS:
        getElements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.STORYBOARD__IMPORTED_EVENTS:
        return importedEvents != null && !importedEvents.isEmpty();
      case DslPackage.STORYBOARD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DslPackage.STORYBOARD__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StoryboardImpl
