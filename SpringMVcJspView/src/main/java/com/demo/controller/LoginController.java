package com.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.User;
import com.demo.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	   @Autowired 
	   LoginService loginService;
	
	//@RequestMapping(value="validateUser",method=RequestMethod.POST)
    @PostMapping("/validateUser")
	public ModelAndView validateUser(@RequestParam("uname") String nm,@RequestParam String pass) {
    	User u=loginService.validateUser(nm,pass);
    	if (u!=null) {
    		return new ModelAndView("redirect:/product/viewProducts");
    	}
    	else {
    		return new ModelAndView("index","msg","pls reenter credentials");
    	}
		
		   
	}

}
