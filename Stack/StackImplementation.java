package Stack;

public class StackImplementation 
{ Node TOP=null;
	public  static class Node
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
		if(TOP==null)
		{
			TOP=n;
			return;
		}
		
		n.next=TOP;
		TOP=n;
		
	}
	boolean isEmpty()
	{
		return TOP==null?true:false;
	}
	int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Empty");
			return -1;
		}
		else
		{
			int data=TOP.data;
			TOP=TOP.next;
			return data;
		}
		
	}
	void display()
	{
		Node ptr=TOP;
		if(isEmpty())
		{
			System.out.println("Stack Empty");
			return ;
		}
		while(ptr!=null)
		{
			System.out.print(ptr.data+"\t");
			ptr=ptr.next;
		}
		
	}
	public static void main(String[] args) 
	{ StackImplementation s1=new StackImplementation();
	s1.push(10);
	s1.push(20);
	s1.push(30);
	s1.display();
	System.out.println("Deleted data:"+s1.pop());
	s1.display();
		
	}
	 

}
