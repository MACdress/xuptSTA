package com.ddd.gaopan;

import java.sql.DriverManager;
import java.util.Scanner;

import com.mysql.jdbc.Connection;

public class DeleteAction_pre {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Connection con = null;
		new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager
					.getConnection("jdbc:mysql://locallhost:3306");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
