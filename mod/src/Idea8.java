public class Idea8 {
	public static void main(String[] args) {
		int a, b, c;
		for (a = 0; a < 2; a++) {
			for (b = 0; b < 2; b++) {
				for (c = 0; c < 2; c++) {
					if (a == 0 && b == 0) {
						continue;
					}
					if (a == 1 && b == 1) {
						continue;
					}
					if (c == 1 && a != 0 && b != 0) {
						continue;
					}
					if (c == 0 && a != 1 && b != 1) {
						continue;
					}
					System.out.println("aÊÇ" + a + "bÊÇ" + b + "cÊÇ" + c);
				}
			}
		}
	}
}
