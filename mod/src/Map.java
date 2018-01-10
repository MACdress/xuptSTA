import java.util.Scanner;

public class Map {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n = sc.nextInt();
		while (n != 0) {
			for (i = 0; i < n; i++) {
				System.out.print(n);
			}
			System.out.println();
			n--;
		}
	}
}
