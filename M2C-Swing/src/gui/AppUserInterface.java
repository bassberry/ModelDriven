
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
	private Page1 page1 = new Page1(this);

	public AppUserInterface(String title) {
		this.setTitle(title);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(800, 600));
		this.setMinimumSize(new Dimension(400, 200));
		this.initialize();
		this.setVisible(true);
	}

	private void initialize() {
		rootPanel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		// place the panel with our content and form at the top of the frame
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1.0;
		c.weighty = 1.0;
		c.anchor = GridBagConstraints.NORTH;

		// Insert the first page of the form transactions here
		rootPanel.add(page1, c);

		JScrollPane temp = new JScrollPane(rootPanel);

		this.getRootPane().setLayout(new GridBagLayout());
		c.fill = GridBagConstraints.BOTH;
		this.getRootPane().add(temp, c);
	}

	public void switchPage(String pageIdentifier) {
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1.0;
		c.weighty = 1.0;
		c.anchor = GridBagConstraints.NORTH;

		switch (pageIdentifier) {

			case "Page1" :
				rootPanel.removeAll();

				Page2 page2 = new Page2(this);
				rootPanel.add(page2, c);

				rootPanel.revalidate();
				rootPanel.repaint();
				break;

			case "Page2" :
				rootPanel.removeAll();

				Page3 page3 = new Page3(this);
				rootPanel.add(page3, c);

				rootPanel.revalidate();
				rootPanel.repaint();
				break;

			case "Page3" :
				rootPanel.removeAll();

				rootPanel.revalidate();
				rootPanel.repaint();
				break;

			default :
				break;
		}
	}
}
