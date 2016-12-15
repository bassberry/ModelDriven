/**
 */
package workflowModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import workflowModel.WorkflowModelPackage;
import workflowModel.Zustand;
import workflowModel.Übergang;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Übergang</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflowModel.impl.ÜbergangImpl#getZustand <em>Zustand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ÜbergangImpl extends MinimalEObjectImpl.Container implements Übergang {
	/**
	 * The cached value of the '{@link #getZustand() <em>Zustand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZustand()
	 * @generated
	 * @ordered
	 */
	protected Zustand zustand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ÜbergangImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowModelPackage.Literals.ÜBERGANG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zustand getZustand() {
		if (zustand != null && zustand.eIsProxy()) {
			InternalEObject oldZustand = (InternalEObject)zustand;
			zustand = (Zustand)eResolveProxy(oldZustand);
			if (zustand != oldZustand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowModelPackage.ÜBERGANG__ZUSTAND, oldZustand, zustand));
			}
		}
		return zustand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zustand basicGetZustand() {
		return zustand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZustand(Zustand newZustand) {
		Zustand oldZustand = zustand;
		zustand = newZustand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowModelPackage.ÜBERGANG__ZUSTAND, oldZustand, zustand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowModelPackage.ÜBERGANG__ZUSTAND:
				if (resolve) return getZustand();
				return basicGetZustand();
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
			case WorkflowModelPackage.ÜBERGANG__ZUSTAND:
				setZustand((Zustand)newValue);
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
			case WorkflowModelPackage.ÜBERGANG__ZUSTAND:
				setZustand((Zustand)null);
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
			case WorkflowModelPackage.ÜBERGANG__ZUSTAND:
				return zustand != null;
		}
		return super.eIsSet(featureID);
	}

} //ÜbergangImpl
