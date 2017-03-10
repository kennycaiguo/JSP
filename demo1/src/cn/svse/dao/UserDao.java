package cn.svse.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import cn.svse.bean.Userinfo;
import cn.svse.utils.DBHelper;

public class UserDao {

	/*
	 * 判断给定的用户是否存在
	 */
	public Userinfo find(String username, String password) throws SQLException {
		Connection conn = DBHelper.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		Userinfo userinfo = null;
		String sql = "select * from Userinfo where uame = ? and upsw = ?";
		pst = conn.prepareStatement(sql);
		pst.setString(1, username);
		pst.setString(2, password);
		rs = pst.executeQuery();
		if (rs.next()) {
			// 将数据集的一行数据映射为一个对象 --ORM 对象关系映射
			userinfo = new Userinfo();
			userinfo.setUid(rs.getInt("uid"));
			userinfo.setUame(rs.getString("uame"));			
			userinfo.setUpsw(rs.getString("upsw"));
			userinfo.setUrealname(rs.getString("urealname"));
		}
		// 关闭数据库资源
		DBHelper.closeConn(conn, pst, rs);
		return userinfo;
	}

}
