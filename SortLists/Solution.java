
 //Definition for singly-linked list.
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode sortList(ListNode head) {
     if(head==null || head.next==null) return head;

     ListNode f = head;
     ListNode s = head; 

     while(f.next!=null && f.next.next!=null){
     	f=f.next.next;
     	s=s.next;
     }   

     ListNode shead = s.next; 

     s.next=null;

     head = sortList(head);
     shead = sortList(shead);

     return mergeTwoLists(head, shead);


    }

    private ListNode mergeTwoLists(ListNode ln1, ListNode ln2){
    	if(ln1==null) return ln2;
    	if(ln2==null) return ln1;

    	ListNode newHeadPrev = new ListNode(0);
    	newHeadPrev.next = ln1.val>ln2.val? ln2:ln1;

    	ListNode pointer = newHeadPrev;
    	while(ln1!=null && ln2!=null){
    		if(ln1.val>ln2.val){
    			pointer.next=ln2;
    			pointer=pointer.next;
    			ln2=ln2.next;
    		}else{
    			pointer.next=ln1;
    			pointer=pointer.next;
    			ln1=ln1.next;
    		}
    	}

    	if(ln1!=null) pointer.next=ln1;
    	if(ln2!=null) pointer.next=ln2;

    	return newHeadPrev.next;
    }
    }

    public static void main(String[] args){
    	Solution s = new Solution();
    	s.test1();
    }

}