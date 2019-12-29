package DoublyLinkedList;

public class DoublyLinkedList 
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
	void push(int data)
	{
		Node n1=new Node(data);
		
		n1.next=head;
		if(head!=null)
			head.prev=n1;
		head=n1;
		
		System.out.println(n1.hashCode()+"  : "+n1.data);
	}
	void insertAtEnd(int data)
	{
		Node temp=head;
		Node n1=new Node(data);
		if(head==null)
		{
			head=n1;
			return ;
		}
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=n1;
		n1.prev=temp;
	
	
		
	}
	void insertAfterGivenNode(Node prev,int data)
	{
		Node n1=new Node(data);
		if(prev==null)
		{
			System.out.println("Previous cannot be null");
			return ;
		}
		n1.next=prev.next;
		prev.next=n1;
		n1.prev=prev;
		if(n1.next!=null)
		{
			n1.next.prev=n1;
		}
		
	
		
	}
	void insertBeforeGivenNode(Node next,int data)
	{
		Node n1=new Node(data);
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
		DoublyLinkedList d1=new DoublyLinkedList();
		d1.push(10);
		d1.push(20);
		d1.push(30);
		d1.push(40);
		d1.push(50);
		d1.display();
		System.out.println(d1.head.hashCode());
		//d1.insertAtEnd(100);
		
		//d1.insertAfterGivenNode(d1.head.next.next,100);
		d1.insertBeforeGivenNode(d1.head.next.next,200);
		
		d1.display();
		System.out.println(d1.head.hashCode());
		
		
		
	}

}
