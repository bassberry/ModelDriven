/**
 */
package screenModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datenausgabefeld</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link screenModel.Datenausgabefeld#getTextfeld <em>Textfeld</em>}</li>
 *   <li>{@link screenModel.Datenausgabefeld#getAusgabefeld <em>Ausgabefeld</em>}</li>
 * </ul>
 *
 * @see screenModel.ScreenModelPackage#getDatenausgabefeld()
 * @model
 * @generated
 */
public interface Datenausgabefeld extends EObject {
	/**
	 * Returns the value of the '<em><b>Textfeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Textfeld</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textfeld</em>' containment reference.
	 * @see #setTextfeld(Textfeld)
	 * @see screenModel.ScreenModelPackage#getDatenausgabefeld_Textfeld()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Textfeld getTextfeld();

	/**
	 * Sets the value of the '{@link screenModel.Datenausgabefeld#getTextfeld <em>Textfeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textfeld</em>' containment reference.
	 * @see #getTextfeld()
	 * @generated
	 */
	void setTextfeld(Textfeld value);

	/**
	 * Returns the value of the '<em><b>Ausgabefeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ausgabefeld</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ausgabefeld</em>' containment reference.
	 * @see #setAusgabefeld(Ausgabefeld)
	 * @see screenModel.ScreenModelPackage#getDatenausgabefeld_Ausgabefeld()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Ausgabefeld getAusgabefeld();

	/**
	 * Sets the value of the '{@link screenModel.Datenausgabefeld#getAusgabefeld <em>Ausgabefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ausgabefeld</em>' containment reference.
	 * @see #getAusgabefeld()
	 * @generated
	 */
	void setAusgabefeld(Ausgabefeld value);

} // Datenausgabefeld
