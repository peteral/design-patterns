package de.peteral.desingPatterns.creational.abstractFactory;

public class Main {
	public static void main(String[] args) {
		MessengerFactory factory = new MessengerFactoryProvider().getFactory();

		Messenger messenger = factory.createMessenger();

		messenger.deliverMessage("Hello world");
	}
}
