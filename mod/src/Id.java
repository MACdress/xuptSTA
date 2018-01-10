import java.text.DecimalFormat;
import java.util.Scanner;

public class Id {
	public static void main(String[] args) {
		String name;
		DecimalFormat df = new DecimalFormat("0.000");
		double sum, ave, i;
		Scanner sc = new Scanner(System.in);
		sum = 0;
		System.out.println("请输入学生的姓名：");
		name = sc.next();
		System.out.println("请输入五门课的成绩：");
		for (i = 0; i < 5; i++) {
			sum += sc.nextDouble();
		}
		ave = sum / 5.0;
		System.out.println(name + "的平均成绩是：" + df.format(ave));
		System.out.println("总成绩是：" + df.format(sum));
	}
}
