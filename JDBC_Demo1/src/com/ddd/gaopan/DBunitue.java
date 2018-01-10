package com.ddd.gaopan;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DBunitue {
	private static String driver;
	private static String utl;
	private static String username;
	private static String password;

	static {
		driver = "com.mysql.jdbc.Driver";// �������ݿ�������
		utl = "jdbc:mysql://localhost:3306/student";// ������ݿ�����
		username = "root";
		password = "root";
	}

	public static Connection open() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
			System.out.println("Class����");
		}
		try {
			return (Connection) DriverManager.getConnection(utl, username,
					password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("DRIVER����");
		}

		return null;
	}

	public static void close(Connection con) {
		if (con != null) {

			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("close����");
			}
		}
	}
}
