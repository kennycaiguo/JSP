package action;

import modle.User;

import com.opensymphony.xwork2.Action;

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
			System.out.println("asdcsafasssssssssssssssssss");
			return "admin_page";
		}else if (!user.getUsername().equals("admin")) {
			return "test_page";
	}
		return null;		
}
	}
