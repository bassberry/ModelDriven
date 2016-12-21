/**
 */
package screenModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import screenModel.ScreenModel;
import screenModel.ScreenModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Screen Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScreenModelTest extends TestCase {

	/**
	 * The fixture for this Screen Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreenModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScreenModelTest.class);
	}

	/**
	 * Constructs a new Screen Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Screen Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ScreenModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Screen Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreenModel getFixture() {
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
		setFixture(ScreenModelFactory.eINSTANCE.createScreenModel());
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

} //ScreenModelTest
