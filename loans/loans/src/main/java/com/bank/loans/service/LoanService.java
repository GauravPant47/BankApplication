package com.bank.loans.service;

import java.util.List;

import com.bank.loans.models.LoanModels;

public interface LoanService {
	
	List<LoanModels> getAllLoans();
	
	List<LoanModels> getAllLoansByCustomerId(int customerId);
}
