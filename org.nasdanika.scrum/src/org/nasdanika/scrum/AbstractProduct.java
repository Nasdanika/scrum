/**
 */
package org.nasdanika.scrum;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.AbstractProduct#getDevelopmentTeam <em>Development Team</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getAbstractProduct()
 * @model
 * @generated
 */
public interface AbstractProduct extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Development Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Development Team</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Development Team</em>' reference.
	 * @see #setDevelopmentTeam(DevelopmentTeam)
	 * @see org.nasdanika.scrum.ScrumPackage#getAbstractProduct_DevelopmentTeam()
	 * @model
	 * @generated
	 */
	DevelopmentTeam getDevelopmentTeam();

	/**
	 * Sets the value of the '{@link org.nasdanika.scrum.AbstractProduct#getDevelopmentTeam <em>Development Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Development Team</em>' reference.
	 * @see #getDevelopmentTeam()
	 * @generated
	 */
	void setDevelopmentTeam(DevelopmentTeam value);

} // AbstractProduct
