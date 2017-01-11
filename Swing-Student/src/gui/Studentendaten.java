
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

public class Studentendaten extends JPanel {

	private AppUserInterface parent = null;

	// Dateneingabeobjekt (Datenobjekt) deklarieren
	private Student student = new Student();

	// Eingabefelder (Textfelder) fuer die jeweiligen Attribute des Datenobjekts
	private JTextField nameTextField = new JTextField("Name", 20);

	private JTextField matrikelnummerTextField = new JTextField("Matrikelnummer", 20);

	private JTextField semesterTextField = new JTextField("Semester", 20);

	public Studentendaten(AppUserInterface parent) {
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
		JPanel studentPanel = new JPanel();
		this.add(studentPanel);
		studentPanel.setLayout(new BoxLayout(studentPanel, BoxLayout.Y_AXIS));

		// Name des Datenobjekts
		studentPanel.add(new JLabel("<html><b>Student</b></html>"));

		// Panel fuer das aktuelle Dateneingabefeld
		JPanel studentPanel_NamePanel = new JPanel();
		studentPanel.add(studentPanel_NamePanel);

		// Name des Attributs ausgeben
		studentPanel_NamePanel.add(new JLabel("Name:"));

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
		studentPanel_NamePanel.add(nameTextField);

		// Panel fuer das aktuelle Dateneingabefeld
		JPanel studentPanel_MatrikelnummerPanel = new JPanel();
		studentPanel.add(studentPanel_MatrikelnummerPanel);

		// Name des Attributs ausgeben
		studentPanel_MatrikelnummerPanel.add(new JLabel("Matrikelnummer:"));

		// FocusListener fuer das aktuelle Eingabefeld (um den Text zu markieren, wenn in das Textfeld geklickt wird)
		matrikelnummerTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(final FocusEvent pE) {
			}
			@Override
			public void focusGained(final FocusEvent pE) {
				matrikelnummerTextField.selectAll();
			}
		});

		// Eingabefeld in das Panel einfuegen
		studentPanel_MatrikelnummerPanel.add(matrikelnummerTextField);

		// Panel fuer das aktuelle Dateneingabefeld
		JPanel studentPanel_SemesterPanel = new JPanel();
		studentPanel.add(studentPanel_SemesterPanel);

		// Name des Attributs ausgeben
		studentPanel_SemesterPanel.add(new JLabel("Semester:"));

		// FocusListener fuer das aktuelle Eingabefeld (um den Text zu markieren, wenn in das Textfeld geklickt wird)
		semesterTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(final FocusEvent pE) {
			}
			@Override
			public void focusGained(final FocusEvent pE) {
				semesterTextField.selectAll();
			}
		});

		// Eingabefeld in das Panel einfuegen
		studentPanel_SemesterPanel.add(semesterTextField);

		// Trennlinie zum Hervorheben der verschiedenen Datenobjekte
		studentPanel.add(new JSeparator(JSeparator.HORIZONTAL));

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

			student.setName(nameTextField.getText());

			student.setMatrikelnummer(matrikelnummerTextField.getText());

			student.setSemester(Integer.parseInt(semesterTextField.getText()));

			// Objekt ins Hash schreiben
			DataStorage.INSTANCE.set("Student", student);

			parent.switchPage("Studentendaten");
		} catch (NumberFormatException exception) {
			// Integer-Konvertierungsfehler abfangen
			JOptionPane.showMessageDialog(Studentendaten.this, "Number could not be converted",
					"Number Format Exception", JOptionPane.ERROR_MESSAGE);
		}
	}
}
