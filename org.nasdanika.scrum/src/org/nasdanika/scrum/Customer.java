/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.Customer#getParties <em>Parties</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Customer#getRequests <em>Requests</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Customer#getFundings <em>Fundings</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Customer#getUsesProducts <em>Uses Products</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Customer#getUsesFunctionality <em>Uses Functionality</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Customer#getInteractions <em>Interactions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Parties</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Party}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Party#getCustomerOf <em>Customer Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parties</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getCustomer_Parties()
	 * @see org.nasdanika.scrum.Party#getCustomerOf
	 * @model opposite="customerOf"
	 * @generated
	 */
	EList<Party> getParties();

	/**
	 * Returns the value of the '<em><b>Requests</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Request}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getCustomer_Requests()
	 * @model containment="true"
	 * @generated
	 */
	EList<Request> getRequests();

	/**
	 * Returns the value of the '<em><b>Fundings</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Funding}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Funding#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fundings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fundings</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getCustomer_Fundings()
	 * @see org.nasdanika.scrum.Funding#getCustomers
	 * @model opposite="customers"
	 * @generated
	 */
	EList<Funding> getFundings();

	/**
	 * Returns the value of the '<em><b>Uses Products</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Product}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Product#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Products</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getCustomer_UsesProducts()
	 * @see org.nasdanika.scrum.Product#getCustomers
	 * @model opposite="customers"
	 * @generated
	 */
	EList<Product> getUsesProducts();

	/**
	 * Returns the value of the '<em><b>Uses Functionality</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Functionality}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Functionality#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Functionality</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Functionality</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getCustomer_UsesFunctionality()
	 * @see org.nasdanika.scrum.Functionality#getCustomers
	 * @model opposite="customers"
	 * @generated
	 */
	EList<Functionality> getUsesFunctionality();

	/**
	 * Returns the value of the '<em><b>Interactions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Interaction}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Interaction#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactions</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getCustomer_Interactions()
	 * @see org.nasdanika.scrum.Interaction#getCustomers
	 * @model opposite="customers"
	 * @generated
	 */
	EList<Interaction> getInteractions();

} // Customer
