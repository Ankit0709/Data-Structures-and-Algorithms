package CircularLinkedList;



public class CircularDoublyLinkedList
{  Node head;
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
	 
	void insertAtEnd(int d)
	{
		Node n=new Node(d);
		if(head==null)
		{
			n.next=n;
			n.prev=n;
			head=n;
		}
		else
		{  Node ptr=head;
			while(ptr.next!=head)
			{
				ptr=ptr.next;
			}
			ptr.next=n;
			n.prev=ptr;
			n.next=head;
			head.prev=n;
		}
		
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
		CircularDoublyLinkedList c3=new CircularDoublyLinkedList();
		c3.push(30);
		c3.push(20);
		c3.push(40);
		c3.push(10);
		c3.display(c3.head);
		
		c3.insertAtEnd(50);
		System.out.println();
		c3.display(c3.head);
	}
 

}
