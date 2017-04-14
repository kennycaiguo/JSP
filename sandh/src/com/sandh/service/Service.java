package com.sandh.service;

import java.util.List;

import com.sandh.bean.Student;
import com.sandh.dao.Dao;


public class Service {
	Dao dao = new Dao();
	public List<Student> list() {
		return dao.list();
	}
	public Student getOne(Long sId) {
		 return dao.getOne(sId);
	}

}
