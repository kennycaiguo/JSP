package cn.svse.bean;

/*
 * 实体类：用来封装数据，也就是“打包”
 */
public class Houseinfo {
	/*
	 * hid int primary key, uid int, harea varchar(50) not null, hname
	 * varchar(100) not null, hfx varchar(50) not null, hmj varchar(50) not
	 * null, hzx varchar(50) not null, hlc varchar(20) not null, hzj varchar(20)
	 * not null, hfd varchar(20) not null, hfdtel varchar(50) not null, hqk
	 * varchar(50) not null
	 */
	private int hid;
	private int uid;
	private String harea;
	private String hname;
	private String hfx;
	private String hmj;
	private String hzx;
	private String hlc;
	private String hzj;
	private String hfd;
	private String hfdtel;
	private String hqk;

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getHarea() {
		return harea;
	}

	public void setHarea(String harea) {
		this.harea = harea;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getHfx() {
		return hfx;
	}

	public void setHfx(String hfx) {
		this.hfx = hfx;
	}

	public String getHmj() {
		return hmj;
	}

	public void setHmj(String hmj) {
		this.hmj = hmj;
	}

	public String getHzx() {
		return hzx;
	}

	public void setHzx(String hzx) {
		this.hzx = hzx;
	}

	public String getHlc() {
		return hlc;
	}

	public void setHlc(String hlc) {
		this.hlc = hlc;
	}

	public String getHzj() {
		return hzj;
	}

	public void setHzj(String hzj) {
		this.hzj = hzj;
	}

	public String getHfd() {
		return hfd;
	}

	public void setHfd(String hfd) {
		this.hfd = hfd;
	}

	public String getHfdtel() {
		return hfdtel;
	}

	public void setHfdtel(String hfdtel) {
		this.hfdtel = hfdtel;
	}

	public String getHqk() {
		return hqk;
	}

	public void setHqk(String hqk) {
		this.hqk = hqk;
	}
}
