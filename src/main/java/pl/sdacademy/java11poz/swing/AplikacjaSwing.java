package pl.sdacademy.java11poz.swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AplikacjaSwing {

	protected final static Logger logger = Logger
			.getLogger(AplikacjaSwing.class.getName()); // java.util.logging.Logger

	public static void main(String[] args) {
		String title = "Moja pierwsza aplikacja";
		// okienko
		JFrame frame = new JFrame(title);

		// przycisk
		String label = "Click me!";
		JButton button = new JButton(label);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				logger.info("Click button");
			}
		});
		// button.setBounds(100, 100, 100, 40);
		frame.add(button);

		frame.setVisible(true);// ustawienie widoczności okienka
		frame.setSize(480, 600);// ustawienie rozmiaru okienka
		frame.setLayout(new GridLayout(3, 1));
	}

}
