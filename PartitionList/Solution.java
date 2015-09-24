public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyHead = new ListNode(-1); 
        dummyHead.next = head; 

        ListNode firstPtr = dummyHead;
        ListNode secondPtr = dummyHead;

        while(head!=null){
            if(firstPtr==secondPtr && head.val<x){
                firstPtr=firstPtr.next;
                secondPtr=secondPtr.next;
                head=head.next;
            }else if(firstPtr==secondPtr && head.val>=x){
                secondPtr=secondPtr.next;
                head=head.next;
            }else if(head.val<x){
        		ListNode temp = head;
        		head = head.next;

        		ListNode firstHalfTemp = firstPtr.next;
        		firstPtr.next=temp;
        		temp.next=firstHalfTemp;

        		secondPtr.next=head;
        		firstPtr=firstPtr.next;
        	}else{
        		head=head.next;
        		secondPtr=secondPtr.next;
        	}
        	
        }

        return dummyHead.next; 
    }

    public ListNode partition_v2(ListNode head, int x) {
	    ListNode dummy1 = new ListNode(0), dummy2 = new ListNode(0);  //dummy heads of the 1st and 2nd queues
	    ListNode curr1 = dummy1, curr2 = dummy2;      //current tails of the two queues;
	    while (head!=null){
	        if (head.val<x) {
	            curr1.next = head;
	            curr1 = head;
	        }else {
	            curr2.next = head;
	            curr2 = head;
	        }
	        head = head.next;
	    }
	    curr2.next = null;          //important! avoid cycle in linked list. otherwise u will get TLE.
	    curr1.next = dummy2.next;
	    return dummy1.next;
	}
}