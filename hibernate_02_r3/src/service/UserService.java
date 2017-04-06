package service;

import java.util.List;

import bean.TUser;
import dao.UserDao;

public class UserService {

	UserDao dao = new UserDao();
	
	public void add(TUser tUser) {
		
		dao.add(tUser);
	}

	public List list() {
		
		return dao.list();
	}

	public TUser getOne(Long id) {

		return dao.getOne(id);
	}

	public void update(TUser tUser) {
		
		dao.update(tUser);
	}

	public void del(TUser tUser) {

		dao.del(tUser);
	}

}
