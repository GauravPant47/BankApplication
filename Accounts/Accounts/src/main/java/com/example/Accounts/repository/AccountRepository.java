package com.example.Accounts.repository;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.Accounts.model.AccountModel;

public interface AccountRepository extends CrudRepository<AccountModel, Long> {

//	@Query(value = "select * from AccountModel where customer_id=?", nativeQuery = true)
	AccountModel findByCustomerId(int customerId);

}
