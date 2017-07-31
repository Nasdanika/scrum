/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functionality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.Functionality#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Functionality#getThemes <em>Themes</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Functionality#getCustomers <em>Customers</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Functionality#getFundings <em>Fundings</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Functionality#getSatisfies <em>Satisfies</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getFunctionality()
 * @model abstract="true"
 * @generated
 */
public interface Functionality extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.ProductUser}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getFunctionality_Users()
	 * @model
	 * @generated
	 */
	EList<ProductUser> getUsers();

	/**
	 * Returns the value of the '<em><b>Themes</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Theme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Themes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Themes</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getFunctionality_Themes()
	 * @model
	 * @generated
	 */
	EList<Theme> getThemes();

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Party}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getFunctionality_Customers()
	 * @model
	 * @generated
	 */
	EList<Party> getCustomers();

	/**
	 * Returns the value of the '<em><b>Fundings</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Funding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fundings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fundings</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getFunctionality_Fundings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Funding> getFundings();

	/**
	 * Returns the value of the '<em><b>Satisfies</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Need}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Need#getSatisfiedBy <em>Satisfied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfies</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getFunctionality_Satisfies()
	 * @see org.nasdanika.scrum.Need#getSatisfiedBy
	 * @model opposite="satisfiedBy"
	 * @generated
	 */
	EList<Need> getSatisfies();

} // Functionality
