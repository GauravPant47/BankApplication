package com.bank.Insurance.services;

import java.util.List;

import com.bank.Insurance.model.InsuranceModel;

public interface InsuranceService {
	
	List<InsuranceModel> getAllInsurance();
	
	List<InsuranceModel> getAllInsuranceByCustomerId(int customerId);
}
