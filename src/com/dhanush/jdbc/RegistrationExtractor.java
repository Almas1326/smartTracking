package com.dhanush.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.dhanush.domain.User;
import com.dhanush.domain.UserRegistration;

public class RegistrationExtractor implements ResultSetExtractor<UserRegistration> {

	
	public UserRegistration extractData(ResultSet resultSet) throws SQLException,
	DataAccessException {

		UserRegistration registration = new UserRegistration();
		registration.setUser_Id(resultSet.getString(1));
		registration.setPassword(resultSet.getString(2));
		registration.setEmail_Id(resultSet.getString(3));
		registration.setMobile_No(resultSet.getString(4));
		return registration;
}

}
