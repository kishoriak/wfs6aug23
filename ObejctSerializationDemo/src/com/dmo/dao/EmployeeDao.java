package com.dmo.dao;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	Employee[] findAll();

	void writeData();

	void readData();

}
