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
}