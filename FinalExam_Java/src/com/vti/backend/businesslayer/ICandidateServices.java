package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.ExperienceCadidate.ProSkill;
import com.vti.entity.FresherCadidate.GraduationRank;

public interface ICandidateServices {
	public boolean isCadidateExist(String email) throws ClassNotFoundException, SQLException;

	public Boolean loginCadidate(String email, String password) throws ClassNotFoundException, SQLException;

	public boolean createExperienceCandidate(String firstName, String lastName, String phone, String email,
			String userName, String password, int expInYear, ProSkill proSkill)
			throws SQLException, ClassNotFoundException;

	public boolean createFresherCandidate(String firstName, String lastName, String phone, String email,
			String userName, String password, GraduationRank graduationRank)
			throws SQLException, ClassNotFoundException;
}
