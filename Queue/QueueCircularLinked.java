package queue;
 class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data=d;
	}
}
 
public class QueueCircularLinked 
{ Node front=null,rear=null;
	
	public void enqueue(int d)
	{
		Node n=new Node(d);
		if(rear==null)
		{
			front=rear=n;
			n.next=n;
		}
		else
		{
			rear.next=n;
			n.next=front;
			rear=n;
		}
	}

}
