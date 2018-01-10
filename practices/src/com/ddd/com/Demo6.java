package com.ddd.com;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Date;

public class Demo6 {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		FileWriter fw = new FileWriter("e:/copy/co.txt");
		PrintWriter pw = new PrintWriter(fw, true);
		String s = null;
		System.out.println("«Î ‰»Î");
		while ((s = br.readLine()) != null) {
			if (s.equalsIgnoreCase("exit")) {
				break;
			}
			System.out.println(s.toUpperCase());
			pw.println("......");
			pw.println(s.toUpperCase());
			pw.flush();
		}
		pw.println("-----" + new Date() + "-----");
		pw.flush();
		pw.close();
		br.close();
	}
}
