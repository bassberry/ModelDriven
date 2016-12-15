/**
 */
package screenModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import screenModel.Attribut;
import screenModel.Ausgabefeld;
import screenModel.ScreenModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ausgabefeld</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link screenModel.impl.AusgabefeldImpl#getAttribut <em>Attribut</em>}</li>
 *   <li>{@link screenModel.impl.AusgabefeldImpl#getDisplayText <em>Display Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AusgabefeldImpl extends MinimalEObjectImpl.Container implements Ausgabefeld {
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
	protected AusgabefeldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScreenModelPackage.Literals.AUSGABEFELD;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScreenModelPackage.AUSGABEFELD__ATTRIBUT, oldAttribut, attribut));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenModelPackage.AUSGABEFELD__ATTRIBUT, oldAttribut, attribut));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenModelPackage.AUSGABEFELD__DISPLAY_TEXT, oldDisplayText, displayText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScreenModelPackage.AUSGABEFELD__ATTRIBUT:
				if (resolve) return getAttribut();
				return basicGetAttribut();
			case ScreenModelPackage.AUSGABEFELD__DISPLAY_TEXT:
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
			case ScreenModelPackage.AUSGABEFELD__ATTRIBUT:
				setAttribut((Attribut)newValue);
				return;
			case ScreenModelPackage.AUSGABEFELD__DISPLAY_TEXT:
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
			case ScreenModelPackage.AUSGABEFELD__ATTRIBUT:
				setAttribut((Attribut)null);
				return;
			case ScreenModelPackage.AUSGABEFELD__DISPLAY_TEXT:
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
			case ScreenModelPackage.AUSGABEFELD__ATTRIBUT:
				return attribut != null;
			case ScreenModelPackage.AUSGABEFELD__DISPLAY_TEXT:
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

} //AusgabefeldImpl
