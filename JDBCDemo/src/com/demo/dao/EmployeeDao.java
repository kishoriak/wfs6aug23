package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean saveEmployee(Employee e);

	boolean removeById(int id);

	List<Employee> getAll();

	Employee findById(int id);

	boolean updateById(int id, String nm, double charges);

	List<Employee> sortyBySal();

	void closeConnection();

}
