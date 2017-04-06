package action;

import java.util.ArrayList;
import java.util.List;

import service.UserService;
import bean.TUser;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<TUser> {

	private TUser tUser = new TUser();

	private List<TUser> userList;

	public List<TUser> getUserList() {
		return userList;
	}

	public void setUserList(List<TUser> userList) {
		this.userList = userList;
	}

	UserService service = new UserService();

	public TUser getModel() {
		return tUser;
	}

	public String list() {
		userList = service.list();
		return SUCCESS;
	}

	public String add() {
		service.add(tUser);
		return SUCCESS;
	}
	
	public String detail() {
		tUser = service.getOne(tUser.getUId());
		ActionContext.getContext().put("user", tUser);
		return SUCCESS;
	}
	
	public String preUpdate() {
		tUser = service.getOne(tUser.getUId());
		ActionContext.getContext().put("user", tUser);
		return SUCCESS;
	}

	public String update() {
		service.update(tUser);
		return SUCCESS;
	}
	
	public String del(){
		service.del(tUser);
		return SUCCESS;
	}

}
