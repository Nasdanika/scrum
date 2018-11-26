/**
 */
package org.nasdanika.scrum.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.scrum.Customer;
import org.nasdanika.scrum.Functionality;
import org.nasdanika.scrum.Funding;
import org.nasdanika.scrum.Interaction;
import org.nasdanika.scrum.Party;
import org.nasdanika.scrum.Product;
import org.nasdanika.scrum.Request;
import org.nasdanika.scrum.ScrumPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.impl.CustomerImpl#getParties <em>Parties</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.CustomerImpl#getRequests <em>Requests</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.CustomerImpl#getFundings <em>Fundings</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.CustomerImpl#getUsesProducts <em>Uses Products</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.CustomerImpl#getUsesFunctionality <em>Uses Functionality</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.CustomerImpl#getInteractions <em>Interactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends ModelElementImpl implements Customer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScrumPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Party> getParties() {
		return (EList<Party>)eGet(ScrumPackage.Literals.CUSTOMER__PARTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Request> getRequests() {
		return (EList<Request>)eGet(ScrumPackage.Literals.CUSTOMER__REQUESTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Funding> getFundings() {
		return (EList<Funding>)eGet(ScrumPackage.Literals.CUSTOMER__FUNDINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Product> getUsesProducts() {
		return (EList<Product>)eGet(ScrumPackage.Literals.CUSTOMER__USES_PRODUCTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Functionality> getUsesFunctionality() {
		return (EList<Functionality>)eGet(ScrumPackage.Literals.CUSTOMER__USES_FUNCTIONALITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interaction> getInteractions() {
		return (EList<Interaction>)eGet(ScrumPackage.Literals.CUSTOMER__INTERACTIONS, true);
	}

} //CustomerImpl
