package com.test.gaopan;

public class digui {
	public static void main(String[] args) {
		System.out.println(sum(1));
	}

	public static int sum(int i) {
		if (i == 100) {
			return i;
		}
		return sum(i + 1) + i;
	}
}
