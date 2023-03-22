package com.bank.cards.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.cards.model.CardeModel;

@Repository
public interface CardRepository extends CrudRepository<CardeModel, Long> {
	
	List<CardeModel> findByCustomerId(int customerId);
}
