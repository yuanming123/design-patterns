package com.test.adapter;

public class ConcreteTarget implements Target{
	
	private Adaptee adaptee;
	
	public ConcreteTarget(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	/**
	 * 将Android转化为iphone
	 */
	@Override
	public void useIphone() {
		adaptee.useAndroid();
	}
	
}
