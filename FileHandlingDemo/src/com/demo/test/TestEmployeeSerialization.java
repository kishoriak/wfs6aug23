package com.demo.test;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeSerialization {
	public static void main(String[] args) {
		EmployeeService eservice=new EmployeeServiceImpl();
		//read data from file
		eservice.readFile();
		//write data to file
		//eservice.writeFile();
	}

}
