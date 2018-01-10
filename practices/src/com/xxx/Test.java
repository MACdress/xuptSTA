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
			System.out.println(file.getAbsolutePath() + "不对");
			return;
		}
		for (File file2 : listfile) {
			if (file2.isFile()) {
				System.out.println(file2.getName() + "  是个文件");
			} else if (file2.isDirectory()) {
				System.out.println(file2.getAbsolutePath() + "是个文件夹");
				scan(file2.getAbsolutePath());
			}
		}
	}
}
