package com.xupt.javaSM;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetAnswer {

	public double getDouble() {// �����ȷ��ʵ��
		Scanner sc = new Scanner(System.in);
		double tag;
		try {
			tag = sc.nextDouble();
		} catch (InputMismatchException in) {
			System.out.println("��Ϸ����룺");
			tag = getDouble();
		}
		return tag;`
	}

	public char getChar() {// �����ȷ��y����n
		Scanner sc = new Scanner(System.in);
		char tag;
		tag = sc.next().charAt(0);

		if ((tag != 'Y') || (tag != 'y') || (tag != 'N') || (tag != 'n')) {
			try {
				throw new InPutException("�������벻�ͷ���");
			} catch (InPutException e) {
				// e.printStackTrace();
				System.out.println("�������벻����Ҫ������������");
				tag = getChar();
			}
		}
		return tag;
	}

	public int getInt1() {// ��֤�����һ��������
		int tag;
		Scanner sc = new Scanner(System.in);
		try {
			tag = sc.nextInt();
		} catch (InputMismatchException in) {
			System.out.println("������Ĳ������֣�");
			tag = getInt1();
		}
		return tag;
	}

	public int getInt2(int tag, int low, int high) {// ��֤�����һ����һ����Χ�ڵ�����
		if (tag < low || tag > high) {
			try {
				throw new InPutException("������" + low + "��" + high + "֮�����:");
			} catch (InPutException e) {
				// TODO Auto-generated catch block
				System.out.println("������" + low + "��" + high + "֮�����:");
				tag = getInt1();
				tag = getInt2(tag, low, high);
			}
		}
		return tag;
	}

	public String getString2() {// �����ȷ���ַ���
		Scanner sc = new Scanner(System.in);
		String name;
		name = sc.next().trim();
		if (name.length() == 0) {
			try {
				throw new InPutException("���벻��Ϊ0");
			} catch (InPutException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("���벻��Ϊ��:");
				name = getString2();
			}
		}
		return name;
	}

	public String getString(int length) {// ���ָ����С���ַ���
		String temp;
		Scanner sc = new Scanner(System.in);
		temp = sc.next().trim();
		if (judgeString1(temp, length) == false) {
			try {
				throw new InPutException("��������ַ����Ϸ���");
			} catch (InPutException e) {
				// e.printStackTrace();
				System.out.println("�������벻����Ҫ�����������룺");
				temp = getString(length);
			}
		}
		return temp;
	}

	public boolean judgeString1(String tag, int length) {// �жϸ�����ַ����Ƿ����Ҫ��
		int i;
		if ((tag.length()) > length || (tag.length()) <= 0) {
			return false;
		}
		for (i = 0; i < tag.length(); i++) {
			if (tag.charAt(i) < '0' || tag.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
}
