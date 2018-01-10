package com.ddd.gaopan;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class CreateDatabase {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student", "root", "root");
			String sql = "update  myfriend set name=? where age=?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, "gaopan");
			stmt.setInt(2, 13);
			stmt.executeUpdate();
			// stmt.executeQuery(sql);
			// while (rs.next()) {
			// String name = rs.getString(1);
			// int age = rs.getInt(2);
			// int id = rs.getInt(3);
			// String birth = rs.getString(4);
			// System.out
			// .println(name + "  " + age + "  " + id + "  " + birth);
			// }
			System.out.println("运行成功");
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
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
