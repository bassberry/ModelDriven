/**
 */
package screenModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link screenModel.Button#getSeite <em>Seite</em>}</li>
 *   <li>{@link screenModel.Button#getDisplayText <em>Display Text</em>}</li>
 * </ul>
 *
 * @see screenModel.ScreenModelPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends EObject {
	/**
	 * Returns the value of the '<em><b>Seite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seite</em>' reference.
	 * @see #setSeite(Seite)
	 * @see screenModel.ScreenModelPackage#getButton_Seite()
	 * @model
	 * @generated
	 */
	Seite getSeite();

	/**
	 * Sets the value of the '{@link screenModel.Button#getSeite <em>Seite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seite</em>' reference.
	 * @see #getSeite()
	 * @generated
	 */
	void setSeite(Seite value);

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
	 * @see screenModel.ScreenModelPackage#getButton_DisplayText()
	 * @model required="true"
	 * @generated
	 */
	String getDisplayText();

	/**
	 * Sets the value of the '{@link screenModel.Button#getDisplayText <em>Display Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Text</em>' attribute.
	 * @see #getDisplayText()
	 * @generated
	 */
	void setDisplayText(String value);

} // Button
