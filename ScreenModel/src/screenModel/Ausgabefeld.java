/**
 */
package screenModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ausgabefeld</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link screenModel.Ausgabefeld#getAttribut <em>Attribut</em>}</li>
 *   <li>{@link screenModel.Ausgabefeld#getDisplayText <em>Display Text</em>}</li>
 * </ul>
 *
 * @see screenModel.ScreenModelPackage#getAusgabefeld()
 * @model
 * @generated
 */
public interface Ausgabefeld extends EObject {
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
	 * @see screenModel.ScreenModelPackage#getAusgabefeld_Attribut()
	 * @model required="true"
	 * @generated
	 */
	Attribut getAttribut();

	/**
	 * Sets the value of the '{@link screenModel.Ausgabefeld#getAttribut <em>Attribut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribut</em>' reference.
	 * @see #getAttribut()
	 * @generated
	 */
	void setAttribut(Attribut value);

	/**
	 * Returns the value of the '<em><b>Display Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Text</em>' attribute.
	 * @see #setDisplayText(String)
	 * @see screenModel.ScreenModelPackage#getAusgabefeld_DisplayText()
	 * @model
	 * @generated
	 */
	String getDisplayText();

	/**
	 * Sets the value of the '{@link screenModel.Ausgabefeld#getDisplayText <em>Display Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Text</em>' attribute.
	 * @see #getDisplayText()
	 * @generated
	 */
	void setDisplayText(String value);

} // Ausgabefeld
