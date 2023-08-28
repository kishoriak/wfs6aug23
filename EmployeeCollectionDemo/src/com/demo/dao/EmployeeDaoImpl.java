package com.demo.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import com.demo.beans.Employee;
import com.demo.comparators.MySalComparator;
import com.demo.exceptions.NoEmployeeFound;

public class EmployeeDaoImpl implements EmployeeDao{
	private static List<Employee> elist;
	static {
		elist=new ArrayList<>(100);
		elist.add(new Employee(12,"Rajan",3456));
		elist.add(new Employee(13,"Revati",444));
		elist.add(new Employee(14,"Shreya",555));
		elist.add(new Employee(15,"Harshal",666));
		
	}

	@Override
	public void saveEmployee(Employee employee) {
		elist.add(employee);
		
	}

	@Override
	public List<Employee> findAllEmployee() {
		if(!elist.isEmpty()) {
		   return elist;
		}
		return null;
		//throw new NoEmployeeFound()
	}

	@Override
	public Employee findById(int id) throws NoEmployeeFound {
		Employee e=new Employee(id);
		int pos=elist.indexOf(e);
		if(pos!=-1) {
			return elist.get(pos);
		}
		throw new NoEmployeeFound("No employee foud for id");
	}

	@Override
	public boolean updateEmployee(int id, String nm, double sal) throws NoEmployeeFound {
		Employee e=findById(id);
		e.setSal(sal);
		e.setEname(nm);
		return true;
	}

	@Override
	public boolean deleteEmployee(int id) {
		Employee e=new Employee(id);
		return elist.remove(e);
				
	}

	@Override
	public List<Employee> findByName(String name) throws NoEmployeeFound {
		List<Employee> result=new ArrayList<>();
		for(Employee e:elist) {
			if(e.getEname().equals(name)) {
				result.add(e);
			}
		}
		if(result.size()>0)
			return result;
		else
			throw new NoEmployeeFound("No Employee Found");
			
	}

	@Override
	public List<Employee> sortByName() {
		List<Employee> newList=(List<Employee>) ((ArrayList)elist).clone();
		//List<Employee> newList=new ArrayList<>();
		//Collections.copy(newList, elist);
		Collections.sort(newList);
		return newList;
	}

	@Override
	public Queue<Employee> sortByPatternandName(String pattern) {
		PriorityQueue<Employee> pq=new PriorityQueue<>(new MySalComparator());
		for(Employee e:elist) {
			if(e.getEname().contains(pattern)) {
				pq.add(e);
			}
		}
		return pq;
		
	}

}
