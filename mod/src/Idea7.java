import java.util.Scanner;

public class Idea7 {
	static void hanshu1(int year, int mouth, int data) {
		int i, day = 0, temp;
		for (i = 1991; i < year; i++) {
			temp = 0;
			if (i % 400 == 0 || i % 4 == 0 && i % 100 != 0) {
				temp = 1;
			}
			day += 365 + temp;
		}
		temp = 0;
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			temp = 1;
		}
		switch (mouth) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day += 31;
			break;
		case 2:
			day += 28 + temp;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day += 30;
		default:
			day += 0;
		}
		day += data;
		day %= 5;
		if (day > 3) {
			System.out.println("晒网！");
		} else {
			System.out.println("打渔！");
		}
	}

	static void hanshu2() {
		int i, j, a = 6, b = 3, sum = 0;
		for (i = 0; i <= a; i++) {
			for (j = 0; j <= b; j++) {
				if (8 - i - j <= 3 && 8 - i - j >= 0)
					sum++;

			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, mouth, data;
		System.out.println("请输入年月日：");
		year = sc.nextInt();
		mouth = sc.nextInt();
		data = sc.nextInt();
		hanshu1(year, mouth, data);
		hanshu2();
	}
}
