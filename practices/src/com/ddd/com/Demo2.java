package com.ddd.com;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Demo2 {
	public static void main(String[] args) throws Exception {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"e:/copy/co.txt"));
		osw.write("asdfasfdasfasfdasdfasdfasdfasd");
		System.out.println(osw.getEncoding());
		osw.close();
		osw = new OutputStreamWriter(new FileOutputStream("e:/copy/co.txt",
				true), "ISO8859_1");// true�ĺ��壬��ԭ���ļ��Ļ�����������д��������ԭ�����ʼ��ܸ���
		osw.write("sadasasdasfasdfsdfasdgfa");
		System.out.println(osw.getEncoding());
		osw.close();
	}
}
