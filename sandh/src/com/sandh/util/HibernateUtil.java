package com.sandh.util;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateUtil {

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

}
