/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.Product#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Product#getThemes <em>Themes</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Product#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Product#getProductUsers <em>Product Users</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Product#getCustomers <em>Customers</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Product#getTargetGroups <em>Target Groups</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends AbstractProduct {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Epic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getProduct_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Epic> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Themes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Theme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Themes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Themes</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getProduct_Themes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Theme> getThemes();

	/**
	 * Returns the value of the '<em><b>Releases</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Release}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Releases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Releases</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getProduct_Releases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Release> getReleases();

	/**
	 * Returns the value of the '<em><b>Product Users</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.ProductUser}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Users</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getProduct_ProductUsers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductUser> getProductUsers();

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.Party}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getProduct_Customers()
	 * @model
	 * @generated
	 */
	EList<Party> getCustomers();

	/**
	 * Returns the value of the '<em><b>Target Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.TargetGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Groups</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getProduct_TargetGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<TargetGroup> getTargetGroups();

} // Product
