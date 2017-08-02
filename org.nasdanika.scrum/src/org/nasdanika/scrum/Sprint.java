/**
 */
package org.nasdanika.scrum;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sprint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.scrum.Sprint#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Sprint#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.scrum.Sprint#getStories <em>Stories</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.scrum.ScrumPackage#getSprint()
 * @model
 * @generated
 */
public interface Sprint extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see org.nasdanika.scrum.ScrumPackage#getSprint_Start()
	 * @model required="true"
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.scrum.Sprint#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see org.nasdanika.scrum.ScrumPackage#getSprint_End()
	 * @model required="true"
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link org.nasdanika.scrum.Sprint#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Stories</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.scrum.UserStory}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.scrum.UserStory#getPlannedFor <em>Planned For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stories</em>' reference list.
	 * @see org.nasdanika.scrum.ScrumPackage#getSprint_Stories()
	 * @see org.nasdanika.scrum.UserStory#getPlannedFor
	 * @model opposite="plannedFor"
	 * @generated
	 */
	EList<UserStory> getStories();

} // Sprint
