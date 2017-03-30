package com.home.utlis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHelper {
	private final static String className = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private final static String url = "jdbc:sqlserver://localhost:1433;databaseName=mydb";
	private final static String user = "sa";
	private final static String password = "svse";
	public static Connection getcon() {
		//定义数据库连接
		Connection conn = null;
		// 加载连接SQLSERVER数据库的驱动
		try {
			Class.forName(className);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
		//通过驱动管理获得数据库连接对象
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("成功连接数据库");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
	}

	public static void closeConn(Connection conn, PreparedStatement pst,
			ResultSet rs) {
		// 关闭ResultSet对象
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// 关闭PreparedStatement对象
		if (pst != null) {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// 关闭 Connection对象
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
	}

}
