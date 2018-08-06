package pl.sdacademy.java11poz.main;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class StrumienieNIO {

	public static void main(String[] args) {

		// \\ <=> / jest rownoznaczy na windows system
		// File.separator - separator zalezny od systemu operacyjnego
		String filepath = "C:" + File.separator
				+ "Users\\trener\\Desktop\\dev\\git\\github\\java11poz\\plik.txt";
		System.out.println("filepath: " + filepath);
		Path path1 = Paths.get(filepath);

		// file:/C:/a.txt <- On Windows
		// file:///C:/a.txt <- On Windows
		// file:///home/user/a.txt <- On Linux
		String filepath2 = "C:/Users/trener/Desktop/dev/git/github/java11poz/plik.txt";
		Path path2 = Paths.get(URI.create("file:/" + filepath2));

		System.out.println("parent: " + path1.getParent().getFileName());

		try {
			BasicFileAttributes basicFile = Files.readAttributes(path2,
					BasicFileAttributes.class);
			System.out.println("isDirectory: " + basicFile.isDirectory());
			System.out.println("size: " + basicFile.size());
			System.out.println("creationTime: " + basicFile.creationTime());

		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
