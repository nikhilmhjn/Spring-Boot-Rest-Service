package com.springboot.application.accounts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.application.model.Account;
import com.springboot.application.model.AccountRequest;
import com.springboot.application.services.AccountService;

@RestController
public class AccountServiceController {

	@Autowired
	private AccountService accountService;
	/**
	 * Get all Account holders data
	 * @return
	 */
	@RequestMapping("/accounts")
	public List<Account> getAccountInfo(){
		return accountService.getAccountInfo();
	}
	
	@RequestMapping("/account")
	public Map<String, Account> getSingleAccountInfo(@RequestBody AccountRequest request){
		System.out.println( "REQUEST --> "+request.getAccountId());
		Account account = accountService.getSingleAccountInfo(request.getAccountId());
		Map<String, Account> map = new HashMap<String, Account>();
		map.put("accountInfo", account);
		return map;
	}	
}
