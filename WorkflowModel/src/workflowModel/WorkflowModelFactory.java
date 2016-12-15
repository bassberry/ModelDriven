/**
 */
package workflowModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see workflowModel.WorkflowModelPackage
 * @generated
 */
public interface WorkflowModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowModelFactory eINSTANCE = workflowModel.impl.WorkflowModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow</em>'.
	 * @generated
	 */
	Workflow createWorkflow();

	/**
	 * Returns a new object of class '<em>Zustand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zustand</em>'.
	 * @generated
	 */
	Zustand createZustand();

	/**
	 * Returns a new object of class '<em>Übergang</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Übergang</em>'.
	 * @generated
	 */
	Übergang createÜbergang();

	/**
	 * Returns a new object of class '<em>Datenobjekt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datenobjekt</em>'.
	 * @generated
	 */
	Datenobjekt createDatenobjekt();

	/**
	 * Returns a new object of class '<em>Datenstruktur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datenstruktur</em>'.
	 * @generated
	 */
	Datenstruktur createDatenstruktur();

	/**
	 * Returns a new object of class '<em>Attribut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribut</em>'.
	 * @generated
	 */
	Attribut createAttribut();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WorkflowModelPackage getWorkflowModelPackage();

} //WorkflowModelFactory
