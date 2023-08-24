package com.demo.service;

import com.demo.dao.EmployeeDao;
import com.demo.dao.GenerateDao;

public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDao edao;
    
	public EmployeeServiceImpl() {
		super();
		this.edao = GenerateDao.getDao(1);
	}

	@Override
	public void readFile() {
		this.edao.readData("empdat.txt");
		
		
	}

	@Override
	public void writeFile() {
		this.edao.writeData("empdat.txt");
		
	}

}
