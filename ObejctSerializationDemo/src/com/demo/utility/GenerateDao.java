package com.demo.utility;

import com.dmo.dao.EmployeeDao;
import com.dmo.dao.EmployeeDaoImpl;

//factory pattern
public class GenerateDao {

	public static EmployeeDao getDao(int i) {
		if(i==1) {
			return new EmployeeDaoImpl();
		}
		return null;
	}

}
