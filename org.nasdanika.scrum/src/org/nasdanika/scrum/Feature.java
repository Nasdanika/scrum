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
 *   <li>{@link org.nasdanika.scrum.Feature#getUserstories <em>Userstories</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Feature#getPlannedFor <em>Planned For</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends Functionality {
	/**
	 * Returns the value of the '<em><b>Userstories</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.UserStory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Userstories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userstories</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getFeature_Userstories()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserStory> getUserstories();

	/**
	 * Returns the value of the '<em><b>Planned For</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Sprint}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Sprint#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planned For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned For</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getFeature_PlannedFor()
	 * @see org.nasdanika.scrum.Sprint#getFeatures
	 * @model opposite="features"
	 * @generated
	 */
	EList<Sprint> getPlannedFor();

} // Feature
