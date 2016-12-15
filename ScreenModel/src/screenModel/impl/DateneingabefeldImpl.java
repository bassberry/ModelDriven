/**
 */
package screenModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import screenModel.Dateneingabefeld;
import screenModel.Eingabefeld;
import screenModel.ScreenModelPackage;
import screenModel.Textfeld;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dateneingabefeld</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link screenModel.impl.DateneingabefeldImpl#getEingabefeld <em>Eingabefeld</em>}</li>
 *   <li>{@link screenModel.impl.DateneingabefeldImpl#getTextfeld <em>Textfeld</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateneingabefeldImpl extends MinimalEObjectImpl.Container implements Dateneingabefeld {
	/**
	 * The cached value of the '{@link #getEingabefeld() <em>Eingabefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEingabefeld()
	 * @generated
	 * @ordered
	 */
	protected Eingabefeld eingabefeld;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateneingabefeldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScreenModelPackage.Literals.DATENEINGABEFELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eingabefeld getEingabefeld() {
		return eingabefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEingabefeld(Eingabefeld newEingabefeld, NotificationChain msgs) {
		Eingabefeld oldEingabefeld = eingabefeld;
		eingabefeld = newEingabefeld;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScreenModelPackage.DATENEINGABEFELD__EINGABEFELD, oldEingabefeld, newEingabefeld);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEingabefeld(Eingabefeld newEingabefeld) {
		if (newEingabefeld != eingabefeld) {
			NotificationChain msgs = null;
			if (eingabefeld != null)
				msgs = ((InternalEObject)eingabefeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScreenModelPackage.DATENEINGABEFELD__EINGABEFELD, null, msgs);
			if (newEingabefeld != null)
				msgs = ((InternalEObject)newEingabefeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScreenModelPackage.DATENEINGABEFELD__EINGABEFELD, null, msgs);
			msgs = basicSetEingabefeld(newEingabefeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenModelPackage.DATENEINGABEFELD__EINGABEFELD, newEingabefeld, newEingabefeld));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScreenModelPackage.DATENEINGABEFELD__TEXTFELD, oldTextfeld, newTextfeld);
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
				msgs = ((InternalEObject)textfeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScreenModelPackage.DATENEINGABEFELD__TEXTFELD, null, msgs);
			if (newTextfeld != null)
				msgs = ((InternalEObject)newTextfeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScreenModelPackage.DATENEINGABEFELD__TEXTFELD, null, msgs);
			msgs = basicSetTextfeld(newTextfeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenModelPackage.DATENEINGABEFELD__TEXTFELD, newTextfeld, newTextfeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScreenModelPackage.DATENEINGABEFELD__EINGABEFELD:
				return basicSetEingabefeld(null, msgs);
			case ScreenModelPackage.DATENEINGABEFELD__TEXTFELD:
				return basicSetTextfeld(null, msgs);
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
			case ScreenModelPackage.DATENEINGABEFELD__EINGABEFELD:
				return getEingabefeld();
			case ScreenModelPackage.DATENEINGABEFELD__TEXTFELD:
				return getTextfeld();
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
			case ScreenModelPackage.DATENEINGABEFELD__EINGABEFELD:
				setEingabefeld((Eingabefeld)newValue);
				return;
			case ScreenModelPackage.DATENEINGABEFELD__TEXTFELD:
				setTextfeld((Textfeld)newValue);
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
			case ScreenModelPackage.DATENEINGABEFELD__EINGABEFELD:
				setEingabefeld((Eingabefeld)null);
				return;
			case ScreenModelPackage.DATENEINGABEFELD__TEXTFELD:
				setTextfeld((Textfeld)null);
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
			case ScreenModelPackage.DATENEINGABEFELD__EINGABEFELD:
				return eingabefeld != null;
			case ScreenModelPackage.DATENEINGABEFELD__TEXTFELD:
				return textfeld != null;
		}
		return super.eIsSet(featureID);
	}

} //DateneingabefeldImpl
