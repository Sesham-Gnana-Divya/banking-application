package com.virtusa.project.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.project.model.Customers;
import com.virtusa.project.model.Transactions;

public interface TransactionRepo extends JpaRepository<Transactions, Long> {
	
	List<Transactions> findByCustomerOrderByDateDesc(Customers customer);
	List<Transactions> findTop5ByCustomerOrderByDateDesc(Customers customer);
	
}
