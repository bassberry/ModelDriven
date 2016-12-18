/**
 */
package workflowModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see workflowModel.WorkflowModelFactory
 * @model kind="package"
 * @generated
 */
public interface WorkflowModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workflowModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "workflowModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workflowModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowModelPackage eINSTANCE = workflowModel.impl.WorkflowModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link workflowModel.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflowModel.impl.WorkflowImpl
	 * @see workflowModel.impl.WorkflowModelPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 0;

	/**
	 * The feature id for the '<em><b>Zustand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ZUSTAND = 0;

	/**
	 * The feature id for the '<em><b>Datenobjekt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__DATENOBJEKT = 1;

	/**
	 * The feature id for the '<em><b>Datenstruktur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__DATENSTRUKTUR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = 3;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link workflowModel.impl.ZustandImpl <em>Zustand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflowModel.impl.ZustandImpl
	 * @see workflowModel.impl.WorkflowModelPackageImpl#getZustand()
	 * @generated
	 */
	int ZUSTAND = 1;

	/**
	 * The feature id for the '<em><b>Uebergang</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSTAND__UEBERGANG = 0;

	/**
	 * The feature id for the '<em><b>Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSTAND__PAGE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Datenobjekt Eingabe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSTAND__DATENOBJEKT_EINGABE = 2;

	/**
	 * The feature id for the '<em><b>Datenobjekt Ausgabe</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSTAND__DATENOBJEKT_AUSGABE = 3;

	/**
	 * The number of structural features of the '<em>Zustand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSTAND_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Zustand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSTAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link workflowModel.impl.UebergangImpl <em>Uebergang</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflowModel.impl.UebergangImpl
	 * @see workflowModel.impl.WorkflowModelPackageImpl#getUebergang()
	 * @generated
	 */
	int UEBERGANG = 2;

	/**
	 * The feature id for the '<em><b>Zustand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERGANG__ZUSTAND = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERGANG__NAME = 1;

	/**
	 * The number of structural features of the '<em>Uebergang</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERGANG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Uebergang</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERGANG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link workflowModel.impl.DatenobjektImpl <em>Datenobjekt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflowModel.impl.DatenobjektImpl
	 * @see workflowModel.impl.WorkflowModelPackageImpl#getDatenobjekt()
	 * @generated
	 */
	int DATENOBJEKT = 3;

	/**
	 * The feature id for the '<em><b>Datenstruktur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENOBJEKT__DATENSTRUKTUR = 0;

	/**
	 * The number of structural features of the '<em>Datenobjekt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENOBJEKT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Datenobjekt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENOBJEKT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link workflowModel.impl.DatenstrukturImpl <em>Datenstruktur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflowModel.impl.DatenstrukturImpl
	 * @see workflowModel.impl.WorkflowModelPackageImpl#getDatenstruktur()
	 * @generated
	 */
	int DATENSTRUKTUR = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSTRUKTUR__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSTRUKTUR__NAME = 1;

	/**
	 * The number of structural features of the '<em>Datenstruktur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSTRUKTUR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Datenstruktur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSTRUKTUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link workflowModel.impl.AttributImpl <em>Attribut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflowModel.impl.AttributImpl
	 * @see workflowModel.impl.WorkflowModelPackageImpl#getAttribut()
	 * @generated
	 */
	int ATTRIBUT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Datentyp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT__DATENTYP = 1;

	/**
	 * The number of structural features of the '<em>Attribut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link workflowModel.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see workflowModel.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the containment reference list '{@link workflowModel.Workflow#getZustand <em>Zustand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zustand</em>'.
	 * @see workflowModel.Workflow#getZustand()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Zustand();

	/**
	 * Returns the meta object for the containment reference list '{@link workflowModel.Workflow#getDatenobjekt <em>Datenobjekt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datenobjekt</em>'.
	 * @see workflowModel.Workflow#getDatenobjekt()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Datenobjekt();

	/**
	 * Returns the meta object for the containment reference list '{@link workflowModel.Workflow#getDatenstruktur <em>Datenstruktur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datenstruktur</em>'.
	 * @see workflowModel.Workflow#getDatenstruktur()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Datenstruktur();

	/**
	 * Returns the meta object for the attribute '{@link workflowModel.Workflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflowModel.Workflow#getName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Name();

	/**
	 * Returns the meta object for class '{@link workflowModel.Zustand <em>Zustand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zustand</em>'.
	 * @see workflowModel.Zustand
	 * @generated
	 */
	EClass getZustand();

	/**
	 * Returns the meta object for the containment reference '{@link workflowModel.Zustand#getUebergang <em>Uebergang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uebergang</em>'.
	 * @see workflowModel.Zustand#getUebergang()
	 * @see #getZustand()
	 * @generated
	 */
	EReference getZustand_Uebergang();

	/**
	 * Returns the meta object for the attribute '{@link workflowModel.Zustand#getPageName <em>Page Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Name</em>'.
	 * @see workflowModel.Zustand#getPageName()
	 * @see #getZustand()
	 * @generated
	 */
	EAttribute getZustand_PageName();

	/**
	 * Returns the meta object for the reference '{@link workflowModel.Zustand#getDatenobjektEingabe <em>Datenobjekt Eingabe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datenobjekt Eingabe</em>'.
	 * @see workflowModel.Zustand#getDatenobjektEingabe()
	 * @see #getZustand()
	 * @generated
	 */
	EReference getZustand_DatenobjektEingabe();

	/**
	 * Returns the meta object for the reference list '{@link workflowModel.Zustand#getDatenobjektAusgabe <em>Datenobjekt Ausgabe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Datenobjekt Ausgabe</em>'.
	 * @see workflowModel.Zustand#getDatenobjektAusgabe()
	 * @see #getZustand()
	 * @generated
	 */
	EReference getZustand_DatenobjektAusgabe();

	/**
	 * Returns the meta object for class '{@link workflowModel.Uebergang <em>Uebergang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uebergang</em>'.
	 * @see workflowModel.Uebergang
	 * @generated
	 */
	EClass getUebergang();

	/**
	 * Returns the meta object for the reference '{@link workflowModel.Uebergang#getZustand <em>Zustand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zustand</em>'.
	 * @see workflowModel.Uebergang#getZustand()
	 * @see #getUebergang()
	 * @generated
	 */
	EReference getUebergang_Zustand();

	/**
	 * Returns the meta object for the attribute '{@link workflowModel.Uebergang#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflowModel.Uebergang#getName()
	 * @see #getUebergang()
	 * @generated
	 */
	EAttribute getUebergang_Name();

	/**
	 * Returns the meta object for class '{@link workflowModel.Datenobjekt <em>Datenobjekt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datenobjekt</em>'.
	 * @see workflowModel.Datenobjekt
	 * @generated
	 */
	EClass getDatenobjekt();

	/**
	 * Returns the meta object for the reference '{@link workflowModel.Datenobjekt#getDatenstruktur <em>Datenstruktur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datenstruktur</em>'.
	 * @see workflowModel.Datenobjekt#getDatenstruktur()
	 * @see #getDatenobjekt()
	 * @generated
	 */
	EReference getDatenobjekt_Datenstruktur();

	/**
	 * Returns the meta object for class '{@link workflowModel.Datenstruktur <em>Datenstruktur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datenstruktur</em>'.
	 * @see workflowModel.Datenstruktur
	 * @generated
	 */
	EClass getDatenstruktur();

	/**
	 * Returns the meta object for the containment reference list '{@link workflowModel.Datenstruktur#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see workflowModel.Datenstruktur#getAttribute()
	 * @see #getDatenstruktur()
	 * @generated
	 */
	EReference getDatenstruktur_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link workflowModel.Datenstruktur#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflowModel.Datenstruktur#getName()
	 * @see #getDatenstruktur()
	 * @generated
	 */
	EAttribute getDatenstruktur_Name();

	/**
	 * Returns the meta object for class '{@link workflowModel.Attribut <em>Attribut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribut</em>'.
	 * @see workflowModel.Attribut
	 * @generated
	 */
	EClass getAttribut();

	/**
	 * Returns the meta object for the attribute '{@link workflowModel.Attribut#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflowModel.Attribut#getName()
	 * @see #getAttribut()
	 * @generated
	 */
	EAttribute getAttribut_Name();

	/**
	 * Returns the meta object for the attribute '{@link workflowModel.Attribut#getDatentyp <em>Datentyp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datentyp</em>'.
	 * @see workflowModel.Attribut#getDatentyp()
	 * @see #getAttribut()
	 * @generated
	 */
	EAttribute getAttribut_Datentyp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkflowModelFactory getWorkflowModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link workflowModel.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflowModel.impl.WorkflowImpl
		 * @see workflowModel.impl.WorkflowModelPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Zustand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__ZUSTAND = eINSTANCE.getWorkflow_Zustand();

		/**
		 * The meta object literal for the '<em><b>Datenobjekt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__DATENOBJEKT = eINSTANCE.getWorkflow_Datenobjekt();

		/**
		 * The meta object literal for the '<em><b>Datenstruktur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__DATENSTRUKTUR = eINSTANCE.getWorkflow_Datenstruktur();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__NAME = eINSTANCE.getWorkflow_Name();

		/**
		 * The meta object literal for the '{@link workflowModel.impl.ZustandImpl <em>Zustand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflowModel.impl.ZustandImpl
		 * @see workflowModel.impl.WorkflowModelPackageImpl#getZustand()
		 * @generated
		 */
		EClass ZUSTAND = eINSTANCE.getZustand();

		/**
		 * The meta object literal for the '<em><b>Uebergang</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUSTAND__UEBERGANG = eINSTANCE.getZustand_Uebergang();

		/**
		 * The meta object literal for the '<em><b>Page Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUSTAND__PAGE_NAME = eINSTANCE.getZustand_PageName();

		/**
		 * The meta object literal for the '<em><b>Datenobjekt Eingabe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUSTAND__DATENOBJEKT_EINGABE = eINSTANCE.getZustand_DatenobjektEingabe();

		/**
		 * The meta object literal for the '<em><b>Datenobjekt Ausgabe</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUSTAND__DATENOBJEKT_AUSGABE = eINSTANCE.getZustand_DatenobjektAusgabe();

		/**
		 * The meta object literal for the '{@link workflowModel.impl.UebergangImpl <em>Uebergang</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflowModel.impl.UebergangImpl
		 * @see workflowModel.impl.WorkflowModelPackageImpl#getUebergang()
		 * @generated
		 */
		EClass UEBERGANG = eINSTANCE.getUebergang();

		/**
		 * The meta object literal for the '<em><b>Zustand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UEBERGANG__ZUSTAND = eINSTANCE.getUebergang_Zustand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UEBERGANG__NAME = eINSTANCE.getUebergang_Name();

		/**
		 * The meta object literal for the '{@link workflowModel.impl.DatenobjektImpl <em>Datenobjekt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflowModel.impl.DatenobjektImpl
		 * @see workflowModel.impl.WorkflowModelPackageImpl#getDatenobjekt()
		 * @generated
		 */
		EClass DATENOBJEKT = eINSTANCE.getDatenobjekt();

		/**
		 * The meta object literal for the '<em><b>Datenstruktur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATENOBJEKT__DATENSTRUKTUR = eINSTANCE.getDatenobjekt_Datenstruktur();

		/**
		 * The meta object literal for the '{@link workflowModel.impl.DatenstrukturImpl <em>Datenstruktur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflowModel.impl.DatenstrukturImpl
		 * @see workflowModel.impl.WorkflowModelPackageImpl#getDatenstruktur()
		 * @generated
		 */
		EClass DATENSTRUKTUR = eINSTANCE.getDatenstruktur();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATENSTRUKTUR__ATTRIBUTE = eINSTANCE.getDatenstruktur_Attribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATENSTRUKTUR__NAME = eINSTANCE.getDatenstruktur_Name();

		/**
		 * The meta object literal for the '{@link workflowModel.impl.AttributImpl <em>Attribut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflowModel.impl.AttributImpl
		 * @see workflowModel.impl.WorkflowModelPackageImpl#getAttribut()
		 * @generated
		 */
		EClass ATTRIBUT = eINSTANCE.getAttribut();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUT__NAME = eINSTANCE.getAttribut_Name();

		/**
		 * The meta object literal for the '<em><b>Datentyp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUT__DATENTYP = eINSTANCE.getAttribut_Datentyp();

	}

} //WorkflowModelPackage
