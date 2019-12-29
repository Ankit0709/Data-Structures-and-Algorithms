package linkedList;

import java.util.Scanner;

class LinkedListInsertAtEnd
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
  public void printlist()
  {
     Node n=head;
     while(n!=null)
     { 
    	 System.out.print(n.data1+"\t");
    	 n=n.next;
     }

 
 }
 public void insertAtEnd(Node n)
 {
	 Node temp=head;
	 while(temp.next!=null)
	 {
		 temp=temp.next;
	 }
	 temp.next=n;
 }




 public static void main(String args[])
{Scanner s=new Scanner(System.in);
 LinkedListInsertAtEnd l2=new LinkedListInsertAtEnd();
 
 Node n1=new Node(1);
 
 
 Node n2=new Node(2);
 Node n3=new Node(3);
 Node n4=new Node(4);
 Node n5=new Node(5);
 Node n6=new Node(6);
 Node n7=new Node(7);
 
 l2.head=n1;
 n1.next=n2;
 n2.next=n3;
 n3.next=n4;
 n4.next=n5;
 n5.next=n6;
 n6.next=n7;
 System.out.println("Linked List is ");
 l2.printlist();
 System.out.println("\n"+l2.head.hashCode());
 System.out.println(n1.hashCode());
 //insert a node  at beginning
 
 Node n=new Node();
 System.out.println("\nEnter  data for the node:");
 int data=s.nextInt();
 n.data1=data;
 n.next=null;
 l2.insertAtEnd(n);
 
 
 
 System.out.println("Linked List is ");
 l2.printlist();
 System.out.println("\n"+l2.head.hashCode());
 System.out.println(n1.hashCode());
 
}

}
