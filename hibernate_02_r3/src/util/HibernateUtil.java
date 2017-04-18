package util;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import service.PersonService;

import bean.Emp;
import bean.PageBean;

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
			query.setFirstResult(0);
			query.setMaxResults(5);
			list = query.list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			s.close();
		}
		return list;
	}
	
	/**
     * 通过hql语句得到数据库中记录总数
     */
	 public int getAllRowCount(String hql)
	    {
	        Session s = null;
	        Transaction tx = null;
	        int allRows = 0;
	        try
	        {
	        	s=HibernateSessionFactory.getSession();
	            tx = s.beginTransaction();
	            Query query = s.createQuery(hql);
	            allRows = query.list().size();
	            tx.commit();
	        }
	        catch (Exception e)
	        {
	            if(tx != null)
	            {
	                tx.rollback();
	            }
	            
	            e.printStackTrace();
	        }
	        finally
	        {
	            s.close();
	        }
	        
	        return allRows;
	    }
	 
	 /**
	     * 使用hibernate提供的分页功能，得到分页显示的数据
	     */
	    public List<Emp> queryByPage(String hql, int offset, int pageSize)
	    {
	        Session s = null;
	        Transaction tx = null;
	        List<Emp> list = null;
	        try
	        {
	        	s=HibernateSessionFactory.getSession();
	            tx = s.beginTransaction();
	            Query query = s.createQuery(hql);
	            query.setFirstResult(offset);
				query.setMaxResults(pageSize);
	            list = query.list();
	            tx.commit();
	        }
	        catch (Exception e)
	        {
	            if(tx != null)
	            {
	                tx.rollback();
	            }
	            
	            e.printStackTrace();
	        }
	        finally
	        {
	        	s.close();
	        }
	        return list;
	    }


}
