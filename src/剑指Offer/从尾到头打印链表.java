package 剑指Offer;
import java.util.*;
public class 从尾到头打印链表 {

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