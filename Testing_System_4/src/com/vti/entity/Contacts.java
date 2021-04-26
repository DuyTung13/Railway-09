package com.vti.entity;

public class Contacts extends Phone {
	private String number;
	private String name;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Contacts [number=" + number + ", name=" + name + "]";
	}
	@Override
	public void insertContact(String name, String phone) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeContact(String name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateContact(String name, String newphone) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void searchContact(String name) {
		// TODO Auto-generated method stub
		
	}
	
	
}
