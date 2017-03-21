package modle;

public class User {
	private String username;
	
	private String password;
	private int uid;
	private String urealname;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUrealname() {
		return urealname;
	}
	public void setUrealname(String urealname) {
		this.urealname = urealname;
	}
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

	
}
