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
 *   <li>{@link org.nasdanika.scrum.Party#getCustomerOf <em>Customer Of</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Party#getInteractions <em>Interactions</em>}</li>
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
	 * Returns the value of the '<em><b>Customer Of</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Customer}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Customer#getParties <em>Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Of</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getParty_CustomerOf()
	 * @see org.nasdanika.scrum.Customer#getParties
	 * @model opposite="parties"
	 * @generated
	 */
	EList<Customer> getCustomerOf();

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
} // Party
