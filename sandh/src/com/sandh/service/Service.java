package com.sandh.service;

import java.util.List;

import com.sandh.bean.TUser;
import com.sandh.dao.Dao;


public class Service {
	Dao dao = new Dao();
	public List<TUser> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}

}
