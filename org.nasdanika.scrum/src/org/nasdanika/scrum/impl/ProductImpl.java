/**
 */
package org.nasdanika.scrum.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.scrum.Component;
import org.nasdanika.scrum.Epic;
import org.nasdanika.scrum.Interaction;
import org.nasdanika.scrum.Party;
import org.nasdanika.scrum.Product;
import org.nasdanika.scrum.ProductUser;
import org.nasdanika.scrum.ScrumPackage;
import org.nasdanika.scrum.TargetGroup;
import org.nasdanika.scrum.Theme;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.impl.ProductImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.ProductImpl#getThemes <em>Themes</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.ProductImpl#getProductUsers <em>Product Users</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.ProductImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.ProductImpl#getTargetGroups <em>Target Groups</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.ProductImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.ProductImpl#getInteractions <em>Interactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends AbstractProductImpl implements Product {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScrumPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Epic> getCapabilities() {
		return (EList<Epic>)eGet(ScrumPackage.Literals.PRODUCT__CAPABILITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Theme> getThemes() {
		return (EList<Theme>)eGet(ScrumPackage.Literals.PRODUCT__THEMES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProductUser> getProductUsers() {
		return (EList<ProductUser>)eGet(ScrumPackage.Literals.PRODUCT__PRODUCT_USERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Party> getCustomers() {
		return (EList<Party>)eGet(ScrumPackage.Literals.PRODUCT__CUSTOMERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TargetGroup> getTargetGroups() {
		return (EList<TargetGroup>)eGet(ScrumPackage.Literals.PRODUCT__TARGET_GROUPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Component> getComponents() {
		return (EList<Component>)eGet(ScrumPackage.Literals.PRODUCT__COMPONENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interaction> getInteractions() {
		return (EList<Interaction>)eGet(ScrumPackage.Literals.PRODUCT__INTERACTIONS, true);
	}

} //ProductImpl
