/**
 */
package screenModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link screenModel.ScreenModel#getSeite <em>Seite</em>}</li>
 *   <li>{@link screenModel.ScreenModel#getName <em>Name</em>}</li>
 *   <li>{@link screenModel.ScreenModel#getDatenobjekt <em>Datenobjekt</em>}</li>
 *   <li>{@link screenModel.ScreenModel#getDatenstruktur <em>Datenstruktur</em>}</li>
 * </ul>
 *
 * @see screenModel.ScreenModelPackage#getScreenModel()
 * @model
 * @generated
 */
public interface ScreenModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Seite</b></em>' containment reference list.
	 * The list contents are of type {@link screenModel.Seite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seite</em>' containment reference list.
	 * @see screenModel.ScreenModelPackage#getScreenModel_Seite()
	 * @model containment="true"
	 * @generated
	 */
	EList<Seite> getSeite();

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
	 * @see screenModel.ScreenModelPackage#getScreenModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link screenModel.ScreenModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Datenobjekt</b></em>' containment reference list.
	 * The list contents are of type {@link screenModel.Datenobjekt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datenobjekt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenobjekt</em>' containment reference list.
	 * @see screenModel.ScreenModelPackage#getScreenModel_Datenobjekt()
	 * @model containment="true"
	 * @generated
	 */
	EList<Datenobjekt> getDatenobjekt();

	/**
	 * Returns the value of the '<em><b>Datenstruktur</b></em>' containment reference list.
	 * The list contents are of type {@link screenModel.Datenstruktur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datenstruktur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenstruktur</em>' containment reference list.
	 * @see screenModel.ScreenModelPackage#getScreenModel_Datenstruktur()
	 * @model containment="true"
	 * @generated
	 */
	EList<Datenstruktur> getDatenstruktur();

} // ScreenModel
