package com.vrsa9208.designPatterns.creational.singleton;

public class DbSingleton {

	private static volatile DbSingleton instance = null;
	
	private DbSingleton() {
		// This validation is for instances using reflection
		if(instance != null) {
			throw new RuntimeException("Use getInstance() method to create");
		}
	}
	
	public static DbSingleton getInstance() {
		if(instance == null) {
			synchronized(DbSingleton.class) {	
				if(instance == null) {					
					instance = new DbSingleton();
				}
			}
		}
		
		return instance;
	}
}
