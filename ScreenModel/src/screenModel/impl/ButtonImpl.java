/**
 */
package screenModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import screenModel.Button;
import screenModel.ScreenModelPackage;
import screenModel.Seite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link screenModel.impl.ButtonImpl#getSeite <em>Seite</em>}</li>
 *   <li>{@link screenModel.impl.ButtonImpl#getDisplayText <em>Display Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonImpl extends MinimalEObjectImpl.Container implements Button {
	/**
	 * The cached value of the '{@link #getSeite() <em>Seite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeite()
	 * @generated
	 * @ordered
	 */
	protected Seite seite;

	/**
	 * The default value of the '{@link #getDisplayText() <em>Display Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayText()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayText() <em>Display Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayText()
	 * @generated
	 * @ordered
	 */
	protected String displayText = DISPLAY_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScreenModelPackage.Literals.BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seite getSeite() {
		if (seite != null && seite.eIsProxy()) {
			InternalEObject oldSeite = (InternalEObject)seite;
			seite = (Seite)eResolveProxy(oldSeite);
			if (seite != oldSeite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScreenModelPackage.BUTTON__SEITE, oldSeite, seite));
			}
		}
		return seite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seite basicGetSeite() {
		return seite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeite(Seite newSeite) {
		Seite oldSeite = seite;
		seite = newSeite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenModelPackage.BUTTON__SEITE, oldSeite, seite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayText() {
		return displayText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayText(String newDisplayText) {
		String oldDisplayText = displayText;
		displayText = newDisplayText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenModelPackage.BUTTON__DISPLAY_TEXT, oldDisplayText, displayText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScreenModelPackage.BUTTON__SEITE:
				if (resolve) return getSeite();
				return basicGetSeite();
			case ScreenModelPackage.BUTTON__DISPLAY_TEXT:
				return getDisplayText();
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
			case ScreenModelPackage.BUTTON__SEITE:
				setSeite((Seite)newValue);
				return;
			case ScreenModelPackage.BUTTON__DISPLAY_TEXT:
				setDisplayText((String)newValue);
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
			case ScreenModelPackage.BUTTON__SEITE:
				setSeite((Seite)null);
				return;
			case ScreenModelPackage.BUTTON__DISPLAY_TEXT:
				setDisplayText(DISPLAY_TEXT_EDEFAULT);
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
			case ScreenModelPackage.BUTTON__SEITE:
				return seite != null;
			case ScreenModelPackage.BUTTON__DISPLAY_TEXT:
				return DISPLAY_TEXT_EDEFAULT == null ? displayText != null : !DISPLAY_TEXT_EDEFAULT.equals(displayText);
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
		result.append(" (displayText: ");
		result.append(displayText);
		result.append(')');
		return result.toString();
	}

} //ButtonImpl
