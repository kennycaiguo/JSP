package dao;

import java.util.List;

import util.HibernateUtil;
import bean.Emp;

public class UserDao {

	public void add(Emp tUser) {
		HibernateUtil.add(tUser);
	}

	public List list() {		
		return HibernateUtil.list("from Emp");
	}

}
