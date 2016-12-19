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
import screenModel.Dateneingabe;
import screenModel.Dateneingabefeld;
import screenModel.Datenobjekt;
import screenModel.ScreenModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dateneingabe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link screenModel.impl.DateneingabeImpl#getDatenobjekt <em>Datenobjekt</em>}</li>
 *   <li>{@link screenModel.impl.DateneingabeImpl#getDateneingabefeld <em>Dateneingabefeld</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateneingabeImpl extends MinimalEObjectImpl.Container implements Dateneingabe {
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
	 * The cached value of the '{@link #getDateneingabefeld() <em>Dateneingabefeld</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateneingabefeld()
	 * @generated
	 * @ordered
	 */
	protected EList<Dateneingabefeld> dateneingabefeld;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateneingabeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScreenModelPackage.Literals.DATENEINGABE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScreenModelPackage.DATENEINGABE__DATENOBJEKT, oldDatenobjekt, datenobjekt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenModelPackage.DATENEINGABE__DATENOBJEKT, oldDatenobjekt, datenobjekt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dateneingabefeld> getDateneingabefeld() {
		if (dateneingabefeld == null) {
			dateneingabefeld = new EObjectContainmentEList<Dateneingabefeld>(Dateneingabefeld.class, this, ScreenModelPackage.DATENEINGABE__DATENEINGABEFELD);
		}
		return dateneingabefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScreenModelPackage.DATENEINGABE__DATENEINGABEFELD:
				return ((InternalEList<?>)getDateneingabefeld()).basicRemove(otherEnd, msgs);
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
			case ScreenModelPackage.DATENEINGABE__DATENOBJEKT:
				if (resolve) return getDatenobjekt();
				return basicGetDatenobjekt();
			case ScreenModelPackage.DATENEINGABE__DATENEINGABEFELD:
				return getDateneingabefeld();
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
			case ScreenModelPackage.DATENEINGABE__DATENOBJEKT:
				setDatenobjekt((Datenobjekt)newValue);
				return;
			case ScreenModelPackage.DATENEINGABE__DATENEINGABEFELD:
				getDateneingabefeld().clear();
				getDateneingabefeld().addAll((Collection<? extends Dateneingabefeld>)newValue);
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
			case ScreenModelPackage.DATENEINGABE__DATENOBJEKT:
				setDatenobjekt((Datenobjekt)null);
				return;
			case ScreenModelPackage.DATENEINGABE__DATENEINGABEFELD:
				getDateneingabefeld().clear();
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
			case ScreenModelPackage.DATENEINGABE__DATENOBJEKT:
				return datenobjekt != null;
			case ScreenModelPackage.DATENEINGABE__DATENEINGABEFELD:
				return dateneingabefeld != null && !dateneingabefeld.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DateneingabeImpl
