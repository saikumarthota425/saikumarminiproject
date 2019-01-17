package com.cg.bms.dao;

public interface QueryMapper {
	String valiadateUser = "SELECT * from User_Table";
	
	String insertingCustomerData = "insert into customer values(accountid_sequence.Nextval,?,?,?,?)";
	
	String gettingId = "Select accountid_sequence.CURRVAL from dual";

}
