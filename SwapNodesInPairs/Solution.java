public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next=head;

        ListNode pointer = dummyHead;
        
        while(pointer.next!=null && pointer.next.next!=null){
        	ListNode temp = pointer.next;

        	pointer.next=temp.next;
        	temp.next=pointer.next.next;
        	pointer.next.next=temp;

        	pointer=temp;
        }

        return dummyHead.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}