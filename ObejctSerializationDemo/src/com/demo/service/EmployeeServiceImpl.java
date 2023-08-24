package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.utility.GenerateDao;
import com.dmo.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao edao;

	public EmployeeServiceImpl() {
		super();
		this.edao = GenerateDao.getDao(1);
	}

	@Override
	public void addNewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter new id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter salary");
		double  sal=sc.nextDouble();
		Employee e=new Employee(id,nm,sal);
		edao.save(e);
		
		
	}

	@Override
	public Employee[] getAll() {
		return edao.findAll();
	}

	@Override
	public void writeFile() {
		edao.writeData();
		
	}

	@Override
	public void readFile() {
		edao.readData();
		
	}
    
    
}
