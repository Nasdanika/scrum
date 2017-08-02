/**
 */
package org.nasdanika.scrum;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.Interaction#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Interaction#getProducts <em>Products</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Interaction#getFunctionality <em>Functionality</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Interaction#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Interaction#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.nasdanika.scrum.ScrumPackage#getInteraction_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.scrum.Interaction#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Product}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Product#getInteractions <em>Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getInteraction_Products()
	 * @see org.nasdanika.scrum.Product#getInteractions
	 * @model opposite="interactions"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Functionality</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Functionality}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Functionality#getInteractions <em>Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functionality</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionality</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getInteraction_Functionality()
	 * @see org.nasdanika.scrum.Functionality#getInteractions
	 * @model opposite="interactions"
	 * @generated
	 */
	EList<Functionality> getFunctionality();

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Party}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Party#getInteractions <em>Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getInteraction_Participant()
	 * @see org.nasdanika.scrum.Party#getInteractions
	 * @model opposite="interactions"
	 * @generated
	 */
	EList<Party> getParticipant();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Interaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getInteraction_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interaction> getChildren();

} // Interaction
