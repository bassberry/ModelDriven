/**
 */
package workflowModel.impl;

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

import workflowModel.Datenobjekt;
import workflowModel.Datenstruktur;
import workflowModel.Workflow;
import workflowModel.WorkflowModelPackage;
import workflowModel.Zustand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflowModel.impl.WorkflowImpl#getZustand <em>Zustand</em>}</li>
 *   <li>{@link workflowModel.impl.WorkflowImpl#getDatenobjekt <em>Datenobjekt</em>}</li>
 *   <li>{@link workflowModel.impl.WorkflowImpl#getDatenstruktur <em>Datenstruktur</em>}</li>
 *   <li>{@link workflowModel.impl.WorkflowImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowImpl extends MinimalEObjectImpl.Container implements Workflow {
	/**
	 * The cached value of the '{@link #getZustand() <em>Zustand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZustand()
	 * @generated
	 * @ordered
	 */
	protected EList<Zustand> zustand;

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
	protected WorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowModelPackage.Literals.WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Zustand> getZustand() {
		if (zustand == null) {
			zustand = new EObjectContainmentEList<Zustand>(Zustand.class, this, WorkflowModelPackage.WORKFLOW__ZUSTAND);
		}
		return zustand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Datenobjekt> getDatenobjekt() {
		if (datenobjekt == null) {
			datenobjekt = new EObjectContainmentEList<Datenobjekt>(Datenobjekt.class, this, WorkflowModelPackage.WORKFLOW__DATENOBJEKT);
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
			datenstruktur = new EObjectContainmentEList<Datenstruktur>(Datenstruktur.class, this, WorkflowModelPackage.WORKFLOW__DATENSTRUKTUR);
		}
		return datenstruktur;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowModelPackage.WORKFLOW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowModelPackage.WORKFLOW__ZUSTAND:
				return ((InternalEList<?>)getZustand()).basicRemove(otherEnd, msgs);
			case WorkflowModelPackage.WORKFLOW__DATENOBJEKT:
				return ((InternalEList<?>)getDatenobjekt()).basicRemove(otherEnd, msgs);
			case WorkflowModelPackage.WORKFLOW__DATENSTRUKTUR:
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
			case WorkflowModelPackage.WORKFLOW__ZUSTAND:
				return getZustand();
			case WorkflowModelPackage.WORKFLOW__DATENOBJEKT:
				return getDatenobjekt();
			case WorkflowModelPackage.WORKFLOW__DATENSTRUKTUR:
				return getDatenstruktur();
			case WorkflowModelPackage.WORKFLOW__NAME:
				return getName();
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
			case WorkflowModelPackage.WORKFLOW__ZUSTAND:
				getZustand().clear();
				getZustand().addAll((Collection<? extends Zustand>)newValue);
				return;
			case WorkflowModelPackage.WORKFLOW__DATENOBJEKT:
				getDatenobjekt().clear();
				getDatenobjekt().addAll((Collection<? extends Datenobjekt>)newValue);
				return;
			case WorkflowModelPackage.WORKFLOW__DATENSTRUKTUR:
				getDatenstruktur().clear();
				getDatenstruktur().addAll((Collection<? extends Datenstruktur>)newValue);
				return;
			case WorkflowModelPackage.WORKFLOW__NAME:
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
			case WorkflowModelPackage.WORKFLOW__ZUSTAND:
				getZustand().clear();
				return;
			case WorkflowModelPackage.WORKFLOW__DATENOBJEKT:
				getDatenobjekt().clear();
				return;
			case WorkflowModelPackage.WORKFLOW__DATENSTRUKTUR:
				getDatenstruktur().clear();
				return;
			case WorkflowModelPackage.WORKFLOW__NAME:
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
			case WorkflowModelPackage.WORKFLOW__ZUSTAND:
				return zustand != null && !zustand.isEmpty();
			case WorkflowModelPackage.WORKFLOW__DATENOBJEKT:
				return datenobjekt != null && !datenobjekt.isEmpty();
			case WorkflowModelPackage.WORKFLOW__DATENSTRUKTUR:
				return datenstruktur != null && !datenstruktur.isEmpty();
			case WorkflowModelPackage.WORKFLOW__NAME:
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

} //WorkflowImpl
