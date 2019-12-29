package CircularLinkedList;



public class CircularListDeletion 
{    Node head;
	 public static class Node
	 {  int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
		public void finalize()
		{
			System.out.println("Object Destroyed");
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
	 void pop()
	 {  Node ptr=head;
		 if(head==null)
		 {
			 System.out.println("List Empty");
			 return;
		 }
		while(ptr.next!=head)
		{
			ptr=ptr.next;
			
		}
		if(ptr==head)
			{head=null;
			return;
			}
		ptr.next=head.next;
		head=head.next;
			 
		 
	 }
	 void deleteFromEnd()
	 {
		 Node ptr=head;
		 if(head==null)
		 {
			 System.out.println("List Empty");
			 return;
		 }
		 Node ptr2=ptr;
		 do
		 {   ptr2=ptr;
			 ptr=ptr.next;
		 }while(ptr.next!=head);
		 
		 if(ptr==head)
		 {
			 head=null;
			 return;
		 }
		 ptr2.next=head;
		 
		 
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
		 
		 CircularListDeletion c2=new CircularListDeletion();
		 c2.push(50);
		 c2.push(40);
		 c2.push(30);
		 c2.push(20);
		 c2.push(10);
		 c2.display(c2.head);
		 //c2.pop();
		 c2.deleteFromEnd();
		 System.gc();
		 
		 c2.display(c2.head);
		
	}
		
	 
}
