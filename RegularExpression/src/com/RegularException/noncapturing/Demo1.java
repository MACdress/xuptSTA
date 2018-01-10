package com.RegularException.noncapturing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(".{3}(?!a)");// （？=a）：不捕获a（符合条件就捕获，不符合条件就不捕获，只捕获三个字母，三个字母的后面必须马上跟着的是一个a
		// 放在前面会捕获a，a会占一个。放在后面只是默认a结尾，a不在三个里面。
		Matcher m = p.matcher("444a55aaa");// 在网上查查这个
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
