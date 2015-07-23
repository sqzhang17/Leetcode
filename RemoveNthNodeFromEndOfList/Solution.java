public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        
        ListNode prevHead = new ListNode(0);
        prevHead.next = head; 
        
        ListNode tail=head;
        ListNode prevRemove=prevHead;
        
        for(int i=1;i<n;i++){
            tail=tail.next;
        }
        
        while(tail.next!=null){
            tail=tail.next;
            prevRemove=prevRemove.next;
        }
        
        prevRemove.next=prevRemove.next.next;
        
        return prevHead.next;
    }
}