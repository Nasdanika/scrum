/**
 */
package org.nasdanika.scrum.impl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.scrum.Functionality;
import org.nasdanika.scrum.Interaction;
import org.nasdanika.scrum.Product;
import org.nasdanika.scrum.Request;
import org.nasdanika.scrum.ScrumPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.impl.RequestImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.RequestImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.RequestImpl#getFulfilledBy <em>Fulfilled By</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.RequestImpl#getRelatedProducts <em>Related Products</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.RequestImpl#getInteractions <em>Interactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestImpl extends ModelElementImpl implements Request {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScrumPackage.Literals.REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return (Date)eGet(ScrumPackage.Literals.REQUEST__DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		eSet(ScrumPackage.Literals.REQUEST__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Request> getChildren() {
		return (EList<Request>)eGet(ScrumPackage.Literals.REQUEST__CHILDREN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Functionality> getFulfilledBy() {
		return (EList<Functionality>)eGet(ScrumPackage.Literals.REQUEST__FULFILLED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Product> getRelatedProducts() {
		return (EList<Product>)eGet(ScrumPackage.Literals.REQUEST__RELATED_PRODUCTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interaction> getInteractions() {
		return (EList<Interaction>)eGet(ScrumPackage.Literals.REQUEST__INTERACTIONS, true);
	}

} //RequestImpl
