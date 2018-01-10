public class Idea9 {
	public static void main(String args[]) {
		int i, j, a, b;
		String s;
		s = "         ";
		for (i = 1; i <= 19; i++) {
			if (i == 10) {
				System.out.println();
				continue;
			}
			for (j = 1; j <= 19; j++) {
				if (j == 10) {
					System.out.print(s);
				} else {
					a = i < 10 ? 10 - i : i - 10;
					b = j < 10 ? j : 20 - j;
					if (j < 10 && b > a || j > 10 && a < b) {
						System.out.print(s);
					} else {
						if (a * b >= 10) {
							System.out.print("   " + a + "*" + b + "=" + a * b);
						} else {
							System.out.print("   " + a + "*" + b + "=  " + a
									* b);
						}
					}
				}
			}
			System.out.println();
		}
	}
}