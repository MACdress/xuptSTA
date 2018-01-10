package com.ddd.gaopan;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;

public class Demo2 {
	public static void main(String[] args) {
		query();
	}

	static void query() {
		Connection con = null;
		java.sql.CallableStatement csmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student", "root", "root");
			csmt = con.prepareCall("{call all_customer()}");
			ResultSet rs = (ResultSet) csmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString(1);
				int age = rs.getInt(2);
				int num = rs.getInt(3);
				String birth = rs.getString(4);
				System.out.println(name + "  " + age + "  " + num + "  "
						+ birth);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (csmt != null) {
				try {
					csmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
