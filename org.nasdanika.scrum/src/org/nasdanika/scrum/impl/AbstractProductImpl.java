/**
 */
package org.nasdanika.scrum.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.scrum.AbstractProduct;
import org.nasdanika.scrum.DevelopmentTeam;
import org.nasdanika.scrum.ScrumPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.impl.AbstractProductImpl#getDevelopmentTeam <em>Development Team</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractProductImpl extends ModelElementImpl implements AbstractProduct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScrumPackage.Literals.ABSTRACT_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentTeam getDevelopmentTeam() {
		return (DevelopmentTeam)eGet(ScrumPackage.Literals.ABSTRACT_PRODUCT__DEVELOPMENT_TEAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevelopmentTeam(DevelopmentTeam newDevelopmentTeam) {
		eSet(ScrumPackage.Literals.ABSTRACT_PRODUCT__DEVELOPMENT_TEAM, newDevelopmentTeam);
	}

} //AbstractProductImpl
