package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.exceptions.EmployeeNotFound;

public interface EmployeeDao {

	void save(Employee employee);

	Set<Employee> findAll();

	Employee findById(int id) throws EmployeeNotFound;

	List<Employee> findByName(String nm);

	boolean removeById(int id);

	Set<Employee> sortBySal();

	Set<Employee> sortById();

	Set<Employee> sortByName();

}
