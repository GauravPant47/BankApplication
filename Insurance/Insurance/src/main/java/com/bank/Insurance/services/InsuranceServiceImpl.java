package com.bank.Insurance.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.Insurance.model.InsuranceModel;
import com.bank.Insurance.repository.InsuranceRepository;


@Service
@Transactional
public class InsuranceServiceImpl implements InsuranceService{
	
	@Autowired
	private InsuranceRepository insuranceRepository;

	@Override
	public List<InsuranceModel> getAllInsurance() {
		
		return this.insuranceRepository.findAll();
	}

	@Override
	public List<InsuranceModel> getAllInsuranceByCustomerId(int customerId) {
		
		return this.insuranceRepository.findByCustomerId(customerId);
	}

}
