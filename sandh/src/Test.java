import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sandh.bean.Student;



public class Test {
        public void addUser(Student user){
//        	��ȡ�����ļ�
        	Configuration config = new Configuration().configure();
//        	����SessionFactory
        	SessionFactory sessionFactory = config.buildSessionFactory();
//        	��Session
        	Session session = sessionFactory.openSession();
//        	��������
        	Transaction ctx = session.beginTransaction();
//        	�־û�����
        	session.save(user);
//        	�ύ����
        	ctx.commit();
//        	�ر�session
        	session.close();
        }
        public static void main(String[] args){
        	Test test= new Test();
        	Student user = new Student();
//        	user.setUName("sadfasdf");
//        	user.setUPwd("1231");
        	test.addUser(user);
        }
}
