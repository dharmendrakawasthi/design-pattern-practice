package com.techendear.singleton;

public class SingletonLazy {

	private static SingletonLazy instance;

	private SingletonLazy() {
	}

	public static SingletonLazy getInstance() {
		if (instance == null)
			return instance = new SingletonLazy();
		return instance;
	}
}
