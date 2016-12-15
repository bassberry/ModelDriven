/**
 */
package workflowModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import workflowModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowModelFactoryImpl extends EFactoryImpl implements WorkflowModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkflowModelFactory init() {
		try {
			WorkflowModelFactory theWorkflowModelFactory = (WorkflowModelFactory)EPackage.Registry.INSTANCE.getEFactory(WorkflowModelPackage.eNS_URI);
			if (theWorkflowModelFactory != null) {
				return theWorkflowModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkflowModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WorkflowModelPackage.WORKFLOW: return createWorkflow();
			case WorkflowModelPackage.ZUSTAND: return createZustand();
			case WorkflowModelPackage.ÜBERGANG: return createÜbergang();
			case WorkflowModelPackage.DATENOBJEKT: return createDatenobjekt();
			case WorkflowModelPackage.DATENSTRUKTUR: return createDatenstruktur();
			case WorkflowModelPackage.ATTRIBUT: return createAttribut();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zustand createZustand() {
		ZustandImpl zustand = new ZustandImpl();
		return zustand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Übergang createÜbergang() {
		ÜbergangImpl übergang = new ÜbergangImpl();
		return übergang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datenobjekt createDatenobjekt() {
		DatenobjektImpl datenobjekt = new DatenobjektImpl();
		return datenobjekt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datenstruktur createDatenstruktur() {
		DatenstrukturImpl datenstruktur = new DatenstrukturImpl();
		return datenstruktur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribut createAttribut() {
		AttributImpl attribut = new AttributImpl();
		return attribut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowModelPackage getWorkflowModelPackage() {
		return (WorkflowModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkflowModelPackage getPackage() {
		return WorkflowModelPackage.eINSTANCE;
	}

} //WorkflowModelFactoryImpl
