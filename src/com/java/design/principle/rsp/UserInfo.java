package com.java.design.principle.rsp;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * �û������ʵ����
 */
public class UserInfo implements IUserInfo {

	private String userName;
	private String userID;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
		changePassword(password);
	}
	
	//�޸��û�����
	public boolean changePassword(String password){
		System.out.println("changePassword=======>"+password);
		return true;
	}
	
	//ɾ���û�
	public boolean deleteUser(){
		System.out.println("deleteUser");
		return true;
	}
	
	//�û�ӳ��
	public void mapUser(){
		System.out.println("mapUser.");
	}
	
	//���һ����֯
	public void addOrg(IUserBO userBO,int orgID){
		System.out.println("�����֯�ɹ�...");
	}
	
	//���һ���ɫ
	public void addRole(IUserBO userBO,int roleID){
		System.out.println("��ӽ�ɫ�ɹ�...");
	}
}
