package com.bg.bms.servise;

import com.cg.bms.dao.Bmsdao;
import com.cg.bms.dao.BmsdaoImpl;
import com.cg.bms.expection.BmsExpection;
import com.cg.bms.model.Customers;

public class BmsserviceImpl implements Bmsservice {
	
	Bmsdao bmsdao = new BmsdaoImpl();

	@Override
	public boolean validateUser(int userId, String password) throws BmsExpection {
		// TODO Auto-generated method stub
		return bmsdao.validateUser(userId,password);
	}

	@Override
	public Long insertingCustomerData(Customers customers) throws BmsExpection {
		// TODO Auto-generated method stub
		return bmsdao.insertingCustomerData(customers);
	}

}
