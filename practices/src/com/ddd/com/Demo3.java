package com.ddd.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		while (s != null) {
			if (s.equalsIgnoreCase("exit")) {
				break;
			}
			System.out.println(s.toUpperCase());
			s = br.readLine();
		}
		br.close();
	}
}
