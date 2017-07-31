/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sprint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.Sprint#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getSprint()
 * @model
 * @generated
 */
public interface Sprint extends ModelElement {
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
	 * @see org.nasdanika.scrum.ScrumPackage#getSprint_Features()
	 * @see org.nasdanika.scrum.Feature#getPlannedFor
	 * @model opposite="plannedFor"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Sprint
