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
//     * ͨ��hql���õ����ݿ��м�¼����
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
//     * ʹ��hibernate�ṩ�ķ�ҳ���ܣ��õ���ҳ��ʾ������
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