/**
 */
package screenModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import screenModel.Eingabefeld;
import screenModel.ScreenModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Eingabefeld</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EingabefeldTest extends TestCase {

	/**
	 * The fixture for this Eingabefeld test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Eingabefeld fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EingabefeldTest.class);
	}

	/**
	 * Constructs a new Eingabefeld test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EingabefeldTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Eingabefeld test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Eingabefeld fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Eingabefeld test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Eingabefeld getFixture() {
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
		setFixture(ScreenModelFactory.eINSTANCE.createEingabefeld());
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

} //EingabefeldTest
