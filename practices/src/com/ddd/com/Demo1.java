package com.ddd.com;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("e:/my.sql");
		// FileOutputStream fos = new FileOutputStream("f:/copy.sql");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int c = 0;
		System.out.println(bis.read());
		System.out.println(bis.read());
		bis.mark(100);// �ӵ�һ�ٸ��ַ������
		for (int i = 0; i < 10 && (c = bis.read()) != -1; i++) {
			System.out.print(c + " ");
		}
		System.out.println();
		bis.reset();// �ص���ǵ��Ǹ��㣬����һ�ٸ��ַ�
		for (int i = 0; i < 10 && (c = bis.read()) != -1; i++) {
			System.out.print(c + " ");
		}
		bis.close();
	}
}
