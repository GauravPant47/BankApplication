package com.bank.Insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.Insurance.model.Customer;
import com.bank.Insurance.model.InsuranceModel;
import com.bank.Insurance.services.InsuranceService;

@RestController
public class InsuranceController {
	
	@Autowired
	private InsuranceService insuranceService;
	
	@GetMapping("/insurnce")
	public ResponseEntity<List<InsuranceModel>> getAllProductEntity(){
		return ResponseEntity.ok().body(insuranceService.getAllInsurance());
	}
	
	@PostMapping("/insurnce")
	public ResponseEntity<List<InsuranceModel>> getInsuranceByCustomerIdByPost(@RequestBody Customer customer){
		return ResponseEntity.ok().body(insuranceService.getAllInsuranceByCustomerId(customer.getCustomerId()));
	}
	
}
