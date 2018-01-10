package backTracking;

import java.util.Scanner;

class Point {
	int x, y;
}

// �˻ʺ�ǵݹ�ʵ��
public class EightQueen {
	private int[] Map;
	private int[] Left;
	private int[] Right;
	private int[] Col;
	private int Queue;
	private int No;

	private EightQueen(int num) {// ��������г�ʼ��
		Queue = num;
		No = 0;
		Map = new int[Queue + 3];// ������ջ
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
		int top = 0;// ����0��ʾջΪ��
		while (j < Queue) {
			Map[++top] = j;
			Left[i + j] = Right[i - j + Queue - 1] = Col[j] = 1;
			//System.out.println(j);
			i++;
			j=0;
			while (top != 0) {
				for (; j < Queue; j++) {// �������и���һ�α��������Ƿ��з���Ҫ��ĸ���
					if ((Left[i + j] == 0) && (Right[i - j + Queue - 1] == 0) && (Col[j] == 0)) {
						Left[i + j] = Right[i - j + Queue - 1] = Col[j] = 1;
						break;
					}
				}
				if ((j == Queue) && (top > 0)) {// ˵������û�з���Ҫ���λ�ã����˵���һ��
					i = top - 1;// �ص���һ��������¼��λ�ã�
					j = Map[top];
					Left[i + j] = Right[i - j + Queue - 1] = Col[j] = 0;
					top--;// ��ջ
					j++;// (����һ�е���һ��λ��)
				} else {// ����Ҫ������ջ
					Map[++top] = j;
					j = 0;
					i++;
				}
				if (i == Queue) {// ջ������������
					printQueue();
					// ������һ������Һ��ʵ�λ��
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
