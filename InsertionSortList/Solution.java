public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);

        ListNode ptr = dummy;
        ListNode curr = head;
        while(curr!=null){
        	//find the right spot to insert
        	while(ptr.next !=null && ptr.next.val<curr.val){
        		ptr=ptr.next;
        	}

        	//insert the curr node
        	ListNode temp1 = curr.next;
        	ListNode temp2 = ptr.next;
        	ptr.next=curr;
        	curr.next=temp2;
        	curr=temp1;
        	
        	//update ptr node
        	ptr=dummy;
        }

        return dummy.next;
    }
}