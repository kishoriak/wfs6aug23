package com.demo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public class ProductDaoImpl2 implements ProductDao{
	
	@Autowired
	private NamedParameterJdbcTemplate njdbcTemplate;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(Product p) {
		String sql="insert into product values(:id,:name,:price,:qty)";
		Map<String,Object> map=new HashMap<>();
		map.put("id", p.getPid());
		map.put("name", p.getPname());
		map.put("price", p.getPrice());
		map.put("qty", p.getQty());
		//int num=njdbcTemplate.update(sql, map);
		int num=njdbcTemplate.execute(sql,map,new PreparedStatementCallback<Integer>() {

			@Override
			public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		} );
		return num;
	}

	@Override
	public List<Product> findAll() {
		String sql="select * from product";
		/*List<Product> plist=jdbcTemplate.query(sql,new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setQty(rs.getInt(3));
				p.setPrice(rs.getDouble(4));
				return p;
			}
			
			
		} );*/
		List<Product> plist=jdbcTemplate.query(sql,(rs,rownum)-> {
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getDouble(3));
				p.setQty(rs.getInt(4));
				
				return p;
			} );
		return plist;
	}

	@Override
	public Product getById(int id) throws EmptyResultDataAccessException{
		String sql="select * from product where pid=?";
		//try {
		     return jdbcTemplate.queryForObject(sql, new Object[] {id},BeanPropertyRowMapper.newInstance(Product.class));
		/*}catch(EmptyResultDataAccessException e) {
		   throw e;	
		}*/
	}

	@Override
	public List<Product> getByPrice(double lpr, double hpr) {
		String sql="select * from product where price between ? and ?";
		return jdbcTemplate.query(sql,new Object[] {lpr,hpr}, BeanPropertyRowMapper.newInstance(Product.class));
	}

	@Override
	public boolean deleteByID(int id) {
		String sql="delete from product where pid=?";
		int n= jdbcTemplate.update(sql,new Object[] {id});
		if (n>0){
			return true;
		}
		return false;
	}

	@Override
	public int updateByID(int id, int qty, double pr) {
		String sql="update product set qty=?,price=? where pid=?";
		return jdbcTemplate.update(sql,new Object[] {qty,pr,id});
		
	}

}
