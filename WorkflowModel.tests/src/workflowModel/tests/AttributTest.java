/**
 */
package workflowModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import workflowModel.Attribut;
import workflowModel.WorkflowModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribut</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributTest extends TestCase {

	/**
	 * The fixture for this Attribut test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attribut fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributTest.class);
	}

	/**
	 * Constructs a new Attribut test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Attribut test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Attribut fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Attribut test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attribut getFixture() {
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
		setFixture(WorkflowModelFactory.eINSTANCE.createAttribut());
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

} //AttributTest
