package com.vti;

import java.time.LocalDate;

public class Group {
	public int GroupID;
	public String GroupName;
	public Account CreatorID;
	public LocalDate CreateDate;
	
	public Account[] account;
}
