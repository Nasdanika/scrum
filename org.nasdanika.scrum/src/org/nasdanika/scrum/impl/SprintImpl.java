/**
 */
package org.nasdanika.scrum.impl;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.scrum.ScrumPackage;
import org.nasdanika.scrum.Sprint;
import org.nasdanika.scrum.UserStory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sprint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.impl.SprintImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.SprintImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.SprintImpl#getStories <em>Stories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SprintImpl extends ModelElementImpl implements Sprint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SprintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScrumPackage.Literals.SPRINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return (Date)eGet(ScrumPackage.Literals.SPRINT__START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		eSet(ScrumPackage.Literals.SPRINT__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return (Date)eGet(ScrumPackage.Literals.SPRINT__END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		eSet(ScrumPackage.Literals.SPRINT__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UserStory> getStories() {
		return (EList<UserStory>)eGet(ScrumPackage.Literals.SPRINT__STORIES, true);
	}

} //SprintImpl
