package ��ָOffer;

public class �����е�����k���ڵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ListNode n=null;
	}
	
	public ListNode FindKthToTail(ListNode head,int k) {
		if(head==null||k<1)
			return null;
		ListNode pre=head;
		int temp=k;
		int count=0;//��¼����������
		while(head!=null)//����head��ǰ����������k����pre��ʼ
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
