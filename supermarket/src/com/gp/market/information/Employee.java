package com.gp.market.information;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.gp.market.operationSQL.Constrict;
import com.gp.market.operationSQL.Insert;

public class Employee implements Insert {
	private final int e_no;
	private final String e_name;
	private final String e_ID;
	private final String e_password;
	private final int e_position_id;

	public Employee(String e_name, String e_ID, String e_password,
			int e_position_id) {
		this.e_no = 0;
		this.e_name = e_name;
		this.e_ID = e_ID;
		this.e_password = e_password;
		this.e_position_id = e_position_id;
		Insertinto(this);
	}

	@Override
	public void Insertinto(Object o) {
		// TODO Auto-generated method stub
		Employee em = null;
		if (o instanceof Employee) {
			em = (Employee) o;
		}
		Connection con = null;
		PreparedStatement ps = null;
		con = Constrict.open();
		if (con == null) {
			return;
		}
		String sql = "insert into employee (e_name,e_ID,e_ ID,e_password,e_position_id)values(?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(2, em.e_name);
			ps.setString(3, em.e_ID);
			ps.setString(4, em.e_password);
			ps.setInt(5, em.e_position_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("SQLÓï¾äinsert into³öÏÖ´íÎó");
		} finally {
			Constrict.close(con, ps);
		}
	}

}
