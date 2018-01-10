import java.util.Scanner;

public class Idea2 {
	public static void main(String[] args) {
		int a, b, len, sum1, sum2, sum3, temp1, temp2;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数据范围：");
		len = sc.nextInt();
		System.out.println("请输入两个数：");
		a = sc.nextInt();
		b = sc.nextInt();
		if (a > b) {
			temp1 = a;
			a = b;
			b = temp1;
		}
		temp1 = a;
		temp2 = b;
		sum1 = sum2 = sum3 = 0;
		while (temp1 <= len || temp2 <= len) {
			if (temp1 <= len) {
				if (temp1 % b == 0) {
					sum2 += temp1;
					sum3 += temp1;
					temp2 = temp1 + b;
				}
				sum1 += temp1;
				temp1 += a;
			} else {
				if (temp2 <= len) {
					sum2 += temp2;
					temp2 += b;
				}
			}
		}
		System.out.println("在" + len + "以内" + a + "的公倍数之和是:" + sum1 + "," + b
				+ "的最小公倍数之和是:" + sum2 + "," + a + "和" + b + "的最小公倍数之和是" + sum3);
	}
}
