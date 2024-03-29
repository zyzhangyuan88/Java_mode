package com.java.design.mode.factory.abstract1.demo2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 场景类
 */
public class Client {

	public static void main(String[] args) {
		//定义出两个工厂
		AbstractCreator creator1 = new Creator1();
		AbstractCreator creator2 = new Creator2();
		
		//产生A1对象
		AbstractProductA a1 =  creator1.createProductA();
		a1.doSomething();
		//产生A2对象
		AbstractProductA a2 = creator2.createProductA();
		a2.doSomething();
		//产生B1对象
		AbstractProductB b1 = creator1.createProductB();
		b1.doSomething();
		//产生B2对象
		AbstractProductB b2 = creator2.createProductB();
		b2.doSomething();
		
		/*
		 * 然后在这里就可以为所欲为了...
		 */
		
	}
}
