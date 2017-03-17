package action;

import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	
	private String username;
	
	private String password;
	
	public String getUsername(){
		return this.username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String login(){
		if(username.equals("admin") && password.equals("123456")){
			
			ActionContext.getContext().getSession().put("username",username);
			
			
			return "success";
		}
		
		return "loginPage";
	}
}
