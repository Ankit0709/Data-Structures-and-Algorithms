package CircularLinkedList;

import java.util.Scanner;

public class CircularSingleList
{   Node head=null;
	public static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	void push(int d)
	{
		Node n=new Node(d);
		Node temp=head;
		n.next=head;
		if(head==null)
		{
			n.next=n;
		}
		else
		{
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			
			temp.next=n;
		}
		
		head=n;
		
	}
	void insertAtEnd(Node head,int d)
	{   Node n=new Node(d);
		Node temp=head;
		if(temp!=null)
		{
			do
			{
				temp=temp.next;
			}while(temp.next!=head);
			
			temp.next=n;
			n.next=head;
		}
		else
		{
			head=n;
			n.next=n;
		}
		
		display(head);
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
	void checkSafeNode(int m,int size)
	{ 
	  Node ptr=head;
		if(head==null)
			return;
		if(size==1)
	 		System.out.println(head.data);
	   Node ptr2=head;
		while(size>1)
		{ 	int c=1;
			while(c!=m)
			{ptr2=ptr;
			ptr=ptr.next;
			c++;
				
			}
			ptr2.next=ptr.next;
			ptr=ptr2.next;
			size--;
			
		}
		System.out.println("Last person left "+ptr.data);
			
		
	}
	
	public static void main(String[] args)
	{
//		CircularSingleList c1=new CircularSingleList();
//		c1.push(50);
//		c1.push(40);
//		c1.push(30);
//		c1.push(20);
//		c1.push(10);
//		c1.display(c1.head);
		
		//c1.insertAtEnd(c1.head, 150);
		
		Scanner s=new Scanner(System.in);
		CircularSingleList c1=new CircularSingleList();
		System.out.println("Enter the number of nodes");
		int n=s.nextInt();
		System.out.println("Enter mth node to be deleted");
		int m=s.nextInt();
		for(int i=n;i>=1;i--)
			c1.push(i);
		c1.display(c1.head);
		
		//c1.checkSafeNode(m,n);
		
		
	}

}
