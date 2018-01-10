package com.xupt.Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Contribute {
	private static String driver;
	private static String url;
	private static String password;
	private static String user;
	static {
		driver = "com.mysql.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/supermarket";
		user = "root";
		password = "123456";
	}

	public static Connection open() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		return DriverManager.getConnection(url, user, password);
	}

	public static void close(Connection con, PreparedStatement ps) {
		if (ps != null) {
			try {
				ps.close();
				ps = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("数据库连接关闭异常");
			}
		}
		if (con != null) {
			try {
				con.close();
				con = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("数据库关闭加载出现异常！");
			}
		}
	}
}
