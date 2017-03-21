package service;

import java.sql.SQLException;
import modle.User;
import dao.UserDao;
public class UserService {
	UserDao dao = new UserDao();
	
	//处理登陆
	public User login(String username,String password) throws SQLException{
		System.out.println("进入UserService.login");
		User user = dao.find(username,password);
		return user;
	}
}
