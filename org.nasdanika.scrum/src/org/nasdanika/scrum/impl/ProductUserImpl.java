/**
 */
package org.nasdanika.scrum.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.nasdanika.scrum.Functionality;
import org.nasdanika.scrum.ProductUser;
import org.nasdanika.scrum.ScrumPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.impl.ProductUserImpl#getFunctionality <em>Functionality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductUserImpl extends ModelElementImpl implements ProductUser {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScrumPackage.Literals.PRODUCT_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Functionality> getFunctionality() {
		return (EList<Functionality>)eGet(ScrumPackage.Literals.PRODUCT_USER__FUNCTIONALITY, true);
	}

} //ProductUserImpl
