//package lmpl;
//
//import java.util.List;
//
//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//import util.HibernateUtil;
//import bean.Emp;
//
//
//public class PersonDAOImpl implements PersonDAO
//{
//    /**
//     * 通过hql语句得到数据库中记录总数
//     */
//    public int getAllRowCount(String hql)
//    {
//        Session session = HibernateUtil.openSession();
//        Transaction tx = null;
//        int allRows = 0;
//        try
//        {
//            tx = session.beginTransaction();
//            
//            Query query = session.createQuery(hql);
//            
//            allRows = query.list().size();
//            
//            tx.commit();
//            
//        }
//        catch (Exception e)
//        {
//            if(tx != null)
//            {
//                tx.rollback();
//            }
//            
//            e.printStackTrace();
//        }
//        finally
//        {
//            HibernateUtil.closeSession(session);
//        }
//        
//        return allRows;
//    }
//    /**
//     * 使用hibernate提供的分页功能，得到分页显示的数据
//     */
//    @SuppressWarnings("unchecked")
//    public List<Emp> queryByPage(String hql, int offset, int pageSize)
//    {
//        Session session = HibernateUtil.openSession();
//        Transaction tx = null;
//        List<Emp> list = null;
//        
//        try
//        {
//            tx = session.beginTransaction();
//            
//            Query query = session.createQuery(hql).setFirstResult(offset).setMaxResults(pageSize);
//            
//            list = query.list();
//            
//            tx.commit();
//            
//        }
//        catch (Exception e)
//        {
//            if(tx != null)
//            {
//                tx.rollback();
//            }
//            
//            e.printStackTrace();
//        }
//        finally
//        {
//            HibernateUtil.closeSession(session);
//        }
//        
//        
//        return list;
//    }
//}