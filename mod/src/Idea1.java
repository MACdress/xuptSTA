import java.util.Scanner;

public class Idea1 {
	public static void main(String[] args) {
		int check = 0, rabbit, sum, floot, flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뼦�õ��ܸ�����");
		sum = sc.nextInt();
		System.out.println("�����뼦�ýŵĸ�����");
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
			System.out.println("������" + rabbit + "ֻ��" + "����" + check + "ֻ��");
		} else {
			System.out.println("NoAnswer!");
		}
	}
}
