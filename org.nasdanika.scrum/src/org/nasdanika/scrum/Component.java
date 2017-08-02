/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.Component#getOwners <em>Owners</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Owners</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Party}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owners</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owners</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getComponent_Owners()
	 * @model
	 * @generated
	 */
	EList<Party> getOwners();

} // Component
