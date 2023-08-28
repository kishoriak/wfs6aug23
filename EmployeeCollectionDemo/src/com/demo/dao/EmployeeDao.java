package com.demo.dao;

import java.util.Collection;
import java.util.List;
import java.util.Queue;

import com.demo.beans.Employee;
import com.demo.exceptions.NoEmployeeFound;

public interface EmployeeDao {

	void saveEmployee(Employee employee);

	Collection<Employee> findAllEmployee();

	Employee findById(int id) throws NoEmployeeFound;

	boolean updateEmployee(int id, String nm, double sal) throws NoEmployeeFound;

	boolean deleteEmployee(int id);

	List<Employee> findByName(String name) throws NoEmployeeFound;

	Collection<Employee> sortByName();

	Collection<Employee> sortByPatternandName(String pattern);

}
