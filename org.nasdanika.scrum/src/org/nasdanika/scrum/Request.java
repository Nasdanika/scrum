/**
 */
package org.nasdanika.scrum;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.Request#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Request#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Request#getFulfilledBy <em>Fulfilled By</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Request#getRelatedProducts <em>Related Products</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Request#getInteractions <em>Interactions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends ModelElement {
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
	 * @see org.nasdanika.scrum.ScrumPackage#getRequest_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.scrum.Request#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Request}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getRequest_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Request> getChildren();

	/**
	 * Returns the value of the '<em><b>Fulfilled By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Functionality}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Functionality#getFulfills <em>Fulfills</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fulfilled By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfilled By</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getRequest_FulfilledBy()
	 * @see org.nasdanika.scrum.Functionality#getFulfills
	 * @model opposite="fulfills"
	 * @generated
	 */
	EList<Functionality> getFulfilledBy();

	/**
	 * Returns the value of the '<em><b>Related Products</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Product}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Product#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Products</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getRequest_RelatedProducts()
	 * @see org.nasdanika.scrum.Product#getRequests
	 * @model opposite="requests"
	 * @generated
	 */
	EList<Product> getRelatedProducts();

	/**
	 * Returns the value of the '<em><b>Interactions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Interaction}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Interaction#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactions</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getRequest_Interactions()
	 * @see org.nasdanika.scrum.Interaction#getRequests
	 * @model opposite="requests"
	 * @generated
	 */
	EList<Interaction> getInteractions();

} // Request
