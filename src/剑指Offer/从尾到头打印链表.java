package ��ָOffer;
import java.util.*;
public class ��β��ͷ��ӡ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 ArrayList<Integer> arrayList=new ArrayList<Integer>();
	    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	        if(listNode!=null){
	            this.printListFromTailToHead(listNode.next);
	            arrayList.add(listNode.val);
	        }
	        return arrayList;
	    }

}




class ListNode {
        int val;
       ListNode next = null;

      ListNode(int val) {
           this.val = val;
       }
    }