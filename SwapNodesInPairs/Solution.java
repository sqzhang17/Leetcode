/*
Key point:
	1.	use dummy head to track the new head of swaped list
	2.	use pointer to track the position to insert
	3.	visit each listnode and swap in pair 
*/

public class Solution {
    public ListNode swapPairs(ListNode head) {
        //dummy node before the head
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next=head;

        //keep track of the last position to insert
        ListNode pointer = dummyHead;
        
        //loop every two node and swap 
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