package com.demo.service;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.exceptions.EmployeeNotFound;
import com.demo.utility.GenerateDao;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao edao;

	public EmployeeServiceImpl() {
		super();
		this.edao = GenerateDao.getDao(1);
	}

	@Override
	public void addnewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String nm=sc.nextLine();
		System.out.println("enetr sal");
		double sal=sc.nextDouble();
		edao.save(new Employee(id,nm,sal));
		
		
	}

	@Override
	public Set<Employee> getAll() {
		return edao.findAll();
	}

	@Override
	public Employee serachById(int id) throws EmployeeNotFound {
		return edao.findById(id);
	}

	@Override
	public List<Employee> searchByName(String nm) {
		return edao.findByName(nm);
	}

	@Override
	public boolean deleteById(int id) {
		return edao.removeById(id);
	}

	@Override
	public Set<Employee> sortBySal() {
		return edao.sortBySal();
	}

	@Override
	public Set<Employee> sortById() {
		return edao.sortById();
	}

	@Override
	public Set<Employee> sortByName() {
		return edao.sortByName();
	}
	

}
