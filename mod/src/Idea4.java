import java.util.Scanner;

public class Idea4 {
	public static void main(String[] args) {
		double[] grade = new double[10];
		Scanner sc = new Scanner(System.in);
		int i;
		double ave, min, max, sum;
		min = 1 << 32;
		max = 1 >> 32;
		sum = 0;
		System.out.println("请评委为选手打分：");
		for (i = 0; i < 10; i++) {
			grade[i] = sc.nextDouble();
			min = min > grade[i] ? grade[i] : min;
			max = max < grade[i] ? grade[i] : max;
			sum += grade[i];
		}
		ave = (sum - max - min) / 8.0;
		System.out.println("最终成绩为：" + ave);
	}
}
