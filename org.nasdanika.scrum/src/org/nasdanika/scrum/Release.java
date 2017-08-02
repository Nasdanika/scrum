/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.Release#getSprints <em>Sprints</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Release#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Release#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getRelease()
 * @model
 * @generated
 */
public interface Release extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Sprints</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Sprint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sprints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sprints</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getRelease_Sprints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sprint> getSprints();

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getRelease_Artifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Feature}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Feature#getPlannedFor <em>Planned For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getRelease_Features()
	 * @see org.nasdanika.scrum.Feature#getPlannedFor
	 * @model opposite="plannedFor"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Release
