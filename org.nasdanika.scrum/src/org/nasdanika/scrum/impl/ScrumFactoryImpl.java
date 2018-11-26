/**
 */
package org.nasdanika.scrum.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.scrum.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScrumFactoryImpl extends EFactoryImpl implements ScrumFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScrumFactory init() {
		try {
			ScrumFactory theScrumFactory = (ScrumFactory)EPackage.Registry.INSTANCE.getEFactory(ScrumPackage.eNS_URI);
			if (theScrumFactory != null) {
				return theScrumFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScrumFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrumFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ScrumPackage.NOTE: return (EObject)createNote();
			case ScrumPackage.SCRUM_REALM: return (EObject)createScrumRealm();
			case ScrumPackage.PARTY_CATEGORY: return (EObject)createPartyCategory();
			case ScrumPackage.ORGANIZATION: return (EObject)createOrganization();
			case ScrumPackage.PROJECT: return (EObject)createProject();
			case ScrumPackage.PERSON: return (EObject)createPerson();
			case ScrumPackage.MEMBER: return (EObject)createMember();
			case ScrumPackage.PARTY_REFERENCE: return (EObject)createPartyReference();
			case ScrumPackage.SCRUM_TEAM: return (EObject)createScrumTeam();
			case ScrumPackage.DEVELOPMENT_TEAM: return (EObject)createDevelopmentTeam();
			case ScrumPackage.PRODUCT: return (EObject)createProduct();
			case ScrumPackage.CUSTOMER: return (EObject)createCustomer();
			case ScrumPackage.REQUEST: return (EObject)createRequest();
			case ScrumPackage.COMPONENT: return (EObject)createComponent();
			case ScrumPackage.TARGET_GROUP: return (EObject)createTargetGroup();
			case ScrumPackage.NEED: return (EObject)createNeed();
			case ScrumPackage.PRODUCT_CATEGORY: return (EObject)createProductCategory();
			case ScrumPackage.THEME: return (EObject)createTheme();
			case ScrumPackage.PRODUCT_USER: return (EObject)createProductUser();
			case ScrumPackage.EPIC: return (EObject)createEpic();
			case ScrumPackage.FEATURE: return (EObject)createFeature();
			case ScrumPackage.USER_STORY: return (EObject)createUserStory();
			case ScrumPackage.TASK: return (EObject)createTask();
			case ScrumPackage.RELEASE: return (EObject)createRelease();
			case ScrumPackage.SPRINT: return (EObject)createSprint();
			case ScrumPackage.ARTIFACT: return (EObject)createArtifact();
			case ScrumPackage.INTERACTION: return (EObject)createInteraction();
			case ScrumPackage.FUNDING: return (EObject)createFunding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ScrumPackage.FUNCTIONALITY_STATE:
				return createFunctionalityStateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ScrumPackage.FUNCTIONALITY_STATE:
				return convertFunctionalityStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrumRealm createScrumRealm() {
		ScrumRealmImpl scrumRealm = new ScrumRealmImpl();
		return scrumRealm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyCategory createPartyCategory() {
		PartyCategoryImpl partyCategory = new PartyCategoryImpl();
		return partyCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member createMember() {
		MemberImpl member = new MemberImpl();
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyReference createPartyReference() {
		PartyReferenceImpl partyReference = new PartyReferenceImpl();
		return partyReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetGroup createTargetGroup() {
		TargetGroupImpl targetGroup = new TargetGroupImpl();
		return targetGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Need createNeed() {
		NeedImpl need = new NeedImpl();
		return need;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategory createProductCategory() {
		ProductCategoryImpl productCategory = new ProductCategoryImpl();
		return productCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Epic createEpic() {
		EpicImpl epic = new EpicImpl();
		return epic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserStory createUserStory() {
		UserStoryImpl userStory = new UserStoryImpl();
		return userStory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Release createRelease() {
		ReleaseImpl release = new ReleaseImpl();
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sprint createSprint() {
		SprintImpl sprint = new SprintImpl();
		return sprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Theme createTheme() {
		ThemeImpl theme = new ThemeImpl();
		return theme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductUser createProductUser() {
		ProductUserImpl productUser = new ProductUserImpl();
		return productUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrumTeam createScrumTeam() {
		ScrumTeamImpl scrumTeam = new ScrumTeamImpl();
		return scrumTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentTeam createDevelopmentTeam() {
		DevelopmentTeamImpl developmentTeam = new DevelopmentTeamImpl();
		return developmentTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Funding createFunding() {
		FundingImpl funding = new FundingImpl();
		return funding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalityState createFunctionalityStateFromString(EDataType eDataType, String initialValue) {
		FunctionalityState result = FunctionalityState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionalityStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrumPackage getScrumPackage() {
		return (ScrumPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScrumPackage getPackage() {
		return ScrumPackage.eINSTANCE;
	}

} //ScrumFactoryImpl
