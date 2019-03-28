package com.vrsa9208.designPatterns.behavioral.visitor;

public class Oil implements AtvPart {
	
	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}
}
