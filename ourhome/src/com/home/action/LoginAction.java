package com.home.action;

import java.sql.SQLException;

import com.home.modle.User;
import com.home.service.UserServicce;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String execute() throws SQLException{
		boolean verify = new UserServicce().login(user);		
		System.out.println("boolean------------------"+verify);
		if(verify == true){
			return SUCCESS;
		}else{
			return null;
		}
		
	}

}
