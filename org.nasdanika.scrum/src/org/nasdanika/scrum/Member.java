/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.Member#getParties <em>Parties</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Member#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getMember()
 * @model
 * @generated
 */
public interface Member extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Parties</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Party}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parties</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getMember_Parties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Party> getParties();

	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Functionality}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Functionality#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getMember_Assignments()
	 * @see org.nasdanika.scrum.Functionality#getAssignedTo
	 * @model opposite="assignedTo"
	 * @generated
	 */
	EList<Functionality> getAssignments();

} // Member
