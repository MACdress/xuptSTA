package com.ddd.com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Demo5 {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("e:/copy/co.txt");
		PrintStream ps = new PrintStream(fos);
		System.setOut(ps);
		System.out.println("Hello,world");
	}
}
