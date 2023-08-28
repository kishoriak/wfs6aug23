package com.demo.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Employee;
import com.demo.comparators.MyIdComparator;
import com.demo.comparators.MyNameComparator;
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

	@Override
	public List<Employee> sortBySal() {
		List<Employee> newList=(List<Employee>) ((ArrayList)elist).clone();
		//List<Employee> newList=new ArrayList<>();
		//Collections.copy(newList, elist);
		//newList.sort(null);
		Collections.sort(newList);
		return newList;
	}

	@Override
	public List<Employee> sortById() {
		List<Employee> newList=(List<Employee>) ((ArrayList)elist).clone();
		Comparator<Employee> c=(o1,o2)->
		{if(o1.getEmpid()<o2.getEmpid())
			     return -1;
		else if(o1.getEmpid()==o2.getEmpid()) 
			return 0;
		else return 1;
					
		};
		newList.sort(c);
		//newList.sort(new MyIdComparator());
		return newList;
	}

	@Override
	public List<Employee> sortByName() {
		List<Employee> newList=(List<Employee>) ((ArrayList)elist).clone();
		Comparator<Employee> c=(o1,o2)->{return o1.getEname().compareTo(o2.getEname());};
		newList.sort(c);
		//newList.sort(new MyNameComparator());
		return newList;
		
	}

}
