package com.vti.entity;

public class Account_Exercise_4 {
	private String id;
	private String name;
	private int balance;
	
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	
	public int Credit(int amuont) {
		amuont = balance;
		return amuont;
	}
	
	@Override
	public String toString() {
		return "Account_Exercise_4: "+id+ " id=" + id + ", name=" + name + ", balance=" + balance ;
	}

}
