package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;
import com.vti.entity.Position;

public class Account {
	public int ID;
	public String Email;
	public String UserName;
	public String FullName;
	public Department Department;
	public Position Position;
	public LocalDate CreateDate;
	
	public Group[] groups;
	
	

	public Account(int iD, String email, String userName, String FirstName , String LastName) {
		ID = iD;
		Email = email;
		UserName = userName;
		FullName = LastName + FirstName;
	}


	public Account(int iD, String email, String userName, String FirstName , String LastName,Position position,LocalDate createDate) {
		ID = iD;
		Email = email;
		UserName = userName;
		FullName = LastName+FirstName;
		Position = position;
		CreateDate = createDate;
	}


	@Override
	public String toString() {
		return "Account "+ID+ "[ID=" + ID + ", Email=" + Email + ", UserName=" + UserName + ", FullName=" + FullName
				+ ", Department=" + Department + ", Position=" + Position + ", CreateDate=" + CreateDate + ", groups="
				+ Arrays.toString(groups) + "]";
	}
}