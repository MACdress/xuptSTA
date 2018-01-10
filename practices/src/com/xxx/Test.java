package com.xxx;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		Test.scan("E:/");
	}

	private static void scan(String path) {
		File file = new File(path);
		File[] listfile = file.listFiles();
		if (listfile == null) {
			System.out.println(file.getAbsolutePath() + "����");
			return;
		}
		for (File file2 : listfile) {
			if (file2.isFile()) {
				System.out.println(file2.getName() + "  �Ǹ��ļ�");
			} else if (file2.isDirectory()) {
				System.out.println(file2.getAbsolutePath() + "�Ǹ��ļ���");
				scan(file2.getAbsolutePath());
			}
		}
	}
}
