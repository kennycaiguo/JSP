package util;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import bean.TUser;

public class HibernateUtil {

	public static void add(Object obj){
		Session s = null;
		Transaction tx = null;		
		try{
			s = HibernateSessionFactory.getSession();
			tx = s.beginTransaction();
			s.save(obj);
			tx.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			s.close();
		}
	}

	public static List list(String hql) {
		List list = new ArrayList();
		Session s = null;
		Transaction tx = null;		
		try{
			s = HibernateSessionFactory.getSession();
			Query query = s.createQuery(hql);
			list = query.list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			s.close();
		}
		return list;
	}

	public static Object getOne(Class class1, Long id) {
		Object obj = null;
		Session s = null;
		Transaction tx = null;		
		try{
			s = HibernateSessionFactory.getSession();
			obj = s.get(class1, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			s.close();
		}
		return obj;
	}

	public static void update(Object obj) {
		Session s = null;
		Transaction tx = null;		
		try{
			s = HibernateSessionFactory.getSession();
			tx = s.beginTransaction();
			s.update(obj);
			tx.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			s.close();
		}		
	}

	public static void del(Object obj) {
		Session s = null;
		Transaction tx = null;		
		try{
			s = HibernateSessionFactory.getSession();
			tx = s.beginTransaction();
			s.delete(obj);
			tx.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			s.close();
		}				
	}
}
