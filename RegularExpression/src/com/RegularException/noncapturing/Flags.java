package com.RegularException.noncapturing;

import java.util.regex.Pattern;

//flags�ļ�д
public class Flags {
	public static void main(String[] args) {
		Pattern.compile("java", Pattern.CASE_INSENSITIVE);// һ����־����Сд����
		// CASE_INSENSITIVE�൱�ڣ���i����==Pattern.compile("(?i)(java)"
	}
}
