package com.RegularException.demo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replace {

	public static void main(String[] args) {
		// �ַ������Ҳ����滻
		int i = 0;
		StringBuffer sb = new StringBuffer();
		Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);// ���Դ�Сд
		Matcher m = p
				.matcher("Java JAvA I like Java  You Like Java TO daoklfniokls");
		while (m.find()) {
			if (i % 2 == 0) {
				m.appendReplacement(sb, "java");// ���滻�Ľ����ӵ�StringBuffer��
			} else {
				m.appendReplacement(sb, "JAVA");
			}
			i++;
		}
		m.appendTail(sb);// ��ʣ�µ�β���ŵ�sb��
		System.out.println(sb);
	}
}
