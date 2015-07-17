
//Definition for ListNode.
public class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
 
public class Solution {
    /**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        ListNode newTail = null; 
        if(head == null) return newTail;
        
        ListNode currNext = null;
        ListNode curr = head;
        
        while(curr!=null){
            currNext = curr.next;
            curr.next=newTail;
            newTail=curr;
            curr=currNext;
        }
        
        return newTail;
    }
}