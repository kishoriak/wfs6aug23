package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.User;

@Repository
public class LoginDaoImpl implements LoginDao{
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public User findUser(String nm, String pass) {
		try {
		String sql="select * from user where uname=? and pass=?";
		return jdbcTemplate.queryForObject(sql, new Object[] {nm,pass},BeanPropertyRowMapper.newInstance(User.class));
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}

}
