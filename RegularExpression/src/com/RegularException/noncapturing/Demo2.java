package com.RegularException.noncapturing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("(\\d(\\d))\\2");// \1������ǵ�һ���鲶׽�����ַ�������ͺ���һ��
		// \2�͵ڶ�����ץ����Ҫһ��
		Matcher m = p.matcher("122");
		System.out.println(m.matches());
	}
}
