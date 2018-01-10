public class Idea5 {
	public static void main(String[] args) {
		int[] a = new int[5];
		int num;
		double temp1;
		num = 1000;
		while (true) {
			a[0] = num % 10;
			a[1] = num / 10 % 10;
			a[2] = num / 100 % 10;
			a[3] = num / 1000;
			if (a[0] == a[1] && a[2] == a[3] && a[0] != a[2]) {
				temp1 = Math.sqrt(num * 1.0);
				if (temp1 * 10 % 10 == 0) {
					System.out.println(temp1);
					System.out.println(num);
					break;
				}
			}
			num++;
		}
	}
}
