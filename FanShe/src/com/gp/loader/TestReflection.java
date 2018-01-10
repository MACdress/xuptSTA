package com.gp.loader;

import java.lang.reflect.Method;

public class TestReflection {
	public static void main(String[] args) throws Exception {
		String str = "com.gp.loader.T";
		Class<?> c = Class.forName(str);// AppClassLoader类加载laod改类
		// ClassLoader cl = c.getClassLoader();
		// while (cl != null) {
		// System.out.println(cl.getClass().getName());
		// cl = cl.getParent();
		// }
		Object o = c.newInstance();// 将类C实例化成对象
		Method[] ms = c.getMethods();
		for (Method m : ms) {
			if (m.getName().equals("my")) {
				m.invoke(o);// 调用Method对象表示的底层方法
			}
		}
	}
}

class T {
	static {
		System.out.println("T.Loading");
	}

	public T() {
		System.out.println("T.construct");
	}

	public void my() {
		System.out.println("This is My");
	}
}

class B {
	static {
		System.out.println("B.loading");
	}

	public B() {
		System.out.println("B.construct");
	}
}