/**
 */
package org.nasdanika.scrum.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.scrum.Party;
import org.nasdanika.scrum.PartyCategory;
import org.nasdanika.scrum.ScrumPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.impl.PartyCategoryImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyCategoryImpl extends PartyImpl implements PartyCategory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScrumPackage.Literals.PARTY_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Party> getChildren() {
		return (EList<Party>)eGet(ScrumPackage.Literals.PARTY_CATEGORY__CHILDREN, true);
	}

} //PartyCategoryImpl
