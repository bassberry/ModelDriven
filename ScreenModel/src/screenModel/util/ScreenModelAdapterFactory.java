/**
 */
package screenModel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import screenModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see screenModel.ScreenModelPackage
 * @generated
 */
public class ScreenModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScreenModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ScreenModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreenModelSwitch<Adapter> modelSwitch =
		new ScreenModelSwitch<Adapter>() {
			@Override
			public Adapter caseScreenModel(ScreenModel object) {
				return createScreenModelAdapter();
			}
			@Override
			public Adapter caseSeite(Seite object) {
				return createSeiteAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseDateneingabe(Dateneingabe object) {
				return createDateneingabeAdapter();
			}
			@Override
			public Adapter caseDatenausgabe(Datenausgabe object) {
				return createDatenausgabeAdapter();
			}
			@Override
			public Adapter caseDatenobjekt(Datenobjekt object) {
				return createDatenobjektAdapter();
			}
			@Override
			public Adapter caseDatenstruktur(Datenstruktur object) {
				return createDatenstrukturAdapter();
			}
			@Override
			public Adapter caseAttribut(Attribut object) {
				return createAttributAdapter();
			}
			@Override
			public Adapter caseDatenausgabefeld(Datenausgabefeld object) {
				return createDatenausgabefeldAdapter();
			}
			@Override
			public Adapter caseTextfeld(Textfeld object) {
				return createTextfeldAdapter();
			}
			@Override
			public Adapter caseEingabefeld(Eingabefeld object) {
				return createEingabefeldAdapter();
			}
			@Override
			public Adapter caseDateneingabefeld(Dateneingabefeld object) {
				return createDateneingabefeldAdapter();
			}
			@Override
			public Adapter caseAusgabefeld(Ausgabefeld object) {
				return createAusgabefeldAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link screenModel.ScreenModel <em>Screen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see screenModel.ScreenModel
	 * @generated
	 */
	public Adapter createScreenModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link screenModel.Seite <em>Seite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see screenModel.Seite
	 * @generated
	 */
	public Adapter createSeiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link screenModel.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see screenModel.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link screenModel.Dateneingabe <em>Dateneingabe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see screenModel.Dateneingabe
	 * @generated
	 */
	public Adapter createDateneingabeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link screenModel.Datenausgabe <em>Datenausgabe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see screenModel.Datenausgabe
	 * @generated
	 */
	public Adapter createDatenausgabeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link screenModel.Datenobjekt <em>Datenobjekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see screenModel.Datenobjekt
	 * @generated
	 */
	public Adapter createDatenobjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link screenModel.Datenstruktur <em>Datenstruktur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see screenModel.Datenstruktur
	 * @generated
	 */
	public Adapter createDatenstrukturAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link screenModel.Attribut <em>Attribut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see screenModel.Attribut
	 * @generated
	 */
	public Adapter createAttributAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link screenModel.Datenausgabefeld <em>Datenausgabefeld</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see screenModel.Datenausgabefeld
	 * @generated
	 */
	public Adapter createDatenausgabefeldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link screenModel.Textfeld <em>Textfeld</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see screenModel.Textfeld
	 * @generated
	 */
	public Adapter createTextfeldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link screenModel.Eingabefeld <em>Eingabefeld</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see screenModel.Eingabefeld
	 * @generated
	 */
	public Adapter createEingabefeldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link screenModel.Dateneingabefeld <em>Dateneingabefeld</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see screenModel.Dateneingabefeld
	 * @generated
	 */
	public Adapter createDateneingabefeldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link screenModel.Ausgabefeld <em>Ausgabefeld</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see screenModel.Ausgabefeld
	 * @generated
	 */
	public Adapter createAusgabefeldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ScreenModelAdapterFactory
