public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHeadDummy = new ListNode(-1);
        ListNode tempTail = newHeadDummy;
        
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                ListNode temp = l1.next;
                tempTail.next = l1;
                l1.next = null;
                tempTail = l1;
                l1=temp;
            }else{
                ListNode temp = l2.next;
                tempTail.next = l2;
                l2.next = null;
                tempTail = l2;
                l2=temp;
            }
        }
        
        if(l1==null) {
            tempTail.next = l2; 
        }else{
            tempTail.next=l1;
        }
        
        return newHeadDummy.next;
    }
}