/**
 */
package com.example.gsn.gsn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.gsn.gsn.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link com.example.gsn.gsn.Relationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see com.example.gsn.gsn.GsnPackage#getRelationship()
 * @model abstract="true"
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(NamedElement)
	 * @see com.example.gsn.gsn.GsnPackage#getRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	NamedElement getSource();

	/**
	 * Sets the value of the '{@link com.example.gsn.gsn.Relationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(NamedElement)
	 * @see com.example.gsn.gsn.GsnPackage#getRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	NamedElement getTarget();

	/**
	 * Sets the value of the '{@link com.example.gsn.gsn.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NamedElement value);

} // Relationship
