/**
 */
package de.larsschuetze.storyboard.model.crom.crom_l1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Crom_l1Factory
 * @model kind="package"
 * @generated
 */
public interface Crom_l1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "crom_l1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/org.rosi.crom.familymetamodel/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "crom_l1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Crom_l1Package eINSTANCE = de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl.init();

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.NamedElement <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.NamedElement
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.ModelElement <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.ModelElement
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__RELATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.ModelImpl
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.RelationTargetImpl <em>Relation Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.RelationTargetImpl
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getRelationTarget()
	 * @generated
	 */
	int RELATION_TARGET = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET__INCOMING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relation Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.TypeImpl
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getType()
	 * @generated
	 */
	int TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = RELATION_TARGET__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__INCOMING = RELATION_TARGET__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OUTGOING = RELATION_TARGET__OUTGOING;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ATTRIBUTES = RELATION_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OPERATIONS = RELATION_TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = RELATION_TARGET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = RELATION_TARGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.RigidTypeImpl <em>Rigid Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.RigidTypeImpl
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getRigidType()
	 * @generated
	 */
	int RIGID_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_TYPE__INCOMING = TYPE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_TYPE__OUTGOING = TYPE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_TYPE__ATTRIBUTES = TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_TYPE__OPERATIONS = TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_TYPE__RELATIONS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rigid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rigid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.GroupImpl
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__RELATIONS = MODEL_ELEMENT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ELEMENTS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.RelationImpl
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 5;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.TypedElementImpl
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.ParameterImpl
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.OperationImpl
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMS = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATION = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNER = TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.AttributeImpl
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OWNER = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.NaturalTypeImpl <em>Natural Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.NaturalTypeImpl
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getNaturalType()
	 * @generated
	 */
	int NATURAL_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE__NAME = RIGID_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE__INCOMING = RIGID_TYPE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE__OUTGOING = RIGID_TYPE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE__ATTRIBUTES = RIGID_TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE__OPERATIONS = RIGID_TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE__RELATIONS = RIGID_TYPE__RELATIONS;

	/**
	 * The number of structural features of the '<em>Natural Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE_FEATURE_COUNT = RIGID_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Natural Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE_OPERATION_COUNT = RIGID_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.AbstractRole <em>Abstract Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.AbstractRole
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getAbstractRole()
	 * @generated
	 */
	int ABSTRACT_ROLE = 16;

	/**
	 * The number of structural features of the '<em>Abstract Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ROLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.RoleTypeImpl <em>Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.RoleTypeImpl
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__NAME = ABSTRACT_ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__INCOMING = ABSTRACT_ROLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__OUTGOING = ABSTRACT_ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_FEATURE_COUNT = ABSTRACT_ROLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_OPERATION_COUNT = ABSTRACT_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.FulfillmentImpl <em>Fulfillment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.FulfillmentImpl
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getFulfillment()
	 * @generated
	 */
	int FULFILLMENT = 12;

	/**
	 * The feature id for the '<em><b>Filled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT__FILLED = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT__FILLER = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fulfillment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fulfillment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.InheritanceImpl
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 13;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.NaturalInheritanceImpl <em>Natural Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.NaturalInheritanceImpl
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getNaturalInheritance()
	 * @generated
	 */
	int NATURAL_INHERITANCE = 14;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_INHERITANCE__SUPER = INHERITANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_INHERITANCE__SUB = INHERITANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Natural Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_INHERITANCE_FEATURE_COUNT = INHERITANCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Natural Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_INHERITANCE_OPERATION_COUNT = INHERITANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Player <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Player
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 17;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.PartImpl
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getPart()
	 * @generated
	 */
	int PART = 19;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__ROLES = 0;

	/**
	 * The feature id for the '<em><b>Whole</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__WHOLE = 1;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.CompartmentTypeImpl <em>Compartment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.CompartmentTypeImpl
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getCompartmentType()
	 * @generated
	 */
	int COMPARTMENT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE__NAME = RELATION_TARGET__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE__INCOMING = RELATION_TARGET__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE__OUTGOING = RELATION_TARGET__OUTGOING;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE__RELATIONS = RELATION_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE__PARTS = RELATION_TARGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE__CONTAINS = RELATION_TARGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fulfillments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE__FULFILLMENTS = RELATION_TARGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Compartment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE_FEATURE_COUNT = RELATION_TARGET_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Compartment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE_OPERATION_COUNT = RELATION_TARGET_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.larsschuetze.storyboard.model.crom.crom_l1.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the reference list '{@link de.larsschuetze.storyboard.model.crom.crom_l1.ModelElement#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relations</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.ModelElement#getRelations()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Relations();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Elements();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.RigidType <em>Rigid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rigid Type</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.RigidType
	 * @generated
	 */
	EClass getRigidType();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference list '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Operation#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Params</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Operation#getParams()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Params();

	/**
	 * Returns the meta object for the attribute '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Operation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Operation#getOperation()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Operation();

	/**
	 * Returns the meta object for the container reference '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Operation#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Operation#getOwner()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Owner();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the container reference '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Attribute#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Attribute#getOwner()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Owner();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Type#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Type#getAttributes()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Type#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Type#getOperations()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Operations();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.NaturalType <em>Natural Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Type</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.NaturalType
	 * @generated
	 */
	EClass getNaturalType();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.RoleType
	 * @generated
	 */
	EClass getRoleType();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Fulfillment <em>Fulfillment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fulfillment</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Fulfillment
	 * @generated
	 */
	EClass getFulfillment();

	/**
	 * Returns the meta object for the reference '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Fulfillment#getFilled <em>Filled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filled</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Fulfillment#getFilled()
	 * @see #getFulfillment()
	 * @generated
	 */
	EReference getFulfillment_Filled();

	/**
	 * Returns the meta object for the reference '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Fulfillment#getFiller <em>Filler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filler</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Fulfillment#getFiller()
	 * @see #getFulfillment()
	 * @generated
	 */
	EReference getFulfillment_Filler();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.NaturalInheritance <em>Natural Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Inheritance</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.NaturalInheritance
	 * @generated
	 */
	EClass getNaturalInheritance();

	/**
	 * Returns the meta object for the reference '{@link de.larsschuetze.storyboard.model.crom.crom_l1.NaturalInheritance#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.NaturalInheritance#getSuper()
	 * @see #getNaturalInheritance()
	 * @generated
	 */
	EReference getNaturalInheritance_Super();

	/**
	 * Returns the meta object for the reference '{@link de.larsschuetze.storyboard.model.crom.crom_l1.NaturalInheritance#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.NaturalInheritance#getSub()
	 * @see #getNaturalInheritance()
	 * @generated
	 */
	EReference getNaturalInheritance_Sub();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.RelationTarget <em>Relation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Target</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.RelationTarget
	 * @generated
	 */
	EClass getRelationTarget();

	/**
	 * Returns the meta object for the reference list '{@link de.larsschuetze.storyboard.model.crom.crom_l1.RelationTarget#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.RelationTarget#getIncoming()
	 * @see #getRelationTarget()
	 * @generated
	 */
	EReference getRelationTarget_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link de.larsschuetze.storyboard.model.crom.crom_l1.RelationTarget#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.RelationTarget#getOutgoing()
	 * @see #getRelationTarget()
	 * @generated
	 */
	EReference getRelationTarget_Outgoing();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.AbstractRole <em>Abstract Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Role</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.AbstractRole
	 * @generated
	 */
	EClass getAbstractRole();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the reference '{@link de.larsschuetze.storyboard.model.crom.crom_l1.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the containment reference '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Part#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Roles</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Part#getRoles()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Roles();

	/**
	 * Returns the meta object for the container reference '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Part#getWhole <em>Whole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Whole</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Part#getWhole()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Whole();

	/**
	 * Returns the meta object for class '{@link de.larsschuetze.storyboard.model.crom.crom_l1.CompartmentType <em>Compartment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment Type</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.CompartmentType
	 * @generated
	 */
	EClass getCompartmentType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.larsschuetze.storyboard.model.crom.crom_l1.CompartmentType#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.CompartmentType#getParts()
	 * @see #getCompartmentType()
	 * @generated
	 */
	EReference getCompartmentType_Parts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.larsschuetze.storyboard.model.crom.crom_l1.CompartmentType#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.CompartmentType#getContains()
	 * @see #getCompartmentType()
	 * @generated
	 */
	EReference getCompartmentType_Contains();

	/**
	 * Returns the meta object for the containment reference list '{@link de.larsschuetze.storyboard.model.crom.crom_l1.CompartmentType#getFulfillments <em>Fulfillments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fulfillments</em>'.
	 * @see de.larsschuetze.storyboard.model.crom.crom_l1.CompartmentType#getFulfillments()
	 * @see #getCompartmentType()
	 * @generated
	 */
	EReference getCompartmentType_Fulfillments();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Crom_l1Factory getCrom_l1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.NamedElement <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.NamedElement
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.ModelElement <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.ModelElement
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__RELATIONS = eINSTANCE.getModelElement_Relations();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.ModelImpl
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.RigidTypeImpl <em>Rigid Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.RigidTypeImpl
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getRigidType()
		 * @generated
		 */
		EClass RIGID_TYPE = eINSTANCE.getRigidType();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.GroupImpl
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.RelationImpl
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.ParameterImpl
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.OperationImpl
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMS = eINSTANCE.getOperation_Params();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__OPERATION = eINSTANCE.getOperation_Operation();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OWNER = eINSTANCE.getOperation_Owner();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.AttributeImpl
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__OWNER = eINSTANCE.getAttribute_Owner();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.TypeImpl
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__ATTRIBUTES = eINSTANCE.getType_Attributes();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__OPERATIONS = eINSTANCE.getType_Operations();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.NaturalTypeImpl <em>Natural Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.NaturalTypeImpl
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getNaturalType()
		 * @generated
		 */
		EClass NATURAL_TYPE = eINSTANCE.getNaturalType();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.RoleTypeImpl <em>Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.RoleTypeImpl
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getRoleType()
		 * @generated
		 */
		EClass ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.FulfillmentImpl <em>Fulfillment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.FulfillmentImpl
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getFulfillment()
		 * @generated
		 */
		EClass FULFILLMENT = eINSTANCE.getFulfillment();

		/**
		 * The meta object literal for the '<em><b>Filled</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULFILLMENT__FILLED = eINSTANCE.getFulfillment_Filled();

		/**
		 * The meta object literal for the '<em><b>Filler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULFILLMENT__FILLER = eINSTANCE.getFulfillment_Filler();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.InheritanceImpl <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.InheritanceImpl
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getInheritance()
		 * @generated
		 */
		EClass INHERITANCE = eINSTANCE.getInheritance();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.NaturalInheritanceImpl <em>Natural Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.NaturalInheritanceImpl
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getNaturalInheritance()
		 * @generated
		 */
		EClass NATURAL_INHERITANCE = eINSTANCE.getNaturalInheritance();

		/**
		 * The meta object literal for the '<em><b>Super</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATURAL_INHERITANCE__SUPER = eINSTANCE.getNaturalInheritance_Super();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATURAL_INHERITANCE__SUB = eINSTANCE.getNaturalInheritance_Sub();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.RelationTargetImpl <em>Relation Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.RelationTargetImpl
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getRelationTarget()
		 * @generated
		 */
		EClass RELATION_TARGET = eINSTANCE.getRelationTarget();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_TARGET__INCOMING = eINSTANCE.getRelationTarget_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_TARGET__OUTGOING = eINSTANCE.getRelationTarget_Outgoing();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.AbstractRole <em>Abstract Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.AbstractRole
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getAbstractRole()
		 * @generated
		 */
		EClass ABSTRACT_ROLE = eINSTANCE.getAbstractRole();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.Player <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.Player
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.TypedElementImpl
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.PartImpl
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__ROLES = eINSTANCE.getPart_Roles();

		/**
		 * The meta object literal for the '<em><b>Whole</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__WHOLE = eINSTANCE.getPart_Whole();

		/**
		 * The meta object literal for the '{@link de.larsschuetze.storyboard.model.crom.crom_l1.impl.CompartmentTypeImpl <em>Compartment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.CompartmentTypeImpl
		 * @see de.larsschuetze.storyboard.model.crom.crom_l1.impl.Crom_l1PackageImpl#getCompartmentType()
		 * @generated
		 */
		EClass COMPARTMENT_TYPE = eINSTANCE.getCompartmentType();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_TYPE__PARTS = eINSTANCE.getCompartmentType_Parts();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_TYPE__CONTAINS = eINSTANCE.getCompartmentType_Contains();

		/**
		 * The meta object literal for the '<em><b>Fulfillments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_TYPE__FULFILLMENTS = eINSTANCE.getCompartmentType_Fulfillments();

	}

} //Crom_l1Package
