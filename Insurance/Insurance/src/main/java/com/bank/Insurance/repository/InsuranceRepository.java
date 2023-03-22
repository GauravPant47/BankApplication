package com.bank.Insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.Insurance.model.InsuranceModel;

public interface InsuranceRepository extends JpaRepository<InsuranceModel, Integer>{
	
	@Query(value = "select * from insurance where customer_id=?",nativeQuery = true)
	List<InsuranceModel> findByCustomerId(int customerId);
}
