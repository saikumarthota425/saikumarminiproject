package com.bg.bms.servise;

import com.cg.bms.expection.BmsExpection;
import com.cg.bms.model.Customers;

public interface Bmsservice {

	boolean validateUser(int userId, String password) throws BmsExpection;

	Long insertingCustomerData(Customers customers) throws BmsExpection;

}
