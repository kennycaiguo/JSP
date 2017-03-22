package action;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

import service.UserService;

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
		HttpServletRequest request;
		//设置获取数据的编码
//		request.setCharacterEncoding("utf-8");
//		
//		//获取表单提交的信息
		String username = user.getUsername();
		String password = user.getPassword();
		
		//用户登录验证
		UserService service = new UserService();
		if(username.equals("lium")){
			try {
				user = service.login(username, password);
				//获得ActionContext实例，以便于访问Sevlet API
				ActionContext ctx = ActionContext.getContext();
				//存入application---长久保存
				ctx.getApplication().put("username",username);
				return "admin_page";
			} catch (Exception e) {
				request = ServletActionContext.getRequest();
				request.setAttribute("erorr2", "数据库验证失败");
				return "admin_page";
			}
			
		}else {
			//HttpServletRequest 只转发一次
			 request = ServletActionContext.getRequest();
			 request.setAttribute("erorr1", "账号/密码 错误！");
		   	return "tologin";
	}
}
	}
