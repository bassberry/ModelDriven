
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

public class Pruefung1 extends JPanel {

	private AppUserInterface parent = null;

	// Dateneingabeobjekt (Datenobjekt) deklarieren
	private Pruefung pruefung1 = new Pruefung();

	// Eingabefelder (Textfelder) fuer die jeweiligen Attribute des Datenobjekts
	private JTextField nameTextField = new JTextField("Name", 20);

	private JTextField noteTextField = new JTextField("Note", 20);

	public Pruefung1(AppUserInterface parent) {
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
		Student student = (Student) DataStorage.INSTANCE.get("Student");

		// Panel fuer die Ausgabe erzeugen
		JPanel studentPanel = new JPanel();
		this.add(studentPanel);
		studentPanel.setLayout(new BoxLayout(studentPanel, BoxLayout.Y_AXIS));

		// Name des Datenobjekts
		studentPanel.add(new JLabel("<html><b>Student</b></html>"));

		// Panel fuer das Datenausgabefeld
		JPanel studentPanel_NamePanel = new JPanel();
		studentPanel.add(studentPanel_NamePanel);

		// Textfeld (beschreibt das Attribut)
		studentPanel_NamePanel.add(new JLabel("Name:"));

		// Ausgabefeld (Wert des Attributs)
		studentPanel_NamePanel.add(new JLabel(((Student) student).getName().toString()));

		// Panel fuer das Datenausgabefeld
		JPanel studentPanel_MatrikelnummerPanel = new JPanel();
		studentPanel.add(studentPanel_MatrikelnummerPanel);

		// Textfeld (beschreibt das Attribut)
		studentPanel_MatrikelnummerPanel.add(new JLabel("Matrikelnummer:"));

		// Ausgabefeld (Wert des Attributs)
		studentPanel_MatrikelnummerPanel.add(new JLabel(((Student) student).getMatrikelnummer().toString()));

		// Panel fuer das Datenausgabefeld
		JPanel studentPanel_SemesterPanel = new JPanel();
		studentPanel.add(studentPanel_SemesterPanel);

		// Textfeld (beschreibt das Attribut)
		studentPanel_SemesterPanel.add(new JLabel("Semester:"));

		// Ausgabefeld (Wert des Attributs)
		studentPanel_SemesterPanel.add(new JLabel(((Student) student).getSemester().toString()));

		// Trennlinie zum Hervorheben der verschiedenen Datenobjekte
		studentPanel.add(new JSeparator(JSeparator.HORIZONTAL));

		// Panel erzeugen
		JPanel pruefung1Panel = new JPanel();
		this.add(pruefung1Panel);
		pruefung1Panel.setLayout(new BoxLayout(pruefung1Panel, BoxLayout.Y_AXIS));

		// Name des Datenobjekts
		pruefung1Panel.add(new JLabel("<html><b>Pruefung1</b></html>"));

		// Panel fuer das aktuelle Dateneingabefeld
		JPanel pruefung1Panel_NamePanel = new JPanel();
		pruefung1Panel.add(pruefung1Panel_NamePanel);

		// Name des Attributs ausgeben
		pruefung1Panel_NamePanel.add(new JLabel("Name:"));

		// FocusListener fuer das aktuelle Eingabefeld (um den Text zu markieren, wenn in das Textfeld geklickt wird)
		nameTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(final FocusEvent pE) {
			}
			@Override
			public void focusGained(final FocusEvent pE) {
				nameTextField.selectAll();
			}
		});

		// Eingabefeld in das Panel einfuegen
		pruefung1Panel_NamePanel.add(nameTextField);

		// Panel fuer das aktuelle Dateneingabefeld
		JPanel pruefung1Panel_NotePanel = new JPanel();
		pruefung1Panel.add(pruefung1Panel_NotePanel);

		// Name des Attributs ausgeben
		pruefung1Panel_NotePanel.add(new JLabel("Note:"));

		// FocusListener fuer das aktuelle Eingabefeld (um den Text zu markieren, wenn in das Textfeld geklickt wird)
		noteTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(final FocusEvent pE) {
			}
			@Override
			public void focusGained(final FocusEvent pE) {
				noteTextField.selectAll();
			}
		});

		// Eingabefeld in das Panel einfuegen
		pruefung1Panel_NotePanel.add(noteTextField);

		// Trennlinie zum Hervorheben der verschiedenen Datenobjekte
		pruefung1Panel.add(new JSeparator(JSeparator.HORIZONTAL));

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

			pruefung1.setName(nameTextField.getText());

			pruefung1.setNote(Integer.parseInt(noteTextField.getText()));

			// Objekt ins Hash schreiben
			DataStorage.INSTANCE.set("Pruefung1", pruefung1);

			parent.switchPage("Pruefung1");
		} catch (NumberFormatException exception) {
			// Integer-Konvertierungsfehler abfangen
			JOptionPane.showMessageDialog(Pruefung1.this, "Number could not be converted", "Number Format Exception",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
