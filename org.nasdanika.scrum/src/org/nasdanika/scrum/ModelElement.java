/**
 */
package org.nasdanika.scrum;

import java.util.Map;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for other model elements.
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.scrum.ScrumPackage#getModelElement()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ModelElement extends CDOObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Validates element.
	 * @param diagnostics Diagnostics to add validation messages to.
	 * @param context Validation context.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context);
} // ModelElement
