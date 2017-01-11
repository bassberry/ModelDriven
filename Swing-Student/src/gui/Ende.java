
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

public class Ende extends JPanel {

	private AppUserInterface parent = null;

	public Ende(AppUserInterface parent) {
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

		// Datenobjekt laden
		Pruefung pruefung1 = (Pruefung) DataStorage.INSTANCE.get("Pruefung1");

		// Panel fuer die Ausgabe erzeugen
		JPanel pruefung1Panel = new JPanel();
		this.add(pruefung1Panel);
		pruefung1Panel.setLayout(new BoxLayout(pruefung1Panel, BoxLayout.Y_AXIS));

		// Name des Datenobjekts
		pruefung1Panel.add(new JLabel("<html><b>Pruefung1</b></html>"));

		// Panel fuer das Datenausgabefeld
		JPanel pruefung1Panel_NamePanel = new JPanel();
		pruefung1Panel.add(pruefung1Panel_NamePanel);

		// Textfeld (beschreibt das Attribut)
		pruefung1Panel_NamePanel.add(new JLabel("Name:"));

		// Ausgabefeld (Wert des Attributs)
		pruefung1Panel_NamePanel.add(new JLabel(((Pruefung) pruefung1).getName().toString()));

		// Panel fuer das Datenausgabefeld
		JPanel pruefung1Panel_NotePanel = new JPanel();
		pruefung1Panel.add(pruefung1Panel_NotePanel);

		// Textfeld (beschreibt das Attribut)
		pruefung1Panel_NotePanel.add(new JLabel("Note:"));

		// Ausgabefeld (Wert des Attributs)
		pruefung1Panel_NotePanel.add(new JLabel(((Pruefung) pruefung1).getNote().toString()));

		// Trennlinie zum Hervorheben der verschiedenen Datenobjekte
		pruefung1Panel.add(new JSeparator(JSeparator.HORIZONTAL));

		// Datenobjekt laden
		Pruefung pruefung2 = (Pruefung) DataStorage.INSTANCE.get("Pruefung2");

		// Panel fuer die Ausgabe erzeugen
		JPanel pruefung2Panel = new JPanel();
		this.add(pruefung2Panel);
		pruefung2Panel.setLayout(new BoxLayout(pruefung2Panel, BoxLayout.Y_AXIS));

		// Name des Datenobjekts
		pruefung2Panel.add(new JLabel("<html><b>Pruefung2</b></html>"));

		// Panel fuer das Datenausgabefeld
		JPanel pruefung2Panel_NamePanel = new JPanel();
		pruefung2Panel.add(pruefung2Panel_NamePanel);

		// Textfeld (beschreibt das Attribut)
		pruefung2Panel_NamePanel.add(new JLabel("Name:"));

		// Ausgabefeld (Wert des Attributs)
		pruefung2Panel_NamePanel.add(new JLabel(((Pruefung) pruefung2).getName().toString()));

		// Panel fuer das Datenausgabefeld
		JPanel pruefung2Panel_NotePanel = new JPanel();
		pruefung2Panel.add(pruefung2Panel_NotePanel);

		// Textfeld (beschreibt das Attribut)
		pruefung2Panel_NotePanel.add(new JLabel("Note:"));

		// Ausgabefeld (Wert des Attributs)
		pruefung2Panel_NotePanel.add(new JLabel(((Pruefung) pruefung2).getNote().toString()));

		// Trennlinie zum Hervorheben der verschiedenen Datenobjekte
		pruefung2Panel.add(new JSeparator(JSeparator.HORIZONTAL));

	}

	private void triggerNextPage() {
		try {

			parent.switchPage("Ende");
		} catch (NumberFormatException exception) {
			// Integer-Konvertierungsfehler abfangen
			JOptionPane.showMessageDialog(Ende.this, "Number could not be converted", "Number Format Exception",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
