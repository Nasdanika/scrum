/**
 */
package org.nasdanika.scrum.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.cdo.security.impl.LoginPasswordRealmImpl;

import org.nasdanika.scrum.ScrumPackage;
import org.nasdanika.scrum.ScrumRealm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realm</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ScrumRealmImpl extends LoginPasswordRealmImpl implements ScrumRealm {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScrumRealmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScrumPackage.Literals.SCRUM_REALM;
	}

} //ScrumRealmImpl
