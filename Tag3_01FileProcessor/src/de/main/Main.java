package de.main;

import de.demo.CharacterCounter;
import de.demo.FileKopierer;
import de.demo.FileProcessor;
import de.demo.LineCounter;

public class Main {

	public static void main(String[] args) {
		FileProcessor fileProcessor = new FileProcessor();
		fileProcessor.addCharacterHandler(new CharacterCounter());
		fileProcessor.addCharacterHandler(new LineCounter());
		fileProcessor.addCharacterHandler(new FileKopierer());
		fileProcessor.run("baer.txt");

	}

}
