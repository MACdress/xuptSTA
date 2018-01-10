package com.test.gaopan.shujuku;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class contribute {
	private static String driver;
	private static String utl;
	private static String password;
	private static String user;
	static {
		driver = "com.mysql.jdbc.Driver";
		utl = "jdbc:mysql://localhost:3306/test";
		user = "root";
		password = "123456";
	}

	public static Connection open() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			return DriverManager.getConnection(utl, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void close(Connection con, PreparedStatement ps) {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("数据库加载关闭出现错误");
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("数据库连接关闭出现错误");
			}
		}
	}
}
