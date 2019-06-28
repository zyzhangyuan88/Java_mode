package com.java.design.mode.template_method.game;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 客户开始使用这个模型
 */
public class Client {

	public static void main(String[] args) {
		SltoModel slto = new SltoModel();
		slto.setNext(false);
		slto.run();

		GameModel pck3 = new Pck3Model();
		pck3.run();
	}
}
