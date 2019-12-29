package queue;

public class QueueLinkedList
{ Node front=null,rear=null;
	public class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
		}
		
	}
	public void enqueue(int d)
	{  Node n=new Node(d);
		if(rear==null)
		{
			front=rear=n;
		}
		else
		{
			rear.next=n;
			rear=n;
		}
		
	}
	public void dequeue() 
	{
		if(front==null)
		{
			System.out.println("Queue Empty");
			return;
		}
		System.out.println("Node deleted"+front.data);
		if(front==rear)
		{
			front=rear=null;
		}
		else
		{
			front=front.next;
		}
		
	}
	public void display()
	{
		if(front==null)
		{
			System.out.println("Queue Empty");
			return;
		}
		Node ptr=front;
		while(ptr!=null)
		{
			System.out.println("Node Element: "+ptr.data);
			ptr=ptr.next;
		}
	}
	

}
