package de.demo;

public class LineCounter extends AbstractCharacterCounter {
	
	

	@Override
	public void process(char c) {
		if(c == '\n')
			counter ++;
	}

}
