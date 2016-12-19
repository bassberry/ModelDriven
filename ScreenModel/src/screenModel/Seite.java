/**
 */
package screenModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link screenModel.Seite#getButton <em>Button</em>}</li>
 *   <li>{@link screenModel.Seite#getDateneingabe <em>Dateneingabe</em>}</li>
 *   <li>{@link screenModel.Seite#getDatenausgabe <em>Datenausgabe</em>}</li>
 *   <li>{@link screenModel.Seite#getPageName <em>Page Name</em>}</li>
 * </ul>
 *
 * @see screenModel.ScreenModelPackage#getSeite()
 * @model
 * @generated
 */
public interface Seite extends EObject {
	/**
	 * Returns the value of the '<em><b>Button</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button</em>' containment reference.
	 * @see #setButton(Button)
	 * @see screenModel.ScreenModelPackage#getSeite_Button()
	 * @model containment="true"
	 * @generated
	 */
	Button getButton();

	/**
	 * Sets the value of the '{@link screenModel.Seite#getButton <em>Button</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button</em>' containment reference.
	 * @see #getButton()
	 * @generated
	 */
	void setButton(Button value);

	/**
	 * Returns the value of the '<em><b>Dateneingabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dateneingabe</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dateneingabe</em>' containment reference.
	 * @see #setDateneingabe(Dateneingabe)
	 * @see screenModel.ScreenModelPackage#getSeite_Dateneingabe()
	 * @model containment="true"
	 * @generated
	 */
	Dateneingabe getDateneingabe();

	/**
	 * Sets the value of the '{@link screenModel.Seite#getDateneingabe <em>Dateneingabe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dateneingabe</em>' containment reference.
	 * @see #getDateneingabe()
	 * @generated
	 */
	void setDateneingabe(Dateneingabe value);

	/**
	 * Returns the value of the '<em><b>Datenausgabe</b></em>' containment reference list.
	 * The list contents are of type {@link screenModel.Datenausgabe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datenausgabe</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenausgabe</em>' containment reference list.
	 * @see screenModel.ScreenModelPackage#getSeite_Datenausgabe()
	 * @model containment="true"
	 * @generated
	 */
	EList<Datenausgabe> getDatenausgabe();

	/**
	 * Returns the value of the '<em><b>Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Name</em>' attribute.
	 * @see #setPageName(String)
	 * @see screenModel.ScreenModelPackage#getSeite_PageName()
	 * @model required="true"
	 * @generated
	 */
	String getPageName();

	/**
	 * Sets the value of the '{@link screenModel.Seite#getPageName <em>Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Name</em>' attribute.
	 * @see #getPageName()
	 * @generated
	 */
	void setPageName(String value);

} // Seite
