package com.RegularException.demo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Group {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("(\\d{3,5})([a-z]{2})");// ��������ʽ�ֳ�������
		Matcher m = p.matcher("123aa-456bb-7989cc-001");
		while (m.find()) {
			// System.out.println(m.group());
			// System.out.println(m.group(1));//����һ��ֵ����Ӵ�
			System.out.println(m.group(2));// ���ڶ���ֵ����Ӵ�
		}
	}
}
