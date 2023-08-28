package com.demo.factory;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.dao.EmployeeMapDaoImpl;
import com.demo.dao.EmployeeSetDaoImpl;

public class StorageFactory {
	

	public static EmployeeDao getDaoInstance(String s) {
		if(s.equals("map")) {
			System.out.println("using map implementation");
			return new EmployeeMapDaoImpl();
		}
			
		else if(s.equals("set"))
		   return new EmployeeSetDaoImpl();
		else   
		 return new EmployeeDaoImpl();
		
	}

}
