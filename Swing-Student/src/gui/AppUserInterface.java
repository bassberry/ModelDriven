
package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class AppUserInterface extends JFrame {

	private JPanel rootPanel = new JPanel();
	private Studentendaten studentendaten = new Studentendaten(this);

	public AppUserInterface(String title) {
		// Fenster definieren und sichtbar machen
		this.setTitle(title);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(800, 600));
		this.setMinimumSize(new Dimension(400, 200));
		this.initialize();
		this.setVisible(true);
	}

	private void initialize() {
		// Layout des Fensters setzen
		rootPanel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		// Das Panel mit allen Inhalten an die vorderste Ebene im Fenster setzen
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1.0;
		c.weighty = 1.0;
		c.anchor = GridBagConstraints.NORTH;

		// Erste Seite laden
		rootPanel.add(studentendaten, c);

		JScrollPane temp = new JScrollPane(rootPanel);

		this.getRootPane().setLayout(new GridBagLayout());
		c.fill = GridBagConstraints.BOTH;
		this.getRootPane().add(temp, c);
	}

	// Seite wechseln
	public void switchPage(String pageIdentifier) {
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1.0;
		c.weighty = 1.0;
		c.anchor = GridBagConstraints.NORTH;

		// Erkennen, welche Seite gerade angezeigt wird
		switch (pageIdentifier) {

			case "Studentendaten" :
				rootPanel.removeAll();

				// Naechste Seite in das Fenster laden
				Pruefung1 pruefung1 = new Pruefung1(this);
				rootPanel.add(pruefung1, c);

				rootPanel.revalidate();
				rootPanel.repaint();
				break;

			case "Pruefung1" :
				rootPanel.removeAll();

				// Naechste Seite in das Fenster laden
				Pruefung2 pruefung2 = new Pruefung2(this);
				rootPanel.add(pruefung2, c);

				rootPanel.revalidate();
				rootPanel.repaint();
				break;

			case "Pruefung2" :
				rootPanel.removeAll();

				// Naechste Seite in das Fenster laden
				Ende ende = new Ende(this);
				rootPanel.add(ende, c);

				rootPanel.revalidate();
				rootPanel.repaint();
				break;

			case "Ende" :
				rootPanel.removeAll();

				rootPanel.revalidate();
				rootPanel.repaint();
				break;

			default :
				break;
		}
	}
}
