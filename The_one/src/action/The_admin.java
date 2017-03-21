package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import modle.User;

import com.opensymphony.xwork2.ActionContext;

public class The_admin{
    private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String executer(){
		if(user.getUsername().equals("admin")){
			//获得ActionContext实例，以便于访问Sevlet API
			ActionContext ctx = ActionContext.getContext();
			//存入application---长久保存
			ctx.getApplication().put("username",user.getUsername());
			return "admin_page";
		}else if (!user.getUsername().equals("admin")) {
			//HttpServletRequest 只转发一次
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("erorr", "账号/密码 错误！");
			return "tologin";
	}
		return null;		
}
	}
