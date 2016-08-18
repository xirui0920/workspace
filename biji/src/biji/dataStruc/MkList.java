package biji.dataStruc;

public class MkList {
	
	public static void main(String[] args) {
		Node p = getLoopList(10);
		for (int i = 0; i < 10; i++) {
			System.out.println(p.e + " " + p.hashCode());
			p = p.next;
		}
	}
	
	//单向循环链表
	public static Node getLoopList(int N){
		if (N <= 0) {
			System.err.println("不能创建空链表");
			return null;
		}
		int i = 1;
		//创建头结点
		Node head = new Node(i);
		head.next = head;
		if (N == 1) {
			return head;
		}
		//创建指针结点p
		Node p = new Node();
		p = head;
		//构建1-N环
		for (i = 2;i <= N;i++) {
			Node next = new Node(i);
			p.next = next;
			p = next;
			p.next = head;
		}
		return head;
	}
	
}
