package com.bank.loans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.loans.models.Customer;
import com.bank.loans.models.LoanModels;
import com.bank.loans.service.LoanService;

@RestController
public class LoanController {
	
	@Autowired
	private LoanService loanService;
	
	@GetMapping("/loans")
	public ResponseEntity<List<LoanModels>> getAllProduct(){
		return ResponseEntity.ok().body(loanService.getAllLoans());
	}
	
	@GetMapping("/loans/{customerId}")
	public ResponseEntity<List<LoanModels>> getAllLoansByCustomerId(@PathVariable int customerId){
		return ResponseEntity.ok().body(loanService.getAllLoansByCustomerId(customerId));
	}
	
	@PostMapping("/loans")
	public ResponseEntity<List<LoanModels>> getLoansByCustomerIdByPost(@RequestBody Customer customer){
		return ResponseEntity.ok().body(loanService.getAllLoansByCustomerId(customer.getCustomerId()));
	}
}
