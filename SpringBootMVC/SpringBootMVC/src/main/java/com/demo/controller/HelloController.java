package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	// @RequestMapping("/hello")
	 @GetMapping("/hello")
     public String sayHello() {
    	 return "hello";
     }
}
