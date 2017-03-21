package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modle.User;
import utils.DBHelper;

public class UserDao {
	public User find(String username, String password)throws SQLException {
		Connection conn = DBHelper.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		User user = null;
		String sql = "select * from user where uame = ? and upsw = ?";
		pst = conn.prepareStatement(sql);
		pst.setString(1, username);
		pst.setString(2, password);
		rs = pst.executeQuery();
		if(rs.next()){
			user = new User();
			user.setUid(rs.getInt("uid"));
			user.setUsername(rs.getString("uame"));			
			user.setPassword(rs.getString("upsw"));
			user.setUrealname(rs.getString("urealname"));
		}
		// 关闭数据库资源
		DBHelper.closeConn(conn, pst, rs);
		System.out.println("关闭数据库资源");
		return user;
	}

}
