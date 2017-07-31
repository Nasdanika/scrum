/**
 */
package org.nasdanika.scrum.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.cdo.security.impl.LoginPasswordRealmImpl;

import org.nasdanika.scrum.ModelElement;
import org.nasdanika.scrum.Note;
import org.nasdanika.scrum.Party;
import org.nasdanika.scrum.ScrumPackage;
import org.nasdanika.scrum.ScrumRealm;
import org.nasdanika.scrum.util.ScrumValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.impl.ScrumRealmImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.ScrumRealmImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.ScrumRealmImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.ScrumRealmImpl#getParties <em>Parties</em>}</li>
 * </ul>
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ScrumPackage.Literals.MODEL_ELEMENT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ScrumPackage.Literals.MODEL_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(ScrumPackage.Literals.MODEL_ELEMENT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(ScrumPackage.Literals.MODEL_ELEMENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Note> getNotes() {
		return (EList<Note>)eGet(ScrumPackage.Literals.MODEL_ELEMENT__NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Party> getParties() {
		return (EList<Party>)eGet(ScrumPackage.Literals.SCRUM_REALM__PARTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ScrumValidator.DIAGNOSTIC_SOURCE,
						 ScrumValidator.MODEL_ELEMENT__VALIDATE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validate", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
				case ScrumPackage.SCRUM_REALM__NAME: return ScrumPackage.MODEL_ELEMENT__NAME;
				case ScrumPackage.SCRUM_REALM__DESCRIPTION: return ScrumPackage.MODEL_ELEMENT__DESCRIPTION;
				case ScrumPackage.SCRUM_REALM__NOTES: return ScrumPackage.MODEL_ELEMENT__NOTES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
				case ScrumPackage.MODEL_ELEMENT__NAME: return ScrumPackage.SCRUM_REALM__NAME;
				case ScrumPackage.MODEL_ELEMENT__DESCRIPTION: return ScrumPackage.SCRUM_REALM__DESCRIPTION;
				case ScrumPackage.MODEL_ELEMENT__NOTES: return ScrumPackage.SCRUM_REALM__NOTES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case ScrumPackage.MODEL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return ScrumPackage.SCRUM_REALM___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ScrumPackage.SCRUM_REALM___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ScrumRealmImpl
