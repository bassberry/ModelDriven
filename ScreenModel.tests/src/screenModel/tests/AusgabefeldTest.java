/**
 */
package screenModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import screenModel.Ausgabefeld;
import screenModel.ScreenModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ausgabefeld</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AusgabefeldTest extends TestCase {

	/**
	 * The fixture for this Ausgabefeld test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ausgabefeld fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AusgabefeldTest.class);
	}

	/**
	 * Constructs a new Ausgabefeld test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AusgabefeldTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ausgabefeld test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Ausgabefeld fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ausgabefeld test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ausgabefeld getFixture() {
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
		setFixture(ScreenModelFactory.eINSTANCE.createAusgabefeld());
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

} //AusgabefeldTest
