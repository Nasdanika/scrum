/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.Theme#getFunctionality <em>Functionality</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getTheme()
 * @model
 * @generated
 */
public interface Theme extends ModelElement {

	/**
	 * Returns the value of the '<em><b>Functionality</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Functionality}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.Functionality#getThemes <em>Themes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functionality</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionality</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getTheme_Functionality()
	 * @see org.nasdanika.scrum.Functionality#getThemes
	 * @model opposite="themes"
	 * @generated
	 */
	EList<Functionality> getFunctionality();
} // Theme
