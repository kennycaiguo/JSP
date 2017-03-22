package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {
	private final static String className = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private final static String url = "jdbc:sqlserver://localhost:1433;databaseName=mydb";
	private final static String user = "sa";
	private final static String password = "svse";

	// 获取连接对象方法
	public static Connection getCon() {
		
		// 定义数据库连接对象
		Connection conn = null;
		// 加载连接SQLSERVER数据库的驱动
		try {
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 通过驱动管理对象获得数据库连接对象
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void closeConn(Connection conn, Statement st, ResultSet rs) {
		// 关闭ResultSet对象
				if (rs != null) {
					try {
						rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
		// 关闭Satement对象
		if (st != null) {
			try {
				st.close();
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
