package com.java.design.mode.proxy.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class RealSubject implements Subject {
	
	//实现方法
	public void request() {
		//业务逻辑处理
		System.out.println("===RealSubject===request======");
	}

}
