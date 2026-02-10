/**
 */
package com.example.gsn.gsn.impl;

import com.example.gsn.gsn.Assumption;
import com.example.gsn.gsn.AwayContext;
import com.example.gsn.gsn.AwayGoal;
import com.example.gsn.gsn.AwaySolution;
import com.example.gsn.gsn.Context;
import com.example.gsn.gsn.ContractModule;
import com.example.gsn.gsn.Goal;
import com.example.gsn.gsn.GsnFactory;
import com.example.gsn.gsn.GsnPackage;
import com.example.gsn.gsn.InContextOf;
import com.example.gsn.gsn.Justification;
import com.example.gsn.gsn.Solution;
import com.example.gsn.gsn.Strategy;
import com.example.gsn.gsn.SupportedBy;

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
public class GsnFactoryImpl extends EFactoryImpl implements GsnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GsnFactory init() {
		try {
			GsnFactory theGsnFactory = (GsnFactory)EPackage.Registry.INSTANCE.getEFactory(GsnPackage.eNS_URI);
			if (theGsnFactory != null) {
				return theGsnFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GsnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GsnFactoryImpl() {
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
			case GsnPackage.GOAL: return createGoal();
			case GsnPackage.CONTEXT: return createContext();
			case GsnPackage.ASSUMPTION: return createAssumption();
			case GsnPackage.JUSTIFICATION: return createJustification();
			case GsnPackage.STRATEGY: return createStrategy();
			case GsnPackage.SOLUTION: return createSolution();
			case GsnPackage.IN_CONTEXT_OF: return createInContextOf();
			case GsnPackage.SUPPORTED_BY: return createSupportedBy();
			case GsnPackage.MODULE: return createModule();
			case GsnPackage.CONTRACT_MODULE: return createContractModule();
			case GsnPackage.AWAY_SOLUTION: return createAwaySolution();
			case GsnPackage.AWAY_GOAL: return createAwayGoal();
			case GsnPackage.AWAY_CONTEXT: return createAwayContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assumption createAssumption() {
		AssumptionImpl assumption = new AssumptionImpl();
		return assumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Justification createJustification() {
		JustificationImpl justification = new JustificationImpl();
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strategy createStrategy() {
		StrategyImpl strategy = new StrategyImpl();
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Solution createSolution() {
		SolutionImpl solution = new SolutionImpl();
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InContextOf createInContextOf() {
		InContextOfImpl inContextOf = new InContextOfImpl();
		return inContextOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupportedBy createSupportedBy() {
		SupportedByImpl supportedBy = new SupportedByImpl();
		return supportedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public com.example.gsn.gsn.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractModule createContractModule() {
		ContractModuleImpl contractModule = new ContractModuleImpl();
		return contractModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwaySolution createAwaySolution() {
		AwaySolutionImpl awaySolution = new AwaySolutionImpl();
		return awaySolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwayGoal createAwayGoal() {
		AwayGoalImpl awayGoal = new AwayGoalImpl();
		return awayGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwayContext createAwayContext() {
		AwayContextImpl awayContext = new AwayContextImpl();
		return awayContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GsnPackage getGsnPackage() {
		return (GsnPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GsnPackage getPackage() {
		return GsnPackage.eINSTANCE;
	}

} //GsnFactoryImpl
