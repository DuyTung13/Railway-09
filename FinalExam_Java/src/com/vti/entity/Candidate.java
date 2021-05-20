package com.vti.entity;

public class Candidate {
	private int id;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String passWord;

	private Category category;

	public enum Category {
		EFRESHERCANDIDATE, FRESHERCANDIDATE
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Candidate(int id, String firstName, String lastName, String phone, String email, String passWord,
			Category category) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.passWord = passWord;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Candidate"+id+ " ID:" + id + " FirstName:" + firstName + " LastName:" + lastName + " Phone:" + phone+ " Email:" + email + " PassWord:" + passWord + " Category=" + category;
	}
}
