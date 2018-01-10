import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in

		);
		System.out.println("请输入给定的数字");
		int a = sc.nextInt();
		int count = count(a);
		System.out.println("coutne=" + count);

	}

	public static boolean isprime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; ++i)
			if (n % i == 0)
				return false;
		return true;

	}

	public static int count(int num) {

		int[] prime = new int[10000];
		int i, j;
		int count = 0;
		for (i = 1, j = 1; i <= num; ++i)
			if (isprime(i))
				prime[j++] = i;

		int maxn = j - 1;

		for (i = 1; i < maxn; ++i)
			for (j = 1; j < maxn; ++j)
				if (isprime(num - prime[i] - prime[j])) {
					System.out.println(prime[i] + "  " + prime[j] + "  "
							+ (num - prime[i] - prime[j]));
					count++;
				}

		return count;

	}

	public int Judge(int num) {
		int count = 0;
		String nums = String.valueOf(num);
		int[] temp = new int[nums.length()];
		if (nums.length() < 0 || nums.length() > 12) {
			return 0;
		}
		for (int i = 0; i < temp.length; i++) {
			temp[i] = num % 10;
			num /= 10;
		}
		return count;
	}
}
