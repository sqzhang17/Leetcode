public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
       if(head==null) return null; 
        if (head.next == null) return new TreeNode(head.val); 

        ListNode slow = head;
	    ListNode fast = head;
	    ListNode temp=null;

	    //find the mid node
	    while(fast.next!=null && fast.next.next!=null){
	        fast = fast.next.next;
	        temp = slow;
	        slow = slow.next;
	    }

	    if(temp!=null)
        	temp.next = null; //break the link
    	else
        	head = null;

        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);


        return root;
    }
}