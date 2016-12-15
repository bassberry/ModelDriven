/**
 */
package screenModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datenausgabe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link screenModel.Datenausgabe#getDatenobjekt <em>Datenobjekt</em>}</li>
 *   <li>{@link screenModel.Datenausgabe#getDatenausgabefeld <em>Datenausgabefeld</em>}</li>
 * </ul>
 *
 * @see screenModel.ScreenModelPackage#getDatenausgabe()
 * @model
 * @generated
 */
public interface Datenausgabe extends EObject {
	/**
	 * Returns the value of the '<em><b>Datenobjekt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datenobjekt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenobjekt</em>' reference.
	 * @see #setDatenobjekt(Datenobjekt)
	 * @see screenModel.ScreenModelPackage#getDatenausgabe_Datenobjekt()
	 * @model
	 * @generated
	 */
	Datenobjekt getDatenobjekt();

	/**
	 * Sets the value of the '{@link screenModel.Datenausgabe#getDatenobjekt <em>Datenobjekt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenobjekt</em>' reference.
	 * @see #getDatenobjekt()
	 * @generated
	 */
	void setDatenobjekt(Datenobjekt value);

	/**
	 * Returns the value of the '<em><b>Datenausgabefeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datenausgabefeld</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenausgabefeld</em>' containment reference.
	 * @see #setDatenausgabefeld(Datenausgabefeld)
	 * @see screenModel.ScreenModelPackage#getDatenausgabe_Datenausgabefeld()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Datenausgabefeld getDatenausgabefeld();

	/**
	 * Sets the value of the '{@link screenModel.Datenausgabe#getDatenausgabefeld <em>Datenausgabefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenausgabefeld</em>' containment reference.
	 * @see #getDatenausgabefeld()
	 * @generated
	 */
	void setDatenausgabefeld(Datenausgabefeld value);

} // Datenausgabe
