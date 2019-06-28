package com.java.design.principle.rsp;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public interface IUserBiz {

	public boolean changePassword(String oldPassword);
	
	public boolean deleteUser();
	
	public void mapUser();
	
	public void addOrg(IUserBO userBO, int orgID);
	
	public void addRole(IUserBO userBO, int roleID);
}
