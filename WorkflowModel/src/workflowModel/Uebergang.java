/**
 */
package workflowModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uebergang</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflowModel.Uebergang#getZustand <em>Zustand</em>}</li>
 *   <li>{@link workflowModel.Uebergang#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see workflowModel.WorkflowModelPackage#getUebergang()
 * @model
 * @generated
 */
public interface Uebergang extends EObject {
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
	 * @see workflowModel.WorkflowModelPackage#getUebergang_Zustand()
	 * @model required="true"
	 * @generated
	 */
	Zustand getZustand();

	/**
	 * Sets the value of the '{@link workflowModel.Uebergang#getZustand <em>Zustand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zustand</em>' reference.
	 * @see #getZustand()
	 * @generated
	 */
	void setZustand(Zustand value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see workflowModel.WorkflowModelPackage#getUebergang_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflowModel.Uebergang#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Uebergang
