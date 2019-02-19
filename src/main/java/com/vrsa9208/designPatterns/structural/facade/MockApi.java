package com.vrsa9208.designPatterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class MockApi {

	public static List<Dish> getDishes() {
		
		List<Dish> dishes = new ArrayList<>();
		
		Dish dish1 = new Dish();
		dish1.setName("Spaguetti");
		dishes.add(dish1);
		
		Dish dish2 = new Dish();
		dish2.setName("Chicken Soup");
		dishes.add(dish2);
		
		Dish dish3 = new Dish();
		dish3.setName("Beef");
		dishes.add(dish3);
		
		Dish dish4 = new Dish();
		dish4.setName("Pork");
		dishes.add(dish4);
		
		Dish dish5 = new Dish();
		dish5.setName("Ramen");
		dishes.add(dish5);
		
		return dishes;
	}
}
