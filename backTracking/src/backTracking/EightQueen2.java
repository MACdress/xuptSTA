package backTracking;

import java.util.Scanner;

//�˻ʺ�ݹ�ʵ��
public class EightQueen2 {
	public static int[] Map;// ����������ͼ
	public static int[] Left;// ��б���ϵĵ�
	public static int[] Right;// ��б���ϵĵ�
	public static int[] Col;// ����һ���ϵĵ�
	public static int Queue;// �ʺ�ĸ���
	public static int num = 0;

	public void Init() {// ��ʼ��
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
