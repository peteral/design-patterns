package de.peteral.desingPatterns.creational.abstractFactory;

public class ConsoleMessenger implements Messenger {
	@Override
	public void deliverMessage(String message) {
		System.out.println(message);
	}
}
