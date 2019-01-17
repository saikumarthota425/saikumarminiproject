package com.cg.bms.model;

public class Users {
	private int accountId;
	private int userId;
	private String password;
	private String secretQuestion;
	private  String transactionPassword;
	private String lockStatus;
 
		
	
	public Users() {
		// TODO Auto-generated constructor stub
	}



	public int getAccountId() {
		return accountId;
	}



	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getSecretQuestion() {
		return secretQuestion;
	}



	public void setSecretQuestion(String secretQuestion) {
		this.secretQuestion = secretQuestion;
	}



	public String getTransactionPassword() {
		return transactionPassword;
	}



	public void setTransactionPassword(String transactionPassword) {
		this.transactionPassword = transactionPassword;
	}



	public String getLockStatus() {
		return lockStatus;
	}



	public void setLockStatus(String lockStatus) {
		this.lockStatus = lockStatus;
	}



	
	
}
     