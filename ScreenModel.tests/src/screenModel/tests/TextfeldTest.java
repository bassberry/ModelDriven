/**
 */
package screenModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import screenModel.ScreenModelFactory;
import screenModel.Textfeld;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Textfeld</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextfeldTest extends TestCase {

	/**
	 * The fixture for this Textfeld test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Textfeld fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextfeldTest.class);
	}

	/**
	 * Constructs a new Textfeld test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextfeldTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Textfeld test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Textfeld fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Textfeld test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Textfeld getFixture() {
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
		setFixture(ScreenModelFactory.eINSTANCE.createTextfeld());
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

} //TextfeldTest
