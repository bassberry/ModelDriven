/**
 */
package screenModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dateneingabefeld</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link screenModel.Dateneingabefeld#getEingabefeld <em>Eingabefeld</em>}</li>
 *   <li>{@link screenModel.Dateneingabefeld#getTextfeld <em>Textfeld</em>}</li>
 * </ul>
 *
 * @see screenModel.ScreenModelPackage#getDateneingabefeld()
 * @model
 * @generated
 */
public interface Dateneingabefeld extends EObject {
	/**
	 * Returns the value of the '<em><b>Eingabefeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eingabefeld</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eingabefeld</em>' containment reference.
	 * @see #setEingabefeld(Eingabefeld)
	 * @see screenModel.ScreenModelPackage#getDateneingabefeld_Eingabefeld()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Eingabefeld getEingabefeld();

	/**
	 * Sets the value of the '{@link screenModel.Dateneingabefeld#getEingabefeld <em>Eingabefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eingabefeld</em>' containment reference.
	 * @see #getEingabefeld()
	 * @generated
	 */
	void setEingabefeld(Eingabefeld value);

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
	 * @see screenModel.ScreenModelPackage#getDateneingabefeld_Textfeld()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Textfeld getTextfeld();

	/**
	 * Sets the value of the '{@link screenModel.Dateneingabefeld#getTextfeld <em>Textfeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textfeld</em>' containment reference.
	 * @see #getTextfeld()
	 * @generated
	 */
	void setTextfeld(Textfeld value);

} // Dateneingabefeld
