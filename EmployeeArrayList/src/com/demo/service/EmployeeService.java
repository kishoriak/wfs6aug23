package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.exceptions.EmployeeNotFound;

public interface EmployeeService {

	void addnewEmployee();

	List<Employee> getAll();

	Employee serachById(int id) throws EmployeeNotFound;

	List<Employee> searchByName(String nm);

	boolean deleteById(int id);

	List<Employee> sortBySal();

	List<Employee> sortById();

	List<Employee> sortByName();

}
