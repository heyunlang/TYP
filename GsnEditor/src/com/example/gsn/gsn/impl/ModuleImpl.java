/**
 */
package com.example.gsn.gsn.impl;

import com.example.gsn.gsn.GsnPackage;
import com.example.gsn.gsn.NamedElement;
import com.example.gsn.gsn.Relationship;

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
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.example.gsn.gsn.impl.ModuleImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link com.example.gsn.gsn.impl.ModuleImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link com.example.gsn.gsn.impl.ModuleImpl#isIsPublic <em>Is Public</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements com.example.gsn.gsn.Module {
	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationships;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> elements;

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
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GsnPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<Relationship>(Relationship.class, this, GsnPackage.MODULE__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<NamedElement>(NamedElement.class, this, GsnPackage.MODULE__ELEMENTS);
		}
		return elements;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GsnPackage.MODULE__IS_PUBLIC, oldIsPublic, isPublic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GsnPackage.MODULE__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
			case GsnPackage.MODULE__ELEMENTS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GsnPackage.MODULE__RELATIONSHIPS:
				return getRelationships();
			case GsnPackage.MODULE__ELEMENTS:
				return getElements();
			case GsnPackage.MODULE__IS_PUBLIC:
				return isIsPublic();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GsnPackage.MODULE__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case GsnPackage.MODULE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case GsnPackage.MODULE__IS_PUBLIC:
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
			case GsnPackage.MODULE__RELATIONSHIPS:
				getRelationships().clear();
				return;
			case GsnPackage.MODULE__ELEMENTS:
				getElements().clear();
				return;
			case GsnPackage.MODULE__IS_PUBLIC:
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
			case GsnPackage.MODULE__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
			case GsnPackage.MODULE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case GsnPackage.MODULE__IS_PUBLIC:
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
		result.append(" (isPublic: ");
		result.append(isPublic);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
