package com.RegularException.noncapturing;

import java.util.regex.Pattern;

//flags的简写
public class Flags {
	public static void main(String[] args) {
		Pattern.compile("java", Pattern.CASE_INSENSITIVE);// 一个标志，大小写忽略
		// CASE_INSENSITIVE相当于（？i）；==Pattern.compile("(?i)(java)"
	}
}
