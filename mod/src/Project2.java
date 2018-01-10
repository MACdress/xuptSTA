import java.util.Scanner;

public class Project2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int tag = num;
		int sum = 0;
		int count = 0;
		while (tag != 0 && count < 4) {
			sum += tag % 10;
			tag /= 10;
		}
		if (count == 4 && sum == 24) {
			System.out.println(num);
		} else {
			System.out.println("flase");
		}
	}
}