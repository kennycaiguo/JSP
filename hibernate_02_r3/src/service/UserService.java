package service;

import java.util.List;

import bean.Emp;
import dao.UserDao;

public class UserService {

	UserDao dao = new UserDao();
	
	public void add(Emp tUser) {
		
		dao.add(tUser);
	}

	public List list() {
		
		return dao.list();
	}

}
