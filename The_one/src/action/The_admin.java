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
		//���û�ȡ���ݵı���
//		request.setCharacterEncoding("utf-8");
//		
//		//��ȡ���ύ����Ϣ
		String username = user.getUsername();
		String password = user.getPassword();
		
		//�û���¼��֤
		UserService service = new UserService();
		if(username.equals("lium")){
			try {
				user = service.login(username, password);
				//���ActionContextʵ�����Ա��ڷ���Sevlet API
				ActionContext ctx = ActionContext.getContext();
				//����application---���ñ���
				ctx.getApplication().put("username",username);
				return "admin_page";
			} catch (Exception e) {
				request = ServletActionContext.getRequest();
				request.setAttribute("erorr2", "���ݿ���֤ʧ��");
				return "admin_page";
			}
			
		}else {
			//HttpServletRequest ֻת��һ��
			 request = ServletActionContext.getRequest();
			 request.setAttribute("erorr1", "�˺�/���� ����");
		   	return "tologin";
	}
}
	}
