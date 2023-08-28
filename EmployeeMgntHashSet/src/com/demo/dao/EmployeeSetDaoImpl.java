package com.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.demo.beans.Employee;
import com.demo.exceptions.EmployeeNotFound;
import com.sun.net.httpserver.Filter;

public class EmployeeSetDaoImpl implements EmployeeDao{
    public static Set<Employee> hset;
    static {
    	hset=new HashSet<>();
    	
    }
	@Override
	public void save(Employee employee) {
		hset.add(employee);
		
	}

	@Override
	public Set<Employee> findAll() {
		return hset;
	}

	@Override
	public Employee findById(int id) throws EmployeeNotFound {
		for(Employee e:hset) {
			if(e.getEmpid()==id) {
				return e;
			}
		}
	   /* Optional<Employee> emp1=hset.stream().filter(emp->emp.getEmpid()==id).findFirst();
	    if(emp1.isPresent())
	         return emp1.get();*/
		return null;
	}

	@Override
	public List<Employee> findByName(String nm) {
		List<Employee> elist=new ArrayList<>();
		for(Employee e:hset) {
			if(e.getEname().equals(nm)) {
				elist.add(e);
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
		return hset.remove(new Employee(id));
		
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
		for(Employee e:hset) {
			eset.add(e);
		}
		return eset;
	}

	@Override
	public Set<Employee> sortById() {
		Set<Employee> esetsorted=new TreeSet<>();
		for(Employee e:hset) {
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
		for(Employee e:hset) {
			eset.add(e);
		}
		return eset;
	}

}
