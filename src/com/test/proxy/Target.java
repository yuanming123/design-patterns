package com.test.proxy;

/**
 * 实际的实现方法
 * @author Administrator
 * @date 2018年10月8日
 */
public class Target implements Subject{

	@Override
	public void print() {
		System.out.println("Hello World!");
	}
	
}
