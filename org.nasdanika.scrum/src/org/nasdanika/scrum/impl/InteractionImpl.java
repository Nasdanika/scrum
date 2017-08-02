/**
 */
package org.nasdanika.scrum.impl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.scrum.Functionality;
import org.nasdanika.scrum.Interaction;
import org.nasdanika.scrum.Party;
import org.nasdanika.scrum.Product;
import org.nasdanika.scrum.ScrumPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.impl.InteractionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.InteractionImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.InteractionImpl#getFunctionality <em>Functionality</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.InteractionImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.InteractionImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionImpl extends ModelElementImpl implements Interaction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScrumPackage.Literals.INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return (Date)eGet(ScrumPackage.Literals.INTERACTION__DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		eSet(ScrumPackage.Literals.INTERACTION__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Product> getProducts() {
		return (EList<Product>)eGet(ScrumPackage.Literals.INTERACTION__PRODUCTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Functionality> getFunctionality() {
		return (EList<Functionality>)eGet(ScrumPackage.Literals.INTERACTION__FUNCTIONALITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Party> getParticipant() {
		return (EList<Party>)eGet(ScrumPackage.Literals.INTERACTION__PARTICIPANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interaction> getChildren() {
		return (EList<Interaction>)eGet(ScrumPackage.Literals.INTERACTION__CHILDREN, true);
	}

} //InteractionImpl
