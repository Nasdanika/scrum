/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Story</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.UserStory#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.nasdanika.scrum.UserStory#getPlannedFor <em>Planned For</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getUserStory()
 * @model
 * @generated
 */
public interface UserStory extends Functionality {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getUserStory_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Planned For</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Sprint}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Sprint#getStories <em>Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planned For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned For</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getUserStory_PlannedFor()
	 * @see org.nasdanika.scrum.Sprint#getStories
	 * @model opposite="stories"
	 * @generated
	 */
	EList<Sprint> getPlannedFor();

} // UserStory
