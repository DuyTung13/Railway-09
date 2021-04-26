package com.vti.entity;

import java.util.ArrayList;

public class VietnamesePhone extends Phone {
	private ArrayList <Contacts> contacts;
	
	public VietnamesePhone() {
		contacts = new ArrayList <Contacts>();
	}

	@Override
	public void insertContact(String name, String phone) {
		Contacts contact = new Contacts();
		contacts.add(contact);
	}

	@Override
	public void removeContact(String name) {
		contacts.removeIf(contact -> contact.getName().equals(name));
	}

	@Override
	public void updateContact(String name, String newphone) {
		for (Contacts contact :contacts) {
			if(contact.getName().equals(name)) {
				contact.setNumber(newphone);
			}
		}
	}

	@Override
	public void searchContact(String name) {
		for(Contacts contact : contacts) {
			if(contact.getName().equals(name)) {
				System.out.println(contact);
			}
		}
	}
	
	public void printContact() {
		for (Contacts contact : contacts) {
			System.out.println(contact);
		}
	}

	@Override
	public String toString() {
		return "VietnamesePhone " + contacts ;
	}
	}
