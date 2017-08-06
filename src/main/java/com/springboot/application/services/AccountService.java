package com.springboot.application.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.application.model.Account;
/**
 * Service class
 * @author Nikhil
 *
 */
@Service
public class AccountService {
  private List<Account> accounts = Arrays.asList(
			new Account("1", "Nikhil", "Ashok", "Mahajan", "AC000001"),
			new Account("2", "Jayesh", "Ashok", "Mahajan", "AC000002")
		  );
  	/**
  	 * Return all account details
  	 * @return
  	 */
	public List<Account> getAccountInfo(){
		return accounts;
	}
	/**
	 * Return single account details
	 * @param id
	 * @return
	 */
	public Account getSingleAccountInfo(String id){
		return accounts.stream().filter(
				account -> account.getAccountId().equals(id)).findFirst().get();
	}
}
