/**
 */
package org.nasdanika.scrum.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.scrum.Party;
import org.nasdanika.scrum.PartyReference;
import org.nasdanika.scrum.ScrumPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.impl.PartyReferenceImpl#getParty <em>Party</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyReferenceImpl extends PartyImpl implements PartyReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScrumPackage.Literals.PARTY_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party getParty() {
		return (Party)eGet(ScrumPackage.Literals.PARTY_REFERENCE__PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParty(Party newParty) {
		eSet(ScrumPackage.Literals.PARTY_REFERENCE__PARTY, newParty);
	}

} //PartyReferenceImpl
