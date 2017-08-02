/**
 */
package org.nasdanika.scrum.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.nasdanika.scrum.Functionality;
import org.nasdanika.scrum.ScrumPackage;
import org.nasdanika.scrum.Theme;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Theme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.impl.ThemeImpl#getFunctionality <em>Functionality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThemeImpl extends ModelElementImpl implements Theme {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScrumPackage.Literals.THEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Functionality> getFunctionality() {
		return (EList<Functionality>)eGet(ScrumPackage.Literals.THEME__FUNCTIONALITY, true);
	}

} //ThemeImpl
