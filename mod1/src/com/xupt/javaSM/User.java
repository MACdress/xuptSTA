package com.xupt.javaSM;

public class User {

	private String name;
	private String passward;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String id;
	private String ShenFenZheng;

	public User() {
		this.id = this.name = this.passward = this.ShenFenZheng = "0";
	}

	public String setInformation(String passward, String name,
			String shenfenzheng) {// �Ը�����Ϣ���г�ʼ��
		int id = (int) (Math.random() * 100000 + 100000);
		this.id = String.valueOf(id);
		this.passward = passward;
		this.name = name;
		this.ShenFenZheng = shenfenzheng;
		return this.id;
	}

	public boolean judgeIogin(String id, String passward) {// �ж��Ƿ���Ե�¼
		if (this.id.equals(id) && this.passward.equals(passward)) {
			return true;
		}
		return false;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	public boolean judgePassward(String temp) {// �������
		if (passward.equals(temp)) {
			return true;
		}
		return false;
	}

	public String getName() {// ����û���
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean judge(String id) {// �ж�id�Ƿ�����ע���
		if (this.id.equals(id)) {
			return true;
		}
		return false;
	}

	public boolean judge1(String name) {// �ж��Ƿ�����ͬ���û���
		if (this.name.equals(name)) {
			return true;
		}
		return false;
	}

	public boolean judge2(String shenfengzheng) {// �ж����֤�Ƿ�����ʹ�ù�
		if (this.ShenFenZheng.equals(shenfengzheng)) {
			return true;// ����ע���
		}
		return false;// û����ע���
	}

}
