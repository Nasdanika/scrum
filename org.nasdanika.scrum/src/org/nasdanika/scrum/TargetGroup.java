/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.TargetGroup#getNeeds <em>Needs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getTargetGroup()
 * @model
 * @generated
 */
public interface TargetGroup extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Needs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Need}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getTargetGroup_Needs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Need> getNeeds();

} // TargetGroup
