/**
 */
package workflowModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import workflowModel.Attribut;
import workflowModel.WorkflowModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflowModel.impl.AttributImpl#getName <em>Name</em>}</li>
 *   <li>{@link workflowModel.impl.AttributImpl#getDatentyp <em>Datentyp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributImpl extends MinimalEObjectImpl.Container implements Attribut {
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
	 * The default value of the '{@link #getDatentyp() <em>Datentyp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatentyp()
	 * @generated
	 * @ordered
	 */
	protected static final String DATENTYP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatentyp() <em>Datentyp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatentyp()
	 * @generated
	 * @ordered
	 */
	protected String datentyp = DATENTYP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowModelPackage.Literals.ATTRIBUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowModelPackage.ATTRIBUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatentyp() {
		return datentyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatentyp(String newDatentyp) {
		String oldDatentyp = datentyp;
		datentyp = newDatentyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowModelPackage.ATTRIBUT__DATENTYP, oldDatentyp, datentyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowModelPackage.ATTRIBUT__NAME:
				return getName();
			case WorkflowModelPackage.ATTRIBUT__DATENTYP:
				return getDatentyp();
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
			case WorkflowModelPackage.ATTRIBUT__NAME:
				setName((String)newValue);
				return;
			case WorkflowModelPackage.ATTRIBUT__DATENTYP:
				setDatentyp((String)newValue);
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
			case WorkflowModelPackage.ATTRIBUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowModelPackage.ATTRIBUT__DATENTYP:
				setDatentyp(DATENTYP_EDEFAULT);
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
			case WorkflowModelPackage.ATTRIBUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowModelPackage.ATTRIBUT__DATENTYP:
				return DATENTYP_EDEFAULT == null ? datentyp != null : !DATENTYP_EDEFAULT.equals(datentyp);
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
		result.append(", datentyp: ");
		result.append(datentyp);
		result.append(')');
		return result.toString();
	}

} //AttributImpl
