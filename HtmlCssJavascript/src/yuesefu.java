import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class yuesefu {
	private static class Node{
        int No;
        Node next;
        public Node(int No){
            this.No=No;
        }
    }
    public static void main(String[] args) {
        int totalNum,cycleNum;
        List<Integer> list = new ArrayList<Integer>();
        Scanner cin = new Scanner(System.in);
        totalNum=cin.nextInt();
        cycleNum=3;
        Node header = new Node(1);
        Node pointer = header;
        for(int i=2;i<=totalNum;i++){
            pointer.next = new Node(i);
            pointer = pointer.next;
        }
        pointer.next= header;
        pointer=header;
        while(pointer != pointer.next){
            int i =2;
            while(i<cycleNum){
                pointer = pointer.next;
                i++;
            }
            pointer.next=pointer.next.next;
            pointer=pointer.next;
        }
        System.out.println(pointer.No);
    }
}
