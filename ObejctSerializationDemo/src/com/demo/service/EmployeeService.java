package com.demo.service;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addNewEmployee();

	Employee[] getAll();

	void writeFile();

	void readFile();

}
