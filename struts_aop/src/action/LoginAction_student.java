package action;

import com.opensymphony.xwork2.ActionContext;

public class LoginAction_student {
    private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    public String login_student(){
    	if(username.equals("admin")){
    		ActionContext.getContext().getSession().put("username",username);
    		return "success";
    	}
    	return "loginPage_student";
    }
}
