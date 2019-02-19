package com.vrsa9208.designPatterns.structural.facade;

import java.util.List;

public class JdbcFacade {

	public int createTable() {
		//Simplifies the process of creating a table, hiding its complexity
		return 0;
	}
	
	public int insertIntoTable() {
		//Simplifies the process of insert into a table, hiding its complexity
		return 0;
	}
	
	public List<Address> getAddresses() {
		//Simplifies the process of returning addresses, hiding its complexity
		return null;
	}
}
