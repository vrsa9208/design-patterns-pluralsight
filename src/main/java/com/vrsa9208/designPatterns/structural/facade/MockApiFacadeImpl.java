package com.vrsa9208.designPatterns.structural.facade;

import java.util.List;
import java.util.stream.Collectors;

public class MockApiFacadeImpl implements MockApiFacade {

	@Override
	public List<String> getDishesNames() {
		//The facade simplifies complex API's
		return MockApi.getDishes().stream()
				.map(Dish::getName)
				.collect(Collectors.toList());
	}

}
