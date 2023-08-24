package com.dmo.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
    private static Employee[] emparr;
    private static int cnt;
    static {
    	emparr=new Employee[100];
    	cnt=0;
    }
	@Override
	public void save(Employee e) {
		emparr[cnt]=e;
		cnt++;
		
	}
	
	@Override
	public Employee[] findAll() {
		
		return emparr;
	}

	@Override
	public void writeData() {
		try(ObjectOutputStream oos=new ObjectOutputStream(
				            new FileOutputStream("empdata.txt"))){
			if(cnt>0) {
				for(Employee e:emparr) {
					if(e==null) {
						break;
					}
					else {
						oos.writeObject(e);
					}
				}
			}
			
		}  catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

	@Override
	public void readData() {
		File f=new File("empdata.txt");
		if(f.exists()) {
			cnt=0;
			try(ObjectInputStream ois=new ObjectInputStream(
					new FileInputStream(f))){
				while(true) {
					emparr[cnt]=(Employee)ois.readObject();
					cnt++;
				}
				
			}catch(EOFException e) {
				System.out.println("Reached to end of file..."+cnt);
				
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("in else");
		}
		
	}

}
