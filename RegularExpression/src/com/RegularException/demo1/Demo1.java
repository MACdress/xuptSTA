package com.RegularException.demo1;

import java.util.regex.Pattern;

public class Demo1 {
	public static void main(String[] args) {
		// ����ʶ������ʽ�ĸ���
		// System.out.println("abc".matches("..."));
		// System.out.println("a12345a".replaceAll("\\d", "-"));
		// Pattern c = Pattern.compile("[a-z]{3}");//
		// ��compile���������������ʽ�����Ұ�������c���ģʽ����
		// //
		// Pattren����ľ����ַ���ƥ������ģʽ����������б��룬����ÿ�ν���ƥ���ʱ��Ҫ���룬�ٶȽ�����������֮���������ƥ���ַ�����ʱ���ٶȻ��һЩ
		// Matcher m = c.matcher("asa");// matcher�鿴�ַ����Ƿ�ƥ��,����������һ����macher��ƥ����
		// // ƥ������п��ܲ���������
		// System.out.println(m.matches());// �Ƿ�ƥ��
		// System.out.println("292".matches("[0-2][0-9][0-9]"));
		// �հ���
		// Pattern.compile("[^[\\s&&[^\\n]]*\\n$");
		// ƥ��email��ַ
		Pattern compile = Pattern.compile("[\\w[.-]]+@[\\w[.-]]+\\.[\\w[.-]]+");
		System.out.println(compile.matcher("735159088@qq.com").matches());// ƥ�������ַ���
	}
}
