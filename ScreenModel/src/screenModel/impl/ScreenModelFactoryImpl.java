/**
 */
package screenModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import screenModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScreenModelFactoryImpl extends EFactoryImpl implements ScreenModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScreenModelFactory init() {
		try {
			ScreenModelFactory theScreenModelFactory = (ScreenModelFactory)EPackage.Registry.INSTANCE.getEFactory(ScreenModelPackage.eNS_URI);
			if (theScreenModelFactory != null) {
				return theScreenModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScreenModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ScreenModelPackage.SCREEN_MODEL: return createScreenModel();
			case ScreenModelPackage.SEITE: return createSeite();
			case ScreenModelPackage.BUTTON: return createButton();
			case ScreenModelPackage.DATENEINGABE: return createDateneingabe();
			case ScreenModelPackage.DATENAUSGABE: return createDatenausgabe();
			case ScreenModelPackage.DATENOBJEKT: return createDatenobjekt();
			case ScreenModelPackage.DATENSTRUKTUR: return createDatenstruktur();
			case ScreenModelPackage.ATTRIBUT: return createAttribut();
			case ScreenModelPackage.DATENAUSGABEFELD: return createDatenausgabefeld();
			case ScreenModelPackage.TEXTFELD: return createTextfeld();
			case ScreenModelPackage.EINGABEFELD: return createEingabefeld();
			case ScreenModelPackage.DATENEINGABEFELD: return createDateneingabefeld();
			case ScreenModelPackage.AUSGABEFELD: return createAusgabefeld();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenModel createScreenModel() {
		ScreenModelImpl screenModel = new ScreenModelImpl();
		return screenModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seite createSeite() {
		SeiteImpl seite = new SeiteImpl();
		return seite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dateneingabe createDateneingabe() {
		DateneingabeImpl dateneingabe = new DateneingabeImpl();
		return dateneingabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datenausgabe createDatenausgabe() {
		DatenausgabeImpl datenausgabe = new DatenausgabeImpl();
		return datenausgabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datenobjekt createDatenobjekt() {
		DatenobjektImpl datenobjekt = new DatenobjektImpl();
		return datenobjekt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datenstruktur createDatenstruktur() {
		DatenstrukturImpl datenstruktur = new DatenstrukturImpl();
		return datenstruktur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribut createAttribut() {
		AttributImpl attribut = new AttributImpl();
		return attribut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datenausgabefeld createDatenausgabefeld() {
		DatenausgabefeldImpl datenausgabefeld = new DatenausgabefeldImpl();
		return datenausgabefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Textfeld createTextfeld() {
		TextfeldImpl textfeld = new TextfeldImpl();
		return textfeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eingabefeld createEingabefeld() {
		EingabefeldImpl eingabefeld = new EingabefeldImpl();
		return eingabefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dateneingabefeld createDateneingabefeld() {
		DateneingabefeldImpl dateneingabefeld = new DateneingabefeldImpl();
		return dateneingabefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ausgabefeld createAusgabefeld() {
		AusgabefeldImpl ausgabefeld = new AusgabefeldImpl();
		return ausgabefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenModelPackage getScreenModelPackage() {
		return (ScreenModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScreenModelPackage getPackage() {
		return ScreenModelPackage.eINSTANCE;
	}

} //ScreenModelFactoryImpl
