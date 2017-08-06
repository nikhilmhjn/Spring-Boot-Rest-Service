package com.springboot.application.model;

/**
 * Model to hold Account information
 * @author Nikhil
 *
 */
public class Account {
	private String accountId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String accountNo;
	
	public Account(String accountId, String firstName, String middleName,
			String lastName, String accountNo) {
		super();
		this.accountId = accountId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.accountNo = accountNo;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
}
