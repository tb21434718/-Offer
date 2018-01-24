package 剑指Offer;

public class 链表中倒数第k个节点 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ListNode n=null;
	}
	
	public ListNode FindKthToTail(ListNode head,int k) {
		if(head==null||k<1)
			return null;
		ListNode pre=head;
		int temp=k;
		int count=0;//记录的是链表长度
		while(head!=null)//先让head往前，到遍历了k个后，pre开始
		{
			head=head.next;
			count++;
			if(k<1)
				pre=pre.next;
			k--;
		}
		if(count<temp)
			return null;
		return pre;

    }
	class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}

}
