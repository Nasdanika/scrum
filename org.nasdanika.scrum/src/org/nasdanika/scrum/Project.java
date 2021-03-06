/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.Project#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends Party {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getProject_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

} // Project
