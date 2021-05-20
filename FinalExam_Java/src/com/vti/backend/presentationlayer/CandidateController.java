package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.businesslayer.CandidateServices;
import com.vti.backend.businesslayer.ICandidateServices;
import com.vti.entity.ExperienceCadidate.ProSkill;
import com.vti.entity.FresherCadidate.GraduationRank;

public class CandidateController {
	private ICandidateServices candidateServices;

	public CandidateController() throws FileNotFoundException, IOException {
		candidateServices = new CandidateServices();

	}

	public boolean isCadidateExist(String email) throws ClassNotFoundException, SQLException {
		return candidateServices.isCadidateExist(email);

	}

	public Boolean loginCadidate(String email, String password) throws ClassNotFoundException, SQLException {
		if (email == null || email.length() > 30 || email.length() < 6) {

			System.out.println(" Information Email false ");
			return false;
		} else {
			return candidateServices.loginCadidate(email, password);

		}

	}

	public boolean createExperienceCandidate(String firstName, String lastName, String phone, String email,
			String userName, String password, int expInYear, ProSkill proSkill) throws ClassNotFoundException, SQLException {
		return candidateServices.createExperienceCandidate(firstName, lastName, phone, email, userName, password,
				expInYear, proSkill);

	}

	public boolean createFresherCandidate(String firstName, String lastName, String phone, String email,
			String userName, String password, GraduationRank graduationRank) throws ClassNotFoundException, SQLException {
		return candidateServices.createFresherCandidate(firstName, lastName, phone, email, userName, password,
				graduationRank);

	}
}
