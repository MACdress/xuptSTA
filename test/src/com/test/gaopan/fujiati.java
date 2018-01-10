package com.test.gaopan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class fujiati {
	public static void main(String[] args) throws Exception {
		String path1 = "F:";
		String path2 = "E:/copy";
		scan(path1, path2);
		System.out.println("拷贝完成");
	}

	public static void scan(String path1, String path2) throws Exception {
		new File(path2).mkdirs();
		File file = new File(path1);
		File[] ls = file.listFiles();
		if (ls == null) {
			return;
		}
		for (int i = 0; i < ls.length; i++) {
			if (ls[i].isFile()) {
				System.out.println(ls[i].getName() + "是一个文件");
				copy(ls[i], path2);
			} else {
				if (ls[i].isDirectory()) {
					System.out.println(ls[i].getAbsolutePath() + "是一个文件夹");
					scan(ls[i].getAbsolutePath(), path2 + "/" + ls[i].getName());
				}
			}
		}
	}

	public static void copy(File file, String path) throws Exception {
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(path + "/" + file.getName());
		byte[] bs = new byte[102888];
		int len = 0;
		while ((len = fis.read(bs)) != -1) {
			fos.write(bs, 0, len);
		}
		fos.flush();
		fos.close();
		fis.close();
	}
}
