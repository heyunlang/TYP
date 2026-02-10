/**
 */
package com.example.gsn.gsn.impl;

import com.example.gsn.gsn.Goal;
import com.example.gsn.gsn.GsnPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.example.gsn.gsn.impl.GoalImpl#isInstantiated <em>Instantiated</em>}</li>
 *   <li>{@link com.example.gsn.gsn.impl.GoalImpl#isDeveloped <em>Developed</em>}</li>
 *   <li>{@link com.example.gsn.gsn.impl.GoalImpl#isIsPublic <em>Is Public</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends NamedElementImpl implements Goal {
	/**
	 * The default value of the '{@link #isInstantiated() <em>Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstantiated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSTANTIATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInstantiated() <em>Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstantiated()
	 * @generated
	 * @ordered
	 */
	protected boolean instantiated = INSTANTIATED_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeveloped() <em>Developed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeveloped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEVELOPED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeveloped() <em>Developed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeveloped()
	 * @generated
	 * @ordered
	 */
	protected boolean developed = DEVELOPED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PUBLIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected boolean isPublic = IS_PUBLIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GsnPackage.Literals.GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInstantiated() {
		return instantiated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstantiated(boolean newInstantiated) {
		boolean oldInstantiated = instantiated;
		instantiated = newInstantiated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GsnPackage.GOAL__INSTANTIATED, oldInstantiated, instantiated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeveloped() {
		return developed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeveloped(boolean newDeveloped) {
		boolean oldDeveloped = developed;
		developed = newDeveloped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GsnPackage.GOAL__DEVELOPED, oldDeveloped, developed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPublic() {
		return isPublic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPublic(boolean newIsPublic) {
		boolean oldIsPublic = isPublic;
		isPublic = newIsPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GsnPackage.GOAL__IS_PUBLIC, oldIsPublic, isPublic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GsnPackage.GOAL__INSTANTIATED:
				return isInstantiated();
			case GsnPackage.GOAL__DEVELOPED:
				return isDeveloped();
			case GsnPackage.GOAL__IS_PUBLIC:
				return isIsPublic();
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
			case GsnPackage.GOAL__INSTANTIATED:
				setInstantiated((Boolean)newValue);
				return;
			case GsnPackage.GOAL__DEVELOPED:
				setDeveloped((Boolean)newValue);
				return;
			case GsnPackage.GOAL__IS_PUBLIC:
				setIsPublic((Boolean)newValue);
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
			case GsnPackage.GOAL__INSTANTIATED:
				setInstantiated(INSTANTIATED_EDEFAULT);
				return;
			case GsnPackage.GOAL__DEVELOPED:
				setDeveloped(DEVELOPED_EDEFAULT);
				return;
			case GsnPackage.GOAL__IS_PUBLIC:
				setIsPublic(IS_PUBLIC_EDEFAULT);
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
			case GsnPackage.GOAL__INSTANTIATED:
				return instantiated != INSTANTIATED_EDEFAULT;
			case GsnPackage.GOAL__DEVELOPED:
				return developed != DEVELOPED_EDEFAULT;
			case GsnPackage.GOAL__IS_PUBLIC:
				return isPublic != IS_PUBLIC_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (instantiated: ");
		result.append(instantiated);
		result.append(", developed: ");
		result.append(developed);
		result.append(", isPublic: ");
		result.append(isPublic);
		result.append(')');
		return result.toString();
	}

} //GoalImpl
