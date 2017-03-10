package cn.svse.bean;

/*
 * 实体类：用来封装数据，也就是“打包”
 */
public class Userinfo {
	/*
	 * uid int primary key, uame varchar(50) not null, upsw varchar(20) not
	 * null, urealname varchar(50) not null
	 */
	private int uid;
	private String uame;
	private String upsw;
	private String urealname;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUame() {
		return uame;
	}

	public void setUame(String uame) {
		this.uame = uame;
	}

	public String getUpsw() {
		return upsw;
	}

	public void setUpsw(String upsw) {
		this.upsw = upsw;
	}

	public String getUrealname() {
		return urealname;
	}

	public void setUrealname(String urealname) {
		this.urealname = urealname;
	}

}
