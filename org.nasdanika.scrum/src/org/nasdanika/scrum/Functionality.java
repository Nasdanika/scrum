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
 *   <li>{@link org.nasdanika.scrum.Functionality#getFulfills <em>Fulfills</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Functionality#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Functionality#getDependants <em>Dependants</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Functionality#getInteractions <em>Interactions</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Functionality#getAssignedTo <em>Assigned To</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.ProductUser#getFunctionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getFunctionality_Users()
	 * @see org.nasdanika.scrum.ProductUser#getFunctionality
	 * @model opposite="functionality"
	 * @generated
	 */
	EList<ProductUser> getUsers();

	/**
	 * Returns the value of the '<em><b>Themes</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Theme}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Theme#getFunctionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Themes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Themes</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getFunctionality_Themes()
	 * @see org.nasdanika.scrum.Theme#getFunctionality
	 * @model opposite="functionality"
	 * @generated
	 */
	EList<Theme> getThemes();

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Customer}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Customer#getUsesFunctionality <em>Uses Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getFunctionality_Customers()
	 * @see org.nasdanika.scrum.Customer#getUsesFunctionality
	 * @model opposite="usesFunctionality"
	 * @generated
	 */
	EList<Customer> getCustomers();

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

	/**
	 * Returns the value of the '<em><b>Fulfills</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Request}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Request#getFulfilledBy <em>Fulfilled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fulfills</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfills</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getFunctionality_Fulfills()
	 * @see org.nasdanika.scrum.Request#getFulfilledBy
	 * @model opposite="fulfilledBy"
	 * @generated
	 */
	EList<Request> getFulfills();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Functionality}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Functionality#getDependants <em>Dependants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getFunctionality_Dependencies()
	 * @see org.nasdanika.scrum.Functionality#getDependants
	 * @model opposite="dependants"
	 * @generated
	 */
	EList<Functionality> getDependencies();

	/**
	 * Returns the value of the '<em><b>Dependants</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Functionality}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Functionality#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependants</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getFunctionality_Dependants()
	 * @see org.nasdanika.scrum.Functionality#getDependencies
	 * @model opposite="dependencies"
	 * @generated
	 */
	EList<Functionality> getDependants();

	/**
	 * Returns the value of the '<em><b>Interactions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Interaction}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Interaction#getFunctionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactions</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getFunctionality_Interactions()
	 * @see org.nasdanika.scrum.Interaction#getFunctionality
	 * @model opposite="functionality"
	 * @generated
	 */
	EList<Interaction> getInteractions();

	/**
	 * Returns the value of the '<em><b>Assigned To</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Member}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Member#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned To</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getFunctionality_AssignedTo()
	 * @see org.nasdanika.scrum.Member#getAssignments
	 * @model opposite="assignments"
	 * @generated
	 */
	EList<Member> getAssignedTo();

} // Functionality
