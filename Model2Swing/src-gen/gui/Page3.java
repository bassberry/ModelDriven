
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
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.addWidgetsToScreen();
	}

	private void addWidgetsToScreen() {

		Person person = (Person) DataStorage.INSTANCE.get("Person");

		JPanel personPanel = new JPanel();
		this.add(personPanel);
		personPanel.setLayout(new BoxLayout(personPanel, BoxLayout.Y_AXIS));

		personPanel.add(new JLabel("<html><b>Person</b></html>"));

		JPanel personPanel_VornamePanel = new JPanel();
		personPanel.add(personPanel_VornamePanel);

		personPanel_VornamePanel.add(new JLabel("Vorname:"));

		personPanel_VornamePanel.add(new JLabel(((Person) person).getVorname().toString()));

		JPanel personPanel_NachnamePanel = new JPanel();
		personPanel.add(personPanel_NachnamePanel);

		personPanel_NachnamePanel.add(new JLabel("Nachname:"));

		personPanel_NachnamePanel.add(new JLabel(((Person) person).getNachname().toString()));

		JPanel personPanel_AlterPanel = new JPanel();
		personPanel.add(personPanel_AlterPanel);

		personPanel_AlterPanel.add(new JLabel("Alter:"));

		personPanel_AlterPanel.add(new JLabel(((Person) person).getAlter().toString()));

		personPanel.add(new JSeparator(JSeparator.HORIZONTAL));

		Adresse adresse = (Adresse) DataStorage.INSTANCE.get("Adresse");

		JPanel adressePanel = new JPanel();
		this.add(adressePanel);
		adressePanel.setLayout(new BoxLayout(adressePanel, BoxLayout.Y_AXIS));

		adressePanel.add(new JLabel("<html><b>Adresse</b></html>"));

		JPanel adressePanel_StrassePanel = new JPanel();
		adressePanel.add(adressePanel_StrassePanel);

		adressePanel_StrassePanel.add(new JLabel("Strasse:"));

		adressePanel_StrassePanel.add(new JLabel(((Adresse) adresse).getStrasse().toString()));

		JPanel adressePanel_HausnummerPanel = new JPanel();
		adressePanel.add(adressePanel_HausnummerPanel);

		adressePanel_HausnummerPanel.add(new JLabel("Hausnummer:"));

		adressePanel_HausnummerPanel.add(new JLabel(((Adresse) adresse).getHausnummer().toString()));

		JPanel adressePanel_StadtPanel = new JPanel();
		adressePanel.add(adressePanel_StadtPanel);

		adressePanel_StadtPanel.add(new JLabel("Stadt:"));

		adressePanel_StadtPanel.add(new JLabel(((Adresse) adresse).getStadt().toString()));

		adressePanel.add(new JSeparator(JSeparator.HORIZONTAL));

	}

	private void triggerNextPage() {
		try {

			parent.switchPage("Page3");
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(Page3.this, "Number could not be converted", "Number Format Exception",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
