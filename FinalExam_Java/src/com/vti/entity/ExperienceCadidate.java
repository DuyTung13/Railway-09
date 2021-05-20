package com.vti.entity;

public class ExperienceCadidate extends Candidate {

	public ExperienceCadidate(int id, String firstName, String lastName, String phone, String email, String passWord,Category category) {
		super(id, firstName, lastName, phone, email, passWord, category);
	}

	private int expInYear;
	private ProSkill proSkill;

	public enum ProSkill {
		DEV, TEST, JAVA, SQL
	}

	@Override
	public String toString() {
		return "ExperienceCadidate: ExpInYear:" + expInYear + " ProSkill:" + proSkill ;
	}

}
