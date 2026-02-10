/**
 */
package com.example.gsn.gsn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.gsn.gsn.Module#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link com.example.gsn.gsn.Module#getElements <em>Elements</em>}</li>
 *   <li>{@link com.example.gsn.gsn.Module#isIsPublic <em>Is Public</em>}</li>
 * </ul>
 *
 * @see com.example.gsn.gsn.GsnPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.gsn.gsn.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see com.example.gsn.gsn.GsnPackage#getModule_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.gsn.gsn.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see com.example.gsn.gsn.GsnPackage#getModule_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedElement> getElements();

	/**
	 * Returns the value of the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Public</em>' attribute.
	 * @see #setIsPublic(boolean)
	 * @see com.example.gsn.gsn.GsnPackage#getModule_IsPublic()
	 * @model
	 * @generated
	 */
	boolean isIsPublic();

	/**
	 * Sets the value of the '{@link com.example.gsn.gsn.Module#isIsPublic <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Public</em>' attribute.
	 * @see #isIsPublic()
	 * @generated
	 */
	void setIsPublic(boolean value);

} // Module
