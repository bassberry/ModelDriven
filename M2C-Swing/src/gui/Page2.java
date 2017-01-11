
package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import dataobjects.*;

public class Page2 extends JPanel {

	private AppUserInterface parent = null;

	// Dateneingabeobjekt (Datenobjekt) deklarieren
	private Adresse adresse = new Adresse();

	// Eingabefelder (Textfelder) fuer die jeweiligen Attribute des Datenobjekts
	private JTextField strasseTextField = new JTextField("Strasse", 20);

	private JTextField hausnummerTextField = new JTextField("Hausnummer", 20);

	private JTextField stadtTextField = new JTextField("Stadt", 20);

	public Page2(AppUserInterface parent) {
		this.parent = parent;
		this.initialize();
	}

	private void initialize() {
		// Layout setzen und alle Ein-/Ausgaben hinzufuegen
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.addWidgetsToScreen();
	}

	private void addWidgetsToScreen() {

		// Datenobjekt laden
		Person person = (Person) DataStorage.INSTANCE.get("Person");

		// Panel fuer die Ausgabe erzeugen
		JPanel personPanel = new JPanel();
		this.add(personPanel);
		personPanel.setLayout(new BoxLayout(personPanel, BoxLayout.Y_AXIS));

		// Name des Datenobjekts
		personPanel.add(new JLabel("<html><b>Person</b></html>"));

		// Panel fuer das Datenausgabefeld
		JPanel personPanel_VornamePanel = new JPanel();
		personPanel.add(personPanel_VornamePanel);

		// Textfeld (beschreibt das Attribut)
		personPanel_VornamePanel.add(new JLabel("Vorname:"));

		// Ausgabefeld (Wert des Attributs)
		personPanel_VornamePanel.add(new JLabel(((Person) person).getVorname().toString()));

		// Panel fuer das Datenausgabefeld
		JPanel personPanel_NachnamePanel = new JPanel();
		personPanel.add(personPanel_NachnamePanel);

		// Textfeld (beschreibt das Attribut)
		personPanel_NachnamePanel.add(new JLabel("Nachname:"));

		// Ausgabefeld (Wert des Attributs)
		personPanel_NachnamePanel.add(new JLabel(((Person) person).getNachname().toString()));

		// Panel fuer das Datenausgabefeld
		JPanel personPanel_AlterPanel = new JPanel();
		personPanel.add(personPanel_AlterPanel);

		// Textfeld (beschreibt das Attribut)
		personPanel_AlterPanel.add(new JLabel("Alter:"));

		// Ausgabefeld (Wert des Attributs)
		personPanel_AlterPanel.add(new JLabel(((Person) person).getAlter().toString()));

		// Trennlinie zum Hervorheben der verschiedenen Datenobjekte
		personPanel.add(new JSeparator(JSeparator.HORIZONTAL));

		// Panel erzeugen
		JPanel adressePanel = new JPanel();
		this.add(adressePanel);
		adressePanel.setLayout(new BoxLayout(adressePanel, BoxLayout.Y_AXIS));

		// Name des Datenobjekts
		adressePanel.add(new JLabel("<html><b>Adresse</b></html>"));

		// Panel fuer das aktuelle Dateneingabefeld
		JPanel adressePanel_StrassePanel = new JPanel();
		adressePanel.add(adressePanel_StrassePanel);

		// Name des Attributs ausgeben
		adressePanel_StrassePanel.add(new JLabel("Strasse:"));

		// FocusListener fuer das aktuelle Eingabefeld (um den Text zu markieren, wenn in das Textfeld geklickt wird)
		strasseTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(final FocusEvent pE) {
			}
			@Override
			public void focusGained(final FocusEvent pE) {
				strasseTextField.selectAll();
			}
		});

		// Eingabefeld in das Panel einfuegen
		adressePanel_StrassePanel.add(strasseTextField);

		// Panel fuer das aktuelle Dateneingabefeld
		JPanel adressePanel_HausnummerPanel = new JPanel();
		adressePanel.add(adressePanel_HausnummerPanel);

		// Name des Attributs ausgeben
		adressePanel_HausnummerPanel.add(new JLabel("Hausnummer:"));

		// FocusListener fuer das aktuelle Eingabefeld (um den Text zu markieren, wenn in das Textfeld geklickt wird)
		hausnummerTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(final FocusEvent pE) {
			}
			@Override
			public void focusGained(final FocusEvent pE) {
				hausnummerTextField.selectAll();
			}
		});

		// Eingabefeld in das Panel einfuegen
		adressePanel_HausnummerPanel.add(hausnummerTextField);

		// Panel fuer das aktuelle Dateneingabefeld
		JPanel adressePanel_StadtPanel = new JPanel();
		adressePanel.add(adressePanel_StadtPanel);

		// Name des Attributs ausgeben
		adressePanel_StadtPanel.add(new JLabel("Stadt:"));

		// FocusListener fuer das aktuelle Eingabefeld (um den Text zu markieren, wenn in das Textfeld geklickt wird)
		stadtTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(final FocusEvent pE) {
			}
			@Override
			public void focusGained(final FocusEvent pE) {
				stadtTextField.selectAll();
			}
		});

		// Eingabefeld in das Panel einfuegen
		adressePanel_StadtPanel.add(stadtTextField);

		// Trennlinie zum Hervorheben der verschiedenen Datenobjekte
		adressePanel.add(new JSeparator(JSeparator.HORIZONTAL));

		{
			// neues Panel fuer den Button
			JPanel controlPanel = new JPanel();

			JButton proceedButton = new JButton("Weiter");
			// KeyListener, laedt die naechste Seite, wenn Enter gedrueckt wird
			proceedButton.addKeyListener(new KeyListener() {
				@Override
				public void keyTyped(KeyEvent e) {
				}

				@Override
				public void keyReleased(KeyEvent e) {
				}

				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						triggerNextPage();
					}
				}
			});

			// ActionListener, lauscht auf Interaktion mit dem Button
			proceedButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					triggerNextPage();
				}
			});

			// Button dem Panel hinzufuegen
			controlPanel.add(proceedButton);
			controlPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

			// Panel ins GUI hinzufuegen
			this.add(controlPanel);
		}

	}

	private void triggerNextPage() {
		try {

			// Attribute aus Textfeldern auslesen und im Datenobjekt speichern

			adresse.setStrasse(strasseTextField.getText());

			adresse.setHausnummer(Integer.parseInt(hausnummerTextField.getText()));

			adresse.setStadt(stadtTextField.getText());

			// Objekt ins Hash schreiben
			DataStorage.INSTANCE.set("Adresse", adresse);

			parent.switchPage("Page2");
		} catch (NumberFormatException exception) {
			// Integer-Konvertierungsfehler abfangen
			JOptionPane.showMessageDialog(Page2.this, "Number could not be converted", "Number Format Exception",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
