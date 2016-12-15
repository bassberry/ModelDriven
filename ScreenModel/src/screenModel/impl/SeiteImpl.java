/**
 */
package screenModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import screenModel.Button;
import screenModel.Datenausgabe;
import screenModel.Dateneingabe;
import screenModel.ScreenModelPackage;
import screenModel.Seite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link screenModel.impl.SeiteImpl#getButton <em>Button</em>}</li>
 *   <li>{@link screenModel.impl.SeiteImpl#getDateneingabe <em>Dateneingabe</em>}</li>
 *   <li>{@link screenModel.impl.SeiteImpl#getDatenausgabe <em>Datenausgabe</em>}</li>
 *   <li>{@link screenModel.impl.SeiteImpl#getPageName <em>Page Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeiteImpl extends MinimalEObjectImpl.Container implements Seite {
	/**
	 * The cached value of the '{@link #getButton() <em>Button</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButton()
	 * @generated
	 * @ordered
	 */
	protected EList<Button> button;

	/**
	 * The cached value of the '{@link #getDateneingabe() <em>Dateneingabe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateneingabe()
	 * @generated
	 * @ordered
	 */
	protected Dateneingabe dateneingabe;

	/**
	 * The cached value of the '{@link #getDatenausgabe() <em>Datenausgabe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenausgabe()
	 * @generated
	 * @ordered
	 */
	protected EList<Datenausgabe> datenausgabe;

	/**
	 * The default value of the '{@link #getPageName() <em>Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageName() <em>Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageName()
	 * @generated
	 * @ordered
	 */
	protected String pageName = PAGE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScreenModelPackage.Literals.SEITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Button> getButton() {
		if (button == null) {
			button = new EObjectContainmentEList<Button>(Button.class, this, ScreenModelPackage.SEITE__BUTTON);
		}
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dateneingabe getDateneingabe() {
		return dateneingabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateneingabe(Dateneingabe newDateneingabe, NotificationChain msgs) {
		Dateneingabe oldDateneingabe = dateneingabe;
		dateneingabe = newDateneingabe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScreenModelPackage.SEITE__DATENEINGABE, oldDateneingabe, newDateneingabe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateneingabe(Dateneingabe newDateneingabe) {
		if (newDateneingabe != dateneingabe) {
			NotificationChain msgs = null;
			if (dateneingabe != null)
				msgs = ((InternalEObject)dateneingabe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScreenModelPackage.SEITE__DATENEINGABE, null, msgs);
			if (newDateneingabe != null)
				msgs = ((InternalEObject)newDateneingabe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScreenModelPackage.SEITE__DATENEINGABE, null, msgs);
			msgs = basicSetDateneingabe(newDateneingabe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenModelPackage.SEITE__DATENEINGABE, newDateneingabe, newDateneingabe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Datenausgabe> getDatenausgabe() {
		if (datenausgabe == null) {
			datenausgabe = new EObjectContainmentEList<Datenausgabe>(Datenausgabe.class, this, ScreenModelPackage.SEITE__DATENAUSGABE);
		}
		return datenausgabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPageName() {
		return pageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageName(String newPageName) {
		String oldPageName = pageName;
		pageName = newPageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenModelPackage.SEITE__PAGE_NAME, oldPageName, pageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScreenModelPackage.SEITE__BUTTON:
				return ((InternalEList<?>)getButton()).basicRemove(otherEnd, msgs);
			case ScreenModelPackage.SEITE__DATENEINGABE:
				return basicSetDateneingabe(null, msgs);
			case ScreenModelPackage.SEITE__DATENAUSGABE:
				return ((InternalEList<?>)getDatenausgabe()).basicRemove(otherEnd, msgs);
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
			case ScreenModelPackage.SEITE__BUTTON:
				return getButton();
			case ScreenModelPackage.SEITE__DATENEINGABE:
				return getDateneingabe();
			case ScreenModelPackage.SEITE__DATENAUSGABE:
				return getDatenausgabe();
			case ScreenModelPackage.SEITE__PAGE_NAME:
				return getPageName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScreenModelPackage.SEITE__BUTTON:
				getButton().clear();
				getButton().addAll((Collection<? extends Button>)newValue);
				return;
			case ScreenModelPackage.SEITE__DATENEINGABE:
				setDateneingabe((Dateneingabe)newValue);
				return;
			case ScreenModelPackage.SEITE__DATENAUSGABE:
				getDatenausgabe().clear();
				getDatenausgabe().addAll((Collection<? extends Datenausgabe>)newValue);
				return;
			case ScreenModelPackage.SEITE__PAGE_NAME:
				setPageName((String)newValue);
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
			case ScreenModelPackage.SEITE__BUTTON:
				getButton().clear();
				return;
			case ScreenModelPackage.SEITE__DATENEINGABE:
				setDateneingabe((Dateneingabe)null);
				return;
			case ScreenModelPackage.SEITE__DATENAUSGABE:
				getDatenausgabe().clear();
				return;
			case ScreenModelPackage.SEITE__PAGE_NAME:
				setPageName(PAGE_NAME_EDEFAULT);
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
			case ScreenModelPackage.SEITE__BUTTON:
				return button != null && !button.isEmpty();
			case ScreenModelPackage.SEITE__DATENEINGABE:
				return dateneingabe != null;
			case ScreenModelPackage.SEITE__DATENAUSGABE:
				return datenausgabe != null && !datenausgabe.isEmpty();
			case ScreenModelPackage.SEITE__PAGE_NAME:
				return PAGE_NAME_EDEFAULT == null ? pageName != null : !PAGE_NAME_EDEFAULT.equals(pageName);
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
		result.append(" (pageName: ");
		result.append(pageName);
		result.append(')');
		return result.toString();
	}

} //SeiteImpl
