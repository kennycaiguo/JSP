package cn.svse.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.svse.bean.Houseinfo;
import cn.svse.utils.DBHelper;

public class HouseDao {

	/*
	 * 新增房屋信息
	 */
	public void addHouseinfo(Houseinfo houseinfo) {
		Connection conn = DBHelper.getCon();
		PreparedStatement pst = null;
		String sql = "insert into houseinfo(uid,harea,hname,hfx,hmj,hzx,hlc,hzj,hfd,hfdtel,hqk) values(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, houseinfo.getUid());
			pst.setString(2, houseinfo.getHarea());
			pst.setString(3, houseinfo.getHname());
			pst.setString(4, houseinfo.getHfx());
			pst.setString(5, houseinfo.getHmj());
			pst.setString(6, houseinfo.getHzx());
			pst.setString(7, houseinfo.getHlc());
			pst.setString(8, houseinfo.getHzj());
			pst.setString(9, houseinfo.getHfd());
			pst.setString(10, houseinfo.getHfdtel());
			pst.setString(11, houseinfo.getHqk());
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConn(conn, pst, null);
		}
	}
	
	/*
	 * 修改房屋信息
	 */
	public void modHouseinfo(Houseinfo houseinfo) {
		Connection conn = DBHelper.getCon();
		PreparedStatement pst = null;
		String sql = "update houseinfo set uid = ?, harea = ?, hname = ?, hfx = ?, hmj = ?, hzx = ?, hlc = ?, hzj = ?, hfd = ?, hfdtel = ?, hqk = ? where hid = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, houseinfo.getUid());
			pst.setString(2, houseinfo.getHarea());
			pst.setString(3, houseinfo.getHname());
			pst.setString(4, houseinfo.getHfx());
			pst.setString(5, houseinfo.getHmj());
			pst.setString(6, houseinfo.getHzx());
			pst.setString(7, houseinfo.getHlc());
			pst.setString(8, houseinfo.getHzj());
			pst.setString(9, houseinfo.getHfd());
			pst.setString(10, houseinfo.getHfdtel());
			pst.setString(11, houseinfo.getHqk());
			pst.setInt(12, houseinfo.getHid());
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConn(conn, pst, null);
		}
	}

	/*
	 * 展示当前登录人发布的所有房屋信息
	 */
	public List<Houseinfo> listHouseinfo(int uid) {
		Connection con = DBHelper.getCon();
		PreparedStatement pst = null;
		// 声明结果集对象
		ResultSet rs = null;
		List<Houseinfo> list = null;
		String sql = "select * from houseinfo where uid = ?";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, uid);
			rs = pst.executeQuery();
			list = new ArrayList<Houseinfo>();
			while (rs.next()) {
				Houseinfo houseinfo = new Houseinfo();
				houseinfo.setHid(rs.getInt("hid"));
				houseinfo.setUid(rs.getInt("uid"));
				houseinfo.setHarea(rs.getString("harea"));
				houseinfo.setHname(rs.getString("hname"));
				houseinfo.setHfx(rs.getString("hfx"));
				houseinfo.setHmj(rs.getString("hmj"));
				houseinfo.setHzx(rs.getString("hzx"));
				houseinfo.setHlc(rs.getString("hlc"));
				houseinfo.setHzj(rs.getString("hzj"));
				houseinfo.setHfd(rs.getString("hfd"));
				houseinfo.setHfdtel(rs.getString("hfdtel"));
				houseinfo.setHqk(rs.getString("hqk"));
				list.add(houseinfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConn(con, pst, rs);
		}
		return list;
	}

	public Houseinfo findHouseinfoById(int hid) {
		Houseinfo houseinfo = new Houseinfo();
		Connection con = DBHelper.getCon();
		PreparedStatement pst = null;
		// 声明结果集对象
		ResultSet rs = null;
		String sql = "select * from houseinfo where hid = ?";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, hid);
			rs = pst.executeQuery();
			while (rs.next()) {
				houseinfo.setHid(rs.getInt("hid"));
				houseinfo.setUid(rs.getInt("uid"));
				houseinfo.setHarea(rs.getString("harea"));
				houseinfo.setHname(rs.getString("hname"));
				houseinfo.setHfx(rs.getString("hfx"));
				houseinfo.setHmj(rs.getString("hmj"));
				houseinfo.setHzx(rs.getString("hzx"));
				houseinfo.setHlc(rs.getString("hlc"));
				houseinfo.setHzj(rs.getString("hzj"));
				houseinfo.setHfd(rs.getString("hfd"));
				houseinfo.setHfdtel(rs.getString("hfdtel"));
				houseinfo.setHqk(rs.getString("hqk"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConn(con, pst, rs);
		}
		return houseinfo;
	}

}
