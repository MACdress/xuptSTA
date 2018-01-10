package com.text.gaopan;

public class MaoPao {
	public static void main(String[] args) {
		int a[] = { 22, 45, 32, 1, 45, 78, 2, 45, 78, 2, 45, 36, 55, 12, 3 };
		for (int i = a.length - 1; i >= 00; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					int temp;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.print(i + "  ");
		}
	}
}
