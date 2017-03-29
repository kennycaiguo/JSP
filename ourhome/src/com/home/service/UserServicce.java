package com.home.service;

import java.sql.SQLException;

import com.home.Dao.UserDao;
import com.home.modle.User;

public class UserServicce {

	public boolean login(User user) throws SQLException {
		boolean verify = new UserDao().find(user);
		return verify;
	}
	//´¦ÀíµÇÂ½
	
}
