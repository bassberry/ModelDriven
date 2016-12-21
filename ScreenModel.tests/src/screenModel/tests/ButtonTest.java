/**
 */
package screenModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import screenModel.Button;
import screenModel.ScreenModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ButtonTest extends TestCase {

	/**
	 * The fixture for this Button test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Button fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ButtonTest.class);
	}

	/**
	 * Constructs a new Button test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Button test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Button fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Button test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Button getFixture() {
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
		setFixture(ScreenModelFactory.eINSTANCE.createButton());
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

} //ButtonTest
