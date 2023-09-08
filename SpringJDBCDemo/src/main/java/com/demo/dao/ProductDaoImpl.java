package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
    @Autowired
	private JdbcTemplate jdbcTemplate;

	public void save(Product p) {
		jdbcTemplate.update("insert onto product values(?,?,?,?)",
				new Object[] {p.getPid(),p.getPname(),p.getPrice(),
						p.getQty()});
		
	}

	@Override
	public List<Product> findAll() {
		/*List<Product> plist=jdbcTemplate.query("select * from product",
				new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getDouble(3));
				p.setQty(rs.getInt(4));
				return p;
			}});*/
	List<Product> plist=jdbcTemplate.query("select * from product",
				(rs, rowNum) -> {
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getDouble(3));
				p.setQty(rs.getInt(4));
				return p;
			});
		return plist;
	}

	@Override
	public int removeById(int pid) {
		return jdbcTemplate.update("delete from product where pid=?",
				new Object[] {pid});
	}

	@Override
	public Product findById(int pid) {
		return jdbcTemplate.queryForObject(
				"select * from product where pid=?", 
				new Object[] {pid},
				BeanPropertyRowMapper.newInstance(Product.class));
	}

	@Override
	public int updateById(int pid, String pname, int qty, double pr) {
		return jdbcTemplate.update(
			"update product set pname=?,qty=?,price=? where pid=?",
			new Object[] {
					pname,qty,pr,pid
			});
	}
}
