package com.virtusa.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.project.dao.TransactionRepo;
import com.virtusa.project.model.Transactions;

@Service
public class TransactionService {

	@Autowired
	TransactionRepo repo;
	
	public void saveTransaction(Transactions transaction) {
		repo.save(transaction);
	}

	
}
