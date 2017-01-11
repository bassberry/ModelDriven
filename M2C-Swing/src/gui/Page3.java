
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

public class Page3 extends JPanel {

	private AppUserInterface parent = null;

	public Page3(AppUserInterface parent) {
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

		// Datenobjekt laden
		Adresse adresse = (Adresse) DataStorage.INSTANCE.get("Adresse");

		// Panel fuer die Ausgabe erzeugen
		JPanel adressePanel = new JPanel();
		this.add(adressePanel);
		adressePanel.setLayout(new BoxLayout(adressePanel, BoxLayout.Y_AXIS));

		// Name des Datenobjekts
		adressePanel.add(new JLabel("<html><b>Adresse</b></html>"));

		// Panel fuer das Datenausgabefeld
		JPanel adressePanel_StrassePanel = new JPanel();
		adressePanel.add(adressePanel_StrassePanel);

		// Textfeld (beschreibt das Attribut)
		adressePanel_StrassePanel.add(new JLabel("Strasse:"));

		// Ausgabefeld (Wert des Attributs)
		adressePanel_StrassePanel.add(new JLabel(((Adresse) adresse).getStrasse().toString()));

		// Panel fuer das Datenausgabefeld
		JPanel adressePanel_HausnummerPanel = new JPanel();
		adressePanel.add(adressePanel_HausnummerPanel);

		// Textfeld (beschreibt das Attribut)
		adressePanel_HausnummerPanel.add(new JLabel("Hausnummer:"));

		// Ausgabefeld (Wert des Attributs)
		adressePanel_HausnummerPanel.add(new JLabel(((Adresse) adresse).getHausnummer().toString()));

		// Panel fuer das Datenausgabefeld
		JPanel adressePanel_StadtPanel = new JPanel();
		adressePanel.add(adressePanel_StadtPanel);

		// Textfeld (beschreibt das Attribut)
		adressePanel_StadtPanel.add(new JLabel("Stadt:"));

		// Ausgabefeld (Wert des Attributs)
		adressePanel_StadtPanel.add(new JLabel(((Adresse) adresse).getStadt().toString()));

		// Trennlinie zum Hervorheben der verschiedenen Datenobjekte
		adressePanel.add(new JSeparator(JSeparator.HORIZONTAL));

	}

	private void triggerNextPage() {
		try {

			parent.switchPage("Page3");
		} catch (NumberFormatException exception) {
			// Integer-Konvertierungsfehler abfangen
			JOptionPane.showMessageDialog(Page3.this, "Number could not be converted", "Number Format Exception",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
