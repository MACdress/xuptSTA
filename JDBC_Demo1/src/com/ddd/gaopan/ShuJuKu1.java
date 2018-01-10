package com.ddd.gaopan;

/*
 *1.加载数据库驱动
 *2.获得数据库链接
 *3.创建语句
 *4.执行查询
 *5.遍历结果集
 *6.关闭数据库连接。
 */
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShuJuKu1 {
	public static void main(String[] args) throws Exception {
		java.sql.Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student", "root", "root");
			String sql = "select * from course";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);// 指针数组，是一个游标
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println(id + ", " + name);
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
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
		}
	}
}
