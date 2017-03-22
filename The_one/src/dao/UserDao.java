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
		String sql = "select * from userinfo where uame = ? and upsw = ?";
		pst = conn.prepareStatement(sql);
		pst.setString(1, username);
		System.out.println("username-----------------------"+username);
		pst.setString(2, password);
		System.out.println("password-----------------------"+password);
		rs = pst.executeQuery();
		while(rs.next()){
			user = new User();
			user.setUsername(rs.getString("uame"));	
			System.out.println("-----------------------"+rs.getString("uame"));
			user.setPassword(rs.getString("upsw"));
		}
		// 关闭数据库资源
		DBHelper.closeConn(conn, pst, rs);
		System.out.println("关闭数据库资源");
		return user;
	}

}
