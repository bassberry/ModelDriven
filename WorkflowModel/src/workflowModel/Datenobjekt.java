/**
 */
package workflowModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datenobjekt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflowModel.Datenobjekt#getDatenstruktur <em>Datenstruktur</em>}</li>
 *   <li>{@link workflowModel.Datenobjekt#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see workflowModel.WorkflowModelPackage#getDatenobjekt()
 * @model
 * @generated
 */
public interface Datenobjekt extends EObject {
	/**
	 * Returns the value of the '<em><b>Datenstruktur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datenstruktur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenstruktur</em>' reference.
	 * @see #setDatenstruktur(Datenstruktur)
	 * @see workflowModel.WorkflowModelPackage#getDatenobjekt_Datenstruktur()
	 * @model required="true"
	 * @generated
	 */
	Datenstruktur getDatenstruktur();

	/**
	 * Sets the value of the '{@link workflowModel.Datenobjekt#getDatenstruktur <em>Datenstruktur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenstruktur</em>' reference.
	 * @see #getDatenstruktur()
	 * @generated
	 */
	void setDatenstruktur(Datenstruktur value);

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
	 * @see workflowModel.WorkflowModelPackage#getDatenobjekt_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflowModel.Datenobjekt#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Datenobjekt
