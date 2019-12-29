package CircularLinkedList;



public class CircularLinkedListSplit
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
		
		CircularLinkedListSplit d1=new CircularLinkedListSplit();
		d1.push(50);
		d1.push(40);
		d1.push(30);
		d1.push(20);
		d1.push(10);
		d1.display(d1.head);
		//d1.pop();
		
		
		System.out.println();
		
		
		
	}
}
