package com.ddd.gaopan;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ShuJuKu {

	public static void main(String[] args) {
		createtable();
	}

	static void createtable() {
		Connection con = DBunitue.open();
		String sql = "create table User (id int primary key auto_increment,name varchar(20))";
		try {
			Statement stmt = (Statement) con.createStatement();
			stmt.execute(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBunitue.close(con);
		}

	}
}
