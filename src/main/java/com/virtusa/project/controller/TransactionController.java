package com.virtusa.project.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.project.dao.CustomerRepo;
import com.virtusa.project.dao.TransactionRepo;
import com.virtusa.project.model.User;
import com.virtusa.project.service.AccountService;

@Controller
public class TransactionController {
	
	@Autowired
	CustomerRepo repo;
	@Autowired
	User user;
	@Autowired
	TransactionRepo transactionrepo;
	@Autowired
	AccountService services;

	@RequestMapping(value = "debit", method = RequestMethod.POST)
	public ModelAndView withdraw(@Param("amount") long amount, @Param("pin") String pin, Principal principal) {
		
		user.setCid(principal.getName());
		user.setName(repo.findByCid(principal.getName()).getCname());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Pages/Withdraw.jsp");
		mv.addObject("user",user);
		
		if(amount <= 0) {
			mv.addObject("errormessage","! Invalid Amount !");
			return mv;
		}
		
		if(!pin.equals(""+repo.findByCid(principal.getName()).getPin())) {
			mv.addObject("errormessage","! Incorrect Pin !");
			return mv;
		}
		
		try {
			services.withdraw(amount, user.getCid());
			mv.addObject("successmessage","Transaction Successful");
			mv.addObject("custtext", "Updated Balance:");
			mv.addObject("UpdatedBalance","&#x20B9 " + repo.findByCid(principal.getName()).getBalance());
			
		} catch (Exception e) {
			mv.addObject("errormessage",e.getMessage());
		}
		
		return mv;
	}
	
	@RequestMapping(value = "credit", method = RequestMethod.POST)
	public ModelAndView deposit(@Param("amount") long amount, @Param("depositor") String depositor, Principal principal) {
		
		user.setCid(principal.getName());
		user.setName(repo.findByCid(principal.getName()).getCname());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Pages/Deposit.jsp");
		mv.addObject("user",user);
		
		if(amount <= 0) {
			mv.addObject("errormessage","! Invalid Amount !");
			return mv;
		}
		
		if(amount >= 200000) {
			mv.addObject("errormessage","! Cannot Deposit Such Large Amount !");
			return mv;
		}
		
		try {
			services.deposit(amount, user.getCid(), depositor);
			mv.addObject("successmessage","Transaction Successful");
			mv.addObject("custtext", "Updated Balance:");
			mv.addObject("UpdatedBalance","&#x20B9 " + repo.findByCid(principal.getName()).getBalance());
			
		} catch (Exception e) {
			mv.addObject("errormessage",e.getMessage());
		}
		return mv;
	}
	
	@RequestMapping(value = "debit")
	public ModelAndView withdrawNoParam(Principal principal) {
		user.setCid(principal.getName());
		user.setName(repo.findByCid(principal.getName()).getCname());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Pages/Withdraw.jsp");
		mv.addObject("user",user);
		return mv;
	}
	@RequestMapping(value = "credit")
	public ModelAndView depositNoParam(Principal principal) {
		user.setCid(principal.getName());
		user.setName(repo.findByCid(principal.getName()).getCname());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Pages/Withdraw.jsp");
		mv.addObject("user",user);
		return mv;
	}
}
