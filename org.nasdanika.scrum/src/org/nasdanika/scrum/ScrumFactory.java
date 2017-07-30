/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.scrum.ScrumPackage
 * @generated
 */
public interface ScrumFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScrumFactory eINSTANCE = org.nasdanika.scrum.impl.ScrumFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Realm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realm</em>'.
	 * @generated
	 */
	ScrumRealm createScrumRealm();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScrumPackage getScrumPackage();

} //ScrumFactory
