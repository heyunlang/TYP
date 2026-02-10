/**
 */
package com.example.gsn.gsn;

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
 * @see com.example.gsn.gsn.GsnFactory
 * @model kind="package"
 * @generated
 */
public interface GsnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gsn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/gsn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gsn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GsnPackage eINSTANCE = com.example.gsn.gsn.impl.GsnPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.example.gsn.gsn.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.gsn.gsn.impl.NamedElementImpl
	 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getNamedElement()
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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.gsn.gsn.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.gsn.gsn.impl.GoalImpl
	 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Instantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__INSTANTIATED = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Developed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DEVELOPED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_PUBLIC = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.example.gsn.gsn.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.gsn.gsn.impl.ContextImpl
	 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.example.gsn.gsn.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.gsn.gsn.impl.AssumptionImpl
	 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.example.gsn.gsn.impl.JustificationImpl <em>Justification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.gsn.gsn.impl.JustificationImpl
	 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getJustification()
	 * @generated
	 */
	int JUSTIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.example.gsn.gsn.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.gsn.gsn.impl.StrategyImpl
	 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.example.gsn.gsn.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.gsn.gsn.impl.SolutionImpl
	 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.example.gsn.gsn.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.gsn.gsn.impl.RelationshipImpl
	 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.gsn.gsn.impl.InContextOfImpl <em>In Context Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.gsn.gsn.impl.InContextOfImpl
	 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getInContextOf()
	 * @generated
	 */
	int IN_CONTEXT_OF = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>In Context Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>In Context Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.example.gsn.gsn.impl.SupportedByImpl <em>Supported By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.gsn.gsn.impl.SupportedByImpl
	 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getSupportedBy()
	 * @generated
	 */
	int SUPPORTED_BY = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Supported By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Supported By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.example.gsn.gsn.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.gsn.gsn.impl.ModuleImpl
	 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 10;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__RELATIONSHIPS = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IS_PUBLIC = 2;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.gsn.gsn.impl.ContractModuleImpl <em>Contract Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.gsn.gsn.impl.ContractModuleImpl
	 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getContractModule()
	 * @generated
	 */
	int CONTRACT_MODULE = 11;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__RELATIONSHIPS = MODULE__RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__ELEMENTS = MODULE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__IS_PUBLIC = MODULE__IS_PUBLIC;

	/**
	 * The number of structural features of the '<em>Contract Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contract Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.example.gsn.gsn.impl.AwaySolutionImpl <em>Away Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.gsn.gsn.impl.AwaySolutionImpl
	 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getAwaySolution()
	 * @generated
	 */
	int AWAY_SOLUTION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__SOLUTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Away Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Away Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.example.gsn.gsn.impl.AwayGoalImpl <em>Away Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.gsn.gsn.impl.AwayGoalImpl
	 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getAwayGoal()
	 * @generated
	 */
	int AWAY_GOAL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__GOAL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Away Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Away Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.example.gsn.gsn.impl.AwayContextImpl <em>Away Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.gsn.gsn.impl.AwayContextImpl
	 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getAwayContext()
	 * @generated
	 */
	int AWAY_CONTEXT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__CONTEXT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Away Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Away Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.example.gsn.gsn.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see com.example.gsn.gsn.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.example.gsn.gsn.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.gsn.gsn.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.example.gsn.gsn.NamedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.example.gsn.gsn.NamedElement#getDescription()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Description();

	/**
	 * Returns the meta object for class '{@link com.example.gsn.gsn.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see com.example.gsn.gsn.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link com.example.gsn.gsn.Goal#isInstantiated <em>Instantiated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instantiated</em>'.
	 * @see com.example.gsn.gsn.Goal#isInstantiated()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Instantiated();

	/**
	 * Returns the meta object for the attribute '{@link com.example.gsn.gsn.Goal#isDeveloped <em>Developed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Developed</em>'.
	 * @see com.example.gsn.gsn.Goal#isDeveloped()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Developed();

	/**
	 * Returns the meta object for the attribute '{@link com.example.gsn.gsn.Goal#isIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see com.example.gsn.gsn.Goal#isIsPublic()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_IsPublic();

	/**
	 * Returns the meta object for class '{@link com.example.gsn.gsn.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see com.example.gsn.gsn.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link com.example.gsn.gsn.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see com.example.gsn.gsn.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for class '{@link com.example.gsn.gsn.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Justification</em>'.
	 * @see com.example.gsn.gsn.Justification
	 * @generated
	 */
	EClass getJustification();

	/**
	 * Returns the meta object for class '{@link com.example.gsn.gsn.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see com.example.gsn.gsn.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for class '{@link com.example.gsn.gsn.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see com.example.gsn.gsn.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for class '{@link com.example.gsn.gsn.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see com.example.gsn.gsn.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link com.example.gsn.gsn.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see com.example.gsn.gsn.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link com.example.gsn.gsn.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.example.gsn.gsn.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for class '{@link com.example.gsn.gsn.InContextOf <em>In Context Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Context Of</em>'.
	 * @see com.example.gsn.gsn.InContextOf
	 * @generated
	 */
	EClass getInContextOf();

	/**
	 * Returns the meta object for class '{@link com.example.gsn.gsn.SupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported By</em>'.
	 * @see com.example.gsn.gsn.SupportedBy
	 * @generated
	 */
	EClass getSupportedBy();

	/**
	 * Returns the meta object for class '{@link com.example.gsn.gsn.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see com.example.gsn.gsn.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.gsn.gsn.Module#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see com.example.gsn.gsn.Module#getRelationships()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Relationships();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.gsn.gsn.Module#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.example.gsn.gsn.Module#getElements()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Elements();

	/**
	 * Returns the meta object for the attribute '{@link com.example.gsn.gsn.Module#isIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see com.example.gsn.gsn.Module#isIsPublic()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_IsPublic();

	/**
	 * Returns the meta object for class '{@link com.example.gsn.gsn.ContractModule <em>Contract Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Module</em>'.
	 * @see com.example.gsn.gsn.ContractModule
	 * @generated
	 */
	EClass getContractModule();

	/**
	 * Returns the meta object for class '{@link com.example.gsn.gsn.AwaySolution <em>Away Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Solution</em>'.
	 * @see com.example.gsn.gsn.AwaySolution
	 * @generated
	 */
	EClass getAwaySolution();

	/**
	 * Returns the meta object for the reference '{@link com.example.gsn.gsn.AwaySolution#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Solution</em>'.
	 * @see com.example.gsn.gsn.AwaySolution#getSolution()
	 * @see #getAwaySolution()
	 * @generated
	 */
	EReference getAwaySolution_Solution();

	/**
	 * Returns the meta object for class '{@link com.example.gsn.gsn.AwayGoal <em>Away Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Goal</em>'.
	 * @see com.example.gsn.gsn.AwayGoal
	 * @generated
	 */
	EClass getAwayGoal();

	/**
	 * Returns the meta object for the reference '{@link com.example.gsn.gsn.AwayGoal#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal</em>'.
	 * @see com.example.gsn.gsn.AwayGoal#getGoal()
	 * @see #getAwayGoal()
	 * @generated
	 */
	EReference getAwayGoal_Goal();

	/**
	 * Returns the meta object for class '{@link com.example.gsn.gsn.AwayContext <em>Away Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Context</em>'.
	 * @see com.example.gsn.gsn.AwayContext
	 * @generated
	 */
	EClass getAwayContext();

	/**
	 * Returns the meta object for the reference '{@link com.example.gsn.gsn.AwayContext#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see com.example.gsn.gsn.AwayContext#getContext()
	 * @see #getAwayContext()
	 * @generated
	 */
	EReference getAwayContext_Context();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GsnFactory getGsnFactory();

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
		 * The meta object literal for the '{@link com.example.gsn.gsn.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.gsn.gsn.impl.NamedElementImpl
		 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getNamedElement()
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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__DESCRIPTION = eINSTANCE.getNamedElement_Description();

		/**
		 * The meta object literal for the '{@link com.example.gsn.gsn.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.gsn.gsn.impl.GoalImpl
		 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Instantiated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__INSTANTIATED = eINSTANCE.getGoal_Instantiated();

		/**
		 * The meta object literal for the '<em><b>Developed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__DEVELOPED = eINSTANCE.getGoal_Developed();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__IS_PUBLIC = eINSTANCE.getGoal_IsPublic();

		/**
		 * The meta object literal for the '{@link com.example.gsn.gsn.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.gsn.gsn.impl.ContextImpl
		 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link com.example.gsn.gsn.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.gsn.gsn.impl.AssumptionImpl
		 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '{@link com.example.gsn.gsn.impl.JustificationImpl <em>Justification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.gsn.gsn.impl.JustificationImpl
		 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getJustification()
		 * @generated
		 */
		EClass JUSTIFICATION = eINSTANCE.getJustification();

		/**
		 * The meta object literal for the '{@link com.example.gsn.gsn.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.gsn.gsn.impl.StrategyImpl
		 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '{@link com.example.gsn.gsn.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.gsn.gsn.impl.SolutionImpl
		 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '{@link com.example.gsn.gsn.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.gsn.gsn.impl.RelationshipImpl
		 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '{@link com.example.gsn.gsn.impl.InContextOfImpl <em>In Context Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.gsn.gsn.impl.InContextOfImpl
		 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getInContextOf()
		 * @generated
		 */
		EClass IN_CONTEXT_OF = eINSTANCE.getInContextOf();

		/**
		 * The meta object literal for the '{@link com.example.gsn.gsn.impl.SupportedByImpl <em>Supported By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.gsn.gsn.impl.SupportedByImpl
		 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getSupportedBy()
		 * @generated
		 */
		EClass SUPPORTED_BY = eINSTANCE.getSupportedBy();

		/**
		 * The meta object literal for the '{@link com.example.gsn.gsn.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.gsn.gsn.impl.ModuleImpl
		 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__RELATIONSHIPS = eINSTANCE.getModule_Relationships();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__ELEMENTS = eINSTANCE.getModule_Elements();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__IS_PUBLIC = eINSTANCE.getModule_IsPublic();

		/**
		 * The meta object literal for the '{@link com.example.gsn.gsn.impl.ContractModuleImpl <em>Contract Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.gsn.gsn.impl.ContractModuleImpl
		 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getContractModule()
		 * @generated
		 */
		EClass CONTRACT_MODULE = eINSTANCE.getContractModule();

		/**
		 * The meta object literal for the '{@link com.example.gsn.gsn.impl.AwaySolutionImpl <em>Away Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.gsn.gsn.impl.AwaySolutionImpl
		 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getAwaySolution()
		 * @generated
		 */
		EClass AWAY_SOLUTION = eINSTANCE.getAwaySolution();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWAY_SOLUTION__SOLUTION = eINSTANCE.getAwaySolution_Solution();

		/**
		 * The meta object literal for the '{@link com.example.gsn.gsn.impl.AwayGoalImpl <em>Away Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.gsn.gsn.impl.AwayGoalImpl
		 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getAwayGoal()
		 * @generated
		 */
		EClass AWAY_GOAL = eINSTANCE.getAwayGoal();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWAY_GOAL__GOAL = eINSTANCE.getAwayGoal_Goal();

		/**
		 * The meta object literal for the '{@link com.example.gsn.gsn.impl.AwayContextImpl <em>Away Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.gsn.gsn.impl.AwayContextImpl
		 * @see com.example.gsn.gsn.impl.GsnPackageImpl#getAwayContext()
		 * @generated
		 */
		EClass AWAY_CONTEXT = eINSTANCE.getAwayContext();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWAY_CONTEXT__CONTEXT = eINSTANCE.getAwayContext_Context();

	}

} //GsnPackage
