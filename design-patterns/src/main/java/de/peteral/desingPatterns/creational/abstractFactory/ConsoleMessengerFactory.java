package de.peteral.desingPatterns.creational.abstractFactory;

public class ConsoleMessengerFactory implements MessengerFactory {

	@Override
	public Messenger createMessenger() {
		return new ConsoleMessenger();
	}

}
