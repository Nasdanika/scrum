/**
 */
package org.nasdanika.scrum.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.scrum.Functionality;
import org.nasdanika.scrum.Member;
import org.nasdanika.scrum.Party;
import org.nasdanika.scrum.ScrumPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.impl.MemberImpl#getParties <em>Parties</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.MemberImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberImpl extends ModelElementImpl implements Member {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScrumPackage.Literals.MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Party> getParties() {
		return (EList<Party>)eGet(ScrumPackage.Literals.MEMBER__PARTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Functionality> getAssignments() {
		return (EList<Functionality>)eGet(ScrumPackage.Literals.MEMBER__ASSIGNMENTS, true);
	}

} //MemberImpl
