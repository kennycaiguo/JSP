package action;

import java.util.Map;

import modle.User;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class Loginaction implements RequestAware, SessionAware,
ApplicationAware, Action{
	private User user;
	private Map request;
	private Map session;
	private Map application;
	
	public String execute(){
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void setRequest(Map<String, Object> request) {		
		this.request = request;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setApplication(Map<String, Object> application) {	
		this.application = application;
	}
}
