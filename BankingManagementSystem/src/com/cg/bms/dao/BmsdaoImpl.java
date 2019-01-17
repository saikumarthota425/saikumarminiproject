package com.cg.bms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.bms.expection.BmsExpection;
import com.cg.bms.model.Customers;
import com.cg.bms.utility.JdbcUtility;

public class BmsdaoImpl implements Bmsdao {

	Connection connection = null;
	PreparedStatement preparestatement = null;
	ResultSet resultset = null;

	@Override
	public boolean validateUser(int userId, String password) throws BmsExpection {

		connection = JdbcUtility.getConnection();
		boolean result = false;
		try {
			preparestatement = connection.prepareStatement(QueryMapper.valiadateUser);
			resultset = preparestatement.executeQuery();

			while (resultset.next()) {
				int id = resultset.getInt("USER_ID");
				String name = resultset.getString("LOGIN_PASSWORD");
				if (id == userId && name.equals(password)) {
					result = true;

				}

			}

		} catch (SQLException e) {

			throw new BmsExpection("no connection");
		} finally {
			try {
				connection.close();

			} catch (SQLException e) {
				throw new BmsExpection("connection not closed");
			}
			try {
				preparestatement.close();
			} catch (SQLException e) {
				throw new BmsExpection("preparesatement not closed");

			}
			try {
				resultset.close();
			} catch (SQLException e) {
				throw new BmsExpection("resultset not closed");
			}
		}

		return result;
	}

	@Override
	public Long insertingCustomerData(Customers customers) throws BmsExpection {
		connection = JdbcUtility.getConnection();
		Long result = (long) 0;
		try {
			preparestatement = connection.prepareStatement(QueryMapper.insertingCustomerData);
			preparestatement.setString(1,customers.getCustomerName());
			preparestatement.setString(2, customers.getEmail());
			preparestatement.setString(3,customers.getAddress());
			preparestatement.setString(4,customers.getPancard());
			preparestatement.executeUpdate();
			
			preparestatement = connection.prepareStatement(QueryMapper.gettingId);
			resultset = preparestatement.executeQuery();
			resultset.next();
		     result = (long) resultset.getInt(1);
		} catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		
		return result;
	}

}
