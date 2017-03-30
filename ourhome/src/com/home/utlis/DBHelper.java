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
		//�������ݿ�����
		Connection conn = null;
		// ��������SQLSERVER���ݿ������
		try {
			Class.forName(className);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
		//ͨ���������������ݿ����Ӷ���
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("�ɹ��������ݿ�");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
	}

	public static void closeConn(Connection conn, PreparedStatement pst,
			ResultSet rs) {
		// �ر�ResultSet����
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// �ر�PreparedStatement����
		if (pst != null) {
			try {
				pst.close();
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
