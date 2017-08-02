/**
 */
package org.nasdanika.scrum.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.nasdanika.scrum.Functionality;
import org.nasdanika.scrum.Funding;
import org.nasdanika.scrum.Interaction;
import org.nasdanika.scrum.Party;
import org.nasdanika.scrum.PartyReference;
import org.nasdanika.scrum.Product;
import org.nasdanika.scrum.ScrumPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.impl.PartyImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.PartyImpl#getUsesProducts <em>Uses Products</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.PartyImpl#getUsesFunctionality <em>Uses Functionality</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.PartyImpl#getInteractions <em>Interactions</em>}</li>
 *   <li>{@link org.nasdanika.scrum.impl.PartyImpl#getFundings <em>Fundings</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PartyImpl extends ModelElementImpl implements Party {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScrumPackage.Literals.PARTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PartyReference> getReferences() {
		return (EList<PartyReference>)eGet(ScrumPackage.Literals.PARTY__REFERENCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Product> getUsesProducts() {
		return (EList<Product>)eGet(ScrumPackage.Literals.PARTY__USES_PRODUCTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Functionality> getUsesFunctionality() {
		return (EList<Functionality>)eGet(ScrumPackage.Literals.PARTY__USES_FUNCTIONALITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interaction> getInteractions() {
		return (EList<Interaction>)eGet(ScrumPackage.Literals.PARTY__INTERACTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Funding> getFundings() {
		return (EList<Funding>)eGet(ScrumPackage.Literals.PARTY__FUNDINGS, true);
	}

} //PartyImpl
