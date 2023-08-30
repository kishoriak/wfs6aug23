package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	boolean deleteById(int id);

	List<Employee> findAll();

	Employee searchById(int id);

	boolean modifyEmployee(int id, String nm, double charges);

	List<Employee> sortBySal();

	void closeConnection();

}
