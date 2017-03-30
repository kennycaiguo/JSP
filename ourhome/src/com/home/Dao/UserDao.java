package com.home.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.home.modle.User;
import com.home.utlis.DBHelper;

public class UserDao {
	public boolean find(User user)throws SQLException {
		Connection conn = DBHelper.getcon();//����һ�����ݿ�����
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "select * from Userinfo where uame = ? and upsw = ?";
		pst = conn.prepareStatement(sql);
		pst.setString(1,user.getUsername());
		pst.setString(2,user.getPassword());
		rs = pst.executeQuery();
		while(rs.next()){
			DBHelper.closeConn(conn, pst, rs);
			return true;
		}
		// �ر����ݿ���Դ	
		DBHelper.closeConn(conn, pst, rs);
		return false;
	}

}
