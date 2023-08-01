package com.virtusa.project.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.project.dao.CustomerRepo;
import com.virtusa.project.model.User;
import com.virtusa.project.service.TokenGenerator;

@Controller
public class ApointmentController {

	@Autowired
	CustomerRepo repo;
	@Autowired
	User user;
	@Autowired
	private TokenGenerator tokenGenerator;
	
	@RequestMapping(value="/Counter Queries", method = RequestMethod.POST)
	public ModelAndView Querypage(@Param("id") String id,Principal principal) {
		
		user.setCid(principal.getName());
		user.setName(repo.findByCid(principal.getName()).getCname());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Pages/Counter Queries.jsp");
		mv.addObject("user",user);
		
		
		int counternumber;
		String appointmentName;
		switch(Integer.parseInt(id)) {
			case 1: 
				counternumber = 5; 
				appointmentName = new String("Loans and EMI");
				break;
			case 2: 
				counternumber = 2; 
				appointmentName = new String("Cash Counter");
				break;
			case 3: 
				counternumber = 6; 
				appointmentName = new String("NRI Account");
				break;
			case 4: counternumber = 3; 
				appointmentName = new String("Internet and Phone Banking");
				break;
			case 5: 
				counternumber = 4; 
				appointmentName = new String("Account Opening");
				break;
			default: 
				counternumber = 1;
				appointmentName = new String("For All Queries");
		}
		
		
		mv.addObject("apointmentName",appointmentName);
		mv.addObject("counter","Please Visit");
		mv.addObject("counterNumber","Counter No: "+counternumber);
		mv.addObject("token_text","Your Token:");
		mv.addObject("token",tokenGenerator.generateRandomPassword());

		return mv;
	}

}
