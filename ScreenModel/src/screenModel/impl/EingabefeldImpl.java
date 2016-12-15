/**
 */
package screenModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import screenModel.Attribut;
import screenModel.Eingabefeld;
import screenModel.ScreenModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eingabefeld</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link screenModel.impl.EingabefeldImpl#getAttribut <em>Attribut</em>}</li>
 *   <li>{@link screenModel.impl.EingabefeldImpl#getInputText <em>Input Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EingabefeldImpl extends MinimalEObjectImpl.Container implements Eingabefeld {
	/**
	 * The cached value of the '{@link #getAttribut() <em>Attribut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribut()
	 * @generated
	 * @ordered
	 */
	protected Attribut attribut;

	/**
	 * The default value of the '{@link #getInputText() <em>Input Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputText()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputText() <em>Input Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputText()
	 * @generated
	 * @ordered
	 */
	protected String inputText = INPUT_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EingabefeldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScreenModelPackage.Literals.EINGABEFELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribut getAttribut() {
		if (attribut != null && attribut.eIsProxy()) {
			InternalEObject oldAttribut = (InternalEObject)attribut;
			attribut = (Attribut)eResolveProxy(oldAttribut);
			if (attribut != oldAttribut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScreenModelPackage.EINGABEFELD__ATTRIBUT, oldAttribut, attribut));
			}
		}
		return attribut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribut basicGetAttribut() {
		return attribut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribut(Attribut newAttribut) {
		Attribut oldAttribut = attribut;
		attribut = newAttribut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenModelPackage.EINGABEFELD__ATTRIBUT, oldAttribut, attribut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputText() {
		return inputText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputText(String newInputText) {
		String oldInputText = inputText;
		inputText = newInputText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenModelPackage.EINGABEFELD__INPUT_TEXT, oldInputText, inputText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScreenModelPackage.EINGABEFELD__ATTRIBUT:
				if (resolve) return getAttribut();
				return basicGetAttribut();
			case ScreenModelPackage.EINGABEFELD__INPUT_TEXT:
				return getInputText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScreenModelPackage.EINGABEFELD__ATTRIBUT:
				setAttribut((Attribut)newValue);
				return;
			case ScreenModelPackage.EINGABEFELD__INPUT_TEXT:
				setInputText((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScreenModelPackage.EINGABEFELD__ATTRIBUT:
				setAttribut((Attribut)null);
				return;
			case ScreenModelPackage.EINGABEFELD__INPUT_TEXT:
				setInputText(INPUT_TEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScreenModelPackage.EINGABEFELD__ATTRIBUT:
				return attribut != null;
			case ScreenModelPackage.EINGABEFELD__INPUT_TEXT:
				return INPUT_TEXT_EDEFAULT == null ? inputText != null : !INPUT_TEXT_EDEFAULT.equals(inputText);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (inputText: ");
		result.append(inputText);
		result.append(')');
		return result.toString();
	}

} //EingabefeldImpl
