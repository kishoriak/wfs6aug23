package com.demo.dao;

//factory of dao implementation
public class GenerateDao {

	public static EmployeeDao getDao(int i) {
		if(i==1) {
			return new EmployeeDaoImpl();
		}
		return null;
	}

}
