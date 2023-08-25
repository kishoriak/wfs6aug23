package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Employee;
import com.demo.exceptions.EmployeeNotFound;

public class EmployeeDaoImpl implements EmployeeDao{
	private static List<Employee> elist;
	static {
		elist=new ArrayList<>();
		
	}

	@Override
	//adding employee object at the end of ArrayList
	public void save(Employee emp) {
		elist.add(emp);
		
	}

	@Override
	public List<Employee> findAll() {
		return elist;
	}

	@Override
	public Employee findById(int id) throws EmployeeNotFound {
		int pos=elist.indexOf(new Employee(id));
		if(pos!=-1) {
			return elist.get(pos);
		}
		throw new EmployeeNotFound("EmployeeNot found---> "+id);
	}

	@Override
	public List<Employee> findByName(String nm) {
		/*List<Employee> lst=new ArrayList<>();
		for(Employee e:elist) {
			if(e.getEname().equals(nm)) {
				lst.add(e);
			}
		}*/
		List<Employee> lst=elist.stream()
				.filter(e->e.getEname().equals(nm))
				.collect(Collectors.toList());
		if(lst.size()>0) {
			return lst;
		}
		return null;
	}

	@Override
	public boolean removeById(int id) {
		//removeif will delete all objects and 
		//remove delete only first matching object
		//elist.removeIf(emp->emp.getsal()>sal);
		return elist.remove(new Employee(id));
	}

}
