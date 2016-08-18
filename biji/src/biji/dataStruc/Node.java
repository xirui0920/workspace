package biji.dataStruc;


/*
 * 节点
 */
public class Node {
	Node last;
	int e;
	Node next;
	
	Node(){}
	
	Node(int e){
		this.e = e;
	}
	
	Node(Node last,int e,Node next){
		this.last = last;
		this.e = e;
		this.next = next;
	}


	
}
