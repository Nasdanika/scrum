/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.nasdanika.cdo.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.scrum.ScrumFactory
 * @model kind="package"
 * @generated
 */
public interface ScrumPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scrum";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.scrum";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.scrum";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScrumPackage eINSTANCE = org.nasdanika.scrum.impl.ScrumPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.ModelElementImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.ScrumRealmImpl <em>Realm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.ScrumRealmImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getScrumRealm()
	 * @generated
	 */
	int SCRUM_REALM = 1;

	/**
	 * The feature id for the '<em><b>Administrators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM__ADMINISTRATORS = SecurityPackage.LOGIN_PASSWORD_REALM__ADMINISTRATORS;

	/**
	 * The feature id for the '<em><b>Guest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM__GUEST = SecurityPackage.LOGIN_PASSWORD_REALM__GUEST;

	/**
	 * The feature id for the '<em><b>Everyone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM__EVERYONE = SecurityPackage.LOGIN_PASSWORD_REALM__EVERYONE;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM__PACKAGES = SecurityPackage.LOGIN_PASSWORD_REALM__PACKAGES;

	/**
	 * The number of structural features of the '<em>Realm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM_FEATURE_COUNT = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Authenticate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM___AUTHENTICATE__OBJECT = SecurityPackage.LOGIN_PASSWORD_REALM___AUTHENTICATE__OBJECT;

	/**
	 * The operation id for the '<em>Get All Users</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM___GET_ALL_USERS = SecurityPackage.LOGIN_PASSWORD_REALM___GET_ALL_USERS;

	/**
	 * The operation id for the '<em>Clear Permissions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM___CLEAR_PERMISSIONS__EOBJECT = SecurityPackage.LOGIN_PASSWORD_REALM___CLEAR_PERMISSIONS__EOBJECT;

	/**
	 * The operation id for the '<em>Is Administrator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM___IS_ADMINISTRATOR__PRINCIPAL = SecurityPackage.LOGIN_PASSWORD_REALM___IS_ADMINISTRATOR__PRINCIPAL;

	/**
	 * The operation id for the '<em>Set Password Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM___SET_PASSWORD_HASH__LOGINPASSWORDHASHUSER_STRING = SecurityPackage.LOGIN_PASSWORD_REALM___SET_PASSWORD_HASH__LOGINPASSWORDHASHUSER_STRING;

	/**
	 * The operation id for the '<em>Get User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM___GET_USER__STRING = SecurityPackage.LOGIN_PASSWORD_REALM___GET_USER__STRING;

	/**
	 * The number of operations of the '<em>Realm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM_OPERATION_COUNT = SecurityPackage.LOGIN_PASSWORD_REALM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.nasdanika.scrum.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.scrum.ModelElement#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see org.nasdanika.scrum.ModelElement#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getModelElement__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.ScrumRealm <em>Realm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realm</em>'.
	 * @see org.nasdanika.scrum.ScrumRealm
	 * @generated
	 */
	EClass getScrumRealm();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScrumFactory getScrumFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.ModelElementImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getModelElement__Validate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.ScrumRealmImpl <em>Realm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.ScrumRealmImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getScrumRealm()
		 * @generated
		 */
		EClass SCRUM_REALM = eINSTANCE.getScrumRealm();

	}

} //ScrumPackage
