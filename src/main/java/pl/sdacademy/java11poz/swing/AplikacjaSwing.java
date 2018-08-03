package pl.sdacademy.java11poz.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.logging.Logger;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;

import pl.sdacademy.java11poz.jadalnia.MapaPozycjiZamowienia;
import pl.sdacademy.java11poz.jadalnia.PozycjaZamowienia;

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

		DefaultListModel<String> listModel = new DefaultListModel<>();

		// petli / stream / for zrób listę z mapy pozycji
		MapaPozycjiZamowienia mapaPozycji = new MapaPozycjiZamowienia();
		Collection<PozycjaZamowienia> kolekcjaPozycji = mapaPozycji.getPozycjeMapa()
				.values();
		listModel.addElement("USA");
		listModel.addElement("India");
		listModel.addElement("Vietnam");
		listModel.addElement("Canada");
		listModel.addElement("Denmark");
		listModel.addElement("France");
		listModel.addElement("Great Britain");
		listModel.addElement("Japan");

		// create the list
		JList countryList = new JList<>(listModel);
		frame.add(countryList);

		JTextField textField = new JTextField("This is a text", 20);
		frame.add(textField);

		countryList.setBackground(Color.green);
		frame.setVisible(true);// ustawienie widoczności okienka
		frame.setSize(480, 600);// ustawienie rozmiaru okienka
		// frame.setLayout(new GridLayout(4, 2));
		frame.setLayout(new BorderLayout());
		frame.add(button, BorderLayout.LINE_END);
		frame.add(new JButton("North"), BorderLayout.NORTH);
		frame.add(new JButton("South"), BorderLayout.SOUTH);
		frame.add(new JButton("East"), BorderLayout.EAST);
		frame.add(new JButton("West"), BorderLayout.WEST);
		frame.add(countryList, BorderLayout.CENTER);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
