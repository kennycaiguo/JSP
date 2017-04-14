import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sandh.bean.Student;



public class Test {
        public void addUser(Student user){
//        	读取配置文件
        	Configuration config = new Configuration().configure();
//        	创建SessionFactory
        	SessionFactory sessionFactory = config.buildSessionFactory();
//        	打开Session
        	Session session = sessionFactory.openSession();
//        	开启事物
        	Transaction ctx = session.beginTransaction();
//        	持久化动作
        	session.save(user);
//        	提交事务
        	ctx.commit();
//        	关闭session
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
