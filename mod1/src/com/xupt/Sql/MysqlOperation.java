package com.xupt.Sql;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class MysqlOperation {
	protected Connection con = null;

	public MysqlOperation() {// ���ݿ��ʼ������
		try {
			con = Contribute.open();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("���ݿ����ӳ����쳣����ȷ�����ݿ��Ƿ����");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("���ݿ���س����쳣����ȷ�����ݿ�����Ƿ��");
		}
	}

	public abstract void insert(Object temp);// ���ݿ�����

	public abstract void update(Object tag);// ���ݿ��޸�

	public abstract void select(Object tag);// ���ݿ��ѯ

	public abstract void delete(Object tag);// ���ݿ�ɾ��ĳ���˵���Ϣ
}
