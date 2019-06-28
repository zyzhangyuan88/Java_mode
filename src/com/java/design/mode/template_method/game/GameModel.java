package com.java.design.mode.template_method.game;

public abstract class GameModel {
	/** * 游戏初始状态*/
	public abstract void gameInit();
	/** * 开启销售*/
	public abstract void startSale();
	/** * 关闭销售*/
	public abstract void stopSale();
	/** * 开启下一期*/
	public abstract void startNewPeriod();
	/** * 启动期终子流程*/
	public abstract void procPeriodEnd();

	public void run(){
		this.gameInit();
		this.startSale();
		this.stopSale();
		if(this.isNext()){
			this.startNewPeriod();
			this.procPeriodEnd();
		}
	}

	protected boolean isNext(){
		return true;
	}
}
