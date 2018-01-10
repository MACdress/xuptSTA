package backTracking;

import java.util.Scanner;

//八皇后递归实现
public class EightQueen2 {
	public static int[] Map;// 代表整个地图
	public static int[] Left;// 左斜线上的点
	public static int[] Right;// 右斜线上的点
	public static int[] Col;// 处于一列上的点
	public static int Queue;// 皇后的个数
	public static int num = 0;

	public void Init() {// 初始化
		Map = new int[Queue];
		Left = new int[2 * Queue - 1];
		Right = new int[2 * Queue - 1];
		Col = new int[Queue];
		for (int i = 0; i < Queue; i++) {
			Col[i] = 0;
		}
		for (int i = 0; i < (2 * Queue - 1); i++) {
			Left[i] = Right[i] = 0;
		}
	}

	public void printQueue() {
		// System.out.println(1);
		System.out.println("No:" +(++num));
		for (int i = 0; i < Queue; i++) {
			for (int j = 0; j < Queue; j++) {
				if (Map[i] == j) {
					System.out.print("@" + " ");
				} else {
					System.out.print("+" + " ");
				}
			}
			System.out.println();

		}
		System.out.println();
	}

	public void runQueue(int i, int j) {
		if (i <= Queue) {
			if (i == Queue) {
				printQueue();
				return;
			}
			for (; j < Queue; j++) {
				if ((Left[i + j] == 0) && (Right[i - j + Queue - 1] == 0) && (Col[j] == 0)) {
					Left[i + j] = Right[i - j + Queue - 1] = Col[j] = 1;
					Map[i] = j;
					runQueue(i + 1, 0);
					Left[i + j] = Right[i - j + Queue - 1] = Col[j] = 0;
				}
			}
			return;
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Queue = sc.nextInt();
		EightQueen2 q = new EightQueen2();
		q.Init();
		q.runQueue(0, 0);
	}
}
