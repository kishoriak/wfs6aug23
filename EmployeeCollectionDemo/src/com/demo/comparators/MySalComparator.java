package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.Employee;

public class MySalComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		System.out.println("in MySal comparator");
		if(o1.getSal()==o2.getSal()) {
			return o1.getEname().compareTo(o2.getEname());
		}
		
		
		
		return (int)(o1.getSal()-o2.getSal());
	}
	

}
