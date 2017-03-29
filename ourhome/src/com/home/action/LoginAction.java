package com.home.action;

import com.home.modle.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String execute(){
		return SUCCESS;
	}

}
