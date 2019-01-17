package com.cg.bms.model;

public class Customers {
	
	private Long accountId;
	private String customerName;
	private String email;
	private String address;
	private String pancard;
	private Long accountBalance;
	private String accountType;
	
	public Customers() {
		
	}

	public Customers(Long accountId, String customerName, String email, String address, String pancard,
			Long accountBalance, String accountType) {
		super();
		this.accountId = accountId;
		this.customerName = customerName;
		this.email = email;
		this.address = address;
		this.pancard = pancard;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public Long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

}