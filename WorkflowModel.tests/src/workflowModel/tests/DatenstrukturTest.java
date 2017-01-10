/**
 */
package workflowModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import workflowModel.Datenstruktur;
import workflowModel.WorkflowModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Datenstruktur</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatenstrukturTest extends TestCase {

	/**
	 * The fixture for this Datenstruktur test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Datenstruktur fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatenstrukturTest.class);
	}

	/**
	 * Constructs a new Datenstruktur test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatenstrukturTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Datenstruktur test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Datenstruktur fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Datenstruktur test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Datenstruktur getFixture() {
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
		setFixture(WorkflowModelFactory.eINSTANCE.createDatenstruktur());
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

} //DatenstrukturTest
