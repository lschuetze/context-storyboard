/**
 */
package de.larsschuetze.storyboard.model.crom.crom_l1.impl;

import de.larsschuetze.storyboard.model.crom.crom_l1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Crom_l1FactoryImpl extends EFactoryImpl implements Crom_l1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Crom_l1Factory init() {
		try {
			Crom_l1Factory theCrom_l1Factory = (Crom_l1Factory)EPackage.Registry.INSTANCE.getEFactory(Crom_l1Package.eNS_URI);
			if (theCrom_l1Factory != null) {
				return theCrom_l1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Crom_l1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crom_l1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Crom_l1Package.MODEL: return createModel();
			case Crom_l1Package.RIGID_TYPE: return createRigidType();
			case Crom_l1Package.GROUP: return createGroup();
			case Crom_l1Package.PARAMETER: return createParameter();
			case Crom_l1Package.OPERATION: return createOperation();
			case Crom_l1Package.ATTRIBUTE: return createAttribute();
			case Crom_l1Package.TYPE: return createType();
			case Crom_l1Package.NATURAL_TYPE: return createNaturalType();
			case Crom_l1Package.ROLE_TYPE: return createRoleType();
			case Crom_l1Package.FULFILLMENT: return createFulfillment();
			case Crom_l1Package.INHERITANCE: return createInheritance();
			case Crom_l1Package.NATURAL_INHERITANCE: return createNaturalInheritance();
			case Crom_l1Package.PART: return createPart();
			case Crom_l1Package.COMPARTMENT_TYPE: return createCompartmentType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RigidType createRigidType() {
		RigidTypeImpl rigidType = new RigidTypeImpl();
		return rigidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalType createNaturalType() {
		NaturalTypeImpl naturalType = new NaturalTypeImpl();
		return naturalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType createRoleType() {
		RoleTypeImpl roleType = new RoleTypeImpl();
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fulfillment createFulfillment() {
		FulfillmentImpl fulfillment = new FulfillmentImpl();
		return fulfillment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance createInheritance() {
		InheritanceImpl inheritance = new InheritanceImpl();
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalInheritance createNaturalInheritance() {
		NaturalInheritanceImpl naturalInheritance = new NaturalInheritanceImpl();
		return naturalInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part createPart() {
		PartImpl part = new PartImpl();
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentType createCompartmentType() {
		CompartmentTypeImpl compartmentType = new CompartmentTypeImpl();
		return compartmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crom_l1Package getCrom_l1Package() {
		return (Crom_l1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Crom_l1Package getPackage() {
		return Crom_l1Package.eINSTANCE;
	}

} //Crom_l1FactoryImpl
