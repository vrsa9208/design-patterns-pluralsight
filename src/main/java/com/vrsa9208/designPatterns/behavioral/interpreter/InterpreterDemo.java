package com.vrsa9208.designPatterns.behavioral.interpreter;

public class InterpreterDemo {
	
	static Expression buildInterpreterTree() {
		
		Expression terminal1 = new TerminalExpression("Lions");
		Expression terminal2 = new TerminalExpression("Tigers");
		Expression terminal3 = new TerminalExpression("Bears");
		
		return new AndExpression(terminal1, terminal2);
	}

	public static void main(String[] args) {
//		String context = "Lions";
//		String context = "Tigers";
//		String context = "Bears";
		String context = "Lions Tigers";
//		String context = "Lions Bears";
//		String context = "Tigers Bears";
		
		Expression define = buildInterpreterTree();
		
		System.out.println(context + " is " + define.interpret(context));
	}
}
