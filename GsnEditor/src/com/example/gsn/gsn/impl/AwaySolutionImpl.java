/**
 */
package com.example.gsn.gsn.impl;

import com.example.gsn.gsn.AwaySolution;
import com.example.gsn.gsn.GsnPackage;
import com.example.gsn.gsn.Solution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Away Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.example.gsn.gsn.impl.AwaySolutionImpl#getSolution <em>Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AwaySolutionImpl extends NamedElementImpl implements AwaySolution {
	/**
	 * The cached value of the '{@link #getSolution() <em>Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected Solution solution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AwaySolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GsnPackage.Literals.AWAY_SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Solution getSolution() {
		if (solution != null && solution.eIsProxy()) {
			InternalEObject oldSolution = (InternalEObject)solution;
			solution = (Solution)eResolveProxy(oldSolution);
			if (solution != oldSolution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GsnPackage.AWAY_SOLUTION__SOLUTION, oldSolution, solution));
			}
		}
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution basicGetSolution() {
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolution(Solution newSolution) {
		Solution oldSolution = solution;
		solution = newSolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GsnPackage.AWAY_SOLUTION__SOLUTION, oldSolution, solution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GsnPackage.AWAY_SOLUTION__SOLUTION:
				if (resolve) return getSolution();
				return basicGetSolution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GsnPackage.AWAY_SOLUTION__SOLUTION:
				setSolution((Solution)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case GsnPackage.AWAY_SOLUTION__SOLUTION:
				setSolution((Solution)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GsnPackage.AWAY_SOLUTION__SOLUTION:
				return solution != null;
		}
		return super.eIsSet(featureID);
	}

} //AwaySolutionImpl
