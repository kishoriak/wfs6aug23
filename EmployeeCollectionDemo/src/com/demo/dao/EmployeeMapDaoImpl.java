package com.demo.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

import com.demo.beans.Employee;
import com.demo.comparators.MySalComparator;
import com.demo.exceptions.NoEmployeeFound;

public class EmployeeMapDaoImpl implements EmployeeDao{
    private static Map<Integer,Employee> emap;
    static {
    	emap=new HashMap<>();
    	emap.put(12,new Employee(12,"Revati",5456));
    	emap.put(13, new Employee(13,"Atharva",5678));
    	emap.put(14, new Employee(14,"Arati",56782));
    }
    
	@Override
	public void saveEmployee(Employee employee) {
		System.out.println("in saveemloyee map");
		emap.put(employee.getEmpid(), employee);
		
	}

	private List<Employee> convertToList(Collection<Employee> c) {
		List<Employee> elist=new ArrayList<>();
		for(Employee e:c) {
			elist.add(e);
		}
		return elist;
	}
	
	@Override
	public List<Employee> findAllEmployee() {
		return convertToList(emap.values());
	}

	@Override
	public Employee findById(int id) throws NoEmployeeFound {
		Employee e= emap.get(id);
		if(e!=null) {
			return e;
		}
		throw new NoEmployeeFound("no employee found for given id "+id);
	}

	@Override
	public boolean updateEmployee(int id, String nm, double sal) throws NoEmployeeFound {
		Employee e= emap.get(id);
		if(e!=null) {
			e.setEname(nm);
			e.setSal(sal);
			return true;
		}
		throw new NoEmployeeFound("no employee found for given id "+id);
	}

	@Override
	public boolean deleteEmployee(int id) {
		Employee e=emap.remove(id);
		if(e!=null)
			return true;
		else 
			return false;
	}

	@Override
	public List<Employee> findByName(String name) throws NoEmployeeFound {
		List<Employee> elist=new ArrayList<>();
		for(Employee e:emap.values()) {
			if(e.getEname().equals(name)) {
				elist.add(e);
			}
		}
		if(elist.size()>0)
		   return elist;
		else
			throw new NoEmployeeFound("no employee foud for name :"+name);
	}

	@Override
	public List<Employee> sortByName() {
		// TODO Auto-generated method stub
		List<Employee> elist=convertToList(emap.values());
		Collections.sort(elist);
		return elist;
	}

	@Override
	public Queue<Employee> sortByPatternandName(String pattern) {
		List<Employee> elist=(List<Employee>) emap.values();
		//to store the data in sorted order of sal
		PriorityQueue<Employee> pq=new PriorityQueue(new MySalComparator());
		for(Employee e:elist) {
			if(e.getEname().contains(pattern)) {
				pq.add(e);
			}
		}
		if(pq.size()>0) {
			return pq;
		}
		return null;
		
	}
	

}
