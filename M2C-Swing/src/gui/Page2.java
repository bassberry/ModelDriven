
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

public class Page2 extends JPanel {

	private AppUserInterface parent = null;

	private Adresse adresse1 = new Adresse();

	private JTextField strasseTextField = new JTextField("Strasse", 20);

	public Page2(AppUserInterface parent) {
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

		JPanel adresse1Panel = new JPanel();
		this.add(adresse1Panel);
		adresse1Panel.setLayout(new BoxLayout(adresse1Panel, BoxLayout.Y_AXIS));

		JPanel adresse1Panel_StrassePanel = new JPanel();
		adresse1Panel.add(adresse1Panel_StrassePanel);

		adresse1Panel_StrassePanel.add(new JLabel("Strasse:"));

		strasseTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(final FocusEvent pE) {
			}
			@Override
			public void focusGained(final FocusEvent pE) {
				strasseTextField.selectAll();
			}
		});
		adresse1Panel_StrassePanel.add(strasseTextField);

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

			adresse1.setStrasse(strasseTextField.getText());

			DataStorage.INSTANCE.set("Adresse1", adresse1);

			parent.switchPage("Page2");
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(Page2.this, "Number could not be converted", "Number Format Exception",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
