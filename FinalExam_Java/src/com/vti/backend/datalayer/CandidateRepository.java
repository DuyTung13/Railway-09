package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vti.entity.ExperienceCadidate.ProSkill;
import com.vti.entity.FresherCadidate;
import com.vti.entity.FresherCadidate.GraduationRank;
import com.vti.ultis.jdbcUltis;

public class CandidateRepository implements ICandidateRepository {
	private jdbcUltis jdbc;

	public CandidateRepository() throws FileNotFoundException, IOException {
		jdbc = new jdbcUltis();
	}

	@Override
	public boolean isCadidateExist(String email) throws ClassNotFoundException, SQLException {
		String sql = " SELECT * FROM Cadidate c WHERE c.Email = ?;";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setString(1, email);
		ResultSet resultSet = preStatement.executeQuery();
		if (resultSet.next()) {
			jdbc.disConnection();
			return true;
		} else {
			jdbc.disConnection();
			return false;
		}
	}

	@Override
	public Boolean loginCadidate(String email, String password) throws SQLException, ClassNotFoundException {
		String sql = " SELECT * FROM Cadidate c WHERE c.Email = ? AND c.password = ?;";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setString(1, email);
		preStatement.setString(2, password);
		ResultSet resultSet = preStatement.executeQuery();
		if (resultSet.next()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean createExperienceCandidate(String firstName, String lastName, String phone, String email, String password, int expInYear, ProSkill proSkill) throws SQLException, ClassNotFoundException {
		String sql = " INSERT INTO Cadidate (`Fistname`, `Lastname`, `Phone`, `Email`, `Password`, `expInYear`, `proSkill`, `Categogy`)"+ "VALUES(?,?,?,?,?,?,?,'EXPERIENCECADIDATE');";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setNString(1, firstName);
		preStatement.setNString(2, lastName);
		preStatement.setString(3, phone);
		preStatement.setString(4, email);
		preStatement.setString(5, password);
		preStatement.setInt(6, expInYear);
		preStatement.setString(7, proSkill.toString());
		int result = preStatement.executeUpdate();
		if (result==1) {
			jdbc.disConnection();
			return true;
		} else {
			jdbc.disConnection();
			return false;
		}
	}

	@Override
	public boolean createFresherCandidate(String firstName, String lastName, String phone, String email, String password, GraduationRank graduationRank) throws SQLException, ClassNotFoundException {
		String sql = "INSERT INTO Cadidate (`Fistname`, `Lastname`, `Phone`, `Email`, `Password`, `GraduationRank`, `Categogy`)"+"VALUES(?,?,?,?,?,?,'FRESHERCADIDATE'); ";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setNString(1, firstName);
		preStatement.setNString(2, lastName);
		preStatement.setString(3, phone);
		preStatement.setString(4, email);
		preStatement.setString(5, password);
		preStatement.setString(6, graduationRank.toString());
		int result = preStatement.executeUpdate();
		if (result==1) {
			jdbc.disConnection();
			return true;
		} else {
			jdbc.disConnection();
			return false;
		}
	}

}
