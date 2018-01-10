package com.xupt.Sql;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class MysqlOperation {
	protected Connection con = null;

	public MysqlOperation() {// 数据库初始化连接
		try {
			con = Contribute.open();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("数据库连接出现异常，请确定数据库是否存在");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("数据库加载出现异常，请确定数据库服务是否打开");
		}
	}

	public abstract void insert(Object temp);// 数据库增加

	public abstract void update(Object tag);// 数据库修改

	public abstract void select(Object tag);// 数据库查询

	public abstract void delete(Object tag);// 数据库删除某个人的信息
}
