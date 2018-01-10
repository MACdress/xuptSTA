package com.gaopan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice1 {
	public static void main(String[] args) throws IOException {
		File file = new File("F:/practice.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		BufferedReader br = new BufferedReader(new FileReader(file));
		int i;
		String s = null;
		for (i = 0; i < 100; i++) {
			s = String.valueOf(Math.random());
			bw.write(s);
			bw.newLine();
		}
		bw.flush();
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		bw.close();
		br.close();
		file.delete();
	}
}
