/**
 */
package screenModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import screenModel.Datenobjekt;
import screenModel.ScreenModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Datenobjekt</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatenobjektTest extends TestCase {

	/**
	 * The fixture for this Datenobjekt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Datenobjekt fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatenobjektTest.class);
	}

	/**
	 * Constructs a new Datenobjekt test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatenobjektTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Datenobjekt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Datenobjekt fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Datenobjekt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Datenobjekt getFixture() {
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
		setFixture(ScreenModelFactory.eINSTANCE.createDatenobjekt());
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

} //DatenobjektTest
