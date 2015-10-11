public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        
        ListNode curr = head.next; 
        ListNode prev = head;
        while(curr!=null){
            if(curr.val==prev.val){
                curr=curr.next;
                prev.next=curr;
            }else{
                prev=prev.next;
                curr=curr.next;
            }
        }
        
        return head;
    }
}