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
import screenModel.Datenausgabe;
import screenModel.Datenausgabefeld;
import screenModel.Datenobjekt;
import screenModel.ScreenModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datenausgabe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link screenModel.impl.DatenausgabeImpl#getDatenobjekt <em>Datenobjekt</em>}</li>
 *   <li>{@link screenModel.impl.DatenausgabeImpl#getDatenausgabefeld <em>Datenausgabefeld</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatenausgabeImpl extends MinimalEObjectImpl.Container implements Datenausgabe {
	/**
	 * The cached value of the '{@link #getDatenobjekt() <em>Datenobjekt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenobjekt()
	 * @generated
	 * @ordered
	 */
	protected Datenobjekt datenobjekt;

	/**
	 * The cached value of the '{@link #getDatenausgabefeld() <em>Datenausgabefeld</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenausgabefeld()
	 * @generated
	 * @ordered
	 */
	protected EList<Datenausgabefeld> datenausgabefeld;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatenausgabeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScreenModelPackage.Literals.DATENAUSGABE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datenobjekt getDatenobjekt() {
		if (datenobjekt != null && datenobjekt.eIsProxy()) {
			InternalEObject oldDatenobjekt = (InternalEObject)datenobjekt;
			datenobjekt = (Datenobjekt)eResolveProxy(oldDatenobjekt);
			if (datenobjekt != oldDatenobjekt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScreenModelPackage.DATENAUSGABE__DATENOBJEKT, oldDatenobjekt, datenobjekt));
			}
		}
		return datenobjekt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datenobjekt basicGetDatenobjekt() {
		return datenobjekt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatenobjekt(Datenobjekt newDatenobjekt) {
		Datenobjekt oldDatenobjekt = datenobjekt;
		datenobjekt = newDatenobjekt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenModelPackage.DATENAUSGABE__DATENOBJEKT, oldDatenobjekt, datenobjekt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Datenausgabefeld> getDatenausgabefeld() {
		if (datenausgabefeld == null) {
			datenausgabefeld = new EObjectContainmentEList<Datenausgabefeld>(Datenausgabefeld.class, this, ScreenModelPackage.DATENAUSGABE__DATENAUSGABEFELD);
		}
		return datenausgabefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScreenModelPackage.DATENAUSGABE__DATENAUSGABEFELD:
				return ((InternalEList<?>)getDatenausgabefeld()).basicRemove(otherEnd, msgs);
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
			case ScreenModelPackage.DATENAUSGABE__DATENOBJEKT:
				if (resolve) return getDatenobjekt();
				return basicGetDatenobjekt();
			case ScreenModelPackage.DATENAUSGABE__DATENAUSGABEFELD:
				return getDatenausgabefeld();
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
			case ScreenModelPackage.DATENAUSGABE__DATENOBJEKT:
				setDatenobjekt((Datenobjekt)newValue);
				return;
			case ScreenModelPackage.DATENAUSGABE__DATENAUSGABEFELD:
				getDatenausgabefeld().clear();
				getDatenausgabefeld().addAll((Collection<? extends Datenausgabefeld>)newValue);
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
			case ScreenModelPackage.DATENAUSGABE__DATENOBJEKT:
				setDatenobjekt((Datenobjekt)null);
				return;
			case ScreenModelPackage.DATENAUSGABE__DATENAUSGABEFELD:
				getDatenausgabefeld().clear();
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
			case ScreenModelPackage.DATENAUSGABE__DATENOBJEKT:
				return datenobjekt != null;
			case ScreenModelPackage.DATENAUSGABE__DATENAUSGABEFELD:
				return datenausgabefeld != null && !datenausgabefeld.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatenausgabeImpl
