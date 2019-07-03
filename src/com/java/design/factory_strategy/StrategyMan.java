package com.java.design.factory_strategy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 策略登记
 */
public enum StrategyMan {
	
	SteadyDeduction("com.java.design.SteadyDeduction"),
	FreeDeduction("com.java.design.FreeDeduction");
	
	String value = "";
	private StrategyMan(String _value){
		this.value = _value;
	}
	
	public String getValue(){
		return this.value;
	}
}
