package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.datalayer.CandidateRepository;
import com.vti.entity.ExperienceCadidate.ProSkill;
import com.vti.entity.FresherCadidate.GraduationRank;

public class CandidateServices implements ICandidateServices {

	private CandidateRepository candidateRepository;

	public CandidateServices() throws FileNotFoundException, IOException {
		candidateRepository = new CandidateRepository();
	}

	@Override
	public boolean isCadidateExist(String email) throws ClassNotFoundException, SQLException {
		return candidateRepository.isCadidateExist(email);
	}

	@Override
	public Boolean loginCadidate(String email, String password) throws ClassNotFoundException, SQLException {
		return candidateRepository.loginCadidate(email, password);
	}

	@Override
	public boolean createExperienceCandidate(String firstName, String lastName, String phone, String email,
			String userName, String password, int expInYear, ProSkill proSkill)
			throws SQLException, ClassNotFoundException {
		return candidateRepository.createExperienceCandidate(firstName, lastName, phone, email, password,expInYear, proSkill);
	}

	@Override
	public boolean createFresherCandidate(String firstName, String lastName, String phone, String email,
			String userName, String password, GraduationRank graduationRank)
			throws SQLException, ClassNotFoundException {
		return candidateRepository.createFresherCandidate(firstName, lastName, phone, email, password,graduationRank);
	}

}
