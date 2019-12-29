package DoublyLinkedList;

import DoublyLinkedList.DoublyLinkedList.Node;

public class DeletionAtSpecificPosition
{
	Node head=null;
	static class Node
	{
		Node prev;
		int data;
		Node next;
		
		Node(int d)
		{
			prev=null;
			next=null;
			data=d;
			
		}
		
	}
	
	void push(int data)
	{
		Node n1=new Node(data);
		
		n1.next=head;
		if(head!=null)
			head.prev=n1;
		head=n1;
		
		System.out.println(n1.hashCode()+"  : "+n1.data);
	}
	
	void display(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+"\t");
			head=head.next;
		}
	}
	public void deleteSpecificPosition(int i) {
		
		Node ptr=head;
		while(i>1)
		{
			ptr=ptr.next;
			i--;
		}
		ptr.prev.next=ptr.next;
		ptr.next.prev=ptr.prev;
			
		
	}
	public static void main(String[] args) {
		DeletionAtSpecificPosition d1=new DeletionAtSpecificPosition();
		d1.push(50);
		d1.push(40);
		d1.push(30);
		d1.push(20);
		d1.display(d1.head);
		System.out.println();
		
		d1.deleteSpecificPosition(2);
		
		
		d1.display(d1.head);
		
		
	}
	

}
