package com.sandh.dao;

import java.util.List;


import com.sandh.bean.TUser;
import com.sandh.util.HibernateUtil;

public class Dao {

	public List<TUser> list() {
		return HibernateUtil.list("from TUser");
	}

}
