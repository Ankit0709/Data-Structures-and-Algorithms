package linkedList;

public class LinkedList03 {
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
	int findLength()
	{	Node temp=head;
		int length=0;
		if(temp==null)
		return 0;
		else
		{
			while(temp!=null)
			{length++;
			temp=temp.next;
				
			}
			return length;
		}
		
	}
	
	public static void main(String[] args) {
	LinkedList03 l1=new LinkedList03();
	l1.push(30);
	l1.push(20);
	l1.push(10);
	l1.push(50);
	l1.push(60);
	
	int length=l1.findLength();
	System.out.println("Length of Linked List:  "+length);
}
	
}
