package com.RegularException.demo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Group {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("(\\d{3,5})([a-z]{2})");// 将正则表达式分成了两组
		Matcher m = p.matcher("123aa-456bb-7989cc-001");
		while (m.find()) {
			// System.out.println(m.group());
			// System.out.println(m.group(1));//按第一组分到的子串
			System.out.println(m.group(2));// 按第二组分到的子串
		}
	}
}
