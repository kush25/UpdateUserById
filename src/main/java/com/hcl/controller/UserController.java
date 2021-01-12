package com.hcl.controller;

import java.util.List;
import java.util.NoSuchElementException;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;

import com.hcl.dao.UsrRepo;

import com.hcl.model.Users;

@Controller
public class UserController {

	@Autowired
	private UsrRepo repos;
	
	
	@PostMapping("/adduser")
	public String newUser(Users us) {
		
		repos.save(us);
		return ("redirect:/listuser");
		
	}
	
	@GetMapping("/adduser")
	public ModelAndView addnewEmp() {
		Users e1 =new Users();
		return new ModelAndView("newuser","form",e1);
		
	}
	
	
	@GetMapping("/listuser")
	public ModelAndView listEmp() {
		
		List<Users> allusrs = (List<Users>) repos.findAll();
		return new ModelAndView("users","usrlist",allusrs);
		
	}
	
	
	
	 @GetMapping("/edituser/{id}")
     public ModelAndView editCustomerForm(@PathVariable("id") long id) {
        try {
		 ModelAndView mav = new ModelAndView("updateuser");
        Users u2 =  repos.findById(id).get();
         mav.addObject("updateemp", u2);
         return mav;
        
     } catch (NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("User Not Found");
			return new ModelAndView("/listuser");
   	 
     }
	 }
	
	

     @PostMapping("/edituser/{id}")
     public String editsaveEmp(@ModelAttribute("emp") Users usr) {
         
         repos.save(usr);
         return ("redirect:/listuser");
        }


}
