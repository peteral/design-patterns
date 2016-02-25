package de.peteral.desingPatterns.creational.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class IdentityProvider {
	private static IdentityProvider instance = null;
	private Map<Thread, Integer> data = new ConcurrentHashMap<>();

	public static synchronized IdentityProvider getInstance() {
		if (instance == null) {
			instance = new IdentityProvider();
		}

		return instance;
	}

	public int getIdentity() {
		Thread currentThread = Thread.currentThread();

		Integer id = data.get(currentThread);
		if (id == null) {
			id = (int) (Math.random() * 65535);
			data.put(currentThread, id);
		}

		return id;
	}
}
