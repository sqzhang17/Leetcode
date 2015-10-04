public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
		ListNode dummy = new ListNode(-1);
	    ListNode tail = dummy;
	    while (head != null) {
	        if (head.next != null && head.val == head.next.val) {
	            while (head.next != null && head.val == head.next.val)
	                head = head.next;
	        } else {
	            tail.next = head;
	            tail = tail.next;
	        }
	        head = head.next;
	    }
	    tail.next = null;
	    return dummy.next;
    }
}