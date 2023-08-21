package com.demo.service;

import java.util.Scanner;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class EmployeeService {
	private static Employee[] emparr;
	private static int cnt;
	static {
		//creating 50 references of Employee
		emparr=new Employee[50];
		emparr[0]=new SalariedEmp(12,"Rajan","33333","Gaming","Designer",55555);
		emparr[1]=new ContractEmp(13,"Atharva","44444","UI","Developer",45,65555);
		emparr[2]=new SalariedEmp(14, "Revati", "55555", "UX", "Designer", 77777);
		emparr[3]=new ContractEmp(13,"Esha","6666","Ux","Developer",45,3000);
		cnt=4;
	}

	public static void addnewEmployee(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int pid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name");
		String nm=sc.nextLine();
		System.out.println("Enter mobile");
		String mob=sc.next();
		System.out.println("Enter dept");
		String dt=sc.next();
		System.out.println("Enter desg");
		String ds=sc.next();
		//for SalariedEmp details
		if(ch==1) {
			System.out.println("Enter salary");
			double s=sc.nextDouble();
			emparr[cnt]=new SalariedEmp(pid,nm,mob,dt,ds,s);
			cnt++;
		}
		else {  //ConractEmployee details
			System.out.println("Enter hrs");
			int hrs=sc.nextInt();
			System.out.println("Enter charges");
			double charges=sc.nextDouble();
			emparr[cnt]=new ContractEmp(pid,nm,mob,dt,ds,hrs,charges);
			cnt++;
		}
		
		
	}
 
	public static Employee[] displayAll() {
		return emparr;
	}

	//modifying sal/ charges/amount based on type of employee
	public static boolean modifySal(int id, double sal) {
		Employee e=searchById(id);
		if(e!=null) {
			if(e instanceof SalariedEmp) {
				((SalariedEmp)e).setBasicSal(sal);
			}
			else {
				if(e instanceof ContractEmp) {
					((ContractEmp)e).setCharges(sal);
				}else {
					//write code for vendor
				}
			}
			return true;
		}
		return false;
	}
	
    // will return object if id found otherwise return null
	private static Employee searchById(int id) {
		for(Employee e:emparr) {
			if(e==null) {
				//not found
				return null;
			}else {
				//found
				if(e.getPerId()==id) {
					return e;
				}
			}
		}
		//not found
		return null;
	}

	//find first 2 salaried employee objects or return null if < 2 SalariedEmp found
	public static Employee[] findTwoSalariedEmp() {
		Employee[] earr=new Employee[2];
		int i=0;
		for(Employee e:emparr) {
			if( e instanceof SalariedEmp) {
				earr[i]=e;
				i++;
				if(i>=2) {
					return earr;
				}
			}
		}
		/*if(i==1) {
			return earr;
		}*/
		return null;
	}

	public static Employee[] findAllContractEmp() {
		Employee[] earr=new Employee[50];
		int i=0;
		for(Employee e:emparr) {
			if((e!=null) && (e instanceof ContractEmp)) {
				earr[i]=e;
				i++;
			}
			if(e==null)
		    	break;
		}
		//if found minimum one contractemployee
		if(i>0)
			return earr;
		else
			//if no Contractemployees are found
			return null;
		
	}

}
