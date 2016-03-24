/**
 */
package metamodel.impl;

import metamodel.*;

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
public class MetamodelFactoryImpl extends EFactoryImpl implements MetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetamodelFactory init() {
		try {
			MetamodelFactory theMetamodelFactory = (MetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(MetamodelPackage.eNS_URI);
			if (theMetamodelFactory != null) {
				return theMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelFactoryImpl() {
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
			case MetamodelPackage.EDGE: return createEdge();
			case MetamodelPackage.ROLE_STORY_BOARD: return createRoleStoryBoard();
			case MetamodelPackage.TRANSITION_CONSTRAINT: return createTransitionConstraint();
			case MetamodelPackage.GUARD: return createGuard();
			case MetamodelPackage.RELATION: return createRelation();
			case MetamodelPackage.STORY_PATTERN_NODE: return createStoryPatternNode();
			case MetamodelPackage.ROLE_MODEL_NODE: return createRoleModelNode();
			case MetamodelPackage.NATURAL_NODE: return createNaturalNode();
			case MetamodelPackage.SUCCESS_NODE: return createSuccessNode();
			case MetamodelPackage.FAIL_NODE: return createFailNode();
			case MetamodelPackage.FORK_NODE: return createForkNode();
			case MetamodelPackage.JOIN_NODE: return createJoinNode();
			case MetamodelPackage.START_NODE: return createStartNode();
			case MetamodelPackage.END_NOTE: return createEndNote();
			case MetamodelPackage.SINK_NODE: return createSinkNode();
			case MetamodelPackage.PLAY_ROLE_NODE: return createPlayRoleNode();
			case MetamodelPackage.ADD_ROLE_NODE: return createAddRoleNode();
			case MetamodelPackage.REMOVE_ROLE_NODE: return createRemoveRoleNode();
			case MetamodelPackage.RENEW_ROLE_NODE: return createRenewRoleNode();
			case MetamodelPackage.PROHIBITED_ROLE_NODE: return createProhibitedRoleNode();
			case MetamodelPackage.GENERIC_EVENT: return createGenericEvent();
			case MetamodelPackage.CONTEXT: return createContext();
			case MetamodelPackage.COMPARTMENT: return createCompartment();
			case MetamodelPackage.JOIN_SPEC: return createJoinSpec();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleStoryBoard createRoleStoryBoard() {
		RoleStoryBoardImpl roleStoryBoard = new RoleStoryBoardImpl();
		return roleStoryBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionConstraint createTransitionConstraint() {
		TransitionConstraintImpl transitionConstraint = new TransitionConstraintImpl();
		return transitionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard createGuard() {
		GuardImpl guard = new GuardImpl();
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPatternNode createStoryPatternNode() {
		StoryPatternNodeImpl storyPatternNode = new StoryPatternNodeImpl();
		return storyPatternNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleModelNode createRoleModelNode() {
		RoleModelNodeImpl roleModelNode = new RoleModelNodeImpl();
		return roleModelNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalNode createNaturalNode() {
		NaturalNodeImpl naturalNode = new NaturalNodeImpl();
		return naturalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessNode createSuccessNode() {
		SuccessNodeImpl successNode = new SuccessNodeImpl();
		return successNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailNode createFailNode() {
		FailNodeImpl failNode = new FailNodeImpl();
		return failNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode createForkNode() {
		ForkNodeImpl forkNode = new ForkNodeImpl();
		return forkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode createJoinNode() {
		JoinNodeImpl joinNode = new JoinNodeImpl();
		return joinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartNode createStartNode() {
		StartNodeImpl startNode = new StartNodeImpl();
		return startNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndNote createEndNote() {
		EndNoteImpl endNote = new EndNoteImpl();
		return endNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkNode createSinkNode() {
		SinkNodeImpl sinkNode = new SinkNodeImpl();
		return sinkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayRoleNode createPlayRoleNode() {
		PlayRoleNodeImpl playRoleNode = new PlayRoleNodeImpl();
		return playRoleNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddRoleNode createAddRoleNode() {
		AddRoleNodeImpl addRoleNode = new AddRoleNodeImpl();
		return addRoleNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveRoleNode createRemoveRoleNode() {
		RemoveRoleNodeImpl removeRoleNode = new RemoveRoleNodeImpl();
		return removeRoleNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenewRoleNode createRenewRoleNode() {
		RenewRoleNodeImpl renewRoleNode = new RenewRoleNodeImpl();
		return renewRoleNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProhibitedRoleNode createProhibitedRoleNode() {
		ProhibitedRoleNodeImpl prohibitedRoleNode = new ProhibitedRoleNodeImpl();
		return prohibitedRoleNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericEvent createGenericEvent() {
		GenericEventImpl genericEvent = new GenericEventImpl();
		return genericEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment createCompartment() {
		CompartmentImpl compartment = new CompartmentImpl();
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinSpec createJoinSpec() {
		JoinSpecImpl joinSpec = new JoinSpecImpl();
		return joinSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelPackage getMetamodelPackage() {
		return (MetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetamodelPackage getPackage() {
		return MetamodelPackage.eINSTANCE;
	}

} //MetamodelFactoryImpl
