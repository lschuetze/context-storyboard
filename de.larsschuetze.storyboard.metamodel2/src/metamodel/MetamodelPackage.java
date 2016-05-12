/**
 */
package metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see metamodel.MetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelPackage eINSTANCE = metamodel.impl.MetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link metamodel.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.EdgeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.NodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IN = 0;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUT = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.RoleStoryBoardImpl <em>Role Story Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.RoleStoryBoardImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getRoleStoryBoard()
	 * @generated
	 */
	int ROLE_STORY_BOARD = 2;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_STORY_BOARD__NODES = 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_STORY_BOARD__EDGES = 1;

	/**
	 * The number of structural features of the '<em>Role Story Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_STORY_BOARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Role Story Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_STORY_BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.TransitionConstraintImpl <em>Transition Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.TransitionConstraintImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getTransitionConstraint()
	 * @generated
	 */
	int TRANSITION_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONSTRAINT__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONSTRAINT__GUARD = 1;

	/**
	 * The number of structural features of the '<em>Transition Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transition Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.EventImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Call Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___CALL_METHOD__STRING_ELIST = 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link metamodel.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.GuardImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 5;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__EVENT = 1;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.RelationImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 6;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__FIRST = 0;

	/**
	 * The feature id for the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SECOND = 1;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.StoryPatternNodeImpl <em>Story Pattern Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.StoryPatternNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getStoryPatternNode()
	 * @generated
	 */
	int STORY_PATTERN_NODE = 7;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE__IN = NODE__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE__OUT = NODE__OUT;

	/**
	 * The feature id for the '<em><b>Role Model Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE__ROLE_MODEL_NODES = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Story Pattern Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Story Pattern Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.ControlNodeImpl <em>Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.ControlNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getControlNode()
	 * @generated
	 */
	int CONTROL_NODE = 8;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__IN = NODE__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__OUT = NODE__OUT;

	/**
	 * The number of structural features of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.RoleModelNodeImpl <em>Role Model Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.RoleModelNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getRoleModelNode()
	 * @generated
	 */
	int ROLE_MODEL_NODE = 9;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL_NODE__IN = NODE__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL_NODE__OUT = NODE__OUT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL_NODE__ELEMENTS = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL_NODE__NAME = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Model Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Role Model Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.RoleModelElementImpl <em>Role Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.RoleModelElementImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getRoleModelElement()
	 * @generated
	 */
	int ROLE_MODEL_ELEMENT = 10;

	/**
	 * The number of structural features of the '<em>Role Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Role Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.RoleNodeImpl <em>Role Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.RoleNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getRoleNode()
	 * @generated
	 */
	int ROLE_NODE = 11;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NODE__RELATIONS = ROLE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NODE__NAME = ROLE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NODE__COMPARTMENT = ROLE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NODE__PLAYER = ROLE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Role Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NODE_FEATURE_COUNT = ROLE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Role Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NODE_OPERATION_COUNT = ROLE_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.NaturalNodeImpl <em>Natural Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.NaturalNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getNaturalNode()
	 * @generated
	 */
	int NATURAL_NODE = 12;

	/**
	 * The feature id for the '<em><b>Playing Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NODE__PLAYING_OBJECT = ROLE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NODE__ROLES = ROLE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Natural Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NODE_FEATURE_COUNT = ROLE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Natural Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_NODE_OPERATION_COUNT = ROLE_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.SuccessNodeImpl <em>Success Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.SuccessNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getSuccessNode()
	 * @generated
	 */
	int SUCCESS_NODE = 13;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_NODE__IN = CONTROL_NODE__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_NODE__OUT = CONTROL_NODE__OUT;

	/**
	 * The number of structural features of the '<em>Success Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Success Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.FailNodeImpl <em>Fail Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.FailNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getFailNode()
	 * @generated
	 */
	int FAIL_NODE = 14;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIL_NODE__IN = CONTROL_NODE__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIL_NODE__OUT = CONTROL_NODE__OUT;

	/**
	 * The number of structural features of the '<em>Fail Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fail Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIL_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.ForkNodeImpl <em>Fork Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.ForkNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getForkNode()
	 * @generated
	 */
	int FORK_NODE = 15;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__IN = CONTROL_NODE__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__OUT = CONTROL_NODE__OUT;

	/**
	 * The number of structural features of the '<em>Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.JoinNodeImpl <em>Join Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.JoinNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getJoinNode()
	 * @generated
	 */
	int JOIN_NODE = 16;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__IN = CONTROL_NODE__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__OUT = CONTROL_NODE__OUT;

	/**
	 * The feature id for the '<em><b>Join Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__JOIN_SPEC = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.StartNodeImpl <em>Start Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.StartNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getStartNode()
	 * @generated
	 */
	int START_NODE = 17;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE__IN = CONTROL_NODE__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE__OUT = CONTROL_NODE__OUT;

	/**
	 * The number of structural features of the '<em>Start Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.EndNoteImpl <em>End Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.EndNoteImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getEndNote()
	 * @generated
	 */
	int END_NOTE = 18;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NOTE__IN = CONTROL_NODE__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NOTE__OUT = CONTROL_NODE__OUT;

	/**
	 * The number of structural features of the '<em>End Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NOTE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NOTE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.SinkNodeImpl <em>Sink Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.SinkNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getSinkNode()
	 * @generated
	 */
	int SINK_NODE = 19;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE__IN = CONTROL_NODE__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE__OUT = CONTROL_NODE__OUT;

	/**
	 * The number of structural features of the '<em>Sink Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sink Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.ConditionRoleNodeImpl <em>Condition Role Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.ConditionRoleNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getConditionRoleNode()
	 * @generated
	 */
	int CONDITION_ROLE_NODE = 22;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ROLE_NODE__RELATIONS = ROLE_NODE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ROLE_NODE__NAME = ROLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ROLE_NODE__COMPARTMENT = ROLE_NODE__COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ROLE_NODE__PLAYER = ROLE_NODE__PLAYER;

	/**
	 * The number of structural features of the '<em>Condition Role Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ROLE_NODE_FEATURE_COUNT = ROLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Condition Role Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ROLE_NODE_OPERATION_COUNT = ROLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.PlayRoleNodeImpl <em>Play Role Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.PlayRoleNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getPlayRoleNode()
	 * @generated
	 */
	int PLAY_ROLE_NODE = 20;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_ROLE_NODE__RELATIONS = CONDITION_ROLE_NODE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_ROLE_NODE__NAME = CONDITION_ROLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_ROLE_NODE__COMPARTMENT = CONDITION_ROLE_NODE__COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_ROLE_NODE__PLAYER = CONDITION_ROLE_NODE__PLAYER;

	/**
	 * The number of structural features of the '<em>Play Role Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_ROLE_NODE_FEATURE_COUNT = CONDITION_ROLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Play Role Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_ROLE_NODE_OPERATION_COUNT = CONDITION_ROLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.RewriteRoleNodeImpl <em>Rewrite Role Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.RewriteRoleNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getRewriteRoleNode()
	 * @generated
	 */
	int REWRITE_ROLE_NODE = 23;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_ROLE_NODE__RELATIONS = ROLE_NODE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_ROLE_NODE__NAME = ROLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_ROLE_NODE__COMPARTMENT = ROLE_NODE__COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_ROLE_NODE__PLAYER = ROLE_NODE__PLAYER;

	/**
	 * The number of structural features of the '<em>Rewrite Role Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_ROLE_NODE_FEATURE_COUNT = ROLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rewrite Role Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_ROLE_NODE_OPERATION_COUNT = ROLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.AddRoleNodeImpl <em>Add Role Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.AddRoleNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getAddRoleNode()
	 * @generated
	 */
	int ADD_ROLE_NODE = 21;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ROLE_NODE__RELATIONS = REWRITE_ROLE_NODE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ROLE_NODE__NAME = REWRITE_ROLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ROLE_NODE__COMPARTMENT = REWRITE_ROLE_NODE__COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ROLE_NODE__PLAYER = REWRITE_ROLE_NODE__PLAYER;

	/**
	 * The number of structural features of the '<em>Add Role Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ROLE_NODE_FEATURE_COUNT = REWRITE_ROLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add Role Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ROLE_NODE_OPERATION_COUNT = REWRITE_ROLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.RemoveRoleNodeImpl <em>Remove Role Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.RemoveRoleNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getRemoveRoleNode()
	 * @generated
	 */
	int REMOVE_ROLE_NODE = 24;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ROLE_NODE__RELATIONS = REWRITE_ROLE_NODE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ROLE_NODE__NAME = REWRITE_ROLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ROLE_NODE__COMPARTMENT = REWRITE_ROLE_NODE__COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ROLE_NODE__PLAYER = REWRITE_ROLE_NODE__PLAYER;

	/**
	 * The number of structural features of the '<em>Remove Role Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ROLE_NODE_FEATURE_COUNT = REWRITE_ROLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Remove Role Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ROLE_NODE_OPERATION_COUNT = REWRITE_ROLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.RenewRoleNodeImpl <em>Renew Role Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.RenewRoleNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getRenewRoleNode()
	 * @generated
	 */
	int RENEW_ROLE_NODE = 25;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEW_ROLE_NODE__RELATIONS = REWRITE_ROLE_NODE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEW_ROLE_NODE__NAME = REWRITE_ROLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEW_ROLE_NODE__COMPARTMENT = REWRITE_ROLE_NODE__COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEW_ROLE_NODE__PLAYER = REWRITE_ROLE_NODE__PLAYER;

	/**
	 * The number of structural features of the '<em>Renew Role Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEW_ROLE_NODE_FEATURE_COUNT = REWRITE_ROLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Renew Role Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEW_ROLE_NODE_OPERATION_COUNT = REWRITE_ROLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.ProhibitedRoleNodeImpl <em>Prohibited Role Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.ProhibitedRoleNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getProhibitedRoleNode()
	 * @generated
	 */
	int PROHIBITED_ROLE_NODE = 26;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROHIBITED_ROLE_NODE__RELATIONS = CONDITION_ROLE_NODE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROHIBITED_ROLE_NODE__NAME = CONDITION_ROLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROHIBITED_ROLE_NODE__COMPARTMENT = CONDITION_ROLE_NODE__COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROHIBITED_ROLE_NODE__PLAYER = CONDITION_ROLE_NODE__PLAYER;

	/**
	 * The number of structural features of the '<em>Prohibited Role Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROHIBITED_ROLE_NODE_FEATURE_COUNT = CONDITION_ROLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prohibited Role Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROHIBITED_ROLE_NODE_OPERATION_COUNT = CONDITION_ROLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.GenericEventImpl <em>Generic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.GenericEventImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getGenericEvent()
	 * @generated
	 */
	int GENERIC_EVENT = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EVENT__NAME = EVENT__NAME;

	/**
	 * The number of structural features of the '<em>Generic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Call Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EVENT___CALL_METHOD__STRING_ELIST = EVENT___CALL_METHOD__STRING_ELIST;

	/**
	 * The number of operations of the '<em>Generic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.ContextImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 28;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.CompartmentImpl <em>Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.CompartmentImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getCompartment()
	 * @generated
	 */
	int COMPARTMENT = 29;

	/**
	 * The number of structural features of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.JoinSpecImpl <em>Join Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.JoinSpecImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getJoinSpec()
	 * @generated
	 */
	int JOIN_SPEC = 30;

	/**
	 * The number of structural features of the '<em>Join Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_SPEC_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Join Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_SPEC_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link metamodel.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see metamodel.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel.Edge#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see metamodel.Edge#getConstraint()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Constraint();

	/**
	 * Returns the meta object for the reference '{@link metamodel.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see metamodel.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for the reference '{@link metamodel.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see metamodel.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for class '{@link metamodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see metamodel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link metamodel.Node#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see metamodel.Node#getIn()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_In();

	/**
	 * Returns the meta object for the reference list '{@link metamodel.Node#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out</em>'.
	 * @see metamodel.Node#getOut()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Out();

	/**
	 * Returns the meta object for class '{@link metamodel.RoleStoryBoard <em>Role Story Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Story Board</em>'.
	 * @see metamodel.RoleStoryBoard
	 * @generated
	 */
	EClass getRoleStoryBoard();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.RoleStoryBoard#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see metamodel.RoleStoryBoard#getNodes()
	 * @see #getRoleStoryBoard()
	 * @generated
	 */
	EReference getRoleStoryBoard_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.RoleStoryBoard#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see metamodel.RoleStoryBoard#getEdges()
	 * @see #getRoleStoryBoard()
	 * @generated
	 */
	EReference getRoleStoryBoard_Edges();

	/**
	 * Returns the meta object for class '{@link metamodel.TransitionConstraint <em>Transition Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Constraint</em>'.
	 * @see metamodel.TransitionConstraint
	 * @generated
	 */
	EClass getTransitionConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel.TransitionConstraint#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see metamodel.TransitionConstraint#getEvent()
	 * @see #getTransitionConstraint()
	 * @generated
	 */
	EReference getTransitionConstraint_Event();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel.TransitionConstraint#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see metamodel.TransitionConstraint#getGuard()
	 * @see #getTransitionConstraint()
	 * @generated
	 */
	EReference getTransitionConstraint_Guard();

	/**
	 * Returns the meta object for class '{@link metamodel.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see metamodel.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the '{@link metamodel.Event#callMethod(java.lang.String, org.eclipse.emf.common.util.EList) <em>Call Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call Method</em>' operation.
	 * @see metamodel.Event#callMethod(java.lang.String, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getEvent__CallMethod__String_EList();

	/**
	 * Returns the meta object for class '{@link metamodel.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see metamodel.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for the reference '{@link metamodel.Guard#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see metamodel.Guard#getContext()
	 * @see #getGuard()
	 * @generated
	 */
	EReference getGuard_Context();

	/**
	 * Returns the meta object for the reference '{@link metamodel.Guard#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see metamodel.Guard#getEvent()
	 * @see #getGuard()
	 * @generated
	 */
	EReference getGuard_Event();

	/**
	 * Returns the meta object for class '{@link metamodel.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see metamodel.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link metamodel.Relation#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see metamodel.Relation#getFirst()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_First();

	/**
	 * Returns the meta object for the reference '{@link metamodel.Relation#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second</em>'.
	 * @see metamodel.Relation#getSecond()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Second();

	/**
	 * Returns the meta object for class '{@link metamodel.StoryPatternNode <em>Story Pattern Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern Node</em>'.
	 * @see metamodel.StoryPatternNode
	 * @generated
	 */
	EClass getStoryPatternNode();

	/**
	 * Returns the meta object for the reference list '{@link metamodel.StoryPatternNode#getRoleModelNodes <em>Role Model Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role Model Nodes</em>'.
	 * @see metamodel.StoryPatternNode#getRoleModelNodes()
	 * @see #getStoryPatternNode()
	 * @generated
	 */
	EReference getStoryPatternNode_RoleModelNodes();

	/**
	 * Returns the meta object for class '{@link metamodel.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node</em>'.
	 * @see metamodel.ControlNode
	 * @generated
	 */
	EClass getControlNode();

	/**
	 * Returns the meta object for class '{@link metamodel.RoleModelNode <em>Role Model Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Model Node</em>'.
	 * @see metamodel.RoleModelNode
	 * @generated
	 */
	EClass getRoleModelNode();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.RoleModelNode#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see metamodel.RoleModelNode#getElements()
	 * @see #getRoleModelNode()
	 * @generated
	 */
	EReference getRoleModelNode_Elements();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.RoleModelNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel.RoleModelNode#getName()
	 * @see #getRoleModelNode()
	 * @generated
	 */
	EAttribute getRoleModelNode_Name();

	/**
	 * Returns the meta object for class '{@link metamodel.RoleModelElement <em>Role Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Model Element</em>'.
	 * @see metamodel.RoleModelElement
	 * @generated
	 */
	EClass getRoleModelElement();

	/**
	 * Returns the meta object for class '{@link metamodel.RoleNode <em>Role Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Node</em>'.
	 * @see metamodel.RoleNode
	 * @generated
	 */
	EClass getRoleNode();

	/**
	 * Returns the meta object for the reference list '{@link metamodel.RoleNode#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relations</em>'.
	 * @see metamodel.RoleNode#getRelations()
	 * @see #getRoleNode()
	 * @generated
	 */
	EReference getRoleNode_Relations();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.RoleNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel.RoleNode#getName()
	 * @see #getRoleNode()
	 * @generated
	 */
	EAttribute getRoleNode_Name();

	/**
	 * Returns the meta object for the reference '{@link metamodel.RoleNode#getCompartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compartment</em>'.
	 * @see metamodel.RoleNode#getCompartment()
	 * @see #getRoleNode()
	 * @generated
	 */
	EReference getRoleNode_Compartment();

	/**
	 * Returns the meta object for the reference '{@link metamodel.RoleNode#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see metamodel.RoleNode#getPlayer()
	 * @see #getRoleNode()
	 * @generated
	 */
	EReference getRoleNode_Player();

	/**
	 * Returns the meta object for class '{@link metamodel.NaturalNode <em>Natural Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Node</em>'.
	 * @see metamodel.NaturalNode
	 * @generated
	 */
	EClass getNaturalNode();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.NaturalNode#getPlayingObject <em>Playing Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Playing Object</em>'.
	 * @see metamodel.NaturalNode#getPlayingObject()
	 * @see #getNaturalNode()
	 * @generated
	 */
	EAttribute getNaturalNode_PlayingObject();

	/**
	 * Returns the meta object for the reference list '{@link metamodel.NaturalNode#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see metamodel.NaturalNode#getRoles()
	 * @see #getNaturalNode()
	 * @generated
	 */
	EReference getNaturalNode_Roles();

	/**
	 * Returns the meta object for class '{@link metamodel.SuccessNode <em>Success Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Success Node</em>'.
	 * @see metamodel.SuccessNode
	 * @generated
	 */
	EClass getSuccessNode();

	/**
	 * Returns the meta object for class '{@link metamodel.FailNode <em>Fail Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fail Node</em>'.
	 * @see metamodel.FailNode
	 * @generated
	 */
	EClass getFailNode();

	/**
	 * Returns the meta object for class '{@link metamodel.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node</em>'.
	 * @see metamodel.ForkNode
	 * @generated
	 */
	EClass getForkNode();

	/**
	 * Returns the meta object for class '{@link metamodel.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node</em>'.
	 * @see metamodel.JoinNode
	 * @generated
	 */
	EClass getJoinNode();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel.JoinNode#getJoinSpec <em>Join Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Spec</em>'.
	 * @see metamodel.JoinNode#getJoinSpec()
	 * @see #getJoinNode()
	 * @generated
	 */
	EReference getJoinNode_JoinSpec();

	/**
	 * Returns the meta object for class '{@link metamodel.StartNode <em>Start Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Node</em>'.
	 * @see metamodel.StartNode
	 * @generated
	 */
	EClass getStartNode();

	/**
	 * Returns the meta object for class '{@link metamodel.EndNote <em>End Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Note</em>'.
	 * @see metamodel.EndNote
	 * @generated
	 */
	EClass getEndNote();

	/**
	 * Returns the meta object for class '{@link metamodel.SinkNode <em>Sink Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink Node</em>'.
	 * @see metamodel.SinkNode
	 * @generated
	 */
	EClass getSinkNode();

	/**
	 * Returns the meta object for class '{@link metamodel.PlayRoleNode <em>Play Role Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Play Role Node</em>'.
	 * @see metamodel.PlayRoleNode
	 * @generated
	 */
	EClass getPlayRoleNode();

	/**
	 * Returns the meta object for class '{@link metamodel.AddRoleNode <em>Add Role Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Role Node</em>'.
	 * @see metamodel.AddRoleNode
	 * @generated
	 */
	EClass getAddRoleNode();

	/**
	 * Returns the meta object for class '{@link metamodel.ConditionRoleNode <em>Condition Role Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Role Node</em>'.
	 * @see metamodel.ConditionRoleNode
	 * @generated
	 */
	EClass getConditionRoleNode();

	/**
	 * Returns the meta object for class '{@link metamodel.RewriteRoleNode <em>Rewrite Role Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rewrite Role Node</em>'.
	 * @see metamodel.RewriteRoleNode
	 * @generated
	 */
	EClass getRewriteRoleNode();

	/**
	 * Returns the meta object for class '{@link metamodel.RemoveRoleNode <em>Remove Role Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Role Node</em>'.
	 * @see metamodel.RemoveRoleNode
	 * @generated
	 */
	EClass getRemoveRoleNode();

	/**
	 * Returns the meta object for class '{@link metamodel.RenewRoleNode <em>Renew Role Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Renew Role Node</em>'.
	 * @see metamodel.RenewRoleNode
	 * @generated
	 */
	EClass getRenewRoleNode();

	/**
	 * Returns the meta object for class '{@link metamodel.ProhibitedRoleNode <em>Prohibited Role Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prohibited Role Node</em>'.
	 * @see metamodel.ProhibitedRoleNode
	 * @generated
	 */
	EClass getProhibitedRoleNode();

	/**
	 * Returns the meta object for class '{@link metamodel.GenericEvent <em>Generic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Event</em>'.
	 * @see metamodel.GenericEvent
	 * @generated
	 */
	EClass getGenericEvent();

	/**
	 * Returns the meta object for class '{@link metamodel.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see metamodel.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link metamodel.Compartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment</em>'.
	 * @see metamodel.Compartment
	 * @generated
	 */
	EClass getCompartment();

	/**
	 * Returns the meta object for class '{@link metamodel.JoinSpec <em>Join Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Spec</em>'.
	 * @see metamodel.JoinSpec
	 * @generated
	 */
	EClass getJoinSpec();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodelFactory getMetamodelFactory();

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
		 * The meta object literal for the '{@link metamodel.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.EdgeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__CONSTRAINT = eINSTANCE.getEdge_Constraint();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '{@link metamodel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.NodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__IN = eINSTANCE.getNode_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUT = eINSTANCE.getNode_Out();

		/**
		 * The meta object literal for the '{@link metamodel.impl.RoleStoryBoardImpl <em>Role Story Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.RoleStoryBoardImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getRoleStoryBoard()
		 * @generated
		 */
		EClass ROLE_STORY_BOARD = eINSTANCE.getRoleStoryBoard();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_STORY_BOARD__NODES = eINSTANCE.getRoleStoryBoard_Nodes();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_STORY_BOARD__EDGES = eINSTANCE.getRoleStoryBoard_Edges();

		/**
		 * The meta object literal for the '{@link metamodel.impl.TransitionConstraintImpl <em>Transition Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.TransitionConstraintImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getTransitionConstraint()
		 * @generated
		 */
		EClass TRANSITION_CONSTRAINT = eINSTANCE.getTransitionConstraint();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_CONSTRAINT__EVENT = eINSTANCE.getTransitionConstraint_Event();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_CONSTRAINT__GUARD = eINSTANCE.getTransitionConstraint_Guard();

		/**
		 * The meta object literal for the '{@link metamodel.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.EventImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Call Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVENT___CALL_METHOD__STRING_ELIST = eINSTANCE.getEvent__CallMethod__String_EList();

		/**
		 * The meta object literal for the '{@link metamodel.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.GuardImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD__CONTEXT = eINSTANCE.getGuard_Context();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD__EVENT = eINSTANCE.getGuard_Event();

		/**
		 * The meta object literal for the '{@link metamodel.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.RelationImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__FIRST = eINSTANCE.getRelation_First();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__SECOND = eINSTANCE.getRelation_Second();

		/**
		 * The meta object literal for the '{@link metamodel.impl.StoryPatternNodeImpl <em>Story Pattern Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.StoryPatternNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getStoryPatternNode()
		 * @generated
		 */
		EClass STORY_PATTERN_NODE = eINSTANCE.getStoryPatternNode();

		/**
		 * The meta object literal for the '<em><b>Role Model Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN_NODE__ROLE_MODEL_NODES = eINSTANCE.getStoryPatternNode_RoleModelNodes();

		/**
		 * The meta object literal for the '{@link metamodel.impl.ControlNodeImpl <em>Control Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.ControlNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getControlNode()
		 * @generated
		 */
		EClass CONTROL_NODE = eINSTANCE.getControlNode();

		/**
		 * The meta object literal for the '{@link metamodel.impl.RoleModelNodeImpl <em>Role Model Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.RoleModelNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getRoleModelNode()
		 * @generated
		 */
		EClass ROLE_MODEL_NODE = eINSTANCE.getRoleModelNode();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_MODEL_NODE__ELEMENTS = eINSTANCE.getRoleModelNode_Elements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_MODEL_NODE__NAME = eINSTANCE.getRoleModelNode_Name();

		/**
		 * The meta object literal for the '{@link metamodel.impl.RoleModelElementImpl <em>Role Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.RoleModelElementImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getRoleModelElement()
		 * @generated
		 */
		EClass ROLE_MODEL_ELEMENT = eINSTANCE.getRoleModelElement();

		/**
		 * The meta object literal for the '{@link metamodel.impl.RoleNodeImpl <em>Role Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.RoleNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getRoleNode()
		 * @generated
		 */
		EClass ROLE_NODE = eINSTANCE.getRoleNode();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_NODE__RELATIONS = eINSTANCE.getRoleNode_Relations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_NODE__NAME = eINSTANCE.getRoleNode_Name();

		/**
		 * The meta object literal for the '<em><b>Compartment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_NODE__COMPARTMENT = eINSTANCE.getRoleNode_Compartment();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_NODE__PLAYER = eINSTANCE.getRoleNode_Player();

		/**
		 * The meta object literal for the '{@link metamodel.impl.NaturalNodeImpl <em>Natural Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.NaturalNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getNaturalNode()
		 * @generated
		 */
		EClass NATURAL_NODE = eINSTANCE.getNaturalNode();

		/**
		 * The meta object literal for the '<em><b>Playing Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATURAL_NODE__PLAYING_OBJECT = eINSTANCE.getNaturalNode_PlayingObject();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATURAL_NODE__ROLES = eINSTANCE.getNaturalNode_Roles();

		/**
		 * The meta object literal for the '{@link metamodel.impl.SuccessNodeImpl <em>Success Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.SuccessNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getSuccessNode()
		 * @generated
		 */
		EClass SUCCESS_NODE = eINSTANCE.getSuccessNode();

		/**
		 * The meta object literal for the '{@link metamodel.impl.FailNodeImpl <em>Fail Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.FailNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getFailNode()
		 * @generated
		 */
		EClass FAIL_NODE = eINSTANCE.getFailNode();

		/**
		 * The meta object literal for the '{@link metamodel.impl.ForkNodeImpl <em>Fork Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.ForkNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getForkNode()
		 * @generated
		 */
		EClass FORK_NODE = eINSTANCE.getForkNode();

		/**
		 * The meta object literal for the '{@link metamodel.impl.JoinNodeImpl <em>Join Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.JoinNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getJoinNode()
		 * @generated
		 */
		EClass JOIN_NODE = eINSTANCE.getJoinNode();

		/**
		 * The meta object literal for the '<em><b>Join Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_NODE__JOIN_SPEC = eINSTANCE.getJoinNode_JoinSpec();

		/**
		 * The meta object literal for the '{@link metamodel.impl.StartNodeImpl <em>Start Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.StartNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getStartNode()
		 * @generated
		 */
		EClass START_NODE = eINSTANCE.getStartNode();

		/**
		 * The meta object literal for the '{@link metamodel.impl.EndNoteImpl <em>End Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.EndNoteImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getEndNote()
		 * @generated
		 */
		EClass END_NOTE = eINSTANCE.getEndNote();

		/**
		 * The meta object literal for the '{@link metamodel.impl.SinkNodeImpl <em>Sink Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.SinkNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getSinkNode()
		 * @generated
		 */
		EClass SINK_NODE = eINSTANCE.getSinkNode();

		/**
		 * The meta object literal for the '{@link metamodel.impl.PlayRoleNodeImpl <em>Play Role Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.PlayRoleNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getPlayRoleNode()
		 * @generated
		 */
		EClass PLAY_ROLE_NODE = eINSTANCE.getPlayRoleNode();

		/**
		 * The meta object literal for the '{@link metamodel.impl.AddRoleNodeImpl <em>Add Role Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.AddRoleNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getAddRoleNode()
		 * @generated
		 */
		EClass ADD_ROLE_NODE = eINSTANCE.getAddRoleNode();

		/**
		 * The meta object literal for the '{@link metamodel.impl.ConditionRoleNodeImpl <em>Condition Role Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.ConditionRoleNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getConditionRoleNode()
		 * @generated
		 */
		EClass CONDITION_ROLE_NODE = eINSTANCE.getConditionRoleNode();

		/**
		 * The meta object literal for the '{@link metamodel.impl.RewriteRoleNodeImpl <em>Rewrite Role Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.RewriteRoleNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getRewriteRoleNode()
		 * @generated
		 */
		EClass REWRITE_ROLE_NODE = eINSTANCE.getRewriteRoleNode();

		/**
		 * The meta object literal for the '{@link metamodel.impl.RemoveRoleNodeImpl <em>Remove Role Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.RemoveRoleNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getRemoveRoleNode()
		 * @generated
		 */
		EClass REMOVE_ROLE_NODE = eINSTANCE.getRemoveRoleNode();

		/**
		 * The meta object literal for the '{@link metamodel.impl.RenewRoleNodeImpl <em>Renew Role Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.RenewRoleNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getRenewRoleNode()
		 * @generated
		 */
		EClass RENEW_ROLE_NODE = eINSTANCE.getRenewRoleNode();

		/**
		 * The meta object literal for the '{@link metamodel.impl.ProhibitedRoleNodeImpl <em>Prohibited Role Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.ProhibitedRoleNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getProhibitedRoleNode()
		 * @generated
		 */
		EClass PROHIBITED_ROLE_NODE = eINSTANCE.getProhibitedRoleNode();

		/**
		 * The meta object literal for the '{@link metamodel.impl.GenericEventImpl <em>Generic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.GenericEventImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getGenericEvent()
		 * @generated
		 */
		EClass GENERIC_EVENT = eINSTANCE.getGenericEvent();

		/**
		 * The meta object literal for the '{@link metamodel.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.ContextImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link metamodel.impl.CompartmentImpl <em>Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.CompartmentImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getCompartment()
		 * @generated
		 */
		EClass COMPARTMENT = eINSTANCE.getCompartment();

		/**
		 * The meta object literal for the '{@link metamodel.impl.JoinSpecImpl <em>Join Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.JoinSpecImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getJoinSpec()
		 * @generated
		 */
		EClass JOIN_SPEC = eINSTANCE.getJoinSpec();

	}

} //MetamodelPackage
