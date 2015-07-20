public class Solution {
    public boolean isPalindrome(ListNode head) {
        //if the linkedlist is only one node or null
        if(head==null || head.next==null) return true;
        
        //initialize two pointer 
        ListNode runner = head;
        ListNode walker = head;
        
        while(runner.next!=null && runner.next.next !=null){
            runner=runner.next.next;
            walker=walker.next;
        }
        
        //make sure the runner is at the last node
        if(runner.next!=null){runner=runner.next;}
        
        //set the note that should begin to reverse
        ListNode curr = walker.next;
        
        //reverse the second half of the list
        while(walker.next!=runner){
            walker.next=curr.next; 
            curr.next=runner.next;
            runner.next=curr;
            curr=walker.next;
        }
        
        //compare the two halves
        while(runner!=null){
            if(runner.val!=head.val){
                return false;
            }
            runner=runner.next;
            head=head.next;
        }
        
        return true;
        
        
    }
}