/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.PartyCategory#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getPartyCategory()
 * @model
 * @generated
 */
public interface PartyCategory extends Party {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Party}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getPartyCategory_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Party> getChildren();

} // PartyCategory
