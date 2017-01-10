/**
 */
package workflowModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import workflowModel.Uebergang;
import workflowModel.WorkflowModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Uebergang</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UebergangTest extends TestCase {

	/**
	 * The fixture for this Uebergang test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Uebergang fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UebergangTest.class);
	}

	/**
	 * Constructs a new Uebergang test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UebergangTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Uebergang test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Uebergang fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Uebergang test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Uebergang getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WorkflowModelFactory.eINSTANCE.createUebergang());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UebergangTest
