import java.util.Scanner;

public class Idea1 {
	public static void main(String[] args) {
		int check = 0, rabbit, sum, floot, flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入鸡兔的总个数：");
		sum = sc.nextInt();
		System.out.println("请输入鸡兔脚的个数：");
		floot = sc.nextInt();
		flag = 0;
		for (rabbit = 0; rabbit <= sum; rabbit++) {
			check = sum - rabbit;
			if (4 * rabbit + 2 * check == floot) {
				flag = 1;
				break;
			}
		}
		if (flag != 0) {
			System.out.println("兔子有" + rabbit + "只，" + "鸡有" + check + "只！");
		} else {
			System.out.println("NoAnswer!");
		}
	}
}
