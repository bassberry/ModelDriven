/**
 */
package screenModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see screenModel.ScreenModelFactory
 * @model kind="package"
 * @generated
 */
public interface ScreenModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "screenModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "screenModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "screenModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScreenModelPackage eINSTANCE = screenModel.impl.ScreenModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link screenModel.impl.ScreenModelImpl <em>Screen Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see screenModel.impl.ScreenModelImpl
	 * @see screenModel.impl.ScreenModelPackageImpl#getScreenModel()
	 * @generated
	 */
	int SCREEN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Seite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_MODEL__SEITE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_MODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Datenobjekt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_MODEL__DATENOBJEKT = 2;

	/**
	 * The feature id for the '<em><b>Datenstruktur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_MODEL__DATENSTRUKTUR = 3;

	/**
	 * The number of structural features of the '<em>Screen Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Screen Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link screenModel.impl.SeiteImpl <em>Seite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see screenModel.impl.SeiteImpl
	 * @see screenModel.impl.ScreenModelPackageImpl#getSeite()
	 * @generated
	 */
	int SEITE = 1;

	/**
	 * The feature id for the '<em><b>Button</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEITE__BUTTON = 0;

	/**
	 * The feature id for the '<em><b>Dateneingabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEITE__DATENEINGABE = 1;

	/**
	 * The feature id for the '<em><b>Datenausgabe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEITE__DATENAUSGABE = 2;

	/**
	 * The feature id for the '<em><b>Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEITE__PAGE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Seite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEITE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Seite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link screenModel.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see screenModel.impl.ButtonImpl
	 * @see screenModel.impl.ScreenModelPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 2;

	/**
	 * The feature id for the '<em><b>Seite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__SEITE = 0;

	/**
	 * The feature id for the '<em><b>Display Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__DISPLAY_TEXT = 1;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link screenModel.impl.DateneingabeImpl <em>Dateneingabe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see screenModel.impl.DateneingabeImpl
	 * @see screenModel.impl.ScreenModelPackageImpl#getDateneingabe()
	 * @generated
	 */
	int DATENEINGABE = 3;

	/**
	 * The feature id for the '<em><b>Datenobjekt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENEINGABE__DATENOBJEKT = 0;

	/**
	 * The feature id for the '<em><b>Dateneingabefeld</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENEINGABE__DATENEINGABEFELD = 1;

	/**
	 * The number of structural features of the '<em>Dateneingabe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENEINGABE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dateneingabe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENEINGABE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link screenModel.impl.DatenausgabeImpl <em>Datenausgabe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see screenModel.impl.DatenausgabeImpl
	 * @see screenModel.impl.ScreenModelPackageImpl#getDatenausgabe()
	 * @generated
	 */
	int DATENAUSGABE = 4;

	/**
	 * The feature id for the '<em><b>Datenobjekt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENAUSGABE__DATENOBJEKT = 0;

	/**
	 * The feature id for the '<em><b>Datenausgabefeld</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENAUSGABE__DATENAUSGABEFELD = 1;

	/**
	 * The number of structural features of the '<em>Datenausgabe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENAUSGABE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Datenausgabe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENAUSGABE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link screenModel.impl.DatenobjektImpl <em>Datenobjekt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see screenModel.impl.DatenobjektImpl
	 * @see screenModel.impl.ScreenModelPackageImpl#getDatenobjekt()
	 * @generated
	 */
	int DATENOBJEKT = 5;

	/**
	 * The feature id for the '<em><b>Datenstruktur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENOBJEKT__DATENSTRUKTUR = 0;

	/**
	 * The number of structural features of the '<em>Datenobjekt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENOBJEKT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Datenobjekt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENOBJEKT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link screenModel.impl.DatenstrukturImpl <em>Datenstruktur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see screenModel.impl.DatenstrukturImpl
	 * @see screenModel.impl.ScreenModelPackageImpl#getDatenstruktur()
	 * @generated
	 */
	int DATENSTRUKTUR = 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSTRUKTUR__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSTRUKTUR__NAME = 1;

	/**
	 * The number of structural features of the '<em>Datenstruktur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSTRUKTUR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Datenstruktur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSTRUKTUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link screenModel.impl.AttributImpl <em>Attribut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see screenModel.impl.AttributImpl
	 * @see screenModel.impl.ScreenModelPackageImpl#getAttribut()
	 * @generated
	 */
	int ATTRIBUT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Datentyp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT__DATENTYP = 1;

	/**
	 * The number of structural features of the '<em>Attribut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link screenModel.impl.DatenausgabefeldImpl <em>Datenausgabefeld</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see screenModel.impl.DatenausgabefeldImpl
	 * @see screenModel.impl.ScreenModelPackageImpl#getDatenausgabefeld()
	 * @generated
	 */
	int DATENAUSGABEFELD = 8;

	/**
	 * The feature id for the '<em><b>Textfeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENAUSGABEFELD__TEXTFELD = 0;

	/**
	 * The feature id for the '<em><b>Ausgabefeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENAUSGABEFELD__AUSGABEFELD = 1;

	/**
	 * The number of structural features of the '<em>Datenausgabefeld</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENAUSGABEFELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Datenausgabefeld</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENAUSGABEFELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link screenModel.impl.TextfeldImpl <em>Textfeld</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see screenModel.impl.TextfeldImpl
	 * @see screenModel.impl.ScreenModelPackageImpl#getTextfeld()
	 * @generated
	 */
	int TEXTFELD = 9;

	/**
	 * The feature id for the '<em><b>Display Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTFELD__DISPLAY_TEXT = 0;

	/**
	 * The number of structural features of the '<em>Textfeld</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTFELD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Textfeld</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTFELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link screenModel.impl.EingabefeldImpl <em>Eingabefeld</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see screenModel.impl.EingabefeldImpl
	 * @see screenModel.impl.ScreenModelPackageImpl#getEingabefeld()
	 * @generated
	 */
	int EINGABEFELD = 10;

	/**
	 * The feature id for the '<em><b>Attribut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINGABEFELD__ATTRIBUT = 0;

	/**
	 * The feature id for the '<em><b>Input Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINGABEFELD__INPUT_TEXT = 1;

	/**
	 * The number of structural features of the '<em>Eingabefeld</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINGABEFELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Eingabefeld</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINGABEFELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link screenModel.impl.DateneingabefeldImpl <em>Dateneingabefeld</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see screenModel.impl.DateneingabefeldImpl
	 * @see screenModel.impl.ScreenModelPackageImpl#getDateneingabefeld()
	 * @generated
	 */
	int DATENEINGABEFELD = 11;

	/**
	 * The feature id for the '<em><b>Eingabefeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENEINGABEFELD__EINGABEFELD = 0;

	/**
	 * The feature id for the '<em><b>Textfeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENEINGABEFELD__TEXTFELD = 1;

	/**
	 * The number of structural features of the '<em>Dateneingabefeld</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENEINGABEFELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dateneingabefeld</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENEINGABEFELD_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link screenModel.impl.AusgabefeldImpl <em>Ausgabefeld</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see screenModel.impl.AusgabefeldImpl
	 * @see screenModel.impl.ScreenModelPackageImpl#getAusgabefeld()
	 * @generated
	 */
	int AUSGABEFELD = 12;

	/**
	 * The feature id for the '<em><b>Attribut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSGABEFELD__ATTRIBUT = 0;

	/**
	 * The feature id for the '<em><b>Display Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSGABEFELD__DISPLAY_TEXT = 1;

	/**
	 * The number of structural features of the '<em>Ausgabefeld</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSGABEFELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ausgabefeld</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSGABEFELD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link screenModel.ScreenModel <em>Screen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen Model</em>'.
	 * @see screenModel.ScreenModel
	 * @generated
	 */
	EClass getScreenModel();

	/**
	 * Returns the meta object for the containment reference list '{@link screenModel.ScreenModel#getSeite <em>Seite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seite</em>'.
	 * @see screenModel.ScreenModel#getSeite()
	 * @see #getScreenModel()
	 * @generated
	 */
	EReference getScreenModel_Seite();

	/**
	 * Returns the meta object for the attribute '{@link screenModel.ScreenModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see screenModel.ScreenModel#getName()
	 * @see #getScreenModel()
	 * @generated
	 */
	EAttribute getScreenModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link screenModel.ScreenModel#getDatenobjekt <em>Datenobjekt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datenobjekt</em>'.
	 * @see screenModel.ScreenModel#getDatenobjekt()
	 * @see #getScreenModel()
	 * @generated
	 */
	EReference getScreenModel_Datenobjekt();

	/**
	 * Returns the meta object for the containment reference list '{@link screenModel.ScreenModel#getDatenstruktur <em>Datenstruktur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datenstruktur</em>'.
	 * @see screenModel.ScreenModel#getDatenstruktur()
	 * @see #getScreenModel()
	 * @generated
	 */
	EReference getScreenModel_Datenstruktur();

	/**
	 * Returns the meta object for class '{@link screenModel.Seite <em>Seite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seite</em>'.
	 * @see screenModel.Seite
	 * @generated
	 */
	EClass getSeite();

	/**
	 * Returns the meta object for the containment reference '{@link screenModel.Seite#getButton <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Button</em>'.
	 * @see screenModel.Seite#getButton()
	 * @see #getSeite()
	 * @generated
	 */
	EReference getSeite_Button();

	/**
	 * Returns the meta object for the containment reference '{@link screenModel.Seite#getDateneingabe <em>Dateneingabe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dateneingabe</em>'.
	 * @see screenModel.Seite#getDateneingabe()
	 * @see #getSeite()
	 * @generated
	 */
	EReference getSeite_Dateneingabe();

	/**
	 * Returns the meta object for the containment reference list '{@link screenModel.Seite#getDatenausgabe <em>Datenausgabe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datenausgabe</em>'.
	 * @see screenModel.Seite#getDatenausgabe()
	 * @see #getSeite()
	 * @generated
	 */
	EReference getSeite_Datenausgabe();

	/**
	 * Returns the meta object for the attribute '{@link screenModel.Seite#getPageName <em>Page Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Name</em>'.
	 * @see screenModel.Seite#getPageName()
	 * @see #getSeite()
	 * @generated
	 */
	EAttribute getSeite_PageName();

	/**
	 * Returns the meta object for class '{@link screenModel.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see screenModel.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the reference '{@link screenModel.Button#getSeite <em>Seite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seite</em>'.
	 * @see screenModel.Button#getSeite()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Seite();

	/**
	 * Returns the meta object for the attribute '{@link screenModel.Button#getDisplayText <em>Display Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Text</em>'.
	 * @see screenModel.Button#getDisplayText()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_DisplayText();

	/**
	 * Returns the meta object for class '{@link screenModel.Dateneingabe <em>Dateneingabe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dateneingabe</em>'.
	 * @see screenModel.Dateneingabe
	 * @generated
	 */
	EClass getDateneingabe();

	/**
	 * Returns the meta object for the reference '{@link screenModel.Dateneingabe#getDatenobjekt <em>Datenobjekt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datenobjekt</em>'.
	 * @see screenModel.Dateneingabe#getDatenobjekt()
	 * @see #getDateneingabe()
	 * @generated
	 */
	EReference getDateneingabe_Datenobjekt();

	/**
	 * Returns the meta object for the containment reference list '{@link screenModel.Dateneingabe#getDateneingabefeld <em>Dateneingabefeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dateneingabefeld</em>'.
	 * @see screenModel.Dateneingabe#getDateneingabefeld()
	 * @see #getDateneingabe()
	 * @generated
	 */
	EReference getDateneingabe_Dateneingabefeld();

	/**
	 * Returns the meta object for class '{@link screenModel.Datenausgabe <em>Datenausgabe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datenausgabe</em>'.
	 * @see screenModel.Datenausgabe
	 * @generated
	 */
	EClass getDatenausgabe();

	/**
	 * Returns the meta object for the reference '{@link screenModel.Datenausgabe#getDatenobjekt <em>Datenobjekt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datenobjekt</em>'.
	 * @see screenModel.Datenausgabe#getDatenobjekt()
	 * @see #getDatenausgabe()
	 * @generated
	 */
	EReference getDatenausgabe_Datenobjekt();

	/**
	 * Returns the meta object for the containment reference list '{@link screenModel.Datenausgabe#getDatenausgabefeld <em>Datenausgabefeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datenausgabefeld</em>'.
	 * @see screenModel.Datenausgabe#getDatenausgabefeld()
	 * @see #getDatenausgabe()
	 * @generated
	 */
	EReference getDatenausgabe_Datenausgabefeld();

	/**
	 * Returns the meta object for class '{@link screenModel.Datenobjekt <em>Datenobjekt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datenobjekt</em>'.
	 * @see screenModel.Datenobjekt
	 * @generated
	 */
	EClass getDatenobjekt();

	/**
	 * Returns the meta object for the reference '{@link screenModel.Datenobjekt#getDatenstruktur <em>Datenstruktur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datenstruktur</em>'.
	 * @see screenModel.Datenobjekt#getDatenstruktur()
	 * @see #getDatenobjekt()
	 * @generated
	 */
	EReference getDatenobjekt_Datenstruktur();

	/**
	 * Returns the meta object for class '{@link screenModel.Datenstruktur <em>Datenstruktur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datenstruktur</em>'.
	 * @see screenModel.Datenstruktur
	 * @generated
	 */
	EClass getDatenstruktur();

	/**
	 * Returns the meta object for the containment reference list '{@link screenModel.Datenstruktur#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see screenModel.Datenstruktur#getAttribute()
	 * @see #getDatenstruktur()
	 * @generated
	 */
	EReference getDatenstruktur_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link screenModel.Datenstruktur#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see screenModel.Datenstruktur#getName()
	 * @see #getDatenstruktur()
	 * @generated
	 */
	EAttribute getDatenstruktur_Name();

	/**
	 * Returns the meta object for class '{@link screenModel.Attribut <em>Attribut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribut</em>'.
	 * @see screenModel.Attribut
	 * @generated
	 */
	EClass getAttribut();

	/**
	 * Returns the meta object for the attribute '{@link screenModel.Attribut#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see screenModel.Attribut#getName()
	 * @see #getAttribut()
	 * @generated
	 */
	EAttribute getAttribut_Name();

	/**
	 * Returns the meta object for the attribute '{@link screenModel.Attribut#getDatentyp <em>Datentyp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datentyp</em>'.
	 * @see screenModel.Attribut#getDatentyp()
	 * @see #getAttribut()
	 * @generated
	 */
	EAttribute getAttribut_Datentyp();

	/**
	 * Returns the meta object for class '{@link screenModel.Datenausgabefeld <em>Datenausgabefeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datenausgabefeld</em>'.
	 * @see screenModel.Datenausgabefeld
	 * @generated
	 */
	EClass getDatenausgabefeld();

	/**
	 * Returns the meta object for the containment reference '{@link screenModel.Datenausgabefeld#getTextfeld <em>Textfeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Textfeld</em>'.
	 * @see screenModel.Datenausgabefeld#getTextfeld()
	 * @see #getDatenausgabefeld()
	 * @generated
	 */
	EReference getDatenausgabefeld_Textfeld();

	/**
	 * Returns the meta object for the containment reference '{@link screenModel.Datenausgabefeld#getAusgabefeld <em>Ausgabefeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ausgabefeld</em>'.
	 * @see screenModel.Datenausgabefeld#getAusgabefeld()
	 * @see #getDatenausgabefeld()
	 * @generated
	 */
	EReference getDatenausgabefeld_Ausgabefeld();

	/**
	 * Returns the meta object for class '{@link screenModel.Textfeld <em>Textfeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textfeld</em>'.
	 * @see screenModel.Textfeld
	 * @generated
	 */
	EClass getTextfeld();

	/**
	 * Returns the meta object for the attribute '{@link screenModel.Textfeld#getDisplayText <em>Display Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Text</em>'.
	 * @see screenModel.Textfeld#getDisplayText()
	 * @see #getTextfeld()
	 * @generated
	 */
	EAttribute getTextfeld_DisplayText();

	/**
	 * Returns the meta object for class '{@link screenModel.Eingabefeld <em>Eingabefeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eingabefeld</em>'.
	 * @see screenModel.Eingabefeld
	 * @generated
	 */
	EClass getEingabefeld();

	/**
	 * Returns the meta object for the reference '{@link screenModel.Eingabefeld#getAttribut <em>Attribut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribut</em>'.
	 * @see screenModel.Eingabefeld#getAttribut()
	 * @see #getEingabefeld()
	 * @generated
	 */
	EReference getEingabefeld_Attribut();

	/**
	 * Returns the meta object for the attribute '{@link screenModel.Eingabefeld#getInputText <em>Input Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Text</em>'.
	 * @see screenModel.Eingabefeld#getInputText()
	 * @see #getEingabefeld()
	 * @generated
	 */
	EAttribute getEingabefeld_InputText();

	/**
	 * Returns the meta object for class '{@link screenModel.Dateneingabefeld <em>Dateneingabefeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dateneingabefeld</em>'.
	 * @see screenModel.Dateneingabefeld
	 * @generated
	 */
	EClass getDateneingabefeld();

	/**
	 * Returns the meta object for the containment reference '{@link screenModel.Dateneingabefeld#getEingabefeld <em>Eingabefeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eingabefeld</em>'.
	 * @see screenModel.Dateneingabefeld#getEingabefeld()
	 * @see #getDateneingabefeld()
	 * @generated
	 */
	EReference getDateneingabefeld_Eingabefeld();

	/**
	 * Returns the meta object for the containment reference '{@link screenModel.Dateneingabefeld#getTextfeld <em>Textfeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Textfeld</em>'.
	 * @see screenModel.Dateneingabefeld#getTextfeld()
	 * @see #getDateneingabefeld()
	 * @generated
	 */
	EReference getDateneingabefeld_Textfeld();

	/**
	 * Returns the meta object for class '{@link screenModel.Ausgabefeld <em>Ausgabefeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ausgabefeld</em>'.
	 * @see screenModel.Ausgabefeld
	 * @generated
	 */
	EClass getAusgabefeld();

	/**
	 * Returns the meta object for the reference '{@link screenModel.Ausgabefeld#getAttribut <em>Attribut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribut</em>'.
	 * @see screenModel.Ausgabefeld#getAttribut()
	 * @see #getAusgabefeld()
	 * @generated
	 */
	EReference getAusgabefeld_Attribut();

	/**
	 * Returns the meta object for the attribute '{@link screenModel.Ausgabefeld#getDisplayText <em>Display Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Text</em>'.
	 * @see screenModel.Ausgabefeld#getDisplayText()
	 * @see #getAusgabefeld()
	 * @generated
	 */
	EAttribute getAusgabefeld_DisplayText();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScreenModelFactory getScreenModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link screenModel.impl.ScreenModelImpl <em>Screen Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see screenModel.impl.ScreenModelImpl
		 * @see screenModel.impl.ScreenModelPackageImpl#getScreenModel()
		 * @generated
		 */
		EClass SCREEN_MODEL = eINSTANCE.getScreenModel();

		/**
		 * The meta object literal for the '<em><b>Seite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN_MODEL__SEITE = eINSTANCE.getScreenModel_Seite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN_MODEL__NAME = eINSTANCE.getScreenModel_Name();

		/**
		 * The meta object literal for the '<em><b>Datenobjekt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN_MODEL__DATENOBJEKT = eINSTANCE.getScreenModel_Datenobjekt();

		/**
		 * The meta object literal for the '<em><b>Datenstruktur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN_MODEL__DATENSTRUKTUR = eINSTANCE.getScreenModel_Datenstruktur();

		/**
		 * The meta object literal for the '{@link screenModel.impl.SeiteImpl <em>Seite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see screenModel.impl.SeiteImpl
		 * @see screenModel.impl.ScreenModelPackageImpl#getSeite()
		 * @generated
		 */
		EClass SEITE = eINSTANCE.getSeite();

		/**
		 * The meta object literal for the '<em><b>Button</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEITE__BUTTON = eINSTANCE.getSeite_Button();

		/**
		 * The meta object literal for the '<em><b>Dateneingabe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEITE__DATENEINGABE = eINSTANCE.getSeite_Dateneingabe();

		/**
		 * The meta object literal for the '<em><b>Datenausgabe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEITE__DATENAUSGABE = eINSTANCE.getSeite_Datenausgabe();

		/**
		 * The meta object literal for the '<em><b>Page Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEITE__PAGE_NAME = eINSTANCE.getSeite_PageName();

		/**
		 * The meta object literal for the '{@link screenModel.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see screenModel.impl.ButtonImpl
		 * @see screenModel.impl.ScreenModelPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Seite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__SEITE = eINSTANCE.getButton_Seite();

		/**
		 * The meta object literal for the '<em><b>Display Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__DISPLAY_TEXT = eINSTANCE.getButton_DisplayText();

		/**
		 * The meta object literal for the '{@link screenModel.impl.DateneingabeImpl <em>Dateneingabe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see screenModel.impl.DateneingabeImpl
		 * @see screenModel.impl.ScreenModelPackageImpl#getDateneingabe()
		 * @generated
		 */
		EClass DATENEINGABE = eINSTANCE.getDateneingabe();

		/**
		 * The meta object literal for the '<em><b>Datenobjekt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATENEINGABE__DATENOBJEKT = eINSTANCE.getDateneingabe_Datenobjekt();

		/**
		 * The meta object literal for the '<em><b>Dateneingabefeld</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATENEINGABE__DATENEINGABEFELD = eINSTANCE.getDateneingabe_Dateneingabefeld();

		/**
		 * The meta object literal for the '{@link screenModel.impl.DatenausgabeImpl <em>Datenausgabe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see screenModel.impl.DatenausgabeImpl
		 * @see screenModel.impl.ScreenModelPackageImpl#getDatenausgabe()
		 * @generated
		 */
		EClass DATENAUSGABE = eINSTANCE.getDatenausgabe();

		/**
		 * The meta object literal for the '<em><b>Datenobjekt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATENAUSGABE__DATENOBJEKT = eINSTANCE.getDatenausgabe_Datenobjekt();

		/**
		 * The meta object literal for the '<em><b>Datenausgabefeld</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATENAUSGABE__DATENAUSGABEFELD = eINSTANCE.getDatenausgabe_Datenausgabefeld();

		/**
		 * The meta object literal for the '{@link screenModel.impl.DatenobjektImpl <em>Datenobjekt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see screenModel.impl.DatenobjektImpl
		 * @see screenModel.impl.ScreenModelPackageImpl#getDatenobjekt()
		 * @generated
		 */
		EClass DATENOBJEKT = eINSTANCE.getDatenobjekt();

		/**
		 * The meta object literal for the '<em><b>Datenstruktur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATENOBJEKT__DATENSTRUKTUR = eINSTANCE.getDatenobjekt_Datenstruktur();

		/**
		 * The meta object literal for the '{@link screenModel.impl.DatenstrukturImpl <em>Datenstruktur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see screenModel.impl.DatenstrukturImpl
		 * @see screenModel.impl.ScreenModelPackageImpl#getDatenstruktur()
		 * @generated
		 */
		EClass DATENSTRUKTUR = eINSTANCE.getDatenstruktur();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATENSTRUKTUR__ATTRIBUTE = eINSTANCE.getDatenstruktur_Attribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATENSTRUKTUR__NAME = eINSTANCE.getDatenstruktur_Name();

		/**
		 * The meta object literal for the '{@link screenModel.impl.AttributImpl <em>Attribut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see screenModel.impl.AttributImpl
		 * @see screenModel.impl.ScreenModelPackageImpl#getAttribut()
		 * @generated
		 */
		EClass ATTRIBUT = eINSTANCE.getAttribut();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUT__NAME = eINSTANCE.getAttribut_Name();

		/**
		 * The meta object literal for the '<em><b>Datentyp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUT__DATENTYP = eINSTANCE.getAttribut_Datentyp();

		/**
		 * The meta object literal for the '{@link screenModel.impl.DatenausgabefeldImpl <em>Datenausgabefeld</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see screenModel.impl.DatenausgabefeldImpl
		 * @see screenModel.impl.ScreenModelPackageImpl#getDatenausgabefeld()
		 * @generated
		 */
		EClass DATENAUSGABEFELD = eINSTANCE.getDatenausgabefeld();

		/**
		 * The meta object literal for the '<em><b>Textfeld</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATENAUSGABEFELD__TEXTFELD = eINSTANCE.getDatenausgabefeld_Textfeld();

		/**
		 * The meta object literal for the '<em><b>Ausgabefeld</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATENAUSGABEFELD__AUSGABEFELD = eINSTANCE.getDatenausgabefeld_Ausgabefeld();

		/**
		 * The meta object literal for the '{@link screenModel.impl.TextfeldImpl <em>Textfeld</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see screenModel.impl.TextfeldImpl
		 * @see screenModel.impl.ScreenModelPackageImpl#getTextfeld()
		 * @generated
		 */
		EClass TEXTFELD = eINSTANCE.getTextfeld();

		/**
		 * The meta object literal for the '<em><b>Display Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTFELD__DISPLAY_TEXT = eINSTANCE.getTextfeld_DisplayText();

		/**
		 * The meta object literal for the '{@link screenModel.impl.EingabefeldImpl <em>Eingabefeld</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see screenModel.impl.EingabefeldImpl
		 * @see screenModel.impl.ScreenModelPackageImpl#getEingabefeld()
		 * @generated
		 */
		EClass EINGABEFELD = eINSTANCE.getEingabefeld();

		/**
		 * The meta object literal for the '<em><b>Attribut</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EINGABEFELD__ATTRIBUT = eINSTANCE.getEingabefeld_Attribut();

		/**
		 * The meta object literal for the '<em><b>Input Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINGABEFELD__INPUT_TEXT = eINSTANCE.getEingabefeld_InputText();

		/**
		 * The meta object literal for the '{@link screenModel.impl.DateneingabefeldImpl <em>Dateneingabefeld</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see screenModel.impl.DateneingabefeldImpl
		 * @see screenModel.impl.ScreenModelPackageImpl#getDateneingabefeld()
		 * @generated
		 */
		EClass DATENEINGABEFELD = eINSTANCE.getDateneingabefeld();

		/**
		 * The meta object literal for the '<em><b>Eingabefeld</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATENEINGABEFELD__EINGABEFELD = eINSTANCE.getDateneingabefeld_Eingabefeld();

		/**
		 * The meta object literal for the '<em><b>Textfeld</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATENEINGABEFELD__TEXTFELD = eINSTANCE.getDateneingabefeld_Textfeld();

		/**
		 * The meta object literal for the '{@link screenModel.impl.AusgabefeldImpl <em>Ausgabefeld</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see screenModel.impl.AusgabefeldImpl
		 * @see screenModel.impl.ScreenModelPackageImpl#getAusgabefeld()
		 * @generated
		 */
		EClass AUSGABEFELD = eINSTANCE.getAusgabefeld();

		/**
		 * The meta object literal for the '<em><b>Attribut</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUSGABEFELD__ATTRIBUT = eINSTANCE.getAusgabefeld_Attribut();

		/**
		 * The meta object literal for the '<em><b>Display Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSGABEFELD__DISPLAY_TEXT = eINSTANCE.getAusgabefeld_DisplayText();

	}

} //ScreenModelPackage
