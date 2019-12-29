package linkedList;

import java.util.Scanner;

import linkedList.LinkedListFirstNodeDelete.Node;

class LinkedListInsertAfterGivenValue
{
  Node head;
  
  static class Node
  { int data1;
    
    Node next;
 	
    Node(int d)
	{data1=d;
	 next=null;
	 
	}
    public Node() {
		// TODO Auto-generated constructor stub
	}
   }
  void push(int newdata)
  {
 	 Node n=new Node(newdata);
 	 if(head==null)
 	 {
 		 head=n;
 		 
 	 }
 	 else
 	 {
 		 n.next=head;
 		 head=n;
 	 }
 	 
  }
  public void printlist()
  {
     Node n=head;
     while(n!=null)
     { 
    	 System.out.print(n.data1+"\t");
    	 n=n.next;
     }

 
 }
 public void insert(Node n,int element)
 {
	 Node temp=head;
	 while(temp.data1!=element)
	 {
		 temp=temp.next;
	 }
	 n.next=temp.next;
	 temp.next=n;
 }




 public static void main(String args[])
{Scanner s=new Scanner(System.in);
 LinkedListInsertAfterGivenValue l2=new LinkedListInsertAfterGivenValue();
 
 
 
 l2.push(10);
 l2.push(20);
 l2.push(30);
 l2.push(40);
 System.out.println("Linked List is ");
 l2.printlist();
 
 //to prove head points to first element
 System.out.println("\n"+l2.head.hashCode());

 //insert a node  at beginning
 
 Node n=new Node();
 System.out.println("\nEnter  data for the node:");
 int data=s.nextInt();
 n.data1=data;
 n.next=null;
 System.out.println("Enter the data to search");
 int element=s.nextInt();
 l2.insert(n,element);
 
 
 
 System.out.println("Linked List is ");
 l2.printlist();
 
//to prove head points to first element
 System.out.println("\n"+l2.head.hashCode());
 
 
}

}
