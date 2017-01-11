
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

	private Adresse adresse = new Adresse();

	private JTextField strasseTextField = new JTextField("Strasse", 20);

	private JTextField hausnummerTextField = new JTextField("Hausnummer", 20);

	private JTextField stadtTextField = new JTextField("Stadt", 20);

	public Page2(AppUserInterface parent) {
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

		JPanel adressePanel = new JPanel();
		this.add(adressePanel);
		adressePanel.setLayout(new BoxLayout(adressePanel, BoxLayout.Y_AXIS));

		adressePanel.add(new JLabel("<html><b>Adresse</b></html>"));

		JPanel adressePanel_StrassePanel = new JPanel();
		adressePanel.add(adressePanel_StrassePanel);

		adressePanel_StrassePanel.add(new JLabel("Strasse:"));

		strasseTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(final FocusEvent pE) {
			}
			@Override
			public void focusGained(final FocusEvent pE) {
				strasseTextField.selectAll();
			}
		});
		adressePanel_StrassePanel.add(strasseTextField);

		JPanel adressePanel_HausnummerPanel = new JPanel();
		adressePanel.add(adressePanel_HausnummerPanel);

		adressePanel_HausnummerPanel.add(new JLabel("Hausnummer:"));

		hausnummerTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(final FocusEvent pE) {
			}
			@Override
			public void focusGained(final FocusEvent pE) {
				hausnummerTextField.selectAll();
			}
		});
		adressePanel_HausnummerPanel.add(hausnummerTextField);

		JPanel adressePanel_StadtPanel = new JPanel();
		adressePanel.add(adressePanel_StadtPanel);

		adressePanel_StadtPanel.add(new JLabel("Stadt:"));

		stadtTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(final FocusEvent pE) {
			}
			@Override
			public void focusGained(final FocusEvent pE) {
				stadtTextField.selectAll();
			}
		});
		adressePanel_StadtPanel.add(stadtTextField);

		adressePanel.add(new JSeparator(JSeparator.HORIZONTAL));

		{
			JPanel controlPanel = new JPanel();

			JButton proceedButton = new JButton("Weiter");
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

			proceedButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					triggerNextPage();
				}
			});

			controlPanel.add(proceedButton);
			controlPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

			this.add(controlPanel);
		}

	}

	private void triggerNextPage() {
		try {

			adresse.setStrasse(strasseTextField.getText());

			adresse.setHausnummer(Integer.parseInt(hausnummerTextField.getText()));

			adresse.setStadt(stadtTextField.getText());

			DataStorage.INSTANCE.set("Adresse", adresse);

			parent.switchPage("Page2");
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(Page2.this, "Number could not be converted", "Number Format Exception",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
