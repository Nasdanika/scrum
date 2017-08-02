/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Development Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.DevelopmentTeam#getMembers <em>Members</em>}</li>
 *   <li>{@link org.nasdanika.scrum.DevelopmentTeam#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getDevelopmentTeam()
 * @model
 * @generated
 */
public interface DevelopmentTeam extends ModelElement {

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getDevelopmentTeam_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.AbstractProduct}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.AbstractProduct#getDevelopmentTeam <em>Development Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getDevelopmentTeam_Products()
	 * @see org.nasdanika.scrum.AbstractProduct#getDevelopmentTeam
	 * @model opposite="developmentTeam"
	 * @generated
	 */
	EList<AbstractProduct> getProducts();
} // DevelopmentTeam
