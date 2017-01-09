
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

public class Page1 extends JPanel {

	private AppUserInterface parent = null;

	private Person person1 = new Person();

	private JTextField nameTextField = new JTextField("Name", 20);

	public Page1(AppUserInterface parent) {
		this.parent = parent;
		this.initialize();
	}

	private void initialize() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.addWidgetsToScreen();
	}

	private void addWidgetsToScreen() {

		JPanel person1Panel = new JPanel();
		this.add(person1Panel);
		person1Panel.setLayout(new BoxLayout(person1Panel, BoxLayout.Y_AXIS));

		JPanel person1Panel_NamePanel = new JPanel();
		person1Panel.add(person1Panel_NamePanel);

		person1Panel_NamePanel.add(new JLabel("Name:"));

		nameTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(final FocusEvent pE) {
			}
			@Override
			public void focusGained(final FocusEvent pE) {
				nameTextField.selectAll();
			}
		});
		person1Panel_NamePanel.add(nameTextField);

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

			person1.setName(nameTextField.getText());

			DataStorage.INSTANCE.set("Person1", person1);

			parent.switchPage("Page1");
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(Page1.this, "Number could not be converted", "Number Format Exception",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
