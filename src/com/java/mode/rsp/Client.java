package com.java.mode.rsp;

public class Client {
	
	public static void main(String[] args) {
		IUserBiz userInfo = new UserInfo();
		
		IUserBO userBO = (IUserBO)userInfo;
		userBO.setPassword("abc");
		
		IUserBiz userBiz = (IUserBiz)userInfo;
		userBiz.deleteUser();
				
	}
}
