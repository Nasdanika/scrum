/**
 */
package org.nasdanika.scrum.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.scrum.AbstractProduct;
import org.nasdanika.scrum.DevelopmentTeam;
import org.nasdanika.scrum.Interaction;
import org.nasdanika.scrum.Person;
import org.nasdanika.scrum.Release;
import org.nasdanika.scrum.ScrumPackage;
import org.nasdanika.scrum.ScrumTeam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.impl.ScrumTeamImpl#getDevelopmentteams <em>Developmentteams</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.ScrumTeamImpl#getProductOwner <em>Product Owner</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.ScrumTeamImpl#getScrumMaster <em>Scrum Master</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.ScrumTeamImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.ScrumTeamImpl#getTeamInteractions <em>Team Interactions</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.ScrumTeamImpl#getReleases <em>Releases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScrumTeamImpl extends OrganizationImpl implements ScrumTeam {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScrumTeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScrumPackage.Literals.SCRUM_TEAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DevelopmentTeam> getDevelopmentteams() {
		return (EList<DevelopmentTeam>)eGet(ScrumPackage.Literals.SCRUM_TEAM__DEVELOPMENTTEAMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getProductOwner() {
		return (Person)eGet(ScrumPackage.Literals.SCRUM_TEAM__PRODUCT_OWNER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductOwner(Person newProductOwner) {
		eSet(ScrumPackage.Literals.SCRUM_TEAM__PRODUCT_OWNER, newProductOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getScrumMaster() {
		return (Person)eGet(ScrumPackage.Literals.SCRUM_TEAM__SCRUM_MASTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrumMaster(Person newScrumMaster) {
		eSet(ScrumPackage.Literals.SCRUM_TEAM__SCRUM_MASTER, newScrumMaster);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractProduct> getProducts() {
		return (EList<AbstractProduct>)eGet(ScrumPackage.Literals.SCRUM_TEAM__PRODUCTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interaction> getTeamInteractions() {
		return (EList<Interaction>)eGet(ScrumPackage.Literals.SCRUM_TEAM__TEAM_INTERACTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Release> getReleases() {
		return (EList<Release>)eGet(ScrumPackage.Literals.SCRUM_TEAM__RELEASES, true);
	}

} //ScrumTeamImpl
