/**
 */
package workflowModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflowModel.Workflow#getZustand <em>Zustand</em>}</li>
 *   <li>{@link workflowModel.Workflow#getDatenobjekt <em>Datenobjekt</em>}</li>
 *   <li>{@link workflowModel.Workflow#getDatenstruktur <em>Datenstruktur</em>}</li>
 *   <li>{@link workflowModel.Workflow#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see workflowModel.WorkflowModelPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Zustand</b></em>' containment reference list.
	 * The list contents are of type {@link workflowModel.Zustand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zustand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zustand</em>' containment reference list.
	 * @see workflowModel.WorkflowModelPackage#getWorkflow_Zustand()
	 * @model containment="true"
	 * @generated
	 */
	EList<Zustand> getZustand();

	/**
	 * Returns the value of the '<em><b>Datenobjekt</b></em>' containment reference list.
	 * The list contents are of type {@link workflowModel.Datenobjekt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datenobjekt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenobjekt</em>' containment reference list.
	 * @see workflowModel.WorkflowModelPackage#getWorkflow_Datenobjekt()
	 * @model containment="true"
	 * @generated
	 */
	EList<Datenobjekt> getDatenobjekt();

	/**
	 * Returns the value of the '<em><b>Datenstruktur</b></em>' containment reference list.
	 * The list contents are of type {@link workflowModel.Datenstruktur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datenstruktur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenstruktur</em>' containment reference list.
	 * @see workflowModel.WorkflowModelPackage#getWorkflow_Datenstruktur()
	 * @model containment="true"
	 * @generated
	 */
	EList<Datenstruktur> getDatenstruktur();

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
	 * @see workflowModel.WorkflowModelPackage#getWorkflow_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflowModel.Workflow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Workflow
