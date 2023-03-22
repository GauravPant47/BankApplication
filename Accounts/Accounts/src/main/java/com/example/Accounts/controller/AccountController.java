package com.example.Accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Accounts.model.AccountModel;
import com.example.Accounts.model.CustomerModel;
import com.example.Accounts.repository.AccountRepository;

@RestController
public class AccountController {
	@Autowired
	private AccountRepository accountRepository;
	
	
	@PostMapping("/accounts")
	public AccountModel getAccountDetails(@RequestBody CustomerModel customerModel) {
		AccountModel account = accountRepository.findByCustomerId(customerModel.getCustomerId());
		return account;
	}

//	@PostMapping("/accounts")
//	public ResponseEntity<AccountModel> getAccountDetails(@RequestBody AccountModel account) {
//		return ResponseEntity.ok().body(accountRepository.findByCustomerId(account.getCustomerId()));
//	}

//	@PostMapping("/customer")
//	public ResponseEntity<AccountModel> getAccount(@RequestBody CustomerModel customerModel) {
//		return ResponseEntity.ok().body(accountRepository.findByCustomerId(customerModel.getCustomerId()));
//	}

}
