/**
 */
package screenModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import screenModel.Datenobjekt;
import screenModel.Datenstruktur;
import screenModel.ScreenModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datenobjekt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link screenModel.impl.DatenobjektImpl#getDatenstruktur <em>Datenstruktur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatenobjektImpl extends MinimalEObjectImpl.Container implements Datenobjekt {
	/**
	 * The cached value of the '{@link #getDatenstruktur() <em>Datenstruktur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenstruktur()
	 * @generated
	 * @ordered
	 */
	protected Datenstruktur datenstruktur;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatenobjektImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScreenModelPackage.Literals.DATENOBJEKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datenstruktur getDatenstruktur() {
		if (datenstruktur != null && datenstruktur.eIsProxy()) {
			InternalEObject oldDatenstruktur = (InternalEObject)datenstruktur;
			datenstruktur = (Datenstruktur)eResolveProxy(oldDatenstruktur);
			if (datenstruktur != oldDatenstruktur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScreenModelPackage.DATENOBJEKT__DATENSTRUKTUR, oldDatenstruktur, datenstruktur));
			}
		}
		return datenstruktur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datenstruktur basicGetDatenstruktur() {
		return datenstruktur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatenstruktur(Datenstruktur newDatenstruktur) {
		Datenstruktur oldDatenstruktur = datenstruktur;
		datenstruktur = newDatenstruktur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenModelPackage.DATENOBJEKT__DATENSTRUKTUR, oldDatenstruktur, datenstruktur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScreenModelPackage.DATENOBJEKT__DATENSTRUKTUR:
				if (resolve) return getDatenstruktur();
				return basicGetDatenstruktur();
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
			case ScreenModelPackage.DATENOBJEKT__DATENSTRUKTUR:
				setDatenstruktur((Datenstruktur)newValue);
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
			case ScreenModelPackage.DATENOBJEKT__DATENSTRUKTUR:
				setDatenstruktur((Datenstruktur)null);
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
			case ScreenModelPackage.DATENOBJEKT__DATENSTRUKTUR:
				return datenstruktur != null;
		}
		return super.eIsSet(featureID);
	}

} //DatenobjektImpl
