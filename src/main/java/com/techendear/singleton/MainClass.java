package com.techendear.singleton;

public class MainClass {

	public static void main(String[] args) {
		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		SingletonEager eager2 = SingletonEager.getInstance();
		System.out.println(eager2);
		
		System.out.println("--------Lazy---------");
		
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		SingletonLazy lazy1 = SingletonLazy.getInstance();
		System.out.println(lazy1);
		
		System.out.println("--------Lazy Synchronized---------");

		final ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
		
	    new Thread() {
			public void run() {
				System.out.println(singleton);
			}
		}.start();
		
		new Thread() {
			public void run() {
				System.out.println(singleton);
			}
		}.start();
		
		new Thread() {
			public void run() {
				System.out.println(singleton);
			}
		}.start();

	}
}
