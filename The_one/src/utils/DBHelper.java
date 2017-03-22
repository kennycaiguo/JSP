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

	// ��ȡ���Ӷ��󷽷�
	public static Connection getCon() {
		
		// �������ݿ����Ӷ���
		Connection conn = null;
		// ��������SQLSERVER���ݿ������
		try {
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// ͨ������������������ݿ����Ӷ���
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void closeConn(Connection conn, Statement st, ResultSet rs) {
		// �ر�ResultSet����
				if (rs != null) {
					try {
						rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
		// �ر�Satement����
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// �ر� Connection����
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
