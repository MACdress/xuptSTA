package com.RegularException.Email;

//���Թ�����
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class KongHang {
	static int normalcode = 0;
	static int commitcode = 0;
	static int whitecode = 0;

	public static void main(String[] args) {
		File f = new File("E:\\java2\\JDBC_Demo1\\src\\com\\ddd\\gaopan");
		File[] lf = f.listFiles();
		if (lf == null) {
			return;
		}
		for (int i = 0; i < lf.length; i++) {
			if (lf[i].isFile() && lf[i].getName().matches(".*\\.java$")) {
				find(lf[i]);
			}
		}
		System.out.println("�հ�����" + whitecode);
		System.out.println("ע������" + commitcode);
		System.out.println("��������" + normalcode);
	}

	public static void find(File f) {
		boolean flag = false;
		BufferedReader br = null;
		// Pattern white = Pattern.compile("^[\\s&&[^\\n]]*\\n$");
		try {
			br = new BufferedReader(new FileReader(f));
			String s = null;
			try {
				while ((s = br.readLine()) != null) {
					s = s.trim();
					if (s.matches("^[\\s&&[^\\n]]*$")) {// readline��\n�Ѿ��õ��ˣ�����д�����ʱ��Ҫ��������ǽ�ȥ
						whitecode++;
						// System.out.println("aaa");
					} else {
						if (s.startsWith("/*")) {
							commitcode++;
							flag = true;
							if (s.endsWith("*/")) {
								flag = false;
							}
						} else {
							if (flag) {
								commitcode++;
								if (s.endsWith("*/")) {
									flag = false;
								}
							} else {
								if (s.matches(".*[////][////].*")) {
									commitcode++;
								} else {
									normalcode++;
								}
							}
						}
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			br = null;
		}
	}
}
