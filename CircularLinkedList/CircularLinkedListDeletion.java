package CircularLinkedList;



public class CircularLinkedListDeletion
{
	Node head;
	public static  class Node
	{
		int data;
		Node prev;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
			prev=null;
			
		}
		public void finalize()
		{
			System.out.println("Object Destroyed");
		}
		
	}
	void push(int d)
	{  Node n=new Node(d);
	   n.next=head;
	   
		if(head==null)
		{		
			n.next=n;
			n.prev=n;
				
		}
		else
		{  Node ptr=head;
			do
			{
				ptr=ptr.next;
			}while(ptr.next!=head);
			ptr.next=n;
			n.prev=ptr;
			head.prev=n;
			
		}
		head=n;
	}
	void pop()
	{
		if(head==null)
		{
			System.out.println("Empty List");
			return;
		}
		Node ptr=head;
		while(ptr.next!=head)
		{
			ptr=ptr.next;
		}
		if(ptr==head)
		{
			head=null;
			return;
		}
		
		head=head.next;
		ptr.next=head;
		head.prev=ptr;
			
		
	}
	void deleteFromEnd()
	{
		if(head==null)
		{
			System.out.println("Empty List");
			return;
		}
		Node ptr=head;
		while(ptr.next!=head)
		{
			ptr=ptr.next;
		}
		if(head==ptr)
		{
			head=null;
			return;
		}
		ptr.prev.next=head;
		head.prev=ptr.prev;
	}
	void display(Node head)
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("List Empty");
			return;
			
		}
		do
		{
			System.out.print(temp.data+"\t");
			
			temp=temp.next;
			
		}while(temp!=head);
	}
	public static void main(String[] args)
	{
		
		CircularLinkedListDeletion d1=new CircularLinkedListDeletion();
		d1.push(50);
		d1.push(40);
		d1.push(30);
		d1.push(20);
		d1.push(10);
		d1.display(d1.head);
		//d1.pop();
		d1.deleteFromEnd();
		System.gc();
		d1.display(d1.head);
		
		
	}
}
