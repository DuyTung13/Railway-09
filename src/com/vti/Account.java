package com.vti;

import java.time.LocalDate;
import java.util.Arrays;

public class Account {
	public int ID;
	public String Email;
	public String UserName;
	public String FullName;
	public Department Department;
	public Position Position;
	public LocalDate CreateDate;
	
	public Group[] groups;

	@Override
	public String toString() {
		return "Account [ID=" + ID + ", Email=" + Email + ", UserName=" + UserName + ", FullName=" + FullName
				+ ", Department=" + Department.name + ", Position=" + Position.name + ", CreateDate=" + CreateDate + ", groups="
				+ Arrays.toString(groups) + "]";
	}

	public Account() {
		super();
	}

	public Account(int iD, String email, String userName, String fullName, com.vti.Department department,
			com.vti.Position position, LocalDate createDate, Group[] groups) {
		super();
		ID = iD;
		Email = email;
		UserName = userName;
		FullName = fullName;
		Department = department;
		Position = position;
		CreateDate = createDate;
		this.groups = groups;
	}
	}
