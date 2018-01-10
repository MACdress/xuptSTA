package com.RegularException.demo1;

import java.util.regex.Pattern;

public class Demo1 {
	public static void main(String[] args) {
		// 简单认识正则表达式的概念
		// System.out.println("abc".matches("..."));
		// System.out.println("a12345a".replaceAll("\\d", "-"));
		// Pattern c = Pattern.compile("[a-z]{3}");//
		// （compile）编译这个正则表达式，并且把它放在c这个模式里面
		// //
		// Pattren代表的就是字符串匹配的这个模式。如果不进行编译，则在每次进行匹配的时候都要编译，速度较慢，而编译之后在拿这个匹配字符串的时候速度会快一些
		// Matcher m = c.matcher("asa");// matcher查看字符串是否匹配,返回类型是一个，macher的匹配器
		// // 匹配过程有可能产生多个结果
		// System.out.println(m.matches());// 是否匹配
		// System.out.println("292".matches("[0-2][0-9][0-9]"));
		// 空白行
		// Pattern.compile("[^[\\s&&[^\\n]]*\\n$");
		// 匹配email地址
		Pattern compile = Pattern.compile("[\\w[.-]]+@[\\w[.-]]+\\.[\\w[.-]]+");
		System.out.println(compile.matcher("735159088@qq.com").matches());// 匹配整个字符串
	}
}
