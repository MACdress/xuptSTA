import java.util.Scanner;

public class Idea6 {
	public static void main(String[] args) {
		int i, num, x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		num = 0;
		for (i = 0; 5 * i <= x * 100; i++) {
			num += (x * 100 - 5 * i) / 2 + 1;
		}
		System.out.println(num);
		sc.close();
	}
}
