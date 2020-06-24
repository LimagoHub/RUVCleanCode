package de.demo;

public abstract class AbstractCharacterCounter implements CharacterHandler {

	protected int counter;
	
	@Override
	public void init() {
		counter = 0;

	}

	@Override
	public void destroy() {
		System.out.println(counter);

	}

	
}
