package com.java.design.principle.lsp.section6;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 父类
 */
@SuppressWarnings("all")
public class Father {
	
	public ArrayList doSomething(HashMap map){
		System.out.println("父类被执行...");
		return new ArrayList();
	}
}
