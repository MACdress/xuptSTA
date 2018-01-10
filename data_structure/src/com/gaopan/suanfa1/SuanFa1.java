package com.gaopan.suanfa1;

import java.util.Scanner;

//用数组来模拟链表。
public class SuanFa1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n, q, p;
		n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = (i + 1) % n;
		}
		int count = n;
		int num = 0;
		q = 0;
		p = 0;
		while (true) {
			if (num == 2) {
				num = 0;
				a[q] = a[p];
				p = a[p];
				count--;
				if (count == 1) {
					System.out.println(p);
				}
			} else {
				q = p;
				p = a[p];
				num++;
			}
		}
	}
}
