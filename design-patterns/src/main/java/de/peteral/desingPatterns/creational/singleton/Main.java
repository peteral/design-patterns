package de.peteral.desingPatterns.creational.singleton;

public class Main {

	public static void main(String[] args) {
		System.out.println(IdentityProvider.getInstance().getIdentity());
		System.out.println(IdentityProvider.getInstance().getIdentity());

		new Thread(() -> {
			System.out.println(IdentityProvider.getInstance().getIdentity());
			System.out.println(IdentityProvider.getInstance().getIdentity());
		}).start();
	}
}
