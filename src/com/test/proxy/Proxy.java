package com.test.proxy;

/**
 * 代理类
 * @author Administrator
 * @date 2018年10月8日
 */
public class Proxy implements Subject{
	
	private Subject target;
	
	public Proxy(Subject target){
		this.target = target;
	}

	@Override
	public void print() {
		System.out.println("begin");
		target.print();
		System.out.println("end");
	}
	
}
