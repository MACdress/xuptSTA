package com.RegularException.noncapturing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(".{3}(?!a)");// ����=a����������a�����������Ͳ��񣬲����������Ͳ�����ֻ����������ĸ��������ĸ�ĺ���������ϸ��ŵ���һ��a
		// ����ǰ��Ჶ��a��a��ռһ�������ں���ֻ��Ĭ��a��β��a�����������档
		Matcher m = p.matcher("444a55aaa");// �����ϲ�����
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
