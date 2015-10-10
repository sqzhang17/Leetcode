public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
    	if(head==null || head.next==null) return head;

    	ListNode dummy = new ListNode(-1);
    	dummy.next=head;

        ListNode runner = head;
        ListNode secStart = head; 
        ListNode prevSecStart = dummy; 

        int cnt=0;
        while(runner!=null){
        	cnt++;
        	runner=runner.next;
        }

		if(k>=cnt) k%=cnt;
        
        if(k==0) return head;
        
        runner=dummy;

        for(int i=0; i<k; i++){
        	runner=runner.next;
        }

        while(runner.next!=null){
        	runner=runner.next;
        	secStart=secStart.next;
        	prevSecStart=prevSecStart.next;
        }

        prevSecStart.next=null;
        dummy.next=secStart;
        runner.next=head;

        return dummy.next;
    }
}