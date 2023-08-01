package com.virtusa.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.virtusa.project.dao.CustomerRepo;
import com.virtusa.project.model.Customers;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private CustomerRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Customers user = repo.findByCid(username);
		if(user == null)
			throw new UsernameNotFoundException("User Not Found");
		
		return new UserPrincipal(user);
	}

}
