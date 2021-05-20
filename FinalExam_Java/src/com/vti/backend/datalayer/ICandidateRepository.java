package com.vti.backend.datalayer;

import java.sql.SQLException;

import com.vti.entity.ExperienceCadidate.ProSkill;
import com.vti.entity.FresherCadidate.GraduationRank;

public interface ICandidateRepository {
	public boolean isCadidateExist(String email) throws ClassNotFoundException, SQLException;

	public Boolean loginCadidate(String email, String password) throws SQLException, ClassNotFoundException;

	public boolean createExperienceCandidate(String firstName, String lastName, String phone, String email, String password, int expInYear, ProSkill proSkill)
			throws SQLException, ClassNotFoundException;

	public boolean createFresherCandidate(String firstName, String lastName, String phone, String email,String password, GraduationRank graduationRank)
			throws SQLException, ClassNotFoundException;
}
