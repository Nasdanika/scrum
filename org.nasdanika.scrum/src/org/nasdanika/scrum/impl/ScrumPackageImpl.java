/**
 */
package org.nasdanika.scrum.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.cdo.security.SecurityPackage;

import org.nasdanika.scrum.ModelElement;
import org.nasdanika.scrum.ScrumFactory;
import org.nasdanika.scrum.ScrumPackage;
import org.nasdanika.scrum.ScrumRealm;
import org.nasdanika.scrum.util.ScrumValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScrumPackageImpl extends EPackageImpl implements ScrumPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrumRealmEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.scrum.ScrumPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScrumPackageImpl() {
		super(eNS_URI, ScrumFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ScrumPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScrumPackage init() {
		if (isInited) return (ScrumPackage)EPackage.Registry.INSTANCE.getEPackage(ScrumPackage.eNS_URI);

		// Obtain or create and register package
		ScrumPackageImpl theScrumPackage = (ScrumPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScrumPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScrumPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SecurityPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theScrumPackage.createPackageContents();

		// Initialize created meta-data
		theScrumPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theScrumPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ScrumValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theScrumPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScrumPackage.eNS_URI, theScrumPackage);
		return theScrumPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelElement__Validate__DiagnosticChain_Map() {
		return modelElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrumRealm() {
		return scrumRealmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrumFactory getScrumFactory() {
		return (ScrumFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEOperation(modelElementEClass, MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP);

		scrumRealmEClass = createEClass(SCRUM_REALM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SecurityPackage theSecurityPackage = (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scrumRealmEClass.getESuperTypes().add(theSecurityPackage.getLoginPasswordRealm());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getModelElement__Validate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(scrumRealmEClass, ScrumRealm.class, "ScrumRealm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (modelElementEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class for other model elements."
		   });	
		addAnnotation
		  (getModelElement__Validate__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "documentation", "Validates element."
		   });	
		addAnnotation
		  ((getModelElement__Validate__DiagnosticChain_Map()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "Diagnostics to add validation messages to."
		   });	
		addAnnotation
		  ((getModelElement__Validate__DiagnosticChain_Map()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "documentation", "Validation context."
		   });	
		addAnnotation
		  (scrumRealmEClass, 
		   source, 
		   new String[] {
			 "documentation", "The root object of the scrum model."
		   });
	}

} //ScrumPackageImpl
