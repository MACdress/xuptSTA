import java.text.DecimalFormat;
import java.util.Scanner;

public class Id {
	public static void main(String[] args) {
		String name;
		DecimalFormat df = new DecimalFormat("0.000");
		double sum, ave, i;
		Scanner sc = new Scanner(System.in);
		sum = 0;
		System.out.println("������ѧ����������");
		name = sc.next();
		System.out.println("���������ſεĳɼ���");
		for (i = 0; i < 5; i++) {
			sum += sc.nextDouble();
		}
		ave = sum / 5.0;
		System.out.println(name + "��ƽ���ɼ��ǣ�" + df.format(ave));
		System.out.println("�ܳɼ��ǣ�" + df.format(sum));
	}
}
