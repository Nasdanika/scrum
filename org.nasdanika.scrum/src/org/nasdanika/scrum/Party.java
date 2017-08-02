/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.Party#getReferences <em>References</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Party#getUsesProducts <em>Uses Products</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Party#getUsesFunctionality <em>Uses Functionality</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Party#getInteractions <em>Interactions</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Party#getFundings <em>Fundings</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getParty()
 * @model abstract="true"
 * @generated
 */
public interface Party extends ModelElement {

	/**
	 * Returns the value of the '<em><b>References</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.PartyReference}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.PartyReference#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getParty_References()
	 * @see org.nasdanika.scrum.PartyReference#getParty
	 * @model opposite="party"
	 * @generated
	 */
	EList<PartyReference> getReferences();

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
	 * @see org.nasdanika.scrum.ScrumPackage#getParty_UsesProducts()
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
	 * @see org.nasdanika.scrum.ScrumPackage#getParty_UsesFunctionality()
	 * @see org.nasdanika.scrum.Functionality#getCustomers
	 * @model opposite="customers"
	 * @generated
	 */
	EList<Functionality> getUsesFunctionality();

	/**
	 * Returns the value of the '<em><b>Interactions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Interaction}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Interaction#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactions</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getParty_Interactions()
	 * @see org.nasdanika.scrum.Interaction#getParticipant
	 * @model opposite="participant"
	 * @generated
	 */
	EList<Interaction> getInteractions();

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
	 * @see org.nasdanika.scrum.ScrumPackage#getParty_Fundings()
	 * @see org.nasdanika.scrum.Funding#getCustomers
	 * @model opposite="customers"
	 * @generated
	 */
	EList<Funding> getFundings();
} // Party
