/**
 */
package workflowModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import workflowModel.WorkflowModelFactory;
import workflowModel.Zustand;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Zustand</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZustandTest extends TestCase {

	/**
	 * The fixture for this Zustand test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Zustand fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ZustandTest.class);
	}

	/**
	 * Constructs a new Zustand test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZustandTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Zustand test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Zustand fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Zustand test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Zustand getFixture() {
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
		setFixture(WorkflowModelFactory.eINSTANCE.createZustand());
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

} //ZustandTest
