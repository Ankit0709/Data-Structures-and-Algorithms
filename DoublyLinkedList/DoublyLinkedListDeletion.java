package DoublyLinkedList;

import DoublyLinkedList.DoublyLinkedList.Node;

public class DoublyLinkedListDeletion 
{   Node head;
	static class Node
	{
		Node prev;
		int data;
		Node next;
		
		Node(int d)
		{ 	prev=null;
			data=d;
			next=null;
		}
		protected void finalize()
		{
			System.out.println("Object Destroyed");
		}
	}
	void push(int data)
	{
		Node n1=new Node(data);
		
		n1.next=head;
		if(head!=null)
			head.prev=n1;
		head=n1;
				
	}
	void pop()
	{  
		if(head==null)
		{
			System.out.println("Doubly Linked List Empty");
			return ;
		}
		 System.out.println("Node that is being deleted: "+head.data);
		head=head.next;
		head.prev=null;
		
	}
	
	void deleteMiddleNode(Node del)
	{
		if(head==null)
		{
			System.out.println("Doubly Linked List Empty");
			return ;
		}
		System.out.println("Data of deleted node: "+del.data);
		del.prev.next=del.next;
		del.next.prev=del.prev;
		del.prev=del.next=null;
		
	}
	void deleteLastNode()
	{
		if(head==null)
		{
			System.out.println("Doubly Linked List Empty");
			return ;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		System.out.println("Data of deleted node: "+temp.data);
		temp.prev.next=null;
		temp.prev=null;
		
		
	}
	void display()
	{   Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"\t");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		DoublyLinkedListDeletion d1=new DoublyLinkedListDeletion();
		d1.push(50);
		d1.push(40);
		d1.push(30);
		d1.push(20);
		d1.push(10);
		d1.display();
	//	d1.pop();
//		d1.deleteMiddleNode(d1.head.next.next);
		d1.deleteLastNode();
		System.gc();
		d1.display();
		
	}

}
