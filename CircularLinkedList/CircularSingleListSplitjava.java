package CircularLinkedList;

import CircularLinkedList.CircularLinkedListSplit.Node;

public class CircularSingleListSplitjava
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
	void split()
	   {Node head2=null;
	     if(head==null)
	     {
	    	 System.out.println("Empty list");
	    	 return;
	     }
	     Node ptr=head;
	     int size=0;
	    do
	     {
	    	 ptr=ptr.next;
	    	 size++;
	     }while(ptr!=head);
	     int c=0;
	     if(size%2==1)
	    	 c=(size/2)+1;
	     else
	    	 c=(size/2);
	     while(c>1)
	     {
	    	 ptr=ptr.next;
	    	 c--;
	     }
	     head2=ptr.next;
	     ptr.next=head;
	     ptr=head2;
	     while(ptr.next!=head)
	     {
	    	 ptr=ptr.next;
	     }
	     ptr.next=head2;
	     display(head);
	     System.out.println();
	     display(head2);
		   
	   }
		
	
	void splitLessComplexity()
	{  
		Node fast=head,slow=head,head2=null;
		if(head==null)
			return;
		//if number of nodes are odd then fast.next==head else if no of 
		//node are even then fast.next.next==head
		while(fast.next!=head&&fast.next.next!=head)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		if(fast.next.next==head)
		{
			fast=fast.next;
		}
		
		if(head.next!=head)
		{
		head2=slow.next;	
		}
		slow.next=head;
		fast.next=head2;
		display(head);
		System.out.println();
		display(head2);
		
	}
	boolean checkCircularLinkedList()
	{ Node ptr=head;
	  if(head==null)
		  return true;
		while(ptr!=null)
		{
			if(ptr==head)
				return true;
			ptr=ptr.next;
		}
		return false;
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
		CircularSingleListSplitjava c1=new CircularSingleListSplitjava();
		c1.push(70);
		c1.push(60);
		
		c1.push(50);
		c1.push(40);
		c1.push(30);
		c1.push(20);
		c1.push(10);
		c1.display(c1.head);
		System.out.println();
		//c1.split();
		//c1.splitLessComplexity();
		
		boolean result=c1.checkCircularLinkedList();
		System.out.println(result);
		//c1.insertAtEnd(c1.head, 150);
		
	}

}
