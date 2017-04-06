package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateSessionFactory;
import util.HibernateUtil;

import bean.TUser;

public class UserDao {

	public void add(TUser tUser) {
		HibernateUtil.add(tUser);
	}

	public List list() {		
		return HibernateUtil.list("from TUser");
	}

	public TUser getOne(Long id) {
		return (TUser) HibernateUtil.getOne(TUser.class,id);
	}

	public void update(TUser tUser) {
		HibernateUtil.update(tUser);
		
	}

	public void del(TUser tUser) {
		HibernateUtil.del(tUser);
		
	}

}
