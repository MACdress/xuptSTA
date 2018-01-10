package com.gaopan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Practice3 {

	public static void main(String[] args) throws Exception {
		File file = new File("F:/My.txt");
		OutputStream fis = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fis);
		System.setOut(ps);
		int len = 0;
		for (char c = 0; c < 1000; c++) {
			System.out.print(c + " ");
			len++;
			if (len == 100) {
				System.out.println();
				len = 0;
			}
		}
		fis.close();
		file.delete();
	}
}
