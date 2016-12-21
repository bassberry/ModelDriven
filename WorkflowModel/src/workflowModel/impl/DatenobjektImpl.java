/**
 */
package workflowModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import workflowModel.Datenobjekt;
import workflowModel.Datenstruktur;
import workflowModel.WorkflowModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datenobjekt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflowModel.impl.DatenobjektImpl#getDatenstruktur <em>Datenstruktur</em>}</li>
 *   <li>{@link workflowModel.impl.DatenobjektImpl#getName <em>Name</em>}</li>
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
		return WorkflowModelPackage.Literals.DATENOBJEKT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowModelPackage.DATENOBJEKT__DATENSTRUKTUR, oldDatenstruktur, datenstruktur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowModelPackage.DATENOBJEKT__DATENSTRUKTUR, oldDatenstruktur, datenstruktur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowModelPackage.DATENOBJEKT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowModelPackage.DATENOBJEKT__DATENSTRUKTUR:
				if (resolve) return getDatenstruktur();
				return basicGetDatenstruktur();
			case WorkflowModelPackage.DATENOBJEKT__NAME:
				return getName();
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
			case WorkflowModelPackage.DATENOBJEKT__DATENSTRUKTUR:
				setDatenstruktur((Datenstruktur)newValue);
				return;
			case WorkflowModelPackage.DATENOBJEKT__NAME:
				setName((String)newValue);
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
			case WorkflowModelPackage.DATENOBJEKT__DATENSTRUKTUR:
				setDatenstruktur((Datenstruktur)null);
				return;
			case WorkflowModelPackage.DATENOBJEKT__NAME:
				setName(NAME_EDEFAULT);
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
			case WorkflowModelPackage.DATENOBJEKT__DATENSTRUKTUR:
				return datenstruktur != null;
			case WorkflowModelPackage.DATENOBJEKT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //DatenobjektImpl
