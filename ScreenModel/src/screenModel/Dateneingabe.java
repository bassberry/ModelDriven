/**
 */
package screenModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dateneingabe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link screenModel.Dateneingabe#getDatenobjekt <em>Datenobjekt</em>}</li>
 *   <li>{@link screenModel.Dateneingabe#getDateneingabefeld <em>Dateneingabefeld</em>}</li>
 * </ul>
 *
 * @see screenModel.ScreenModelPackage#getDateneingabe()
 * @model
 * @generated
 */
public interface Dateneingabe extends EObject {
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
	 * @see screenModel.ScreenModelPackage#getDateneingabe_Datenobjekt()
	 * @model
	 * @generated
	 */
	Datenobjekt getDatenobjekt();

	/**
	 * Sets the value of the '{@link screenModel.Dateneingabe#getDatenobjekt <em>Datenobjekt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenobjekt</em>' reference.
	 * @see #getDatenobjekt()
	 * @generated
	 */
	void setDatenobjekt(Datenobjekt value);

	/**
	 * Returns the value of the '<em><b>Dateneingabefeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dateneingabefeld</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dateneingabefeld</em>' containment reference.
	 * @see #setDateneingabefeld(Dateneingabefeld)
	 * @see screenModel.ScreenModelPackage#getDateneingabe_Dateneingabefeld()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dateneingabefeld getDateneingabefeld();

	/**
	 * Sets the value of the '{@link screenModel.Dateneingabe#getDateneingabefeld <em>Dateneingabefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dateneingabefeld</em>' containment reference.
	 * @see #getDateneingabefeld()
	 * @generated
	 */
	void setDateneingabefeld(Dateneingabefeld value);

} // Dateneingabe
