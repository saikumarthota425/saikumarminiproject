package com.cg.bms.dao;

import com.cg.bms.expection.BmsExpection;
import com.cg.bms.model.Customers;

public interface Bmsdao {

	boolean validateUser(int userId, String password) throws BmsExpection;

	Long insertingCustomerData(Customers customers) throws BmsExpection;

}
