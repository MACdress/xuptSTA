package com.RegularException.demo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//找子串	
public class Demo2 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d{3,4}");
		String temp = "136-592-1832-1";
		Matcher m = p.matcher(temp);
		System.out.println(m.matches());
		m.reset();
		System.out.println(m.find());
		System.out.println(m.start() + "," + m.end());// 找到相应的匹配的字符串的开始和结尾
		System.out.println(m.find());
		System.out.println(m.start() + "," + m.end());
		System.out.println(m.find());
		System.out.println(m.start() + "," + m.end());
		System.out.println(m.find());
		System.out.println(m.start() + "," + m.end());// 所以这里会报错
	}
}
