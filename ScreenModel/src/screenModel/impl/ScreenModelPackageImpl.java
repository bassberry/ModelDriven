/**
 */
package screenModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import screenModel.Attribut;
import screenModel.Ausgabefeld;
import screenModel.Button;
import screenModel.Datenausgabe;
import screenModel.Datenausgabefeld;
import screenModel.Dateneingabe;
import screenModel.Dateneingabefeld;
import screenModel.Datenobjekt;
import screenModel.Datenstruktur;
import screenModel.Eingabefeld;
import screenModel.ScreenModel;
import screenModel.ScreenModelFactory;
import screenModel.ScreenModelPackage;
import screenModel.Seite;
import screenModel.Textfeld;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScreenModelPackageImpl extends EPackageImpl implements ScreenModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateneingabeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datenausgabeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datenobjektEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datenstrukturEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datenausgabefeldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textfeldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eingabefeldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateneingabefeldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ausgabefeldEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see screenModel.ScreenModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScreenModelPackageImpl() {
		super(eNS_URI, ScreenModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ScreenModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScreenModelPackage init() {
		if (isInited) return (ScreenModelPackage)EPackage.Registry.INSTANCE.getEPackage(ScreenModelPackage.eNS_URI);

		// Obtain or create and register package
		ScreenModelPackageImpl theScreenModelPackage = (ScreenModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScreenModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScreenModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theScreenModelPackage.createPackageContents();

		// Initialize created meta-data
		theScreenModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScreenModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScreenModelPackage.eNS_URI, theScreenModelPackage);
		return theScreenModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScreenModel() {
		return screenModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreenModel_Seite() {
		return (EReference)screenModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreenModel_Name() {
		return (EAttribute)screenModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreenModel_Datenobjekt() {
		return (EReference)screenModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreenModel_Datenstruktur() {
		return (EReference)screenModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeite() {
		return seiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeite_Button() {
		return (EReference)seiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeite_Dateneingabe() {
		return (EReference)seiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeite_Datenausgabe() {
		return (EReference)seiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeite_PageName() {
		return (EAttribute)seiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButton_Seite() {
		return (EReference)buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_DisplayText() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateneingabe() {
		return dateneingabeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateneingabe_Datenobjekt() {
		return (EReference)dateneingabeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateneingabe_Dateneingabefeld() {
		return (EReference)dateneingabeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatenausgabe() {
		return datenausgabeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatenausgabe_Datenobjekt() {
		return (EReference)datenausgabeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatenausgabe_Datenausgabefeld() {
		return (EReference)datenausgabeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatenobjekt() {
		return datenobjektEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatenobjekt_Datenstruktur() {
		return (EReference)datenobjektEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatenstruktur() {
		return datenstrukturEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatenstruktur_Attribute() {
		return (EReference)datenstrukturEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatenstruktur_Name() {
		return (EAttribute)datenstrukturEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribut() {
		return attributEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribut_Name() {
		return (EAttribute)attributEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribut_Datentyp() {
		return (EAttribute)attributEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatenausgabefeld() {
		return datenausgabefeldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatenausgabefeld_Textfeld() {
		return (EReference)datenausgabefeldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatenausgabefeld_Ausgabefeld() {
		return (EReference)datenausgabefeldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextfeld() {
		return textfeldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextfeld_DisplayText() {
		return (EAttribute)textfeldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEingabefeld() {
		return eingabefeldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEingabefeld_Attribut() {
		return (EReference)eingabefeldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEingabefeld_InputText() {
		return (EAttribute)eingabefeldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateneingabefeld() {
		return dateneingabefeldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateneingabefeld_Eingabefeld() {
		return (EReference)dateneingabefeldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateneingabefeld_Textfeld() {
		return (EReference)dateneingabefeldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAusgabefeld() {
		return ausgabefeldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAusgabefeld_Attribut() {
		return (EReference)ausgabefeldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAusgabefeld_DisplayText() {
		return (EAttribute)ausgabefeldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenModelFactory getScreenModelFactory() {
		return (ScreenModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		screenModelEClass = createEClass(SCREEN_MODEL);
		createEReference(screenModelEClass, SCREEN_MODEL__SEITE);
		createEAttribute(screenModelEClass, SCREEN_MODEL__NAME);
		createEReference(screenModelEClass, SCREEN_MODEL__DATENOBJEKT);
		createEReference(screenModelEClass, SCREEN_MODEL__DATENSTRUKTUR);

		seiteEClass = createEClass(SEITE);
		createEReference(seiteEClass, SEITE__BUTTON);
		createEReference(seiteEClass, SEITE__DATENEINGABE);
		createEReference(seiteEClass, SEITE__DATENAUSGABE);
		createEAttribute(seiteEClass, SEITE__PAGE_NAME);

		buttonEClass = createEClass(BUTTON);
		createEReference(buttonEClass, BUTTON__SEITE);
		createEAttribute(buttonEClass, BUTTON__DISPLAY_TEXT);

		dateneingabeEClass = createEClass(DATENEINGABE);
		createEReference(dateneingabeEClass, DATENEINGABE__DATENOBJEKT);
		createEReference(dateneingabeEClass, DATENEINGABE__DATENEINGABEFELD);

		datenausgabeEClass = createEClass(DATENAUSGABE);
		createEReference(datenausgabeEClass, DATENAUSGABE__DATENOBJEKT);
		createEReference(datenausgabeEClass, DATENAUSGABE__DATENAUSGABEFELD);

		datenobjektEClass = createEClass(DATENOBJEKT);
		createEReference(datenobjektEClass, DATENOBJEKT__DATENSTRUKTUR);

		datenstrukturEClass = createEClass(DATENSTRUKTUR);
		createEReference(datenstrukturEClass, DATENSTRUKTUR__ATTRIBUTE);
		createEAttribute(datenstrukturEClass, DATENSTRUKTUR__NAME);

		attributEClass = createEClass(ATTRIBUT);
		createEAttribute(attributEClass, ATTRIBUT__NAME);
		createEAttribute(attributEClass, ATTRIBUT__DATENTYP);

		datenausgabefeldEClass = createEClass(DATENAUSGABEFELD);
		createEReference(datenausgabefeldEClass, DATENAUSGABEFELD__TEXTFELD);
		createEReference(datenausgabefeldEClass, DATENAUSGABEFELD__AUSGABEFELD);

		textfeldEClass = createEClass(TEXTFELD);
		createEAttribute(textfeldEClass, TEXTFELD__DISPLAY_TEXT);

		eingabefeldEClass = createEClass(EINGABEFELD);
		createEReference(eingabefeldEClass, EINGABEFELD__ATTRIBUT);
		createEAttribute(eingabefeldEClass, EINGABEFELD__INPUT_TEXT);

		dateneingabefeldEClass = createEClass(DATENEINGABEFELD);
		createEReference(dateneingabefeldEClass, DATENEINGABEFELD__EINGABEFELD);
		createEReference(dateneingabefeldEClass, DATENEINGABEFELD__TEXTFELD);

		ausgabefeldEClass = createEClass(AUSGABEFELD);
		createEReference(ausgabefeldEClass, AUSGABEFELD__ATTRIBUT);
		createEAttribute(ausgabefeldEClass, AUSGABEFELD__DISPLAY_TEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(screenModelEClass, ScreenModel.class, "ScreenModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScreenModel_Seite(), this.getSeite(), null, "seite", null, 0, -1, ScreenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreenModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, ScreenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScreenModel_Datenobjekt(), this.getDatenobjekt(), null, "datenobjekt", null, 0, -1, ScreenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScreenModel_Datenstruktur(), this.getDatenstruktur(), null, "datenstruktur", null, 0, -1, ScreenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seiteEClass, Seite.class, "Seite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSeite_Button(), this.getButton(), null, "button", null, 0, 1, Seite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeite_Dateneingabe(), this.getDateneingabe(), null, "dateneingabe", null, 0, 1, Seite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeite_Datenausgabe(), this.getDatenausgabe(), null, "datenausgabe", null, 0, -1, Seite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeite_PageName(), ecorePackage.getEString(), "pageName", null, 1, 1, Seite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getButton_Seite(), this.getSeite(), null, "seite", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButton_DisplayText(), ecorePackage.getEString(), "displayText", null, 1, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateneingabeEClass, Dateneingabe.class, "Dateneingabe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDateneingabe_Datenobjekt(), this.getDatenobjekt(), null, "datenobjekt", null, 0, 1, Dateneingabe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDateneingabe_Dateneingabefeld(), this.getDateneingabefeld(), null, "dateneingabefeld", null, 1, -1, Dateneingabe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datenausgabeEClass, Datenausgabe.class, "Datenausgabe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatenausgabe_Datenobjekt(), this.getDatenobjekt(), null, "datenobjekt", null, 0, 1, Datenausgabe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatenausgabe_Datenausgabefeld(), this.getDatenausgabefeld(), null, "datenausgabefeld", null, 1, -1, Datenausgabe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datenobjektEClass, Datenobjekt.class, "Datenobjekt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatenobjekt_Datenstruktur(), this.getDatenstruktur(), null, "datenstruktur", null, 1, 1, Datenobjekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datenstrukturEClass, Datenstruktur.class, "Datenstruktur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatenstruktur_Attribute(), this.getAttribut(), null, "attribute", null, 0, -1, Datenstruktur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatenstruktur_Name(), ecorePackage.getEString(), "name", null, 1, 1, Datenstruktur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributEClass, Attribut.class, "Attribut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribut_Name(), ecorePackage.getEString(), "name", null, 1, 1, Attribut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribut_Datentyp(), ecorePackage.getEString(), "datentyp", null, 1, 1, Attribut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datenausgabefeldEClass, Datenausgabefeld.class, "Datenausgabefeld", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatenausgabefeld_Textfeld(), this.getTextfeld(), null, "textfeld", null, 1, 1, Datenausgabefeld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatenausgabefeld_Ausgabefeld(), this.getAusgabefeld(), null, "ausgabefeld", null, 1, 1, Datenausgabefeld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textfeldEClass, Textfeld.class, "Textfeld", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextfeld_DisplayText(), ecorePackage.getEString(), "displayText", null, 1, 1, Textfeld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eingabefeldEClass, Eingabefeld.class, "Eingabefeld", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEingabefeld_Attribut(), this.getAttribut(), null, "attribut", null, 1, 1, Eingabefeld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEingabefeld_InputText(), ecorePackage.getEString(), "inputText", null, 1, 1, Eingabefeld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateneingabefeldEClass, Dateneingabefeld.class, "Dateneingabefeld", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDateneingabefeld_Eingabefeld(), this.getEingabefeld(), null, "eingabefeld", null, 1, 1, Dateneingabefeld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDateneingabefeld_Textfeld(), this.getTextfeld(), null, "textfeld", null, 1, 1, Dateneingabefeld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ausgabefeldEClass, Ausgabefeld.class, "Ausgabefeld", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAusgabefeld_Attribut(), this.getAttribut(), null, "attribut", null, 1, 1, Ausgabefeld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAusgabefeld_DisplayText(), ecorePackage.getEString(), "displayText", null, 1, 1, Ausgabefeld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ScreenModelPackageImpl
