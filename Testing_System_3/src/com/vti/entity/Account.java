package com.vti.entity;

import java.time.LocalDate;

public class Account {
	private String Email;
	private String UserName;
	private String FullName;
	LocalDate CreateDate;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public LocalDate getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(LocalDate createDate) {
		CreateDate = createDate;
	}
	
	
}
