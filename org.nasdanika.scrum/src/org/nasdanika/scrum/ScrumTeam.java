/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.ScrumTeam#getDevelopmentteams <em>Developmentteams</em>}</li>
 *   <li>{@link org.nasdanika.scrum.ScrumTeam#getProductOwner <em>Product Owner</em>}</li>
 *   <li>{@link org.nasdanika.scrum.ScrumTeam#getScrumMaster <em>Scrum Master</em>}</li>
 *   <li>{@link org.nasdanika.scrum.ScrumTeam#getProducts <em>Products</em>}</li>
 *   <li>{@link org.nasdanika.scrum.ScrumTeam#getTeamInteractions <em>Team Interactions</em>}</li>
 *   <li>{@link org.nasdanika.scrum.ScrumTeam#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.scrum.ScrumTeam#getCustomers <em>Customers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getScrumTeam()
 * @model
 * @generated
 */
public interface ScrumTeam extends Organization {
	/**
	 * Returns the value of the '<em><b>Developmentteams</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.DevelopmentTeam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Developmentteams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developmentteams</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getScrumTeam_Developmentteams()
	 * @model containment="true"
	 * @generated
	 */
	EList<DevelopmentTeam> getDevelopmentteams();

	/**
	 * Returns the value of the '<em><b>Product Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Owner</em>' reference.
	 * @see #setProductOwner(Person)
	 * @see org.nasdanika.scrum.ScrumPackage#getScrumTeam_ProductOwner()
	 * @model
	 * @generated
	 */
	Person getProductOwner();

	/**
	 * Sets the value of the '{@link org.nasdanika.scrum.ScrumTeam#getProductOwner <em>Product Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Owner</em>' reference.
	 * @see #getProductOwner()
	 * @generated
	 */
	void setProductOwner(Person value);

	/**
	 * Returns the value of the '<em><b>Scrum Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scrum Master</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scrum Master</em>' reference.
	 * @see #setScrumMaster(Person)
	 * @see org.nasdanika.scrum.ScrumPackage#getScrumTeam_ScrumMaster()
	 * @model
	 * @generated
	 */
	Person getScrumMaster();

	/**
	 * Sets the value of the '{@link org.nasdanika.scrum.ScrumTeam#getScrumMaster <em>Scrum Master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scrum Master</em>' reference.
	 * @see #getScrumMaster()
	 * @generated
	 */
	void setScrumMaster(Person value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.AbstractProduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getScrumTeam_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractProduct> getProducts();

	/**
	 * Returns the value of the '<em><b>Team Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Interaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team Interactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Interactions</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getScrumTeam_TeamInteractions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interaction> getTeamInteractions();

	/**
	 * Returns the value of the '<em><b>Releases</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Release}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Releases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Releases</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getScrumTeam_Releases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Release> getReleases();

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Customer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getScrumTeam_Customers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Customer> getCustomers();

} // ScrumTeam
