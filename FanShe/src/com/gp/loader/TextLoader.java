package com.gp.loader;

public class TextLoader {
	public static void main(String[] args) {
		ClassLoader cl = TextLoader.class.getClassLoader();
		while (cl != null) {
			System.out.println(cl.getClass().getName());
			cl = cl.getParent();// egtParent方法，查看上一层是否被加载，如果被加载了就不会再次加载了
		}
	}
}
