/**
 */
package com.example.gsn.gsn.util;

import com.example.gsn.gsn.Assumption;
import com.example.gsn.gsn.AwayContext;
import com.example.gsn.gsn.AwayGoal;
import com.example.gsn.gsn.AwaySolution;
import com.example.gsn.gsn.Context;
import com.example.gsn.gsn.ContractModule;
import com.example.gsn.gsn.Goal;
import com.example.gsn.gsn.GsnPackage;
import com.example.gsn.gsn.InContextOf;
import com.example.gsn.gsn.Justification;
import com.example.gsn.gsn.NamedElement;
import com.example.gsn.gsn.Relationship;
import com.example.gsn.gsn.Solution;
import com.example.gsn.gsn.Strategy;
import com.example.gsn.gsn.SupportedBy;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.example.gsn.gsn.GsnPackage
 * @generated
 */
public class GsnAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GsnPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GsnAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GsnPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected GsnSwitch<Adapter> modelSwitch =
		new GsnSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseAssumption(Assumption object) {
				return createAssumptionAdapter();
			}
			@Override
			public Adapter caseJustification(Justification object) {
				return createJustificationAdapter();
			}
			@Override
			public Adapter caseStrategy(Strategy object) {
				return createStrategyAdapter();
			}
			@Override
			public Adapter caseSolution(Solution object) {
				return createSolutionAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseInContextOf(InContextOf object) {
				return createInContextOfAdapter();
			}
			@Override
			public Adapter caseSupportedBy(SupportedBy object) {
				return createSupportedByAdapter();
			}
			@Override
			public Adapter caseModule(com.example.gsn.gsn.Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseContractModule(ContractModule object) {
				return createContractModuleAdapter();
			}
			@Override
			public Adapter caseAwaySolution(AwaySolution object) {
				return createAwaySolutionAdapter();
			}
			@Override
			public Adapter caseAwayGoal(AwayGoal object) {
				return createAwayGoalAdapter();
			}
			@Override
			public Adapter caseAwayContext(AwayContext object) {
				return createAwayContextAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.example.gsn.gsn.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.gsn.gsn.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.gsn.gsn.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.gsn.gsn.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.gsn.gsn.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.gsn.gsn.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.gsn.gsn.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.gsn.gsn.Assumption
	 * @generated
	 */
	public Adapter createAssumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.gsn.gsn.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.gsn.gsn.Justification
	 * @generated
	 */
	public Adapter createJustificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.gsn.gsn.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.gsn.gsn.Strategy
	 * @generated
	 */
	public Adapter createStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.gsn.gsn.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.gsn.gsn.Solution
	 * @generated
	 */
	public Adapter createSolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.gsn.gsn.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.gsn.gsn.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.gsn.gsn.InContextOf <em>In Context Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.gsn.gsn.InContextOf
	 * @generated
	 */
	public Adapter createInContextOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.gsn.gsn.SupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.gsn.gsn.SupportedBy
	 * @generated
	 */
	public Adapter createSupportedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.gsn.gsn.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.gsn.gsn.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.gsn.gsn.ContractModule <em>Contract Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.gsn.gsn.ContractModule
	 * @generated
	 */
	public Adapter createContractModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.gsn.gsn.AwaySolution <em>Away Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.gsn.gsn.AwaySolution
	 * @generated
	 */
	public Adapter createAwaySolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.gsn.gsn.AwayGoal <em>Away Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.gsn.gsn.AwayGoal
	 * @generated
	 */
	public Adapter createAwayGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.gsn.gsn.AwayContext <em>Away Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.example.gsn.gsn.AwayContext
	 * @generated
	 */
	public Adapter createAwayContextAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GsnAdapterFactory
