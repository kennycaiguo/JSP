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
			//���ActionContextʵ�����Ա��ڷ���Sevlet API
			ActionContext ctx = ActionContext.getContext();
			//����application---���ñ���
			ctx.getApplication().put("username",user.getUsername());
			return "admin_page";
		}else if (!user.getUsername().equals("admin")) {
			//HttpServletRequest ֻת��һ��
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("erorr", "�˺�/���� ����");
			return "tologin";
	}
		return null;		
}
	}
