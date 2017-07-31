/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.Artifact#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Party}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getArtifact_Owner()
	 * @model
	 * @generated
	 */
	EList<Party> getOwner();

} // Artifact
