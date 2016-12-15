/**
 */
package workflowModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Übergang</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflowModel.Übergang#getZustand <em>Zustand</em>}</li>
 * </ul>
 *
 * @see workflowModel.WorkflowModelPackage#getÜbergang()
 * @model
 * @generated
 */
public interface Übergang extends EObject {
	/**
	 * Returns the value of the '<em><b>Zustand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zustand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zustand</em>' reference.
	 * @see #setZustand(Zustand)
	 * @see workflowModel.WorkflowModelPackage#getÜbergang_Zustand()
	 * @model required="true"
	 * @generated
	 */
	Zustand getZustand();

	/**
	 * Sets the value of the '{@link workflowModel.Übergang#getZustand <em>Zustand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zustand</em>' reference.
	 * @see #getZustand()
	 * @generated
	 */
	void setZustand(Zustand value);

} // Übergang
