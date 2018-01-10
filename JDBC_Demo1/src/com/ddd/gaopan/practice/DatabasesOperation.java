package com.ddd.gaopan.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabasesOperation {
	private static Connection con = null;
	private static PreparedStatement stmt = null;
	ResultSet rs = null;

	public void createTable() {
		if (con == null) {
			con = Contribute.open();
		}
		String sql = "Create table users(id int primary key auto_increment,name varchar(20) not null,sex varchar(2) not null default '男',password varchar(6) not null)";
		try {
			stmt = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("sql语句出现问题！");
		}
		try {
			System.out.println(stmt.executeUpdate());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("返回出错");
		}
		Contribute.close(con, stmt);
	}

	public void tableConstriction() throws Exception {
		if (con == null) {
			con = Contribute.open();
		}
		String sql = "select * from users";
		try {
			stmt = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("sql语句出现问题！");
		}
		try {
			rs = stmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("返回结果时出现错误！");
		}
		List<User> al = new ArrayList<User>();
		while (rs.next()) {
			User use = new User();
			use.setId(rs.getInt(1));
			use.setUsername(rs.getString(2));
			use.setSex(rs.getString(3));
			use.setPassword(rs.getString(4));
			al.add(use);
		}
		for (User user : al) {
			System.out.println(user);
		}
		if (rs == null) {
			rs.close();
			rs = null;
		}
		Contribute.close(con, stmt);
	}

	public void add() throws Exception {
		if (con == null) {
			con = Contribute.open();
		}
		String sql = "insert into users(name,password) values(?,?)";
		stmt = con.prepareStatement(sql);
		stmt.setString(1, "罗瑶");
		stmt.setString(2, "163786");
		int i = stmt.executeUpdate();
		System.out.println(i);
		Contribute.close(con, stmt);
	}

	public void update() throws Exception {
		if (con == null) {
			con = Contribute.open();
		}
		String sql = "update users set password = ?  where id=? ";
		stmt = con.prepareStatement(sql);
		stmt.setString(1, "123456");
		stmt.setInt(2, 2);
		int i = stmt.executeUpdate();
		System.out.println(i);
		Contribute.close(con, stmt);
	}

	public void delete() throws Exception {
		if (con == null) {
			con = Contribute.open();
		}
		String sql = "delete from users where name=?";
		stmt = con.prepareStatement(sql);
		stmt.setString(1, "罗瑶");
		int i = stmt.executeUpdate();
		System.out.println(i);
		Contribute.close(con, stmt);
	}
}
