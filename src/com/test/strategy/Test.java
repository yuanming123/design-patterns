package com.test.strategy;

public class Test {
	public static void main(String[] args) {
		Strategy strategy = new ConcreteStrategyA();
		Context context = new Context(strategy);
		context.method();
	}
}
