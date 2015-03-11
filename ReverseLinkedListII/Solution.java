import java.util.*;
public class Solution {
	public static void main(String[] args){
		ListNode a1=new ListNode(1);
		ListNode a2=new ListNode(2);
		ListNode a3=new ListNode(3);
		ListNode a4=new ListNode(4);
		ListNode a5=new ListNode(5);
		ListNode a6=new ListNode(6);

		a1.next=a2;
		a2.next=a3;
		//a3.next=a4;
		//a4.next=a5;
		//a5.next=a6;

		ListNode res=reverseBetween(a1,1,3);

		System.out.println(res);


	}

    public static ListNode reverseBetween(ListNode head, int m, int n) {
    	if(head==null || head.next==null) return head;

    	ListNode prev=new ListNode(0);
    	prev.next=head;

    	ListNode prevNewHead=prev;

    	for(int i=1;i<m;i++){
    		prev=prev.next;
    	}

    	ListNode mth=prev.next;

    	ListNode nth=mth;
    	for(int i=1;i<=(n-m);i++){
    		nth=nth.next;
    	}

    	while(prev.next!=nth){
    		prev.next=mth.next;
    		mth.next=nth.next;
    		nth.next=mth;
    		mth=prev.next;
    	}

    	return prevNewHead.next;
    }
}

 //Definition for singly-linked list.
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }

    public String toString(){
    	return Integer.toString(val);
    }
}