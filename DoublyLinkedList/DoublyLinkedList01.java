package DoublyLinkedList;

import DoublyLinkedList.DoublyLinkedList.Node;

public class DoublyLinkedList01 
{
	Node head;
	static class Node
	{
		Node prev;
		int data;
		Node next;
		
		Node(int d)
		{	prev=null;
			data=d;
			next=null;
		}
		
	}
	
	//push function to push the elements in the doubly linked list
	void push(int data)
	{
		Node n1=new Node(data);
		
		n1.next=head;
		if(head!=null)
		head.prev=n1;
		head=n1;
		
		
	}
	void insertBeforeGivenNode(Node next,int data)
	{	//allocates  memory to the node 
		Node n1=new Node(data);
		
		//checking if next is null
		if(next==null)
		{
			System.out.println("Next cannot be null");
			return ;
		}
		
		n1.prev=next.prev;
		
		next.prev=n1;
		
		n1.next=n1.prev.next;
		
		n1.prev.next=n1;
		
	}
	
	//Function To display the Doubly Linked List
	void display()
	{ Node temp=head;
		if(head==null)
		{
			System.out.println("Doubly Linked List Empty");
			return;
		}
		while(temp!=null)
		{
			System.out.print(temp.data+"\t");
			temp=temp.next;
		}
	}
	
	
	public static void main(String[] args)
	{
		DoublyLinkedList01 d1=new DoublyLinkedList01();
		d1.push(10);
		d1.push(20);
		d1.push(30);
		d1.push(40);
		d1.push(50);
		
		System.out.println("Doubly linked list before:");
		d1.display();
		System.out.println("\nDoubly linked list after:");
		d1.insertBeforeGivenNode(d1.head.next.next,200);
		
		d1.display();
		
		
		
	}

}
