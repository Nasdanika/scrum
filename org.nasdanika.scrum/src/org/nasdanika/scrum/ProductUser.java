/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.ProductUser#getFunctionality <em>Functionality</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getProductUser()
 * @model
 * @generated
 */
public interface ProductUser extends ModelElement {

	/**
	 * Returns the value of the '<em><b>Functionality</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Functionality}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Functionality#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functionality</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionality</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getProductUser_Functionality()
	 * @see org.nasdanika.scrum.Functionality#getUsers
	 * @model opposite="users"
	 * @generated
	 */
	EList<Functionality> getFunctionality();
} // ProductUser
