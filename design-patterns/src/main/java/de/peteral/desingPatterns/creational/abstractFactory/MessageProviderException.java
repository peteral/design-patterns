package de.peteral.desingPatterns.creational.abstractFactory;

public class MessageProviderException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public MessageProviderException(String message, Throwable reason) {
		super(message, reason);
	}

}
