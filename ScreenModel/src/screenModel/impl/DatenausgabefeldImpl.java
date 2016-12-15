/**
 */
package screenModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import screenModel.Ausgabefeld;
import screenModel.Datenausgabefeld;
import screenModel.ScreenModelPackage;
import screenModel.Textfeld;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datenausgabefeld</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link screenModel.impl.DatenausgabefeldImpl#getTextfeld <em>Textfeld</em>}</li>
 *   <li>{@link screenModel.impl.DatenausgabefeldImpl#getAusgabefeld <em>Ausgabefeld</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatenausgabefeldImpl extends MinimalEObjectImpl.Container implements Datenausgabefeld {
	/**
	 * The cached value of the '{@link #getTextfeld() <em>Textfeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextfeld()
	 * @generated
	 * @ordered
	 */
	protected Textfeld textfeld;

	/**
	 * The cached value of the '{@link #getAusgabefeld() <em>Ausgabefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAusgabefeld()
	 * @generated
	 * @ordered
	 */
	protected Ausgabefeld ausgabefeld;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatenausgabefeldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScreenModelPackage.Literals.DATENAUSGABEFELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Textfeld getTextfeld() {
		return textfeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextfeld(Textfeld newTextfeld, NotificationChain msgs) {
		Textfeld oldTextfeld = textfeld;
		textfeld = newTextfeld;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScreenModelPackage.DATENAUSGABEFELD__TEXTFELD, oldTextfeld, newTextfeld);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextfeld(Textfeld newTextfeld) {
		if (newTextfeld != textfeld) {
			NotificationChain msgs = null;
			if (textfeld != null)
				msgs = ((InternalEObject)textfeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScreenModelPackage.DATENAUSGABEFELD__TEXTFELD, null, msgs);
			if (newTextfeld != null)
				msgs = ((InternalEObject)newTextfeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScreenModelPackage.DATENAUSGABEFELD__TEXTFELD, null, msgs);
			msgs = basicSetTextfeld(newTextfeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenModelPackage.DATENAUSGABEFELD__TEXTFELD, newTextfeld, newTextfeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ausgabefeld getAusgabefeld() {
		return ausgabefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAusgabefeld(Ausgabefeld newAusgabefeld, NotificationChain msgs) {
		Ausgabefeld oldAusgabefeld = ausgabefeld;
		ausgabefeld = newAusgabefeld;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScreenModelPackage.DATENAUSGABEFELD__AUSGABEFELD, oldAusgabefeld, newAusgabefeld);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAusgabefeld(Ausgabefeld newAusgabefeld) {
		if (newAusgabefeld != ausgabefeld) {
			NotificationChain msgs = null;
			if (ausgabefeld != null)
				msgs = ((InternalEObject)ausgabefeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScreenModelPackage.DATENAUSGABEFELD__AUSGABEFELD, null, msgs);
			if (newAusgabefeld != null)
				msgs = ((InternalEObject)newAusgabefeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScreenModelPackage.DATENAUSGABEFELD__AUSGABEFELD, null, msgs);
			msgs = basicSetAusgabefeld(newAusgabefeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenModelPackage.DATENAUSGABEFELD__AUSGABEFELD, newAusgabefeld, newAusgabefeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScreenModelPackage.DATENAUSGABEFELD__TEXTFELD:
				return basicSetTextfeld(null, msgs);
			case ScreenModelPackage.DATENAUSGABEFELD__AUSGABEFELD:
				return basicSetAusgabefeld(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScreenModelPackage.DATENAUSGABEFELD__TEXTFELD:
				return getTextfeld();
			case ScreenModelPackage.DATENAUSGABEFELD__AUSGABEFELD:
				return getAusgabefeld();
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
			case ScreenModelPackage.DATENAUSGABEFELD__TEXTFELD:
				setTextfeld((Textfeld)newValue);
				return;
			case ScreenModelPackage.DATENAUSGABEFELD__AUSGABEFELD:
				setAusgabefeld((Ausgabefeld)newValue);
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
			case ScreenModelPackage.DATENAUSGABEFELD__TEXTFELD:
				setTextfeld((Textfeld)null);
				return;
			case ScreenModelPackage.DATENAUSGABEFELD__AUSGABEFELD:
				setAusgabefeld((Ausgabefeld)null);
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
			case ScreenModelPackage.DATENAUSGABEFELD__TEXTFELD:
				return textfeld != null;
			case ScreenModelPackage.DATENAUSGABEFELD__AUSGABEFELD:
				return ausgabefeld != null;
		}
		return super.eIsSet(featureID);
	}

} //DatenausgabefeldImpl
