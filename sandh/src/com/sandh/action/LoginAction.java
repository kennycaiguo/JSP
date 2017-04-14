package com.sandh.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sandh.bean.Student;
import com.sandh.service.Service;

public class LoginAction extends ActionSupport implements ModelDriven<Student>{
	Service service = new Service();
	private Student tUser = new Student();

	private List<Student> loginList;
	
	public List<Student> getLoginList() {
		return loginList;
	}
	public void setLoginList(List<Student> loginList) {
		this.loginList = loginList;
	}
	public Student getModel() {
		return tUser; 
	}
	public String tologin(){
		return SUCCESS;
	}
	public String list_login(){
		loginList = service.list();
		return SUCCESS;
	}
	public String detail(){
		tUser = service.getOne(tUser.getSId());
		ActionContext.getContext().put("cv", tUser);
		return SUCCESS;
	}
	
	
}
