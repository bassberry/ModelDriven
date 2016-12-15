/**
 */
package workflowModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zustand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflowModel.Zustand#getÜbergang <em>Übergang</em>}</li>
 *   <li>{@link workflowModel.Zustand#getPageName <em>Page Name</em>}</li>
 *   <li>{@link workflowModel.Zustand#getDatenobjektEingabe <em>Datenobjekt Eingabe</em>}</li>
 *   <li>{@link workflowModel.Zustand#getDatenobjektAusgabe <em>Datenobjekt Ausgabe</em>}</li>
 * </ul>
 *
 * @see workflowModel.WorkflowModelPackage#getZustand()
 * @model
 * @generated
 */
public interface Zustand extends EObject {
	/**
	 * Returns the value of the '<em><b>Übergang</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Übergang</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Übergang</em>' containment reference.
	 * @see #setÜbergang(Übergang)
	 * @see workflowModel.WorkflowModelPackage#getZustand_Übergang()
	 * @model containment="true"
	 * @generated
	 */
	Übergang getÜbergang();

	/**
	 * Sets the value of the '{@link workflowModel.Zustand#getÜbergang <em>Übergang</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Übergang</em>' containment reference.
	 * @see #getÜbergang()
	 * @generated
	 */
	void setÜbergang(Übergang value);

	/**
	 * Returns the value of the '<em><b>Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Name</em>' attribute.
	 * @see #setPageName(String)
	 * @see workflowModel.WorkflowModelPackage#getZustand_PageName()
	 * @model
	 * @generated
	 */
	String getPageName();

	/**
	 * Sets the value of the '{@link workflowModel.Zustand#getPageName <em>Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Name</em>' attribute.
	 * @see #getPageName()
	 * @generated
	 */
	void setPageName(String value);

	/**
	 * Returns the value of the '<em><b>Datenobjekt Eingabe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datenobjekt Eingabe</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenobjekt Eingabe</em>' reference.
	 * @see #setDatenobjektEingabe(Datenobjekt)
	 * @see workflowModel.WorkflowModelPackage#getZustand_DatenobjektEingabe()
	 * @model
	 * @generated
	 */
	Datenobjekt getDatenobjektEingabe();

	/**
	 * Sets the value of the '{@link workflowModel.Zustand#getDatenobjektEingabe <em>Datenobjekt Eingabe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenobjekt Eingabe</em>' reference.
	 * @see #getDatenobjektEingabe()
	 * @generated
	 */
	void setDatenobjektEingabe(Datenobjekt value);

	/**
	 * Returns the value of the '<em><b>Datenobjekt Ausgabe</b></em>' reference list.
	 * The list contents are of type {@link workflowModel.Datenobjekt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datenobjekt Ausgabe</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenobjekt Ausgabe</em>' reference list.
	 * @see workflowModel.WorkflowModelPackage#getZustand_DatenobjektAusgabe()
	 * @model
	 * @generated
	 */
	EList<Datenobjekt> getDatenobjektAusgabe();

} // Zustand
