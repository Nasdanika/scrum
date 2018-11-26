/**
 */
package org.nasdanika.scrum.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.nasdanika.scrum.Customer;
import org.nasdanika.scrum.Interaction;
import org.nasdanika.scrum.Party;
import org.nasdanika.scrum.PartyReference;
import org.nasdanika.scrum.ScrumPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.impl.PartyImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.PartyImpl#getCustomerOf <em>Customer Of</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.PartyImpl#getInteractions <em>Interactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PartyImpl extends ModelElementImpl implements Party {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScrumPackage.Literals.PARTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PartyReference> getReferences() {
		return (EList<PartyReference>)eGet(ScrumPackage.Literals.PARTY__REFERENCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Customer> getCustomerOf() {
		return (EList<Customer>)eGet(ScrumPackage.Literals.PARTY__CUSTOMER_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interaction> getInteractions() {
		return (EList<Interaction>)eGet(ScrumPackage.Literals.PARTY__INTERACTIONS, true);
	}

} //PartyImpl
