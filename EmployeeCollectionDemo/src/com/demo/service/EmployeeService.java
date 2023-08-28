package com.demo.service;

import java.util.Collection;
import java.util.List;
import java.util.Queue;

import com.demo.beans.Employee;
import com.demo.exceptions.NoEmployeeFound;

public interface EmployeeService {

	void addnewEmployee();

	Collection<Employee> findAll();

	Employee searchById(int id) throws NoEmployeeFound;

	boolean modifyEmployee(int id, String nm, double sal) throws NoEmployeeFound;

	boolean deleteEmployee(int id);

	List<Employee> findByName(String name) throws NoEmployeeFound;

	Collection<Employee> sortByName();

	Collection<Employee> sortByPatternUsingSal(String pattern);

}
