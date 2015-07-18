class ListNode{
	int val;
	ListNode next;
	public ListNode(int val){
		this.val=val;
		this.next=null;
	}

	public String toString(){
		return " ["+this.val+"] ->";
	}
}

public class Solution{
	public static void main(String args[]){
		Solution s = new Solution();
		s.test1();
		s.test2();
		s.test3();
		s.test4();
	}

	//test case for linkedlist without circle for even number elements
	public void test1(){
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ListNode ln5 = new ListNode(5);
		ListNode ln6 = new ListNode(6);

		ln1.next=ln2;
		ln2.next=ln3;
		ln3.next=ln4;
		ln4.next=ln5;
		ln5.next=ln6;
		
		ListNode newHead = reverseHalfLinkedList(ln1);

		while(newHead!=null){
			System.out.print(newHead);
			newHead=newHead.next;
		}

		System.out.println();

	}

	//test case for linkedlist without circle for odd number elements
	public void test2(){
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ListNode ln5 = new ListNode(5);

		ln1.next=ln2;
		ln2.next=ln3;
		ln3.next=ln4;
		ln4.next=ln5;
		
		ListNode newHead = reverseHalfLinkedList(ln1);

		while(newHead!=null){
			System.out.print(newHead);
			newHead=newHead.next;
		}
		System.out.println();
	}


	///test case for linkedlist with circle for odd number elements
	public void test3(){
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ListNode ln5 = new ListNode(5);

		ln1.next=ln2;
		ln2.next=ln3;
		ln3.next=ln4;
		ln4.next=ln5;
		ln5.next=ln1;

		ListNode newHead = reverseHalfLinkedList(ln1);

		do{
			System.out.print(newHead);
			newHead=newHead.next;
		}while(newHead!=ln1 && newHead!=null);

		System.out.println();
	}

	//test case for linkedlist with circle for even number elements
	public void test4(){
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ListNode ln5 = new ListNode(5);
		ListNode ln6 = new ListNode(6);

		ln1.next=ln2;
		ln2.next=ln3;
		ln3.next=ln4;
		ln4.next=ln5;
		ln5.next=ln6;
		ln6.next=ln1;

		ListNode newHead = reverseHalfLinkedList(ln1);

		do{
			System.out.print(newHead);
			newHead=newHead.next;
		}while(newHead!=ln1 && newHead!=null);

		System.out.println();
	}


	//reverse linkedlist from middle
	public ListNode reverseHalfLinkedList(ListNode head){
		if(head==null) return null;

		ListNode runner = head;
		ListNode walker = head;

		while(runner.next !=head && runner.next!=null ){
			runner = runner.next;

			walker = walker.next;

			if(runner.next !=head &&runner.next!=null ){
				runner=runner.next;
			}	
		}

		ListNode prev = head;
		while(prev.next!=walker){
			prev=prev.next;
		}

		while(prev.next!=runner){
			prev.next = walker.next;
			walker.next = runner.next;
			runner.next =walker;
			walker = prev.next;
		}

		return head;
	}
} 