package com.digitalbooks.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "USER")
public class User {

	@Column(name = "USER-ID")
	private Integer userId;
	@Column(name = "USER-FIRSTNAME")
	private String userFirstName;
	@Column(name = "USER-LASTNAME")
	private String userLastName;
	@Column(name = "USER-EMAIL")
	private String userEmail;
	@Column(name = "USERNAME")
	private String userName;
	@Column(name = "USER-PASSWORD")
	private String userPassword;
	@Column(name="USER-Role")
	private String userRole;

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public User(Integer userId, String userFirstName, String userLastName, String userEmail, String userName,
			String userPassword, String userRole) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userRole = userRole;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userEmail=" + userEmail + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userRole=" + userRole + "]";
	}

}
