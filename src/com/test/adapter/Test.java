package com.test.adapter;

public class Test {

	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target target = new ConcreteTarget(adaptee);
		target.useIphone();
	}
}
