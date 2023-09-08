package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String displayhomePage() {
		return "index";
	}
	
	//@RequestMapping(value="/hello", method=RequestMethod.GET)
	@GetMapping("/hello")
	public ModelAndView sayHello(){
		System.out.println("in say hello");
		String msg="Welcome to SpringMVC";
		return new ModelAndView("hello","msg",msg);
		
	}

}
