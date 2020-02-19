package org.zoudeng.entity;

public class Login {
private int UserId;
private String UserName;
private String UserPwd;

public Login() {
	
}
public Login( String userName, String userPwd) {

	UserName = userName;
	UserPwd = userPwd;
}
public int getUserId() {
	return UserId;
}
public void setUserId(int userId) {
	UserId = userId;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getUserPwd() {
	return UserPwd;
}
public void setUserPwd(String userPwd) {
	UserPwd = userPwd;
}
}
