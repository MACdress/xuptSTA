package com.gaopan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);// �ӿ���ת��
		BufferedReader br = new BufferedReader(isr);
		String s = null;
		System.out.println("������");
		s = br.readLine();
		while (s != null) {
			if (s.equals("exit")) {
				break;
			}
			System.out.println(s.toUpperCase());
			s = br.readLine();
		}
		br.close();
		System.out.println("ллʹ��");
	}
}
