package linkedList;

import java.util.Scanner;

public class LinkedListSearching {
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
	
	void reverse()
	{
		Node prev=null;
		Node curr=head;
		Node next=null;
		
		if(head==null)
		{
			System.out.println("Linked List Empty");
			return ;
		}
		else
		{
			while(curr!=null)
			{
				next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
			}
			head=prev;
		}
	}
	
	boolean searchRecursion(Node head,int element)
	{
		if(head==null)
			return false;
		if(head.data==element)
			return true;
		else
			return searchRecursion(head.next, element);
		
	}
	boolean search(int element)
	{
		Node temp=head;
		
		
			while(temp!=null)
			{	if(temp.data==element)
				return true;
				temp=temp.next;
					
				
			}
			return false;
		}
	
	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"\t");
			temp=temp.next;
		}
	}
		
	
	public static void main(String[] args) {
	LinkedListSearching l1=new LinkedListSearching();
	l1.push(30);
	l1.push(20);
	l1.push(10);
	l1.push(50);
	l1.push(60);
	int l=0;
	Scanner s=new Scanner(System.in);
	int data=s.nextInt();
	boolean result=l1.searchRecursion(l1.head,data);
	
	
	if(result==false)
	{
		System.out.println("Element not found");
	}
	else
	{
		System.out.println("Element found");
	}
	//Reversing Linked List
		l1.display();
		System.out.println("\nReverse Linked List:");
		l1.reverse();
		l1.display();
		
}
	
}
