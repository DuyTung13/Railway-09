package com.vti.entity;

import com.vti.entity.Candidate.Category;

public class FresherCadidate extends Candidate {

	private GraduationRank graduationRank;

	public enum GraduationRank {
		EXCELLENCE, GOOD, FAIR, POOR
	}

	@Override
	public String toString() {
		return "FresherCadidate: GraduationRank:" + graduationRank + "]";
	}

	public GraduationRank getGraduationRank() {

		return graduationRank;
	}

	public void setGraduationRank(GraduationRank graduationRank) {
		this.graduationRank = graduationRank;
	}

	public FresherCadidate(int id, String firstName, String lastName, String phone, String email, String passWord,Category category, GraduationRank graduationRank) {
		super(id, firstName, lastName, phone, email, passWord, category);
		this.graduationRank = graduationRank;
	}
}
