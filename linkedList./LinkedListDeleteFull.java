package linkedList;

import java.util.Scanner;

import linkedList.LinkedList.Node;

public class LinkedListDeleteFull
{
Node head;
 static class Node
   {
	 int data;
	 Node next;
	 Node(int d)
		{data=d;
		next=null;
		}
	  public void finalize()
	 {
		System.out.println("Object Destroyed"); 
	 }
	}
 void push(int newdata)
 {
	 
	 	Node n=new Node(newdata);
	 	n.next=head;
	 	head=n;
	 
 }

void deleteFirst()
{
	Node temp=head.next;
	head.next=null;
	head=temp;
}

void deleteLast()
{
	Node temp=head;
	Node temp2=null;
	while(temp.next!=null)
	{   temp2=temp;
		temp=temp.next;
		
	}
	temp2.next=null;
	temp=null;
	
}
void deleteNodeGivenValue(int data)
{
	Node temp=head;
	if(temp.data!=data)
	{
		
	
	Node temp2=null;
	while(temp.data!=data)
	{temp2=temp;
	temp=temp.next;
		
	}
   temp2.next=temp.next;
   temp.next=null;
   temp=null;
	}
	else
	{
		head=temp.next;
		temp.next=null;
		temp=null;
	}
	
}
void display()
{
	Node temp=head;
	if(head!=null)
	{
		while(temp!=null)
		{
			System.out.println(temp.data+"\t");
			temp=temp.next;
		}	
	}
	else
	{
		System.out.println("Linked list empty");
	}
		
	
}

public static void main(String args[])
{	Scanner s=new Scanner(System.in);
	LinkedListFirstNodeDelete l1=new LinkedListFirstNodeDelete();
	l1.push(40);
	l1.push(30);
	l1.push(20);
	l1.push(10);
	
	l1.display();
	//to prove head points to first element
	
	
	l1.head=null;
	l1.display();
	
	//to prove head points to first element

	
	
	System.gc();

}

}
