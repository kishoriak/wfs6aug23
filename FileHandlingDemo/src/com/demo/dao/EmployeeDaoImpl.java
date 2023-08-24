package com.demo.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private static Employee[] emparr;
	private static int cnt;
	static {
		emparr=new Employee[100];
		/*emparr[0]=new Employee(1,"Revati",345674);
		emparr[1]=new Employee(2,"Rajan",444444);
		emparr[2]=new Employee(3,"Atharva",555555);*/
		//cnt=3;
	}
	@Override
	public void readData(String fname) {
		cnt=0;
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fname))){
			while(true) {
				emparr[cnt]=(Employee)ois.readObject();
				cnt++;
			}
			
		} catch(EOFException e) {
			System.out.println("Reached to end of file......"+cnt);
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		displayAll();
	}
	private void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(emparr[i]);
		}
		
	}
	@Override
	public void writeData(String fname) {
		try(ObjectOutputStream oos=new ObjectOutputStream(
				                     new FileOutputStream(fname))){
			for(int i=0;i<cnt;i++) {
				oos.writeObject(emparr[i]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
