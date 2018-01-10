public class Cuclute {
	static void sum1() {
		int sum, temp;
		temp = 1;
		sum = 0;
		while (temp <= 99) {
			sum += temp;
			temp += 2;
		}
		System.out.println(sum);
	}

	static void sum2() {
		int sum, temp;
		temp = 1;
		sum = 0;
		while (temp <= 256) {
			sum += temp;
			temp *= 2;
			// System.out.println(temp);
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		sum1();
		sum2();
	}
}
