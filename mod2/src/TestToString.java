public class TestToString {
	public static void main(String[] args) {
		Cats c1 = new Cats(1, 2, 3);
		Cats c2 = new Cats(1, 2, 3);
		System.out.println(c1.equals(c2));
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1.equals(s2));
	}
}

class Cats {
	int color;
	int height, weight;

	public Cats(int color, int height, int weight) {
		this.color = color;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public boolean equals(Object c1) {
		if (c1 == null) {
			return false;
		}
		if ((c1 instanceof Cats)) {
			Cats c2 = (Cats) c1;
			if ((this.color == c2.color) && (this.height == c2.height)
					&& (this.weight == c2.weight)) {
				return true;
			}
		}
		return false;
	}
}
