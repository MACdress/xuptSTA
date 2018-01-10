package backTracking;

import java.util.Scanner;

class Point {
	int x, y;
}

// 八皇后非递归实现
public class EightQueen {
	private int[] Map;
	private int[] Left;
	private int[] Right;
	private int[] Col;
	private int Queue;
	private int No;

	private EightQueen(int num) {// 对数组进行初始化
		Queue = num;
		No = 0;
		Map = new int[Queue + 3];// 类似于栈
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

	private void printQueue() {
		System.out.println("No:" + (++No));
		for (int i = 1; i <= Queue; i++) {
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

	public void qightQueue(int i, int j) {
		int top = 0;// 设置0表示栈为空
		while (j < Queue) {
			Map[++top] = j;
			Left[i + j] = Right[i - j + Queue - 1] = Col[j] = 1;
			//System.out.println(j);
			i++;
			j=0;
			while (top != 0) {
				for (; j < Queue; j++) {// 本行所有格子一次遍历，看是否有符合要求的格子
					if ((Left[i + j] == 0) && (Right[i - j + Queue - 1] == 0) && (Col[j] == 0)) {
						Left[i + j] = Right[i - j + Queue - 1] = Col[j] = 1;
						break;
					}
				}
				if ((j == Queue) && (top > 0)) {// 说明本行没有符合要求的位置，回退到上一行
					i = top - 1;// 回到上一个点所记录的位置；
					j = Map[top];
					Left[i + j] = Right[i - j + Queue - 1] = Col[j] = 0;
					top--;// 退栈
					j++;// (到上一行的下一个位置)
				} else {// 符合要求则入栈
					Map[++top] = j;
					j = 0;
					i++;
				}
				if (i == Queue) {// 栈满，则进行输出
					printQueue();
					// 返回上一层接着找合适的位置
					i = top - 1;
					j = Map[top];
					Left[i + j] = Right[i - j + Queue - 1] = Col[j] = 0;
					top--;
					j++;
				}
			}
		}
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		EightQueen q = new EightQueen(sc.nextInt());
		q.qightQueue(0, 0);
	}

}
