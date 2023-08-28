package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.exceptions.EmployeeNotFound;

public interface EmployeeService {

	void addnewEmployee();

	Set<Employee> getAll();

	Employee serachById(int id) throws EmployeeNotFound;

	List<Employee> searchByName(String nm);

	boolean deleteById(int id);

	Set<Employee> sortBySal();

	Set<Employee> sortById();

	Set<Employee> sortByName();

}
