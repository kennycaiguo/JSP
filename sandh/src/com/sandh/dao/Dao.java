package com.sandh.dao;

import java.util.List;



import com.sandh.bean.Student;
import com.sandh.util.HibernateUtil;

public class Dao {

	public List<Student> list() {
		return HibernateUtil.list("from Student");
	}

	public Student getOne(Long sId) {
		return (Student) HibernateUtil.getOne(Student.class,sId);
	}

}
