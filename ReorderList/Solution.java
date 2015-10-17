import java.util.*;

public class Solution {
    public void reorderList(ListNode head) {
    	if(head==null || head.next==null) return head;

    	Stack<ListNode> stack = new Stack<ListNode>();

    	ListNode fast = head; 
    	ListNode slow = head;

    	while(fast.next!=null && fast.next.next!=null){
    		fast=fast.next.next;
    		slow=slow.next;
    	}  

    	ListNode secHead = slow.next;
    	slow.next=null;

    	while(secHead!=null){
    		stack.push(secHead)
    		secHead=secHead.next;
    	}

    	ListNode runner = head;
    	while(stack.size()!=0){
    		ListNode temp = stack.pop();
    		ListNode tempNext = runner.next
    		runner.next=temp;
    		temp.next=tempNext;

    		runner=runner.next.next;
    	}
    }
}