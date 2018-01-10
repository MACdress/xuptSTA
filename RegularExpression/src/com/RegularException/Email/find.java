package com.RegularException.Email;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//搜素网页上的内容
public class find {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(
					"F:\\12345.txt"));
			String s = null;
			try {
				while ((s = br.readLine()) != null) {
					Find(s);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("读取文件失败");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("文件没找到！");
		}
	}

	public static void Find(String s) {
		Pattern p = Pattern.compile("[\\w[.-]]+@[\\w[.-]]+\\.[\\w[.-]]+");
		Matcher m = p.matcher(s);
		// System.out.println(s);
		while (m.find()) {
			System.out.println(m.group());
		}
		// System.out.println("没有");
	}
}
