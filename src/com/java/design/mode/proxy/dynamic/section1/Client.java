package com.java.design.mode.proxy.dynamic.section1;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all.
 */
public class Client {
	private static DynamicProxy proxy;
	private static Subject subject;

	public static void main(String[] args) {
		subject = new RealSubject();
		proxy = new DynamicProxy(subject);
		proxy.exec("doSomething", args);

	}
}
