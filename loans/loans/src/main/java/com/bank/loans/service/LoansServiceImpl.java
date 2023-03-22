package com.bank.loans.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.loans.models.LoanModels;
import com.bank.loans.repository.LoansRepository;


@Service
@Transactional
public class LoansServiceImpl implements LoanService {

	@Autowired
	private LoansRepository loansRepository;

	@Override
	public List<LoanModels> getAllLoans() {
		return this.loansRepository.findAll();
	}

	@Override
	public List<LoanModels> getAllLoansByCustomerId(int customerId) {
		return this.loansRepository.serchByCustomerId(customerId);
	}

}
