package com.ddd.gaopan.practice;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {
	public static void main(String[] args) {
		Map<Object, Object> m = new HashMap<Object, Object>();
		for (int i = 0; i < args.length; i++) {
			int freq = (Integer) m.get(args[i]) == null ? 0 : (Integer) m
					.get(args[i]);
			m.put(args[i], freq == 0 ? 1 : freq + 1);
		}
		System.out.println(m.size());
		System.out.println(m);
	}
}
