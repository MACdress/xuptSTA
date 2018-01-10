package com.RegularException.demo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replace {

	public static void main(String[] args) {
		// 字符串查找并且替换
		int i = 0;
		StringBuffer sb = new StringBuffer();
		Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);// 忽略大小写
		Matcher m = p
				.matcher("Java JAvA I like Java  You Like Java TO daoklfniokls");
		while (m.find()) {
			if (i % 2 == 0) {
				m.appendReplacement(sb, "java");// 将替换的结果添加到StringBuffer中
			} else {
				m.appendReplacement(sb, "JAVA");
			}
			i++;
		}
		m.appendTail(sb);// 将剩下的尾部放到sb中
		System.out.println(sb);
	}
}
