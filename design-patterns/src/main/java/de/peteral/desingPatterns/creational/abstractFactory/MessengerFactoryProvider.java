package de.peteral.desingPatterns.creational.abstractFactory;

public class MessengerFactoryProvider {

	public MessengerFactory getFactory() {
		String className = System.getProperty("abstractFactory.className",
				"de.peteral.desingPatterns.creational.abstractFactory.ConsoleMessengerFactory");

		try {
			return (MessengerFactory) Class.forName(className).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			throw new MessageProviderException("Failed instantiating factory [" + className + "]: ", e);
		}
	}

}
