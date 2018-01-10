package com.xupt.javaSM;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetAnswer {

	public double getDouble() {// 获得正确的实数
		Scanner sc = new Scanner(System.in);
		double tag;
		try {
			tag = sc.nextDouble();
		} catch (InputMismatchException in) {
			System.out.println("请合法输入：");
			tag = getDouble();
		}
		return tag;`
	}

	public char getChar() {// 获得正确的y或者n
		Scanner sc = new Scanner(System.in);
		char tag;
		tag = sc.next().charAt(0);

		if ((tag != 'Y') || (tag != 'y') || (tag != 'N') || (tag != 'n')) {
			try {
				throw new InPutException("您的输入不和法：");
			} catch (InPutException e) {
				// e.printStackTrace();
				System.out.println("您的输入不符合要求，请重新输入");
				tag = getChar();
			}
		}
		return tag;
	}

	public int getInt1() {// 保证输入的一定是数字
		int tag;
		Scanner sc = new Scanner(System.in);
		try {
			tag = sc.nextInt();
		} catch (InputMismatchException in) {
			System.out.println("您输入的不是数字：");
			tag = getInt1();
		}
		return tag;
	}

	public int getInt2(int tag, int low, int high) {// 保证输入的一定是一定范围内的数字
		if (tag < low || tag > high) {
			try {
				throw new InPutException("请输入" + low + "至" + high + "之间的数:");
			} catch (InPutException e) {
				// TODO Auto-generated catch block
				System.out.println("请输入" + low + "至" + high + "之间的数:");
				tag = getInt1();
				tag = getInt2(tag, low, high);
			}
		}
		return tag;
	}

	public String getString2() {// 获得正确的字符串
		Scanner sc = new Scanner(System.in);
		String name;
		name = sc.next().trim();
		if (name.length() == 0) {
			try {
				throw new InPutException("输入不能为0");
			} catch (InPutException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("输入不能为空:");
				name = getString2();
			}
		}
		return name;
	}

	public String getString(int length) {// 获得指定大小的字符串
		String temp;
		Scanner sc = new Scanner(System.in);
		temp = sc.next().trim();
		if (judgeString1(temp, length) == false) {
			try {
				throw new InPutException("您输入的字符不合法！");
			} catch (InPutException e) {
				// e.printStackTrace();
				System.out.println("您的输入不符合要求，请重新输入：");
				temp = getString(length);
			}
		}
		return temp;
	}

	public boolean judgeString1(String tag, int length) {// 判断给如的字符串是否符合要求
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
