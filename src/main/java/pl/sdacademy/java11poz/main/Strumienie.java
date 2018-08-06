package pl.sdacademy.java11poz.main;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;

public class Strumienie {

	public static void main(String[] args) {

		try {
			FileReader input = new FileReader("plik.txt");
			FileWriter output = new FileWriter("plik2.txt");
			// kopiowanie z input do output
			copy(input, output);

			// nie uzywane streamy zamykamy
			input.close();
			output.close();

			String message = "Wstep do programowania";
			StringReader input2 = new StringReader(message);
			FileWriter output2 = new FileWriter("plik3.txt");

			// kopiowanie z input2 do output2
			copy(input2, output2);
			input2.close();
			output2.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void copy(Reader input, Writer output) throws IOException {

		int c;
		while ((c = input.read()) != -1) {
			output.write(c);
		}

	}
}
