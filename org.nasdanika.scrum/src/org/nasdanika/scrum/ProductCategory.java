/**
 */
package org.nasdanika.scrum;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.ProductCategory#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getProductCategory()
 * @model
 * @generated
 */
public interface ProductCategory extends AbstractProduct {
	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.AbstractProduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getProductCategory_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractProduct> getProducts();

} // ProductCategory
