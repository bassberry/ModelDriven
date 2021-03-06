/**
 */
package workflowModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflowModel.Attribut#getName <em>Name</em>}</li>
 *   <li>{@link workflowModel.Attribut#getDatentyp <em>Datentyp</em>}</li>
 * </ul>
 *
 * @see workflowModel.WorkflowModelPackage#getAttribut()
 * @model
 * @generated
 */
public interface Attribut extends EObject {
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
	 * @see workflowModel.WorkflowModelPackage#getAttribut_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflowModel.Attribut#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Datentyp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datentyp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datentyp</em>' attribute.
	 * @see #setDatentyp(String)
	 * @see workflowModel.WorkflowModelPackage#getAttribut_Datentyp()
	 * @model required="true"
	 * @generated
	 */
	String getDatentyp();

	/**
	 * Sets the value of the '{@link workflowModel.Attribut#getDatentyp <em>Datentyp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datentyp</em>' attribute.
	 * @see #getDatentyp()
	 * @generated
	 */
	void setDatentyp(String value);

} // Attribut
