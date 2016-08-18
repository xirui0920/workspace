package biji.jianzhiOffer;
/*
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class Main3 {
	public static void main(String[] args) {
	
		
	}
	
	public ListNode deleteDuplication(ListNode pHead)
    {
		ListNode temp = pHead;
		ListNode pre = pHead;
		int val;
		while(temp != null){
			val = temp.val;
			if (val == temp.next.val) {
				pre.next = temp.next.next;
			}else {
				pre = temp;
				temp = temp.next;
			}
			
		}	
		return pHead;
    }
	
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
}
