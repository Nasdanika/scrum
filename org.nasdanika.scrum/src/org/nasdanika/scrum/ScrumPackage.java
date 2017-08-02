/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NOTES = 2;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 3;

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
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.NoteImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.ScrumRealmImpl <em>Realm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.ScrumRealmImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getScrumRealm()
	 * @generated
	 */
	int SCRUM_REALM = 2;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM__NAME = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM__DESCRIPTION = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM__NOTES = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM__PARTIES = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Realm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM_FEATURE_COUNT = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 4;

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
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM___VALIDATE__DIAGNOSTICCHAIN_MAP = SecurityPackage.LOGIN_PASSWORD_REALM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Realm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_REALM_OPERATION_COUNT = SecurityPackage.LOGIN_PASSWORD_REALM_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.PartyImpl <em>Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.PartyImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getParty()
	 * @generated
	 */
	int PARTY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__NOTES = MODEL_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__REFERENCES = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uses Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__USES_PRODUCTS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uses Functionality</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__USES_FUNCTIONALITY = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__INTERACTIONS = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fundings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__FUNDINGS = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___VALIDATE__DIAGNOSTICCHAIN_MAP = MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.PartyCategoryImpl <em>Party Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.PartyCategoryImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getPartyCategory()
	 * @generated
	 */
	int PARTY_CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CATEGORY__NAME = PARTY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CATEGORY__DESCRIPTION = PARTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CATEGORY__NOTES = PARTY__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CATEGORY__REFERENCES = PARTY__REFERENCES;

	/**
	 * The feature id for the '<em><b>Uses Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CATEGORY__USES_PRODUCTS = PARTY__USES_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Uses Functionality</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CATEGORY__USES_FUNCTIONALITY = PARTY__USES_FUNCTIONALITY;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CATEGORY__INTERACTIONS = PARTY__INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Fundings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CATEGORY__FUNDINGS = PARTY__FUNDINGS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CATEGORY__CHILDREN = PARTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Party Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CATEGORY_FEATURE_COUNT = PARTY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CATEGORY___VALIDATE__DIAGNOSTICCHAIN_MAP = PARTY___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Party Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CATEGORY_OPERATION_COUNT = PARTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.OrganizationImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = PARTY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DESCRIPTION = PARTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NOTES = PARTY__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__REFERENCES = PARTY__REFERENCES;

	/**
	 * The feature id for the '<em><b>Uses Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__USES_PRODUCTS = PARTY__USES_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Uses Functionality</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__USES_FUNCTIONALITY = PARTY__USES_FUNCTIONALITY;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__INTERACTIONS = PARTY__INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Fundings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__FUNDINGS = PARTY__FUNDINGS;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MEMBERS = PARTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = PARTY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___VALIDATE__DIAGNOSTICCHAIN_MAP = PARTY___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = PARTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.ProjectImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = PARTY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = PARTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NOTES = PARTY__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REFERENCES = PARTY__REFERENCES;

	/**
	 * The feature id for the '<em><b>Uses Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__USES_PRODUCTS = PARTY__USES_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Uses Functionality</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__USES_FUNCTIONALITY = PARTY__USES_FUNCTIONALITY;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__INTERACTIONS = PARTY__INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Fundings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FUNDINGS = PARTY__FUNDINGS;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MEMBERS = PARTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = PARTY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___VALIDATE__DIAGNOSTICCHAIN_MAP = PARTY___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = PARTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.PersonImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = PARTY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DESCRIPTION = PARTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NOTES = PARTY__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__REFERENCES = PARTY__REFERENCES;

	/**
	 * The feature id for the '<em><b>Uses Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__USES_PRODUCTS = PARTY__USES_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Uses Functionality</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__USES_FUNCTIONALITY = PARTY__USES_FUNCTIONALITY;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__INTERACTIONS = PARTY__INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Fundings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FUNDINGS = PARTY__FUNDINGS;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = PARTY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___VALIDATE__DIAGNOSTICCHAIN_MAP = PARTY___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = PARTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.MemberImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NOTES = MODEL_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Parties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__PARTIES = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ASSIGNMENTS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER___VALIDATE__DIAGNOSTICCHAIN_MAP = MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.PartyReferenceImpl <em>Party Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.PartyReferenceImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getPartyReference()
	 * @generated
	 */
	int PARTY_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_REFERENCE__NAME = PARTY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_REFERENCE__DESCRIPTION = PARTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_REFERENCE__NOTES = PARTY__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_REFERENCE__REFERENCES = PARTY__REFERENCES;

	/**
	 * The feature id for the '<em><b>Uses Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_REFERENCE__USES_PRODUCTS = PARTY__USES_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Uses Functionality</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_REFERENCE__USES_FUNCTIONALITY = PARTY__USES_FUNCTIONALITY;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_REFERENCE__INTERACTIONS = PARTY__INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Fundings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_REFERENCE__FUNDINGS = PARTY__FUNDINGS;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_REFERENCE__PARTY = PARTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Party Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_REFERENCE_FEATURE_COUNT = PARTY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_REFERENCE___VALIDATE__DIAGNOSTICCHAIN_MAP = PARTY___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Party Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_REFERENCE_OPERATION_COUNT = PARTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.AbstractProductImpl <em>Abstract Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.AbstractProductImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getAbstractProduct()
	 * @generated
	 */
	int ABSTRACT_PRODUCT = 12;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.ProductImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 13;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.ComponentImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 14;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.TargetGroupImpl <em>Target Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.TargetGroupImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getTargetGroup()
	 * @generated
	 */
	int TARGET_GROUP = 15;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.NeedImpl <em>Need</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.NeedImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getNeed()
	 * @generated
	 */
	int NEED = 16;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.ProductCategoryImpl <em>Product Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.ProductCategoryImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getProductCategory()
	 * @generated
	 */
	int PRODUCT_CATEGORY = 17;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.FunctionalityImpl <em>Functionality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.FunctionalityImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getFunctionality()
	 * @generated
	 */
	int FUNCTIONALITY = 20;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.EpicImpl <em>Epic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.EpicImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getEpic()
	 * @generated
	 */
	int EPIC = 21;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.FeatureImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 22;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.UserStoryImpl <em>User Story</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.UserStoryImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getUserStory()
	 * @generated
	 */
	int USER_STORY = 23;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.TaskImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 24;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.ReleaseImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 25;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.SprintImpl <em>Sprint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.SprintImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getSprint()
	 * @generated
	 */
	int SPRINT = 26;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.ArtifactImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 27;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.ThemeImpl <em>Theme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.ThemeImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getTheme()
	 * @generated
	 */
	int THEME = 18;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.ProductUserImpl <em>Product User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.ProductUserImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getProductUser()
	 * @generated
	 */
	int PRODUCT_USER = 19;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.InteractionImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 28;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.ScrumTeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.ScrumTeamImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getScrumTeam()
	 * @generated
	 */
	int SCRUM_TEAM = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_TEAM__NAME = ORGANIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_TEAM__DESCRIPTION = ORGANIZATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_TEAM__NOTES = ORGANIZATION__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_TEAM__REFERENCES = ORGANIZATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Uses Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_TEAM__USES_PRODUCTS = ORGANIZATION__USES_PRODUCTS;

	/**
	 * The feature id for the '<em><b>Uses Functionality</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_TEAM__USES_FUNCTIONALITY = ORGANIZATION__USES_FUNCTIONALITY;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_TEAM__INTERACTIONS = ORGANIZATION__INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Fundings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_TEAM__FUNDINGS = ORGANIZATION__FUNDINGS;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_TEAM__MEMBERS = ORGANIZATION__MEMBERS;

	/**
	 * The feature id for the '<em><b>Developmentteams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_TEAM__DEVELOPMENTTEAMS = ORGANIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_TEAM__PRODUCT_OWNER = ORGANIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scrum Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_TEAM__SCRUM_MASTER = ORGANIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_TEAM__PRODUCTS = ORGANIZATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Team Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_TEAM__TEAM_INTERACTIONS = ORGANIZATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Releases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_TEAM__RELEASES = ORGANIZATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_TEAM_FEATURE_COUNT = ORGANIZATION_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_TEAM___VALIDATE__DIAGNOSTICCHAIN_MAP = ORGANIZATION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRUM_TEAM_OPERATION_COUNT = ORGANIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.DevelopmentTeamImpl <em>Development Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.DevelopmentTeamImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getDevelopmentTeam()
	 * @generated
	 */
	int DEVELOPMENT_TEAM = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_TEAM__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_TEAM__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_TEAM__NOTES = MODEL_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_TEAM__MEMBERS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_TEAM__PRODUCTS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Development Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_TEAM_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_TEAM___VALIDATE__DIAGNOSTICCHAIN_MAP = MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Development Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_TEAM_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PRODUCT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PRODUCT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PRODUCT__NOTES = MODEL_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Development Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PRODUCT__DEVELOPMENT_TEAM = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PRODUCT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PRODUCT___VALIDATE__DIAGNOSTICCHAIN_MAP = MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Abstract Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PRODUCT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = ABSTRACT_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = ABSTRACT_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NOTES = ABSTRACT_PRODUCT__NOTES;

	/**
	 * The feature id for the '<em><b>Development Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DEVELOPMENT_TEAM = ABSTRACT_PRODUCT__DEVELOPMENT_TEAM;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CAPABILITIES = ABSTRACT_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Themes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__THEMES = ABSTRACT_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_USERS = ABSTRACT_PRODUCT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CUSTOMERS = ABSTRACT_PRODUCT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TARGET_GROUPS = ABSTRACT_PRODUCT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__COMPONENTS = ABSTRACT_PRODUCT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__INTERACTIONS = ABSTRACT_PRODUCT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = ABSTRACT_PRODUCT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___VALIDATE__DIAGNOSTICCHAIN_MAP = ABSTRACT_PRODUCT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = ABSTRACT_PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NOTES = MODEL_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNERS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___VALIDATE__DIAGNOSTICCHAIN_MAP = MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP__NOTES = MODEL_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Needs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP__NEEDS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Target Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__NOTES = MODEL_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__SATISFIED_BY = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED___VALIDATE__DIAGNOSTICCHAIN_MAP = MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__NAME = ABSTRACT_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__DESCRIPTION = ABSTRACT_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__NOTES = ABSTRACT_PRODUCT__NOTES;

	/**
	 * The feature id for the '<em><b>Development Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__DEVELOPMENT_TEAM = ABSTRACT_PRODUCT__DEVELOPMENT_TEAM;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__PRODUCTS = ABSTRACT_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_FEATURE_COUNT = ABSTRACT_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY___VALIDATE__DIAGNOSTICCHAIN_MAP = ABSTRACT_PRODUCT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Product Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_OPERATION_COUNT = ABSTRACT_PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME__NOTES = MODEL_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Functionality</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME__FUNCTIONALITY = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Theme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME___VALIDATE__DIAGNOSTICCHAIN_MAP = MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Theme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_USER__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_USER__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_USER__NOTES = MODEL_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Functionality</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_USER__FUNCTIONALITY = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_USER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_USER___VALIDATE__DIAGNOSTICCHAIN_MAP = MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Product User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_USER_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__NOTES = MODEL_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__USERS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Themes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__THEMES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__CUSTOMERS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fundings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__FUNDINGS = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__SATISFIES = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__DEPENDENCIES = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Dependants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__DEPENDANTS = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__INTERACTIONS = MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Assigned To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__ASSIGNED_TO = MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Functionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY___VALIDATE__DIAGNOSTICCHAIN_MAP = MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Functionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__NAME = FUNCTIONALITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__DESCRIPTION = FUNCTIONALITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__NOTES = FUNCTIONALITY__NOTES;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__USERS = FUNCTIONALITY__USERS;

	/**
	 * The feature id for the '<em><b>Themes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__THEMES = FUNCTIONALITY__THEMES;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__CUSTOMERS = FUNCTIONALITY__CUSTOMERS;

	/**
	 * The feature id for the '<em><b>Fundings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__FUNDINGS = FUNCTIONALITY__FUNDINGS;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__SATISFIES = FUNCTIONALITY__SATISFIES;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__DEPENDENCIES = FUNCTIONALITY__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Dependants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__DEPENDANTS = FUNCTIONALITY__DEPENDANTS;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__INTERACTIONS = FUNCTIONALITY__INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Assigned To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__ASSIGNED_TO = FUNCTIONALITY__ASSIGNED_TO;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__CHILDREN = FUNCTIONALITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__FEATURES = FUNCTIONALITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Epic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC_FEATURE_COUNT = FUNCTIONALITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC___VALIDATE__DIAGNOSTICCHAIN_MAP = FUNCTIONALITY___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Epic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC_OPERATION_COUNT = FUNCTIONALITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = FUNCTIONALITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = FUNCTIONALITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NOTES = FUNCTIONALITY__NOTES;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__USERS = FUNCTIONALITY__USERS;

	/**
	 * The feature id for the '<em><b>Themes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__THEMES = FUNCTIONALITY__THEMES;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CUSTOMERS = FUNCTIONALITY__CUSTOMERS;

	/**
	 * The feature id for the '<em><b>Fundings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FUNDINGS = FUNCTIONALITY__FUNDINGS;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SATISFIES = FUNCTIONALITY__SATISFIES;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DEPENDENCIES = FUNCTIONALITY__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Dependants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DEPENDANTS = FUNCTIONALITY__DEPENDANTS;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__INTERACTIONS = FUNCTIONALITY__INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Assigned To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ASSIGNED_TO = FUNCTIONALITY__ASSIGNED_TO;

	/**
	 * The feature id for the '<em><b>User Stories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__USER_STORIES = FUNCTIONALITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Planned For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PLANNED_FOR = FUNCTIONALITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = FUNCTIONALITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___VALIDATE__DIAGNOSTICCHAIN_MAP = FUNCTIONALITY___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = FUNCTIONALITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__NAME = FUNCTIONALITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__DESCRIPTION = FUNCTIONALITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__NOTES = FUNCTIONALITY__NOTES;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__USERS = FUNCTIONALITY__USERS;

	/**
	 * The feature id for the '<em><b>Themes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__THEMES = FUNCTIONALITY__THEMES;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__CUSTOMERS = FUNCTIONALITY__CUSTOMERS;

	/**
	 * The feature id for the '<em><b>Fundings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__FUNDINGS = FUNCTIONALITY__FUNDINGS;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__SATISFIES = FUNCTIONALITY__SATISFIES;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__DEPENDENCIES = FUNCTIONALITY__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Dependants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__DEPENDANTS = FUNCTIONALITY__DEPENDANTS;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__INTERACTIONS = FUNCTIONALITY__INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Assigned To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__ASSIGNED_TO = FUNCTIONALITY__ASSIGNED_TO;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__TASKS = FUNCTIONALITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Planned For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__PLANNED_FOR = FUNCTIONALITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY_FEATURE_COUNT = FUNCTIONALITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY___VALIDATE__DIAGNOSTICCHAIN_MAP = FUNCTIONALITY___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>User Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY_OPERATION_COUNT = FUNCTIONALITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NOTES = MODEL_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__COMPONENTS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___VALIDATE__DIAGNOSTICCHAIN_MAP = MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NOTES = MODEL_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Sprints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__SPRINTS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__ARTIFACTS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__FEATURES = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE___VALIDATE__DIAGNOSTICCHAIN_MAP = MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRINT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRINT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRINT__NOTES = MODEL_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRINT__START = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRINT__END = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRINT__STORIES = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sprint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRINT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRINT___VALIDATE__DIAGNOSTICCHAIN_MAP = MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Sprint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRINT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NOTES = MODEL_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__OWNER = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT___VALIDATE__DIAGNOSTICCHAIN_MAP = MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__DATE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__PRODUCTS = 2;

	/**
	 * The feature id for the '<em><b>Functionality</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__FUNCTIONALITY = 3;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__PARTICIPANT = 4;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.impl.FundingImpl <em>Funding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.impl.FundingImpl
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getFunding()
	 * @generated
	 */
	int FUNDING = 29;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDING__DATE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDING__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDING__CUSTOMERS = 2;

	/**
	 * The number of structural features of the '<em>Funding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Funding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDING_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.scrum.FunctionalityState <em>Functionality State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.scrum.FunctionalityState
	 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getFunctionalityState()
	 * @generated
	 */
	int FUNCTIONALITY_STATE = 30;


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
	 * Returns the meta object for the attribute '{@link org.nasdanika.scrum.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.scrum.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.scrum.ModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.scrum.ModelElement#getDescription()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.ModelElement#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes</em>'.
	 * @see org.nasdanika.scrum.ModelElement#getNotes()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Notes();

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
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see org.nasdanika.scrum.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.scrum.Note#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.nasdanika.scrum.Note#getDate()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.scrum.Note#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.scrum.Note#getDescription()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Description();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.ScrumRealm#getParties <em>Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parties</em>'.
	 * @see org.nasdanika.scrum.ScrumRealm#getParties()
	 * @see #getScrumRealm()
	 * @generated
	 */
	EReference getScrumRealm_Parties();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party</em>'.
	 * @see org.nasdanika.scrum.Party
	 * @generated
	 */
	EClass getParty();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Party#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see org.nasdanika.scrum.Party#getReferences()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_References();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Party#getUsesProducts <em>Uses Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Products</em>'.
	 * @see org.nasdanika.scrum.Party#getUsesProducts()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_UsesProducts();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Party#getUsesFunctionality <em>Uses Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Functionality</em>'.
	 * @see org.nasdanika.scrum.Party#getUsesFunctionality()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_UsesFunctionality();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Party#getInteractions <em>Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interactions</em>'.
	 * @see org.nasdanika.scrum.Party#getInteractions()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_Interactions();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Party#getFundings <em>Fundings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fundings</em>'.
	 * @see org.nasdanika.scrum.Party#getFundings()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_Fundings();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.PartyCategory <em>Party Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Category</em>'.
	 * @see org.nasdanika.scrum.PartyCategory
	 * @generated
	 */
	EClass getPartyCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.PartyCategory#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.scrum.PartyCategory#getChildren()
	 * @see #getPartyCategory()
	 * @generated
	 */
	EReference getPartyCategory_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see org.nasdanika.scrum.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.Organization#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.nasdanika.scrum.Organization#getMembers()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Members();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.nasdanika.scrum.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.Project#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.nasdanika.scrum.Project#getMembers()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Members();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.nasdanika.scrum.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see org.nasdanika.scrum.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.Member#getParties <em>Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parties</em>'.
	 * @see org.nasdanika.scrum.Member#getParties()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Parties();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Member#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assignments</em>'.
	 * @see org.nasdanika.scrum.Member#getAssignments()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Assignments();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.PartyReference <em>Party Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Reference</em>'.
	 * @see org.nasdanika.scrum.PartyReference
	 * @generated
	 */
	EClass getPartyReference();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.scrum.PartyReference#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.nasdanika.scrum.PartyReference#getParty()
	 * @see #getPartyReference()
	 * @generated
	 */
	EReference getPartyReference_Party();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.AbstractProduct <em>Abstract Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Product</em>'.
	 * @see org.nasdanika.scrum.AbstractProduct
	 * @generated
	 */
	EClass getAbstractProduct();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.scrum.AbstractProduct#getDevelopmentTeam <em>Development Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Development Team</em>'.
	 * @see org.nasdanika.scrum.AbstractProduct#getDevelopmentTeam()
	 * @see #getAbstractProduct()
	 * @generated
	 */
	EReference getAbstractProduct_DevelopmentTeam();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see org.nasdanika.scrum.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.Product#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see org.nasdanika.scrum.Product#getCapabilities()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Capabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.Product#getThemes <em>Themes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Themes</em>'.
	 * @see org.nasdanika.scrum.Product#getThemes()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Themes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.Product#getProductUsers <em>Product Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Users</em>'.
	 * @see org.nasdanika.scrum.Product#getProductUsers()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ProductUsers();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Product#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customers</em>'.
	 * @see org.nasdanika.scrum.Product#getCustomers()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Customers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.Product#getTargetGroups <em>Target Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Groups</em>'.
	 * @see org.nasdanika.scrum.Product#getTargetGroups()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_TargetGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.Product#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.nasdanika.scrum.Product#getComponents()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Components();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Product#getInteractions <em>Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interactions</em>'.
	 * @see org.nasdanika.scrum.Product#getInteractions()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Interactions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.nasdanika.scrum.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Component#getOwners <em>Owners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owners</em>'.
	 * @see org.nasdanika.scrum.Component#getOwners()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Owners();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.TargetGroup <em>Target Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Group</em>'.
	 * @see org.nasdanika.scrum.TargetGroup
	 * @generated
	 */
	EClass getTargetGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.TargetGroup#getNeeds <em>Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Needs</em>'.
	 * @see org.nasdanika.scrum.TargetGroup#getNeeds()
	 * @see #getTargetGroup()
	 * @generated
	 */
	EReference getTargetGroup_Needs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Need <em>Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Need</em>'.
	 * @see org.nasdanika.scrum.Need
	 * @generated
	 */
	EClass getNeed();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Need#getSatisfiedBy <em>Satisfied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satisfied By</em>'.
	 * @see org.nasdanika.scrum.Need#getSatisfiedBy()
	 * @see #getNeed()
	 * @generated
	 */
	EReference getNeed_SatisfiedBy();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.ProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Category</em>'.
	 * @see org.nasdanika.scrum.ProductCategory
	 * @generated
	 */
	EClass getProductCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.ProductCategory#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see org.nasdanika.scrum.ProductCategory#getProducts()
	 * @see #getProductCategory()
	 * @generated
	 */
	EReference getProductCategory_Products();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Functionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functionality</em>'.
	 * @see org.nasdanika.scrum.Functionality
	 * @generated
	 */
	EClass getFunctionality();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Functionality#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Users</em>'.
	 * @see org.nasdanika.scrum.Functionality#getUsers()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Users();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Functionality#getThemes <em>Themes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Themes</em>'.
	 * @see org.nasdanika.scrum.Functionality#getThemes()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Themes();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Functionality#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customers</em>'.
	 * @see org.nasdanika.scrum.Functionality#getCustomers()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Customers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.Functionality#getFundings <em>Fundings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fundings</em>'.
	 * @see org.nasdanika.scrum.Functionality#getFundings()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Fundings();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Functionality#getSatisfies <em>Satisfies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satisfies</em>'.
	 * @see org.nasdanika.scrum.Functionality#getSatisfies()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Satisfies();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Functionality#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see org.nasdanika.scrum.Functionality#getDependencies()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Dependencies();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Functionality#getDependants <em>Dependants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependants</em>'.
	 * @see org.nasdanika.scrum.Functionality#getDependants()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Dependants();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Functionality#getInteractions <em>Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interactions</em>'.
	 * @see org.nasdanika.scrum.Functionality#getInteractions()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Interactions();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Functionality#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned To</em>'.
	 * @see org.nasdanika.scrum.Functionality#getAssignedTo()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_AssignedTo();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Epic <em>Epic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Epic</em>'.
	 * @see org.nasdanika.scrum.Epic
	 * @generated
	 */
	EClass getEpic();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.Epic#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.scrum.Epic#getChildren()
	 * @see #getEpic()
	 * @generated
	 */
	EReference getEpic_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.Epic#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.nasdanika.scrum.Epic#getFeatures()
	 * @see #getEpic()
	 * @generated
	 */
	EReference getEpic_Features();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.nasdanika.scrum.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.Feature#getUserStories <em>User Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Stories</em>'.
	 * @see org.nasdanika.scrum.Feature#getUserStories()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_UserStories();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Feature#getPlannedFor <em>Planned For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Planned For</em>'.
	 * @see org.nasdanika.scrum.Feature#getPlannedFor()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_PlannedFor();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.UserStory <em>User Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Story</em>'.
	 * @see org.nasdanika.scrum.UserStory
	 * @generated
	 */
	EClass getUserStory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.UserStory#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see org.nasdanika.scrum.UserStory#getTasks()
	 * @see #getUserStory()
	 * @generated
	 */
	EReference getUserStory_Tasks();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.UserStory#getPlannedFor <em>Planned For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Planned For</em>'.
	 * @see org.nasdanika.scrum.UserStory#getPlannedFor()
	 * @see #getUserStory()
	 * @generated
	 */
	EReference getUserStory_PlannedFor();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.nasdanika.scrum.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Task#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see org.nasdanika.scrum.Task#getComponents()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Components();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see org.nasdanika.scrum.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.Release#getSprints <em>Sprints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sprints</em>'.
	 * @see org.nasdanika.scrum.Release#getSprints()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_Sprints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.Release#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see org.nasdanika.scrum.Release#getArtifacts()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_Artifacts();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Release#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see org.nasdanika.scrum.Release#getFeatures()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_Features();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Sprint <em>Sprint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sprint</em>'.
	 * @see org.nasdanika.scrum.Sprint
	 * @generated
	 */
	EClass getSprint();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.scrum.Sprint#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.nasdanika.scrum.Sprint#getStart()
	 * @see #getSprint()
	 * @generated
	 */
	EAttribute getSprint_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.scrum.Sprint#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.nasdanika.scrum.Sprint#getEnd()
	 * @see #getSprint()
	 * @generated
	 */
	EAttribute getSprint_End();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Sprint#getStories <em>Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stories</em>'.
	 * @see org.nasdanika.scrum.Sprint#getStories()
	 * @see #getSprint()
	 * @generated
	 */
	EReference getSprint_Stories();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see org.nasdanika.scrum.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Artifact#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owner</em>'.
	 * @see org.nasdanika.scrum.Artifact#getOwner()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Owner();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Theme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Theme</em>'.
	 * @see org.nasdanika.scrum.Theme
	 * @generated
	 */
	EClass getTheme();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Theme#getFunctionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functionality</em>'.
	 * @see org.nasdanika.scrum.Theme#getFunctionality()
	 * @see #getTheme()
	 * @generated
	 */
	EReference getTheme_Functionality();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.ProductUser <em>Product User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product User</em>'.
	 * @see org.nasdanika.scrum.ProductUser
	 * @generated
	 */
	EClass getProductUser();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.ProductUser#getFunctionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functionality</em>'.
	 * @see org.nasdanika.scrum.ProductUser#getFunctionality()
	 * @see #getProductUser()
	 * @generated
	 */
	EReference getProductUser_Functionality();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see org.nasdanika.scrum.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.scrum.Interaction#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.nasdanika.scrum.Interaction#getDate()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.scrum.Interaction#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.scrum.Interaction#getDescription()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Interaction#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see org.nasdanika.scrum.Interaction#getProducts()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Products();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Interaction#getFunctionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functionality</em>'.
	 * @see org.nasdanika.scrum.Interaction#getFunctionality()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Functionality();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Interaction#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant</em>'.
	 * @see org.nasdanika.scrum.Interaction#getParticipant()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Participant();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.ScrumTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see org.nasdanika.scrum.ScrumTeam
	 * @generated
	 */
	EClass getScrumTeam();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.ScrumTeam#getDevelopmentteams <em>Developmentteams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Developmentteams</em>'.
	 * @see org.nasdanika.scrum.ScrumTeam#getDevelopmentteams()
	 * @see #getScrumTeam()
	 * @generated
	 */
	EReference getScrumTeam_Developmentteams();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.scrum.ScrumTeam#getProductOwner <em>Product Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Owner</em>'.
	 * @see org.nasdanika.scrum.ScrumTeam#getProductOwner()
	 * @see #getScrumTeam()
	 * @generated
	 */
	EReference getScrumTeam_ProductOwner();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.scrum.ScrumTeam#getScrumMaster <em>Scrum Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scrum Master</em>'.
	 * @see org.nasdanika.scrum.ScrumTeam#getScrumMaster()
	 * @see #getScrumTeam()
	 * @generated
	 */
	EReference getScrumTeam_ScrumMaster();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.ScrumTeam#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see org.nasdanika.scrum.ScrumTeam#getProducts()
	 * @see #getScrumTeam()
	 * @generated
	 */
	EReference getScrumTeam_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.ScrumTeam#getTeamInteractions <em>Team Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Team Interactions</em>'.
	 * @see org.nasdanika.scrum.ScrumTeam#getTeamInteractions()
	 * @see #getScrumTeam()
	 * @generated
	 */
	EReference getScrumTeam_TeamInteractions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.ScrumTeam#getReleases <em>Releases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Releases</em>'.
	 * @see org.nasdanika.scrum.ScrumTeam#getReleases()
	 * @see #getScrumTeam()
	 * @generated
	 */
	EReference getScrumTeam_Releases();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.DevelopmentTeam <em>Development Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Development Team</em>'.
	 * @see org.nasdanika.scrum.DevelopmentTeam
	 * @generated
	 */
	EClass getDevelopmentTeam();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.scrum.DevelopmentTeam#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.nasdanika.scrum.DevelopmentTeam#getMembers()
	 * @see #getDevelopmentTeam()
	 * @generated
	 */
	EReference getDevelopmentTeam_Members();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.DevelopmentTeam#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see org.nasdanika.scrum.DevelopmentTeam#getProducts()
	 * @see #getDevelopmentTeam()
	 * @generated
	 */
	EReference getDevelopmentTeam_Products();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.scrum.Funding <em>Funding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funding</em>'.
	 * @see org.nasdanika.scrum.Funding
	 * @generated
	 */
	EClass getFunding();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.scrum.Funding#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.nasdanika.scrum.Funding#getDate()
	 * @see #getFunding()
	 * @generated
	 */
	EAttribute getFunding_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.scrum.Funding#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.scrum.Funding#getDescription()
	 * @see #getFunding()
	 * @generated
	 */
	EAttribute getFunding_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.scrum.Funding#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customers</em>'.
	 * @see org.nasdanika.scrum.Funding#getCustomers()
	 * @see #getFunding()
	 * @generated
	 */
	EReference getFunding_Customers();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.scrum.FunctionalityState <em>Functionality State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Functionality State</em>'.
	 * @see org.nasdanika.scrum.FunctionalityState
	 * @generated
	 */
	EEnum getFunctionalityState();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getModelElement_Description();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__NOTES = eINSTANCE.getModelElement_Notes();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getModelElement__Validate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.NoteImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__DATE = eINSTANCE.getNote_Date();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__DESCRIPTION = eINSTANCE.getNote_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.ScrumRealmImpl <em>Realm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.ScrumRealmImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getScrumRealm()
		 * @generated
		 */
		EClass SCRUM_REALM = eINSTANCE.getScrumRealm();

		/**
		 * The meta object literal for the '<em><b>Parties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRUM_REALM__PARTIES = eINSTANCE.getScrumRealm_Parties();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.PartyImpl <em>Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.PartyImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getParty()
		 * @generated
		 */
		EClass PARTY = eINSTANCE.getParty();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__REFERENCES = eINSTANCE.getParty_References();

		/**
		 * The meta object literal for the '<em><b>Uses Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__USES_PRODUCTS = eINSTANCE.getParty_UsesProducts();

		/**
		 * The meta object literal for the '<em><b>Uses Functionality</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__USES_FUNCTIONALITY = eINSTANCE.getParty_UsesFunctionality();

		/**
		 * The meta object literal for the '<em><b>Interactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__INTERACTIONS = eINSTANCE.getParty_Interactions();

		/**
		 * The meta object literal for the '<em><b>Fundings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__FUNDINGS = eINSTANCE.getParty_Fundings();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.PartyCategoryImpl <em>Party Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.PartyCategoryImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getPartyCategory()
		 * @generated
		 */
		EClass PARTY_CATEGORY = eINSTANCE.getPartyCategory();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CATEGORY__CHILDREN = eINSTANCE.getPartyCategory_Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.OrganizationImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__MEMBERS = eINSTANCE.getOrganization_Members();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.ProjectImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__MEMBERS = eINSTANCE.getProject_Members();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.PersonImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.MemberImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>Parties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__PARTIES = eINSTANCE.getMember_Parties();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__ASSIGNMENTS = eINSTANCE.getMember_Assignments();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.PartyReferenceImpl <em>Party Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.PartyReferenceImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getPartyReference()
		 * @generated
		 */
		EClass PARTY_REFERENCE = eINSTANCE.getPartyReference();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_REFERENCE__PARTY = eINSTANCE.getPartyReference_Party();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.AbstractProductImpl <em>Abstract Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.AbstractProductImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getAbstractProduct()
		 * @generated
		 */
		EClass ABSTRACT_PRODUCT = eINSTANCE.getAbstractProduct();

		/**
		 * The meta object literal for the '<em><b>Development Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PRODUCT__DEVELOPMENT_TEAM = eINSTANCE.getAbstractProduct_DevelopmentTeam();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.ProductImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__CAPABILITIES = eINSTANCE.getProduct_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Themes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__THEMES = eINSTANCE.getProduct_Themes();

		/**
		 * The meta object literal for the '<em><b>Product Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCT_USERS = eINSTANCE.getProduct_ProductUsers();

		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__CUSTOMERS = eINSTANCE.getProduct_Customers();

		/**
		 * The meta object literal for the '<em><b>Target Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__TARGET_GROUPS = eINSTANCE.getProduct_TargetGroups();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__COMPONENTS = eINSTANCE.getProduct_Components();

		/**
		 * The meta object literal for the '<em><b>Interactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__INTERACTIONS = eINSTANCE.getProduct_Interactions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.ComponentImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Owners</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OWNERS = eINSTANCE.getComponent_Owners();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.TargetGroupImpl <em>Target Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.TargetGroupImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getTargetGroup()
		 * @generated
		 */
		EClass TARGET_GROUP = eINSTANCE.getTargetGroup();

		/**
		 * The meta object literal for the '<em><b>Needs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_GROUP__NEEDS = eINSTANCE.getTargetGroup_Needs();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.NeedImpl <em>Need</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.NeedImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getNeed()
		 * @generated
		 */
		EClass NEED = eINSTANCE.getNeed();

		/**
		 * The meta object literal for the '<em><b>Satisfied By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEED__SATISFIED_BY = eINSTANCE.getNeed_SatisfiedBy();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.ProductCategoryImpl <em>Product Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.ProductCategoryImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getProductCategory()
		 * @generated
		 */
		EClass PRODUCT_CATEGORY = eINSTANCE.getProductCategory();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY__PRODUCTS = eINSTANCE.getProductCategory_Products();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.FunctionalityImpl <em>Functionality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.FunctionalityImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getFunctionality()
		 * @generated
		 */
		EClass FUNCTIONALITY = eINSTANCE.getFunctionality();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__USERS = eINSTANCE.getFunctionality_Users();

		/**
		 * The meta object literal for the '<em><b>Themes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__THEMES = eINSTANCE.getFunctionality_Themes();

		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__CUSTOMERS = eINSTANCE.getFunctionality_Customers();

		/**
		 * The meta object literal for the '<em><b>Fundings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__FUNDINGS = eINSTANCE.getFunctionality_Fundings();

		/**
		 * The meta object literal for the '<em><b>Satisfies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__SATISFIES = eINSTANCE.getFunctionality_Satisfies();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__DEPENDENCIES = eINSTANCE.getFunctionality_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Dependants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__DEPENDANTS = eINSTANCE.getFunctionality_Dependants();

		/**
		 * The meta object literal for the '<em><b>Interactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__INTERACTIONS = eINSTANCE.getFunctionality_Interactions();

		/**
		 * The meta object literal for the '<em><b>Assigned To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__ASSIGNED_TO = eINSTANCE.getFunctionality_AssignedTo();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.EpicImpl <em>Epic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.EpicImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getEpic()
		 * @generated
		 */
		EClass EPIC = eINSTANCE.getEpic();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPIC__CHILDREN = eINSTANCE.getEpic_Children();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPIC__FEATURES = eINSTANCE.getEpic_Features();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.FeatureImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>User Stories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__USER_STORIES = eINSTANCE.getFeature_UserStories();

		/**
		 * The meta object literal for the '<em><b>Planned For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__PLANNED_FOR = eINSTANCE.getFeature_PlannedFor();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.UserStoryImpl <em>User Story</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.UserStoryImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getUserStory()
		 * @generated
		 */
		EClass USER_STORY = eINSTANCE.getUserStory();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_STORY__TASKS = eINSTANCE.getUserStory_Tasks();

		/**
		 * The meta object literal for the '<em><b>Planned For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_STORY__PLANNED_FOR = eINSTANCE.getUserStory_PlannedFor();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.TaskImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__COMPONENTS = eINSTANCE.getTask_Components();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.ReleaseImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '<em><b>Sprints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE__SPRINTS = eINSTANCE.getRelease_Sprints();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE__ARTIFACTS = eINSTANCE.getRelease_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE__FEATURES = eINSTANCE.getRelease_Features();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.SprintImpl <em>Sprint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.SprintImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getSprint()
		 * @generated
		 */
		EClass SPRINT = eINSTANCE.getSprint();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPRINT__START = eINSTANCE.getSprint_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPRINT__END = eINSTANCE.getSprint_End();

		/**
		 * The meta object literal for the '<em><b>Stories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRINT__STORIES = eINSTANCE.getSprint_Stories();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.ArtifactImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__OWNER = eINSTANCE.getArtifact_Owner();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.ThemeImpl <em>Theme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.ThemeImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getTheme()
		 * @generated
		 */
		EClass THEME = eINSTANCE.getTheme();

		/**
		 * The meta object literal for the '<em><b>Functionality</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEME__FUNCTIONALITY = eINSTANCE.getTheme_Functionality();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.ProductUserImpl <em>Product User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.ProductUserImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getProductUser()
		 * @generated
		 */
		EClass PRODUCT_USER = eINSTANCE.getProductUser();

		/**
		 * The meta object literal for the '<em><b>Functionality</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_USER__FUNCTIONALITY = eINSTANCE.getProductUser_Functionality();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.InteractionImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__DATE = eINSTANCE.getInteraction_Date();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__DESCRIPTION = eINSTANCE.getInteraction_Description();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__PRODUCTS = eINSTANCE.getInteraction_Products();

		/**
		 * The meta object literal for the '<em><b>Functionality</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__FUNCTIONALITY = eINSTANCE.getInteraction_Functionality();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__PARTICIPANT = eINSTANCE.getInteraction_Participant();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.ScrumTeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.ScrumTeamImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getScrumTeam()
		 * @generated
		 */
		EClass SCRUM_TEAM = eINSTANCE.getScrumTeam();

		/**
		 * The meta object literal for the '<em><b>Developmentteams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRUM_TEAM__DEVELOPMENTTEAMS = eINSTANCE.getScrumTeam_Developmentteams();

		/**
		 * The meta object literal for the '<em><b>Product Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRUM_TEAM__PRODUCT_OWNER = eINSTANCE.getScrumTeam_ProductOwner();

		/**
		 * The meta object literal for the '<em><b>Scrum Master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRUM_TEAM__SCRUM_MASTER = eINSTANCE.getScrumTeam_ScrumMaster();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRUM_TEAM__PRODUCTS = eINSTANCE.getScrumTeam_Products();

		/**
		 * The meta object literal for the '<em><b>Team Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRUM_TEAM__TEAM_INTERACTIONS = eINSTANCE.getScrumTeam_TeamInteractions();

		/**
		 * The meta object literal for the '<em><b>Releases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRUM_TEAM__RELEASES = eINSTANCE.getScrumTeam_Releases();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.DevelopmentTeamImpl <em>Development Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.DevelopmentTeamImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getDevelopmentTeam()
		 * @generated
		 */
		EClass DEVELOPMENT_TEAM = eINSTANCE.getDevelopmentTeam();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_TEAM__MEMBERS = eINSTANCE.getDevelopmentTeam_Members();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_TEAM__PRODUCTS = eINSTANCE.getDevelopmentTeam_Products();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.impl.FundingImpl <em>Funding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.impl.FundingImpl
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getFunding()
		 * @generated
		 */
		EClass FUNDING = eINSTANCE.getFunding();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNDING__DATE = eINSTANCE.getFunding_Date();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNDING__DESCRIPTION = eINSTANCE.getFunding_Description();

		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNDING__CUSTOMERS = eINSTANCE.getFunding_Customers();

		/**
		 * The meta object literal for the '{@link org.nasdanika.scrum.FunctionalityState <em>Functionality State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.scrum.FunctionalityState
		 * @see org.nasdanika.scrum.impl.ScrumPackageImpl#getFunctionalityState()
		 * @generated
		 */
		EEnum FUNCTIONALITY_STATE = eINSTANCE.getFunctionalityState();

	}

} //ScrumPackage
