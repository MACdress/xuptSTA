package com.test.gaopan.shujuku;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MysqlOperation {
	private static Connection con = null;
	private static PreparedStatement ps = null;

	public static void insert(student stu) {
		con = contribute.open();
		String sql = "insert into student values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, stu.getS_no());
			ps.setString(2, stu.getS_name());
			ps.setInt(3, stu.getAge());
			ps.setString(4, stu.getSex());

			int i = ps.executeUpdate();
			System.out.println(i);
			contribute.close(con, ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void update(int id, student stu) {
		try {
			con = contribute.open();
			String sql = "update student set s_no=?,s_name=?,s_age=?,s_sex=? where s_no=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, stu.getS_no());
			ps.setString(2, stu.getS_name());
			ps.setInt(3, stu.getAge());
			ps.setString(4, stu.getSex());
			ps.setInt(5, id);
			int i = ps.executeUpdate();
			System.out.println(i);
			contribute.close(con, ps);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void Select1(int id) {// 根据学号查看某一个学生信息
		ResultSet rs = null;
		try {
			con = contribute.open();
			String sql = "select *   from student where s_no=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			student temp = null;
			if (rs.next()) {
				temp = new student();
				temp.setS_no(rs.getInt(1));
				temp.setS_name(rs.getString(2));
				temp.setAge(rs.getInt(3));
				temp.setSex(rs.getString(4));
			}
			System.out.println(temp);
			if (rs != null) {
				rs.close();
			}
			contribute.close(con, ps);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void select2(String sex) {// 根据性别查看同性别的所有学生
		con = contribute.open();
		String sql = "select * from student where s_sex=?";
		try {
			ps = con.prepareStatement(sql);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			ps.setString(1, sex);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("sql语句出现错误");
		}
		ResultSet rs = null;
		List<student> al = new ArrayList<student>();
		try {
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				student temp = new student();
				temp.setS_no(rs.getInt(1));
				temp.setS_name(rs.getString(2));
				temp.setAge(rs.getInt(3));
				temp.setSex(rs.getString(4));
				al.add(temp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (student student : al) {
			System.out.println(student);
		}
		contribute.close(con, ps);
	}

	public static void delete(int id) {
		try {
			con = contribute.open();
			String sql = "delete from student where s_no=id";
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			System.out.println(i);
			contribute.close(con, ps);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void selectall() {
		ResultSet rs = null;
		con = contribute.open();
		String sql = "select * from student";
		try {
			ps = con.prepareStatement(sql);
			List<student> al = new ArrayList<student>();
			rs = ps.executeQuery();
			while (rs.next()) {
				student temp = new student();
				temp.setS_no(rs.getInt(1));
				temp.setS_name(rs.getString(2));
				temp.setAge(rs.getInt(3));
				temp.setSex(rs.getString(4));
				al.add(temp);
			}
			for (student student : al) {
				System.out.println(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		contribute.close(con, ps);
	}
}
