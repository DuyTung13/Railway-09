package com.vti;

import java.time.LocalDate;

public class Account {
	public int AccountID;
	public String Email;
	public String UserName;
	public String FullName;
	public Department Department;
	public Position Position;
	public LocalDate CreateDate;
	
	public Group[] group;
}
