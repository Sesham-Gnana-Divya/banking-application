package com.virtusa.project.service;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.project.dao.CustomerRepo;
import com.virtusa.project.model.Customers;
import com.virtusa.project.model.Transactions;

@Service
public class AccountService {
	
	@Autowired
	private CustomerRepo repo;
	
	@Autowired
    private TransactionService transactionService;
	
	public void withdraw(double amount, String cid) throws Exception{
		
        Customers user = repo.findByCid(cid);
        BigDecimal temp = user.getBalance();
        
        if(temp.compareTo(new BigDecimal(amount)) < 0) {
        	throw new Exception("! Insufficient Funds !");
        }
        
        user.setBalance(temp.subtract(new BigDecimal(amount)));
        repo.save(user);
        
        Date date = new Date();

        if(temp == user.getBalance()) {
        	Transactions transaction = new Transactions(date, "Withdraw from Primary Account", "Account", "Failed", amount, user.getBalance(), user);
        	transactionService.saveTransaction(transaction);
        	throw new Exception("! Transaction Failed !");
        }else {
        	Transactions transaction = new Transactions(date, "Withdraw from Primary Account", "Account", "Success", amount, user.getBalance(), user);
        	transactionService.saveTransaction(transaction);
        }
	    
	}
	
	public void deposit(double amount, String cid, String depositor) throws Exception {
		
        Customers user = repo.findByCid(cid);
        BigDecimal temp = user.getBalance();
        
        
        user.setBalance(temp.add(new BigDecimal(amount)));
        
        if(user.getBalance().compareTo(new BigDecimal(10000000)) > 0) {
        	throw new Exception("! Bank Limit Alert !");
        }
        repo.save(user);
        
        Date date = new Date();
        
        if(temp == user.getBalance()) {
        	Transactions transaction = new Transactions(date, "Deposited by "+ depositor, "Account", "Failed", amount, user.getBalance(), user);
        	transactionService.saveTransaction(transaction);
        	throw new Exception("! Transaction Failed !");
        }else {
        	Transactions transaction = new Transactions(date, "Deposited by "+ depositor, "Account", "Success", amount, user.getBalance(), user);
        	transactionService.saveTransaction(transaction);
        }
	}
	
	

	
}
