package com.vti;

import java.time.LocalDate;

public class Account {
	public int ID;
	public String Email;
	public String UserName;
	public String FullName;
	public Department Department;
	public Position Position;
	public LocalDate CreateDate;
	
	public Group[] groups;
}
