/**
 * 
 */
package com.yeehom.ecommerseminiprog.pojo;

import java.sql.Date;

import org.springframework.stereotype.Component;

/**
 * @author YeeHomFu
 *
 */
@Component
public class UserPojo {

	private String userName;
	private String userPwd;
	private String userEmail;
	private int userPhone;
	private Date regTime;
	private String userNickName;
	private int userGender;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	public int getUserGender() {
		return userGender;
	}

	public void setUserGender(int userGender) {
		this.userGender = userGender;
	}

	@Override
	public String toString() {
		return "UserPojo [userName=" + userName + ", userPwd=" + userPwd + ", userEmail=" + userEmail + ", userPhone="
				+ userPhone + ", regTime=" + regTime + ", userNickName=" + userNickName + ", userGender=" + userGender
				+ "]";
	}

}
