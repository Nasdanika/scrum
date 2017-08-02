/**
 */
package org.nasdanika.scrum.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.nasdanika.scrum.Component;
import org.nasdanika.scrum.ScrumPackage;
import org.nasdanika.scrum.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.impl.TaskImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends ModelElementImpl implements Task {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScrumPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Component> getComponents() {
		return (EList<Component>)eGet(ScrumPackage.Literals.TASK__COMPONENTS, true);
	}

} //TaskImpl
