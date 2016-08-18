package biji.dataStruc;
/*
 * 约瑟夫问题
 * 循环链表
 */
public class Josephus {
		
	public static void main(String[] args) {
		Josephus j = new Josephus();
		j.josephus(9, 5);
	}
	
	public void josephus(int N,int M){
		//创建1-N的循环列表
		Node p = MkList.getLoopList(N);
		//每数M个踢出一个节点知道剩一个节点
//		System.out.println(p.e);
		while(p != p.next){
			for (int j = 1; j < M; j++) {
				p = p.next;
			}
			p.next = p.next.next;
			N--;
		}
		System.out.println(p.e);
	}
	
	
}
