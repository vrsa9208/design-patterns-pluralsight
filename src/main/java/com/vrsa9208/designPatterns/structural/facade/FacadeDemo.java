package com.vrsa9208.designPatterns.structural.facade;

import java.util.List;

public class FacadeDemo {

	public static void main(String[] args) {
		List<String> dishes = new MockApiFacadeImpl().getDishesNames();
		
		System.out.println(dishes);
	}

}
