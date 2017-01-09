
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

		Person person1 = (Person) DataStorage.INSTANCE.get("Person1");

		JPanel person1Panel = new JPanel();
		this.add(person1Panel);
		person1Panel.setLayout(new BoxLayout(person1Panel, BoxLayout.Y_AXIS));

		JPanel person1Panel_NamePanel = new JPanel();
		person1Panel.add(person1Panel_NamePanel);

		person1Panel_NamePanel.add(new JLabel("Name:"));

		person1Panel_NamePanel.add(new JLabel(((Person) person1).getName().toString()));

		Adresse adresse1 = (Adresse) DataStorage.INSTANCE.get("Adresse1");

		JPanel adresse1Panel = new JPanel();
		this.add(adresse1Panel);
		adresse1Panel.setLayout(new BoxLayout(adresse1Panel, BoxLayout.Y_AXIS));

		JPanel adresse1Panel_StrassePanel = new JPanel();
		adresse1Panel.add(adresse1Panel_StrassePanel);

		adresse1Panel_StrassePanel.add(new JLabel("Strasse:"));

		adresse1Panel_StrassePanel.add(new JLabel(((Adresse) adresse1).getStrasse().toString()));

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
