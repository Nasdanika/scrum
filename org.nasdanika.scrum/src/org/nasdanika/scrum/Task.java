/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.Task#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends ModelElement {

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getTask_Components()
	 * @model
	 * @generated
	 */
	EList<Component> getComponents();
} // Task
