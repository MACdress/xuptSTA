import java.util.Scanner;

public class Idea3 {
	public static void main(String[] args) {
		int man = 0, people, value, flag = 1, women = 0, temp1, temp2;
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ˡ�Ů�ˡ�С������������");
		people = sc.nextInt();
		System.out.println("������һ�������˶���Ԫ");
		value = sc.nextInt();
		flag = 0;
		if (value >= people) {
			for (man = 0; (3 * man) <= value && man <= people; man++) {
				temp1 = value - 3 * man;
				temp2 = people - man;
				// System.out.println(temp1);
				for (women = 0; 2 * women <= temp1 && women <= temp2; women++) {
					if (2 * man + women == value - people) {
						flag = 1;
						// System.out.println(man + " " + women);
						break;
					}
				}
				if (flag != 0) {
					break;
				}
			}
		}
		if (flag != 0) {
			System.out.println("������" + man + "����Ů����" + women + "����С����:"
					+ (people - man - women));
		} else {
			System.out.println("NoAnswer!");
		}
	}
}