public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prevHead = new ListNode(0);//set dummy node
        ListNode pos = prevHead;//set position node to insert the node 
        
        ListNode temp=null; // set temporary node for the new linkedlist node
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                temp = new ListNode(l1.val);
                l1=l1.next;
            }else{
                temp = new ListNode(l2.val);
                l2=l2.next;
            }
            pos.next = temp; 
            pos=temp;
        }//end while loop
        
        while(l1!=null){//clean l1 left if necessary
            temp=new ListNode(l1.val);
            pos.next=temp;
            pos=temp;
            l1=l1.next;
        }
        
        while(l2!=null){//clean l2 left if necessary
            temp=new ListNode(l2.val);
            pos.next=temp;
            pos=temp;
            l2=l2.next;
        }
        
        //return the next node from the dummy node
        return prevHead.next;
        
    }
}