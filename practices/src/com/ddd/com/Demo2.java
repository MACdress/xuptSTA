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
				true), "ISO8859_1");// true的含义，在原来文件的基础上往里面写，否则会把原来的问价能覆盖
		osw.write("sadasasdasfasdfsdfasdgfa");
		System.out.println(osw.getEncoding());
		osw.close();
	}
}
