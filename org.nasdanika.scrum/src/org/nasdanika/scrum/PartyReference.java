/**
 */
package org.nasdanika.scrum;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.PartyReference#getParty <em>Party</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getPartyReference()
 * @model
 * @generated
 */
public interface PartyReference extends Party {
	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Party#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.nasdanika.scrum.ScrumPackage#getPartyReference_Party()
	 * @see org.nasdanika.scrum.Party#getReferences
	 * @model opposite="references"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.nasdanika.scrum.PartyReference#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

} // PartyReference
