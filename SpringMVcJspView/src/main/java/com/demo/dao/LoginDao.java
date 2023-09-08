package com.demo.dao;

import com.demo.beans.User;

public interface LoginDao {

	User findUser(String nm, String pass);

}
