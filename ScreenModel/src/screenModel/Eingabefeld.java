/**
 */
package screenModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eingabefeld</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link screenModel.Eingabefeld#getAttribut <em>Attribut</em>}</li>
 *   <li>{@link screenModel.Eingabefeld#getInputText <em>Input Text</em>}</li>
 * </ul>
 *
 * @see screenModel.ScreenModelPackage#getEingabefeld()
 * @model
 * @generated
 */
public interface Eingabefeld extends EObject {

	/**
	 * Returns the value of the '<em><b>Attribut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribut</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribut</em>' reference.
	 * @see #setAttribut(Attribut)
	 * @see screenModel.ScreenModelPackage#getEingabefeld_Attribut()
	 * @model required="true"
	 * @generated
	 */
	Attribut getAttribut();

	/**
	 * Sets the value of the '{@link screenModel.Eingabefeld#getAttribut <em>Attribut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribut</em>' reference.
	 * @see #getAttribut()
	 * @generated
	 */
	void setAttribut(Attribut value);

	/**
	 * Returns the value of the '<em><b>Input Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Text</em>' attribute.
	 * @see #setInputText(String)
	 * @see screenModel.ScreenModelPackage#getEingabefeld_InputText()
	 * @model required="true"
	 * @generated
	 */
	String getInputText();

	/**
	 * Sets the value of the '{@link screenModel.Eingabefeld#getInputText <em>Input Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Text</em>' attribute.
	 * @see #getInputText()
	 * @generated
	 */
	void setInputText(String value);
} // Eingabefeld
