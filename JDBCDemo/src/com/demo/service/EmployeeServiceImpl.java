package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
      private EmployeeDao employeeDao;

	public EmployeeServiceImpl() {
		employeeDao=new EmployeeDaoImpl();
	}

	@Override
	public boolean addNewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int empid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter sal");
		int s=sc.nextInt();
		Employee e=new Employee(empid,nm,s);
		return employeeDao.saveEmployee(e);
		
	}

	@Override
	public boolean deleteById(int id) {
		return employeeDao.removeById(id);
	}

	@Override
	public List<Employee> findAll() {
		return employeeDao.getAll();
	}

	@Override
	public Employee searchById(int id) {
		return employeeDao.findById(id);
	}

	@Override
	public boolean modifyEmployee(int id, String nm, double charges) {
		return employeeDao.updateById(id,nm,charges);
	}

	@Override
	public List<Employee> sortBySal() {
		return employeeDao.sortyBySal();
	}

	@Override
	public void closeConnection() {
		employeeDao.closeConnection();
		
	}
      
}
