/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.Feature#getUserStories <em>User Stories</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Feature#getPlannedFor <em>Planned For</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends Functionality {
	/**
	 * Returns the value of the '<em><b>User Stories</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.UserStory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Stories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Stories</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getFeature_UserStories()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserStory> getUserStories();

	/**
	 * Returns the value of the '<em><b>Planned For</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Release}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Release#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planned For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned For</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getFeature_PlannedFor()
	 * @see org.nasdanika.scrum.Release#getFeatures
	 * @model opposite="features"
	 * @generated
	 */
	EList<Release> getPlannedFor();

} // Feature
