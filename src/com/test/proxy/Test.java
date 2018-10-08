package com.test.proxy;
/**
 * 测试类
 * @author Administrator
 * @date 2018年10月8日
 */
public class Test {
	public static void main(String[] args) {
		Subject target = new Target();
		Subject proxy = new Proxy(target);
		proxy.print();
	}
}
