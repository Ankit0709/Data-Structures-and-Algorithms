package linkedList;

public class LinkedListLength {
	Node head;
	static class Node
	{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	void push(int data)
	{
		Node n=new Node(data);
		n.next=head;
		head=n;
	}

	int findLength(Node head,int l)
	{	
		if(head==null)
			return l;
		else
		{
			l++;
			return findLength(head.next,l);
		}
	}
	void checkPalindrome(Node head,int l)
	{
		int middle=l/2;
		
	}
	public static void main(String[] args) {
	LinkedListLength l1=new LinkedListLength();
	l1.push(1);
	l1.push(2);
	l1.push(3);
	l1.push(2);
	l1.push(1);
	
	
	int l=0;
	int length=l1.findLength(l1.head,l);
	l1.checkPalindrome(l1.head,length);
	
}
	
}
