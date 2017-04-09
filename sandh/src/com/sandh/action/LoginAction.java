package com.sandh.action;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sandh.bean.TUser;
import com.sandh.service.Service;

public class LoginAction extends ActionSupport implements ModelDriven<TUser>{
	Service service = new Service();
	private TUser tUser = new TUser();

	private List<TUser> loginList;
	
	public List<TUser> getLoginList() {
		return loginList;
	}
	public void setLoginList(List<TUser> loginList) {
		this.loginList = loginList;
	}
	public TUser getModel() {
		return tUser; 
	}
	public String tologin(){
		return SUCCESS;
	}
	public String list_login(){
		loginList = service.list();
		return SUCCESS;
	}

	
	
}
