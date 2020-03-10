package com.techendear.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	public static ThreadSafeSingleton getInstance() {

		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				return instance = new ThreadSafeSingleton();
			}
		}
		return instance;
	}
}
