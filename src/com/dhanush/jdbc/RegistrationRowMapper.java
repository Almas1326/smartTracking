package com.dhanush.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dhanush.domain.User;
import com.dhanush.domain.UserRegistration;

public class RegistrationRowMapper implements RowMapper<UserRegistration> {

	@Override
	public UserRegistration mapRow(ResultSet resultSet, int line) throws SQLException {
		RegistrationExtractor registration = new RegistrationExtractor();
		return registration.extractData(resultSet);
	}
	

}
