package com.bank.loans.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.loans.models.LoanModels;

public interface LoansRepository extends JpaRepository<LoanModels, Integer> {
	
	@Query(value = "select * from loans l where l.customer_id=?1",nativeQuery = true)
	List<LoanModels> serchByCustomerId(int customerId);
}
