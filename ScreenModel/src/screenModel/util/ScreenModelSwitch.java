/**
 */
package screenModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import screenModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see screenModel.ScreenModelPackage
 * @generated
 */
public class ScreenModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScreenModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ScreenModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ScreenModelPackage.SCREEN_MODEL: {
				ScreenModel screenModel = (ScreenModel)theEObject;
				T result = caseScreenModel(screenModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScreenModelPackage.SEITE: {
				Seite seite = (Seite)theEObject;
				T result = caseSeite(seite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScreenModelPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScreenModelPackage.DATENEINGABE: {
				Dateneingabe dateneingabe = (Dateneingabe)theEObject;
				T result = caseDateneingabe(dateneingabe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScreenModelPackage.DATENAUSGABE: {
				Datenausgabe datenausgabe = (Datenausgabe)theEObject;
				T result = caseDatenausgabe(datenausgabe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScreenModelPackage.DATENOBJEKT: {
				Datenobjekt datenobjekt = (Datenobjekt)theEObject;
				T result = caseDatenobjekt(datenobjekt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScreenModelPackage.DATENSTRUKTUR: {
				Datenstruktur datenstruktur = (Datenstruktur)theEObject;
				T result = caseDatenstruktur(datenstruktur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScreenModelPackage.ATTRIBUT: {
				Attribut attribut = (Attribut)theEObject;
				T result = caseAttribut(attribut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScreenModelPackage.DATENAUSGABEFELD: {
				Datenausgabefeld datenausgabefeld = (Datenausgabefeld)theEObject;
				T result = caseDatenausgabefeld(datenausgabefeld);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScreenModelPackage.TEXTFELD: {
				Textfeld textfeld = (Textfeld)theEObject;
				T result = caseTextfeld(textfeld);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScreenModelPackage.EINGABEFELD: {
				Eingabefeld eingabefeld = (Eingabefeld)theEObject;
				T result = caseEingabefeld(eingabefeld);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScreenModelPackage.DATENEINGABEFELD: {
				Dateneingabefeld dateneingabefeld = (Dateneingabefeld)theEObject;
				T result = caseDateneingabefeld(dateneingabefeld);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScreenModelPackage.AUSGABEFELD: {
				Ausgabefeld ausgabefeld = (Ausgabefeld)theEObject;
				T result = caseAusgabefeld(ausgabefeld);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenModel(ScreenModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeite(Seite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dateneingabe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dateneingabe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateneingabe(Dateneingabe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datenausgabe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datenausgabe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatenausgabe(Datenausgabe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datenobjekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datenobjekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatenobjekt(Datenobjekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datenstruktur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datenstruktur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatenstruktur(Datenstruktur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribut(Attribut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datenausgabefeld</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datenausgabefeld</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatenausgabefeld(Datenausgabefeld object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textfeld</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textfeld</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextfeld(Textfeld object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eingabefeld</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eingabefeld</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEingabefeld(Eingabefeld object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dateneingabefeld</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dateneingabefeld</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateneingabefeld(Dateneingabefeld object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ausgabefeld</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ausgabefeld</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAusgabefeld(Ausgabefeld object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ScreenModelSwitch
