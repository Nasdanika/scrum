/**
 */
package org.nasdanika.scrum.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.scrum.Functionality;
import org.nasdanika.scrum.Funding;
import org.nasdanika.scrum.Need;
import org.nasdanika.scrum.Party;
import org.nasdanika.scrum.ProductUser;
import org.nasdanika.scrum.ScrumPackage;
import org.nasdanika.scrum.Theme;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functionality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.impl.FunctionalityImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.FunctionalityImpl#getThemes <em>Themes</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.FunctionalityImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.FunctionalityImpl#getFundings <em>Fundings</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.FunctionalityImpl#getSatisfies <em>Satisfies</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FunctionalityImpl extends ModelElementImpl implements Functionality {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScrumPackage.Literals.FUNCTIONALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProductUser> getUsers() {
		return (EList<ProductUser>)eGet(ScrumPackage.Literals.FUNCTIONALITY__USERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Theme> getThemes() {
		return (EList<Theme>)eGet(ScrumPackage.Literals.FUNCTIONALITY__THEMES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Party> getCustomers() {
		return (EList<Party>)eGet(ScrumPackage.Literals.FUNCTIONALITY__CUSTOMERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Funding> getFundings() {
		return (EList<Funding>)eGet(ScrumPackage.Literals.FUNCTIONALITY__FUNDINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Need> getSatisfies() {
		return (EList<Need>)eGet(ScrumPackage.Literals.FUNCTIONALITY__SATISFIES, true);
	}

} //FunctionalityImpl
