/**
 */
package org.nasdanika.scrum.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.nasdanika.scrum.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.scrum.ScrumPackage
 * @generated
 */
public class ScrumValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ScrumValidator INSTANCE = new ScrumValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.nasdanika.scrum";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Model Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MODEL_ELEMENT__VALIDATE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrumValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ScrumPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ScrumPackage.MODEL_ELEMENT:
				return validateModelElement((ModelElement)value, diagnostics, context);
			case ScrumPackage.NOTE:
				return validateNote((Note)value, diagnostics, context);
			case ScrumPackage.SCRUM_REALM:
				return validateScrumRealm((ScrumRealm)value, diagnostics, context);
			case ScrumPackage.PARTY:
				return validateParty((Party)value, diagnostics, context);
			case ScrumPackage.ORGANIZATION:
				return validateOrganization((Organization)value, diagnostics, context);
			case ScrumPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case ScrumPackage.MEMBER:
				return validateMember((Member)value, diagnostics, context);
			case ScrumPackage.ABSTRACT_PRODUCT:
				return validateAbstractProduct((AbstractProduct)value, diagnostics, context);
			case ScrumPackage.PRODUCT:
				return validateProduct((Product)value, diagnostics, context);
			case ScrumPackage.TARGET_GROUP:
				return validateTargetGroup((TargetGroup)value, diagnostics, context);
			case ScrumPackage.NEED:
				return validateNeed((Need)value, diagnostics, context);
			case ScrumPackage.PRODUCT_CATEGORY:
				return validateProductCategory((ProductCategory)value, diagnostics, context);
			case ScrumPackage.FUNCTIONALITY:
				return validateFunctionality((Functionality)value, diagnostics, context);
			case ScrumPackage.EPIC:
				return validateEpic((Epic)value, diagnostics, context);
			case ScrumPackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case ScrumPackage.USER_STORY:
				return validateUserStory((UserStory)value, diagnostics, context);
			case ScrumPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case ScrumPackage.RELEASE:
				return validateRelease((Release)value, diagnostics, context);
			case ScrumPackage.SPRINT:
				return validateSprint((Sprint)value, diagnostics, context);
			case ScrumPackage.ARTIFACT:
				return validateArtifact((Artifact)value, diagnostics, context);
			case ScrumPackage.THEME:
				return validateTheme((Theme)value, diagnostics, context);
			case ScrumPackage.PRODUCT_USER:
				return validateProductUser((ProductUser)value, diagnostics, context);
			case ScrumPackage.INTERACTION:
				return validateInteraction((Interaction)value, diagnostics, context);
			case ScrumPackage.SCRUM_TEAM:
				return validateScrumTeam((ScrumTeam)value, diagnostics, context);
			case ScrumPackage.DEVELOPMENT_TEAM:
				return validateDevelopmentTeam((DevelopmentTeam)value, diagnostics, context);
			case ScrumPackage.FUNDING:
				return validateFunding((Funding)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelElement(ModelElement modelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)modelElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(modelElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelElement_validate(ModelElement modelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return modelElement.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNote(Note note, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)note, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScrumRealm(ScrumRealm scrumRealm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)scrumRealm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)scrumRealm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)scrumRealm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)scrumRealm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)scrumRealm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)scrumRealm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)scrumRealm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)scrumRealm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)scrumRealm, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(scrumRealm, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParty(Party party, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)party, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)party, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)party, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)party, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)party, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)party, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)party, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)party, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)party, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(party, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganization(Organization organization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)organization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)organization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)organization, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(organization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)person, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)person, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(person, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)member, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)member, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(member, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractProduct(AbstractProduct abstractProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)abstractProduct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)abstractProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)abstractProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)abstractProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)abstractProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)abstractProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)abstractProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)abstractProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)abstractProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(abstractProduct, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)product, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)product, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(product, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetGroup(TargetGroup targetGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)targetGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)targetGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)targetGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)targetGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)targetGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)targetGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)targetGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)targetGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)targetGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(targetGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeed(Need need, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)need, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)need, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)need, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)need, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)need, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)need, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)need, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)need, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)need, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(need, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductCategory(ProductCategory productCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)productCategory, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)productCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)productCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)productCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)productCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)productCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)productCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)productCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)productCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(productCategory, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionality(Functionality functionality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)functionality, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)functionality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)functionality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)functionality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)functionality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)functionality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)functionality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)functionality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)functionality, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(functionality, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpic(Epic epic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)epic, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)epic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)epic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)epic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)epic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)epic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)epic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)epic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)epic, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(epic, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)feature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(feature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserStory(UserStory userStory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)userStory, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)userStory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)userStory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)userStory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)userStory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)userStory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)userStory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)userStory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)userStory, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(userStory, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)task, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)task, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(task, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelease(Release release, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)release, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)release, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)release, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)release, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)release, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)release, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)release, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)release, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)release, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(release, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSprint(Sprint sprint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)sprint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)sprint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)sprint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)sprint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)sprint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)sprint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)sprint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)sprint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)sprint, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(sprint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifact(Artifact artifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)artifact, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(artifact, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTheme(Theme theme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)theme, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)theme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)theme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)theme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)theme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)theme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)theme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)theme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)theme, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(theme, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductUser(ProductUser productUser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)productUser, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)productUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)productUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)productUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)productUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)productUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)productUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)productUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)productUser, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(productUser, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteraction(Interaction interaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)interaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScrumTeam(ScrumTeam scrumTeam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)scrumTeam, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)scrumTeam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)scrumTeam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)scrumTeam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)scrumTeam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)scrumTeam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)scrumTeam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)scrumTeam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)scrumTeam, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(scrumTeam, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevelopmentTeam(DevelopmentTeam developmentTeam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)developmentTeam, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)developmentTeam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)developmentTeam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)developmentTeam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)developmentTeam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)developmentTeam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)developmentTeam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)developmentTeam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)developmentTeam, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElement_validate(developmentTeam, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunding(Funding funding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)funding, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ScrumValidator
