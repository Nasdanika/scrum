/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.cdo.security.LoginPasswordRealm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root object of the scrum model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.ScrumRealm#getParties <em>Parties</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getScrumRealm()
 * @model
 * @generated
 */
public interface ScrumRealm extends LoginPasswordRealm, ModelElement {

	/**
	 * Returns the value of the '<em><b>Parties</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Party}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parties</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getScrumRealm_Parties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Party> getParties();
} // ScrumRealm
