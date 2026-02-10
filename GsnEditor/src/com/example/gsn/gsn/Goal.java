/**
 */
package com.example.gsn.gsn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.gsn.gsn.Goal#isInstantiated <em>Instantiated</em>}</li>
 *   <li>{@link com.example.gsn.gsn.Goal#isDeveloped <em>Developed</em>}</li>
 *   <li>{@link com.example.gsn.gsn.Goal#isIsPublic <em>Is Public</em>}</li>
 * </ul>
 *
 * @see com.example.gsn.gsn.GsnPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Instantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiated</em>' attribute.
	 * @see #setInstantiated(boolean)
	 * @see com.example.gsn.gsn.GsnPackage#getGoal_Instantiated()
	 * @model
	 * @generated
	 */
	boolean isInstantiated();

	/**
	 * Sets the value of the '{@link com.example.gsn.gsn.Goal#isInstantiated <em>Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiated</em>' attribute.
	 * @see #isInstantiated()
	 * @generated
	 */
	void setInstantiated(boolean value);

	/**
	 * Returns the value of the '<em><b>Developed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developed</em>' attribute.
	 * @see #setDeveloped(boolean)
	 * @see com.example.gsn.gsn.GsnPackage#getGoal_Developed()
	 * @model
	 * @generated
	 */
	boolean isDeveloped();

	/**
	 * Sets the value of the '{@link com.example.gsn.gsn.Goal#isDeveloped <em>Developed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Developed</em>' attribute.
	 * @see #isDeveloped()
	 * @generated
	 */
	void setDeveloped(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Public</em>' attribute.
	 * @see #setIsPublic(boolean)
	 * @see com.example.gsn.gsn.GsnPackage#getGoal_IsPublic()
	 * @model
	 * @generated
	 */
	boolean isIsPublic();

	/**
	 * Sets the value of the '{@link com.example.gsn.gsn.Goal#isIsPublic <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Public</em>' attribute.
	 * @see #isIsPublic()
	 * @generated
	 */
	void setIsPublic(boolean value);

} // Goal
