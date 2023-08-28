package com.demo.service;

import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.exceptions.NoEmployeeFound;
import com.demo.factory.StorageFactory;

public class EmployeeServiceImpl implements EmployeeService {
   private EmployeeDao employeeDao; 
   
	
	public EmployeeServiceImpl(String s) {
		
	   employeeDao=StorageFactory.getDaoInstance(s);
    }


	@Override
	public void addnewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter sal");
		double sal=sc.nextDouble();
		employeeDao.saveEmployee(new Employee(id,nm,sal));
		
	}


	@Override
	public Collection<Employee> findAll() {
		return  employeeDao.findAllEmployee();
	}


	@Override
	public Employee searchById(int id) throws NoEmployeeFound {
		return employeeDao.findById(id);
	}


	@Override
	public boolean modifyEmployee(int id, String nm, double sal) throws NoEmployeeFound {
		return employeeDao.updateEmployee(id,nm,sal);
	}


	@Override
	public boolean deleteEmployee(int id) {
		return employeeDao.deleteEmployee(id);
	}


	@Override
	public List<Employee> findByName(String name) throws NoEmployeeFound{
		return employeeDao.findByName(name);
	}


	@Override
	public Collection<Employee> sortByName() {
		return employeeDao.sortByName();
	}


	@Override
	public Collection<Employee> sortByPatternUsingSal(String pattern) {
		return employeeDao.sortByPatternandName(pattern);
	}

}
