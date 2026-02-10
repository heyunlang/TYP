/**
 */
package com.example.gsn.gsn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Away Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.gsn.gsn.AwayGoal#getGoal <em>Goal</em>}</li>
 * </ul>
 *
 * @see com.example.gsn.gsn.GsnPackage#getAwayGoal()
 * @model
 * @generated
 */
public interface AwayGoal extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference.
	 * @see #setGoal(Goal)
	 * @see com.example.gsn.gsn.GsnPackage#getAwayGoal_Goal()
	 * @model
	 * @generated
	 */
	Goal getGoal();

	/**
	 * Sets the value of the '{@link com.example.gsn.gsn.AwayGoal#getGoal <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Goal value);

} // AwayGoal
