package de.demo;

import java.io.FileWriter;
import java.io.IOException;

public class FileKopierer implements CharacterHandler {
	
	private FileWriter out;
	

	@Override
	public void init() {
		try {
			out = new FileWriter("Kopie.txt");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		try {
			out.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void process(char c) {
		try {
			out.write(c);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
