/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.Need#getSatisfiedBy <em>Satisfied By</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getNeed()
 * @model
 * @generated
 */
public interface Need extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Satisfied By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Functionality}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Functionality#getSatisfies <em>Satisfies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfied By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfied By</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getNeed_SatisfiedBy()
	 * @see org.nasdanika.scrum.Functionality#getSatisfies
	 * @model opposite="satisfies"
	 * @generated
	 */
	EList<Functionality> getSatisfiedBy();

} // Need
