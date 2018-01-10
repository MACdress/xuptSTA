package com.ddd.gaopan.practice;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class BasicContainer {
	public static void main(String[] args) {
		Collection<Demo1> c = new HashSet<Demo1>();
		c.add(new Demo1("f1", "l1"));
		c.add(new Demo1("f2", "l2"));
		c.add(new Demo1("f3", "l3"));
		Iterator<Demo1> it = c.iterator();
		while (it.hasNext()) {
			Demo1 dem = (it.next());
			System.out.println(dem);
		}
	}
}
