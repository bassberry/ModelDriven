/**
 */
package screenModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link screenModel.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link screenModel.Attribute#getDatentyp <em>Datentyp</em>}</li>
 * </ul>
 *
 * @see screenModel.ScreenModelPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
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
	 * @see screenModel.ScreenModelPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link screenModel.Attribute#getName <em>Name</em>}' attribute.
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
	 * @see screenModel.ScreenModelPackage#getAttribute_Datentyp()
	 * @model
	 * @generated
	 */
	String getDatentyp();

	/**
	 * Sets the value of the '{@link screenModel.Attribute#getDatentyp <em>Datentyp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datentyp</em>' attribute.
	 * @see #getDatentyp()
	 * @generated
	 */
	void setDatentyp(String value);

} // Attribute
