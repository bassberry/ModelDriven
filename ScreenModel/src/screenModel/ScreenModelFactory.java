/**
 */
package screenModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see screenModel.ScreenModelPackage
 * @generated
 */
public interface ScreenModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScreenModelFactory eINSTANCE = screenModel.impl.ScreenModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Screen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Screen Model</em>'.
	 * @generated
	 */
	ScreenModel createScreenModel();

	/**
	 * Returns a new object of class '<em>Seite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seite</em>'.
	 * @generated
	 */
	Seite createSeite();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	Button createButton();

	/**
	 * Returns a new object of class '<em>Dateneingabe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dateneingabe</em>'.
	 * @generated
	 */
	Dateneingabe createDateneingabe();

	/**
	 * Returns a new object of class '<em>Datenausgabe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datenausgabe</em>'.
	 * @generated
	 */
	Datenausgabe createDatenausgabe();

	/**
	 * Returns a new object of class '<em>Datenobjekt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datenobjekt</em>'.
	 * @generated
	 */
	Datenobjekt createDatenobjekt();

	/**
	 * Returns a new object of class '<em>Datenstruktur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datenstruktur</em>'.
	 * @generated
	 */
	Datenstruktur createDatenstruktur();

	/**
	 * Returns a new object of class '<em>Attribut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribut</em>'.
	 * @generated
	 */
	Attribut createAttribut();

	/**
	 * Returns a new object of class '<em>Datenausgabefeld</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datenausgabefeld</em>'.
	 * @generated
	 */
	Datenausgabefeld createDatenausgabefeld();

	/**
	 * Returns a new object of class '<em>Textfeld</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Textfeld</em>'.
	 * @generated
	 */
	Textfeld createTextfeld();

	/**
	 * Returns a new object of class '<em>Eingabefeld</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eingabefeld</em>'.
	 * @generated
	 */
	Eingabefeld createEingabefeld();

	/**
	 * Returns a new object of class '<em>Dateneingabefeld</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dateneingabefeld</em>'.
	 * @generated
	 */
	Dateneingabefeld createDateneingabefeld();

	/**
	 * Returns a new object of class '<em>Ausgabefeld</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ausgabefeld</em>'.
	 * @generated
	 */
	Ausgabefeld createAusgabefeld();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScreenModelPackage getScreenModelPackage();

} //ScreenModelFactory
