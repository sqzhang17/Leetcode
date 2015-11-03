public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        //if(head==null) return head;
        
        ListNode newHead = new ListNode(-1);
        ListNode newTail = null; 
        newHead.next = newTail;
        
        while(head!=null){
            ListNode temp = head.next; 
            newHead.next = head; 
            head.next = newTail; 
            newTail=head; 
            head = temp; 
        }
        
        return newHead.next;
    }
}