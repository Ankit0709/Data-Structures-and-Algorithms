package linkedList;

import java.util.Scanner;

public class LinkedListIndexValue {
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
		
	int getValueRecursive(Node head,int index,int count)
	{
		if(head==null)
			return -1;
		if(count==index)
			return head.data;
		else
		{
		
			head=head.next;
			return getValueRecursive(head, index, count+1);
		}
		
	}
	
	int getValue(int index)
	{ 
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			if(count==index)
			{
				return temp.data;
			}
			temp=temp.next;
			count++;
		}
		assert(false);
		return -1;

	}
	public static void main(String[] args) {
	LinkedListIndexValue l1=new LinkedListIndexValue();
	l1.push(30);
	l1.push(20);
	l1.push(10);
	l1.push(50);
	l1.push(60);
	
	Scanner s=new Scanner(System.in);
	int index=s.nextInt();
	System.out.println(l1.head.hashCode());
	//int data=l1.getValue(index);
	int count=0;
	int data=l1.getValueRecursive(l1.head, index, count);
	
	System.out.println(data);
	System.out.println(l1.head.hashCode());
	
}
	
}
