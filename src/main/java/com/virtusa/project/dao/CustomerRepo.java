package com.virtusa.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.project.model.Customers;

public interface CustomerRepo extends JpaRepository<Customers, String>{
	
	
	Customers findByCid(String Cid);
	Customers findByCname(String Cname);
	Customers findByPhone(String phone);
	
}
