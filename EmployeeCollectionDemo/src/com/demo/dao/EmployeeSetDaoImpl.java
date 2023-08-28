package com.demo.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Employee;
import com.demo.comparators.MyIdComparator;
import com.demo.comparators.MySalComparator;
import com.demo.exceptions.NoEmployeeFound;

public class EmployeeSetDaoImpl implements EmployeeDao{
	static Set<Employee> eset;
	{
		eset=new HashSet<>();
		eset.add(new Employee(12,"Rajan",3456));
		eset.add(new Employee(13,"Revati",444));
		eset.add(new Employee(14,"Shreya",555));
		eset.add(new Employee(15,"Harshal",666));
	}

	@Override
	public void saveEmployee(Employee employee) {
		boolean status=eset.add(employee);
		if(status) {
			System.out.println("added");
		}
		else {
			System.out.println("duplicate object");
		}
		
	}

	@Override
	public Set<Employee> findAllEmployee() {
		return eset;
	}

	@Override
	public Employee findById(int id) throws NoEmployeeFound {
		for(Employee e:eset) {
			if(e.getEmpid()==id) {
				return e;
			}
		}
      throw new NoEmployeeFound("no employee found");
	}

	@Override
	public boolean updateEmployee(int id, String nm, double sal) throws NoEmployeeFound {
		Employee e=findById(id);
		if(e!=null) {
			e.setEname(nm);
			e.setSal(sal);
			return true;
		}
		return false;
		
	}

	@Override
	public boolean deleteEmployee(int id)  {
		return eset.remove(new Employee(id));
		
		
	}

	@Override
	public List<Employee> findByName(String name) throws NoEmployeeFound {
		List<Employee> elist=new ArrayList<>();
		for(Employee e:eset) {
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
		//use priorityqueue because name of 2 employees can be same
		//PriorityQueue<Employee> pq=new PriorityQueue<>();
		List<Employee> list=new ArrayList<>();
		for(Employee e:eset) {
			//pq.add(e);
			list.add(e);
		}
		Collections.sort(list);
		//return pq;
		return list;
	}

	@Override
	public Set<Employee> sortByPatternandName(String pattern) {
		Comparator<Employee> c=(o1,o2)->{
			System.out.println("in MyID comparator");
			return o1.getEmpid()-o2.getEmpid();
			};			
			Comparator<Employee> c1=(o1,o2)->{
				System.out.println("in MyID comparator");
				return o1.getEmpid()-o2.getEmpid();
				};
		Set<Employee> ts=new TreeSet<>(c);
		for(Employee e:eset) {
			if(e.getEname().contains(pattern))
			 ts.add(e);
		}
		return ts;
	}

}
