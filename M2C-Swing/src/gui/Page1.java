
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

public class Page1 extends JPanel {

	private AppUserInterface parent = null;

	// Dateneingabeobjekt (Datenobjekt) deklarieren
	private Person person = new Person();

	// Eingabefelder (Textfelder) fuer die jeweiligen Attribute des Datenobjekts
	private JTextField vornameTextField = new JTextField("Vorname", 20);

	private JTextField nachnameTextField = new JTextField("Nachname", 20);

	private JTextField alterTextField = new JTextField("Alter", 20);

	public Page1(AppUserInterface parent) {
		this.parent = parent;
		this.initialize();
	}

	private void initialize() {
		// Layout setzen und alle Ein-/Ausgaben hinzufuegen
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.addWidgetsToScreen();
	}

	private void addWidgetsToScreen() {

		// Panel erzeugen
		JPanel personPanel = new JPanel();
		this.add(personPanel);
		personPanel.setLayout(new BoxLayout(personPanel, BoxLayout.Y_AXIS));

		// Name des Datenobjekts
		personPanel.add(new JLabel("<html><b>Person</b></html>"));

		// Panel fuer das aktuelle Dateneingabefeld
		JPanel personPanel_VornamePanel = new JPanel();
		personPanel.add(personPanel_VornamePanel);

		// Name des Attributs ausgeben
		personPanel_VornamePanel.add(new JLabel("Vorname:"));

		// FocusListener fuer das aktuelle Eingabefeld (um den Text zu markieren, wenn in das Textfeld geklickt wird)
		vornameTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(final FocusEvent pE) {
			}
			@Override
			public void focusGained(final FocusEvent pE) {
				vornameTextField.selectAll();
			}
		});

		// Eingabefeld in das Panel einfuegen
		personPanel_VornamePanel.add(vornameTextField);

		// Panel fuer das aktuelle Dateneingabefeld
		JPanel personPanel_NachnamePanel = new JPanel();
		personPanel.add(personPanel_NachnamePanel);

		// Name des Attributs ausgeben
		personPanel_NachnamePanel.add(new JLabel("Nachname:"));

		// FocusListener fuer das aktuelle Eingabefeld (um den Text zu markieren, wenn in das Textfeld geklickt wird)
		nachnameTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(final FocusEvent pE) {
			}
			@Override
			public void focusGained(final FocusEvent pE) {
				nachnameTextField.selectAll();
			}
		});

		// Eingabefeld in das Panel einfuegen
		personPanel_NachnamePanel.add(nachnameTextField);

		// Panel fuer das aktuelle Dateneingabefeld
		JPanel personPanel_AlterPanel = new JPanel();
		personPanel.add(personPanel_AlterPanel);

		// Name des Attributs ausgeben
		personPanel_AlterPanel.add(new JLabel("Alter:"));

		// FocusListener fuer das aktuelle Eingabefeld (um den Text zu markieren, wenn in das Textfeld geklickt wird)
		alterTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(final FocusEvent pE) {
			}
			@Override
			public void focusGained(final FocusEvent pE) {
				alterTextField.selectAll();
			}
		});

		// Eingabefeld in das Panel einfuegen
		personPanel_AlterPanel.add(alterTextField);

		// Trennlinie zum Hervorheben der verschiedenen Datenobjekte
		personPanel.add(new JSeparator(JSeparator.HORIZONTAL));

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

			person.setVorname(vornameTextField.getText());

			person.setNachname(nachnameTextField.getText());

			person.setAlter(Integer.parseInt(alterTextField.getText()));

			// Objekt ins Hash schreiben
			DataStorage.INSTANCE.set("Person", person);

			parent.switchPage("Page1");
		} catch (NumberFormatException exception) {
			// Integer-Konvertierungsfehler abfangen
			JOptionPane.showMessageDialog(Page1.this, "Number could not be converted", "Number Format Exception",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
