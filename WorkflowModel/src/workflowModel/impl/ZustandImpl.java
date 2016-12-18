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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import workflowModel.Datenobjekt;
import workflowModel.Uebergang;
import workflowModel.WorkflowModelPackage;
import workflowModel.Zustand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zustand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflowModel.impl.ZustandImpl#getUebergang <em>Uebergang</em>}</li>
 *   <li>{@link workflowModel.impl.ZustandImpl#getPageName <em>Page Name</em>}</li>
 *   <li>{@link workflowModel.impl.ZustandImpl#getDatenobjektEingabe <em>Datenobjekt Eingabe</em>}</li>
 *   <li>{@link workflowModel.impl.ZustandImpl#getDatenobjektAusgabe <em>Datenobjekt Ausgabe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZustandImpl extends MinimalEObjectImpl.Container implements Zustand {
	/**
	 * The cached value of the '{@link #getUebergang() <em>Uebergang</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUebergang()
	 * @generated
	 * @ordered
	 */
	protected Uebergang uebergang;

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
	 * The cached value of the '{@link #getDatenobjektEingabe() <em>Datenobjekt Eingabe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenobjektEingabe()
	 * @generated
	 * @ordered
	 */
	protected Datenobjekt datenobjektEingabe;

	/**
	 * The cached value of the '{@link #getDatenobjektAusgabe() <em>Datenobjekt Ausgabe</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenobjektAusgabe()
	 * @generated
	 * @ordered
	 */
	protected EList<Datenobjekt> datenobjektAusgabe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZustandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowModelPackage.Literals.ZUSTAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uebergang getUebergang() {
		return uebergang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUebergang(Uebergang newUebergang, NotificationChain msgs) {
		Uebergang oldUebergang = uebergang;
		uebergang = newUebergang;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowModelPackage.ZUSTAND__UEBERGANG, oldUebergang, newUebergang);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUebergang(Uebergang newUebergang) {
		if (newUebergang != uebergang) {
			NotificationChain msgs = null;
			if (uebergang != null)
				msgs = ((InternalEObject)uebergang).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkflowModelPackage.ZUSTAND__UEBERGANG, null, msgs);
			if (newUebergang != null)
				msgs = ((InternalEObject)newUebergang).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkflowModelPackage.ZUSTAND__UEBERGANG, null, msgs);
			msgs = basicSetUebergang(newUebergang, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowModelPackage.ZUSTAND__UEBERGANG, newUebergang, newUebergang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowModelPackage.ZUSTAND__PAGE_NAME, oldPageName, pageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datenobjekt getDatenobjektEingabe() {
		if (datenobjektEingabe != null && datenobjektEingabe.eIsProxy()) {
			InternalEObject oldDatenobjektEingabe = (InternalEObject)datenobjektEingabe;
			datenobjektEingabe = (Datenobjekt)eResolveProxy(oldDatenobjektEingabe);
			if (datenobjektEingabe != oldDatenobjektEingabe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowModelPackage.ZUSTAND__DATENOBJEKT_EINGABE, oldDatenobjektEingabe, datenobjektEingabe));
			}
		}
		return datenobjektEingabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datenobjekt basicGetDatenobjektEingabe() {
		return datenobjektEingabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatenobjektEingabe(Datenobjekt newDatenobjektEingabe) {
		Datenobjekt oldDatenobjektEingabe = datenobjektEingabe;
		datenobjektEingabe = newDatenobjektEingabe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowModelPackage.ZUSTAND__DATENOBJEKT_EINGABE, oldDatenobjektEingabe, datenobjektEingabe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Datenobjekt> getDatenobjektAusgabe() {
		if (datenobjektAusgabe == null) {
			datenobjektAusgabe = new EObjectResolvingEList<Datenobjekt>(Datenobjekt.class, this, WorkflowModelPackage.ZUSTAND__DATENOBJEKT_AUSGABE);
		}
		return datenobjektAusgabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowModelPackage.ZUSTAND__UEBERGANG:
				return basicSetUebergang(null, msgs);
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
			case WorkflowModelPackage.ZUSTAND__UEBERGANG:
				return getUebergang();
			case WorkflowModelPackage.ZUSTAND__PAGE_NAME:
				return getPageName();
			case WorkflowModelPackage.ZUSTAND__DATENOBJEKT_EINGABE:
				if (resolve) return getDatenobjektEingabe();
				return basicGetDatenobjektEingabe();
			case WorkflowModelPackage.ZUSTAND__DATENOBJEKT_AUSGABE:
				return getDatenobjektAusgabe();
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
			case WorkflowModelPackage.ZUSTAND__UEBERGANG:
				setUebergang((Uebergang)newValue);
				return;
			case WorkflowModelPackage.ZUSTAND__PAGE_NAME:
				setPageName((String)newValue);
				return;
			case WorkflowModelPackage.ZUSTAND__DATENOBJEKT_EINGABE:
				setDatenobjektEingabe((Datenobjekt)newValue);
				return;
			case WorkflowModelPackage.ZUSTAND__DATENOBJEKT_AUSGABE:
				getDatenobjektAusgabe().clear();
				getDatenobjektAusgabe().addAll((Collection<? extends Datenobjekt>)newValue);
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
			case WorkflowModelPackage.ZUSTAND__UEBERGANG:
				setUebergang((Uebergang)null);
				return;
			case WorkflowModelPackage.ZUSTAND__PAGE_NAME:
				setPageName(PAGE_NAME_EDEFAULT);
				return;
			case WorkflowModelPackage.ZUSTAND__DATENOBJEKT_EINGABE:
				setDatenobjektEingabe((Datenobjekt)null);
				return;
			case WorkflowModelPackage.ZUSTAND__DATENOBJEKT_AUSGABE:
				getDatenobjektAusgabe().clear();
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
			case WorkflowModelPackage.ZUSTAND__UEBERGANG:
				return uebergang != null;
			case WorkflowModelPackage.ZUSTAND__PAGE_NAME:
				return PAGE_NAME_EDEFAULT == null ? pageName != null : !PAGE_NAME_EDEFAULT.equals(pageName);
			case WorkflowModelPackage.ZUSTAND__DATENOBJEKT_EINGABE:
				return datenobjektEingabe != null;
			case WorkflowModelPackage.ZUSTAND__DATENOBJEKT_AUSGABE:
				return datenobjektAusgabe != null && !datenobjektAusgabe.isEmpty();
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

} //ZustandImpl
