import java.util.Scanner;

public class Data {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, mouth;
		System.out.println("请输入年月日：");
		year = sc.nextInt();
		mouth = sc.nextInt();
		int flag = 0;
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			flag = 1;
		}
		switch (mouth) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31");
			break;
		case 2:
			System.out.println(28 + flag);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30");
		default:
			System.out.println("flase");
		}
	}
}
