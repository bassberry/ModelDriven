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

import screenModel.Datenobjekt;
import screenModel.Datenstruktur;
import screenModel.ScreenModel;
import screenModel.ScreenModelPackage;
import screenModel.Seite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screen Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link screenModel.impl.ScreenModelImpl#getSeite <em>Seite</em>}</li>
 *   <li>{@link screenModel.impl.ScreenModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link screenModel.impl.ScreenModelImpl#getDatenobjekt <em>Datenobjekt</em>}</li>
 *   <li>{@link screenModel.impl.ScreenModelImpl#getDatenstruktur <em>Datenstruktur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScreenModelImpl extends MinimalEObjectImpl.Container implements ScreenModel {
	/**
	 * The cached value of the '{@link #getSeite() <em>Seite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeite()
	 * @generated
	 * @ordered
	 */
	protected EList<Seite> seite;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatenobjekt() <em>Datenobjekt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenobjekt()
	 * @generated
	 * @ordered
	 */
	protected EList<Datenobjekt> datenobjekt;

	/**
	 * The cached value of the '{@link #getDatenstruktur() <em>Datenstruktur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenstruktur()
	 * @generated
	 * @ordered
	 */
	protected EList<Datenstruktur> datenstruktur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreenModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScreenModelPackage.Literals.SCREEN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Seite> getSeite() {
		if (seite == null) {
			seite = new EObjectContainmentEList<Seite>(Seite.class, this, ScreenModelPackage.SCREEN_MODEL__SEITE);
		}
		return seite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenModelPackage.SCREEN_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Datenobjekt> getDatenobjekt() {
		if (datenobjekt == null) {
			datenobjekt = new EObjectContainmentEList<Datenobjekt>(Datenobjekt.class, this, ScreenModelPackage.SCREEN_MODEL__DATENOBJEKT);
		}
		return datenobjekt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Datenstruktur> getDatenstruktur() {
		if (datenstruktur == null) {
			datenstruktur = new EObjectContainmentEList<Datenstruktur>(Datenstruktur.class, this, ScreenModelPackage.SCREEN_MODEL__DATENSTRUKTUR);
		}
		return datenstruktur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScreenModelPackage.SCREEN_MODEL__SEITE:
				return ((InternalEList<?>)getSeite()).basicRemove(otherEnd, msgs);
			case ScreenModelPackage.SCREEN_MODEL__DATENOBJEKT:
				return ((InternalEList<?>)getDatenobjekt()).basicRemove(otherEnd, msgs);
			case ScreenModelPackage.SCREEN_MODEL__DATENSTRUKTUR:
				return ((InternalEList<?>)getDatenstruktur()).basicRemove(otherEnd, msgs);
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
			case ScreenModelPackage.SCREEN_MODEL__SEITE:
				return getSeite();
			case ScreenModelPackage.SCREEN_MODEL__NAME:
				return getName();
			case ScreenModelPackage.SCREEN_MODEL__DATENOBJEKT:
				return getDatenobjekt();
			case ScreenModelPackage.SCREEN_MODEL__DATENSTRUKTUR:
				return getDatenstruktur();
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
			case ScreenModelPackage.SCREEN_MODEL__SEITE:
				getSeite().clear();
				getSeite().addAll((Collection<? extends Seite>)newValue);
				return;
			case ScreenModelPackage.SCREEN_MODEL__NAME:
				setName((String)newValue);
				return;
			case ScreenModelPackage.SCREEN_MODEL__DATENOBJEKT:
				getDatenobjekt().clear();
				getDatenobjekt().addAll((Collection<? extends Datenobjekt>)newValue);
				return;
			case ScreenModelPackage.SCREEN_MODEL__DATENSTRUKTUR:
				getDatenstruktur().clear();
				getDatenstruktur().addAll((Collection<? extends Datenstruktur>)newValue);
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
			case ScreenModelPackage.SCREEN_MODEL__SEITE:
				getSeite().clear();
				return;
			case ScreenModelPackage.SCREEN_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ScreenModelPackage.SCREEN_MODEL__DATENOBJEKT:
				getDatenobjekt().clear();
				return;
			case ScreenModelPackage.SCREEN_MODEL__DATENSTRUKTUR:
				getDatenstruktur().clear();
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
			case ScreenModelPackage.SCREEN_MODEL__SEITE:
				return seite != null && !seite.isEmpty();
			case ScreenModelPackage.SCREEN_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ScreenModelPackage.SCREEN_MODEL__DATENOBJEKT:
				return datenobjekt != null && !datenobjekt.isEmpty();
			case ScreenModelPackage.SCREEN_MODEL__DATENSTRUKTUR:
				return datenstruktur != null && !datenstruktur.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ScreenModelImpl
