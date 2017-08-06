package com.springboot.application.model;
/**
 * Request structure of Account service
 * @author Nikhil
 *
 */
public class AccountRequest {
	private String accountId;
	public AccountRequest(){
		
	}
	
	public AccountRequest(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
}
