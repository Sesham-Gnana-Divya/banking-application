package com.virtusa.project.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.project.dao.CustomerRepo;
import com.virtusa.project.dao.TransactionRepo;
import com.virtusa.project.model.Transactions;
import com.virtusa.project.model.User;
import com.virtusa.project.service.AccountService;


@Controller
public class PageController {
	
	@Autowired
	CustomerRepo repo;
	@Autowired
	User user;
	@Autowired
	TransactionRepo transactionrepo;
	@Autowired
	AccountService services;


	@RequestMapping("/")
	public ModelAndView Homepage(Principal principal) {
		
		user.setCid(principal.getName());
		user.setName(repo.findByCid(principal.getName()).getCname());
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Pages/Mainpage.jsp");
		mv.addObject("user",user);
		return mv;
	}
	
	@RequestMapping(value="/login")
	public String loginpage() {
		return "home.jsp";
	}
	
	
	@RequestMapping(value="/logout-sucess")
	public String logout() {
		return "home.jsp";
	}
	
	@RequestMapping("/Withdraw")
	public ModelAndView withdrawpage(Principal principal) {
		user.setCid(principal.getName());
		user.setName(repo.findByCid(principal.getName()).getCname());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Pages/Withdraw.jsp");
		mv.addObject("user",user);
		return mv;
	}
	
	@RequestMapping("/Deposit")
	public ModelAndView Depositpage(Principal principal) {
		user.setCid(principal.getName());
		user.setName(repo.findByCid(principal.getName()).getCname());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Pages/Deposit.jsp");
		mv.addObject("user",user);
		return mv;
	}
	
	@RequestMapping("/Counter Queries")
	public ModelAndView Querypage(Principal principal) {
		user.setCid(principal.getName());
		user.setName(repo.findByCid(principal.getName()).getCname());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Pages/Counter Queries.jsp");
		mv.addObject("user",user);
		return mv;
	}
	
	
	@RequestMapping("/Balance Enquery")
	public ModelAndView Balancepage(Principal principal) {
		user.setCid(principal.getName());
		user.setName(repo.findByCid(principal.getName()).getCname());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Pages/Balance Enquery.jsp");
		mv.addObject("user",user);
		mv.addObject("balance",repo.findByCid(user.getCid()).getBalance());
		List<Transactions> transaction = transactionrepo.findTop5ByCustomerOrderByDateDesc(repo.findByCid(principal.getName()));
		int i = 1;
		for(Transactions list:transaction) {
			mv.addObject("transaction"+i,list);
			i++;
		}
		
		return mv;
	}
	
	
	
	
}
