/**
 */
package org.nasdanika.scrum.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.scrum.Feature;
import org.nasdanika.scrum.Release;
import org.nasdanika.scrum.ScrumPackage;
import org.nasdanika.scrum.UserStory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.impl.FeatureImpl#getUserStories <em>User Stories</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.FeatureImpl#getPlannedFor <em>Planned For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends FunctionalityImpl implements Feature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScrumPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UserStory> getUserStories() {
		return (EList<UserStory>)eGet(ScrumPackage.Literals.FEATURE__USER_STORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Release> getPlannedFor() {
		return (EList<Release>)eGet(ScrumPackage.Literals.FEATURE__PLANNED_FOR, true);
	}

} //FeatureImpl
