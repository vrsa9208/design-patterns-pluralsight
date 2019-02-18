package com.vrsa9208.designPatterns.structural.composite;

public class CompositeMenuDemo {

	public static void main(String[] args) {
		Menu mainMenu = new Menu("Main", "/main");
		
		MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
		
		mainMenu.add(safetyMenuItem);
		
		Menu claimsSubmenu = new Menu("Claims", "/claims");
		
		mainMenu.add(claimsSubmenu);
		
		MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
		
		claimsSubmenu.add(personalClaimsMenu);
		
		System.out.println(mainMenu.toString());
	}
}
