
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

	private Person person = new Person();

	private JTextField vornameTextField = new JTextField("Vorname", 20);

	private JTextField nachnameTextField = new JTextField("Nachname", 20);

	private JTextField alterTextField = new JTextField("Alter", 20);

	public Page1(AppUserInterface parent) {
		this.parent = parent;
		this.initialize();
	}

	private void initialize() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.addWidgetsToScreen();
	}

	private void addWidgetsToScreen() {

		JPanel personPanel = new JPanel();
		this.add(personPanel);
		personPanel.setLayout(new BoxLayout(personPanel, BoxLayout.Y_AXIS));

		JPanel personPanel_VornamePanel = new JPanel();
		personPanel.add(personPanel_VornamePanel);

		personPanel_VornamePanel.add(new JLabel("Vorname:"));

		vornameTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(final FocusEvent pE) {
			}
			@Override
			public void focusGained(final FocusEvent pE) {
				vornameTextField.selectAll();
			}
		});
		personPanel_VornamePanel.add(vornameTextField);

		JPanel personPanel_NachnamePanel = new JPanel();
		personPanel.add(personPanel_NachnamePanel);

		personPanel_NachnamePanel.add(new JLabel("Nachname:"));

		nachnameTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(final FocusEvent pE) {
			}
			@Override
			public void focusGained(final FocusEvent pE) {
				nachnameTextField.selectAll();
			}
		});
		personPanel_NachnamePanel.add(nachnameTextField);

		JPanel personPanel_AlterPanel = new JPanel();
		personPanel.add(personPanel_AlterPanel);

		personPanel_AlterPanel.add(new JLabel("Alter:"));

		alterTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(final FocusEvent pE) {
			}
			@Override
			public void focusGained(final FocusEvent pE) {
				alterTextField.selectAll();
			}
		});
		personPanel_AlterPanel.add(alterTextField);

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

			person.setVorname(vornameTextField.getText());

			person.setNachname(nachnameTextField.getText());

			person.setAlter(Integer.parseInt(alterTextField.getText()));

			DataStorage.INSTANCE.set("Person", person);

			parent.switchPage("Page1");
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(Page1.this, "Number could not be converted", "Number Format Exception",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
