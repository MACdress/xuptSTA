package com.gp.loader;

public class TextLoader {
	public static void main(String[] args) {
		ClassLoader cl = TextLoader.class.getClassLoader();
		while (cl != null) {
			System.out.println(cl.getClass().getName());
			cl = cl.getParent();// egtParent�������鿴��һ���Ƿ񱻼��أ�����������˾Ͳ����ٴμ�����
		}
	}
}
