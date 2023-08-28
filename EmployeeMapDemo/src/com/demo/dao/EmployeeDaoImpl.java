package com.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.demo.beans.Employee;
import com.demo.exceptions.EmployeeNotFound;
import com.sun.net.httpserver.Filter;

public class EmployeeDaoImpl implements EmployeeDao{
    public static Map<Integer,Employee> hmap;
    static {
    	hmap=new HashMap<>();
    	hmap.put(12, new Employee(12,"xxx",4567));
    	hmap.put(13, new Employee(13,"yyyy",4567));
    }
	@Override
	public void save(Employee employee) {
		if(!hmap.containsKey(employee.getEmpid()))
		    hmap.put(employee.getEmpid(),employee);
		
	}

	@Override
	public Set<Employee> findAll() {
		return (Set<Employee>)hmap.values();
	}

	@Override
	public Employee findById(int id) throws EmployeeNotFound {
	if(hmap.get(id)!=null)
		return hmap.get(id);
	throw new EmployeeNotFound("id not found");
	}

	@Override
	public List<Employee> findByName(String nm) {
		List<Employee> elist=new ArrayList<>();
		Set<Integer> kset=hmap.keySet();
		for(Integer e:kset) {
			if(hmap.get(e).getEname().equals(nm)) {
				elist.add(hmap.get(e));
			}
		}
	    //List<Employee> elist=hset.stream()
		                  //   .filter(emp->emp.getEname().equals(nm))
		                  //   .collect(Collectors.toList());
	    if(elist.size()>0)
			return elist;
		return null;
	}

	@Override
	public boolean removeById(int id) {
		Employee e=hmap.remove(id);
		if(e!=null)
			return true;
		return false;
		
	}

	@Override
	public Set<Employee> sortBySal() {
		Comparator<Employee> c=(o1,o2)->{
			if(o1.getSal()<o2.getSal()) {
				return -1;
			}
			else if(o1.getSal()==o2.getSal())
				   return o1.getEmpid()-o2.getEmpid();
			else
				return 1;
		};
		
		Set<Employee> eset=new TreeSet<>(c);
		Set<Employee> values=(Set<Employee>)hmap.values();
		for(Employee e:values) {
			eset.add(e);
		}
		return eset;
	}

	@Override
	public Set<Employee> sortById() {
		Set<Employee> esetsorted=new TreeSet<>();
		Set<Employee> values=(Set<Employee>)hmap.values();
		for(Employee e:values) {
			esetsorted.add(e);
		}
		return esetsorted;
	}

	@Override
	public Set<Employee> sortByName() {
		Comparator<Employee> c=(o1,o2)->{
			if(o1.getEname().compareTo(o2.getEname())==0)
				   return o1.getEmpid()-o2.getEmpid();
			else
				return o1.getEname().compareTo(o2.getEname());
		};
		Set<Employee> eset=new TreeSet<>(c);
		Set<Employee> values=(Set<Employee>)hmap.values();
		for(Employee e:values) {
			eset.add(e);
		}
		return eset;
	}

}
