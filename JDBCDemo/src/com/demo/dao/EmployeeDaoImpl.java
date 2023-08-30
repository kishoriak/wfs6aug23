package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	static Connection conn=null;
	//static PreparedStatement insst=null;
	static{
		try {
			conn=DBUtil.getMyConnection();
			//insst=conn.prepareStatement("insert into employee values(?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean saveEmployee(Employee e) {
		try {
			PreparedStatement insst=conn.prepareStatement("insert into employee values(?,?,?)");
			insst.setInt(1, e.getEmpid());
			insst.setString(2,e.getEname());
			insst.setInt(3, (int) e.getSal());
			int n=insst.executeUpdate();
			if(n>0) {
				return true;
			}
			return false;
			//conn.commit();
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			/*try {
				conn.rollback();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}*/
			e1.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean removeById(int id) {
		try {
			PreparedStatement delst=conn.prepareStatement("delete from employee where id=?");
			delst.setInt(1, id);
			int n=delst.executeUpdate();
			if(n>0) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public List<Employee> getAll() {
		PreparedStatement getallst;
		List<Employee> elist=new ArrayList<>();
		try {
			getallst = conn.prepareStatement("select * from employee");
			ResultSet rs=getallst.executeQuery();
			while(rs.next()) {
				elist.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3)));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(elist.size()>0) {
			return elist;
		}
		return null;
	}
	
	@Override
	public Employee findById(int id) {
		PreparedStatement byIdst;
		try {
			byIdst = conn.prepareStatement("select * from employee where id=?");
			byIdst.setInt(1, id);
			ResultSet rs=byIdst.executeQuery();
			if(rs.next()) {
				return new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3));
			}
			else {
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	@Override
	public boolean updateById(int id, String nm, double charges) {
		try {
			PreparedStatement upst=conn.prepareStatement("update employee set name=?,sal=? where id=?" );
			upst.setString(1, nm);
			upst.setInt(2, (int) charges);
			upst.setInt(3, id);
			int n=upst.executeUpdate();
			if(n>0) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public List<Employee> sortyBySal() {
		List<Employee> elist=new ArrayList<>();
		try {
			
			PreparedStatement sortst=conn.prepareStatement("select * from employee order by sal" );
			ResultSet rs=sortst.executeQuery();
			while(rs.next()) {
				elist.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3)));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(elist.size()>0) {
			return elist;
		}
		return null;
	}
	
	@Override
	public void closeConnection() {
		DBUtil.closeMyConnection();
		
	}
	

}
