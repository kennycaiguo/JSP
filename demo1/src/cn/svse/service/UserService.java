package cn.svse.service;

import java.sql.SQLException;
import cn.svse.bean.Userinfo;
import cn.svse.dao.UserDao;

/*
 * 业务处理类
 */
public class UserService {

	UserDao dao = new UserDao();

	/*
	 * 处理登录业务
	 */
	public Userinfo login(String username, String password) throws SQLException {
		Userinfo userinfo = dao.find(username, password);
		return userinfo;
	}

}
