package biji.dataStruc;
/*
 * 给定某个节点，返回循环链表中节点个数
 */
public class Ex_3_24 {
	
	public static void main(String[] args) {
		Node p = MkList.getLoopList(10);
		System.err.println(getCountList(p));
	}
	
	public static int getCountList(Node p){
		int count=1;
		Node head = p;
		while(!((p.next.e == head.e) && (p.next.next == head.next))){
			count++;
			p = p.next;
		}
		return count;
	}
}
