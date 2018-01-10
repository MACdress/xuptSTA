import java.util.Scanner;

public class Cuclute2 {

	public static void main(String[] args) {
		int n, sum;
		Scanner sc = new Scanner(System.in);
		sum = 0;
		n = sc.nextInt();
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		System.out.println(sum);
	}
}
