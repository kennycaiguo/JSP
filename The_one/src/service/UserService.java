package service;

import java.sql.SQLException;
import modle.User;
import dao.UserDao;
public class UserService {
	UserDao dao = new UserDao();
	
	//�����½
	public User login(String username,String password) throws SQLException{
		System.out.println("����UserService.login");
		User user = dao.find(username,password);
		return user;
	}
}
