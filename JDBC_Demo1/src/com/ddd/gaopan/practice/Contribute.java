package com.ddd.gaopan.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Contribute {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	static {
		driver = "com.mysql.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/student";
		username = "root";
		password = "123456";
	}

	public static Connection open() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("���ݿ����ʧ��");
		}
		try {
			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("���ݿ����ӳ��ִ���");
		}
		return null;
	}

	public static void close(Connection con, PreparedStatement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("�ر����ݿ����ӳ��ִ���");
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("���ݿ�رճ��ִ���");
			}
		}
	}
}
