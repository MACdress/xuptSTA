import java.util.Scanner;

public class Idea3 {
	public static void main(String[] args) {
		int man = 0, people, value, flag = 1, women = 0, temp1, temp2;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入男人、女人、小孩的总人数：");
		people = sc.nextInt();
		System.out.println("请输入一共消费了多少元");
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
			System.out.println("男人有" + man + "个，女人有" + women + "个，小孩有:"
					+ (people - man - women));
		} else {
			System.out.println("NoAnswer!");
		}
	}
}