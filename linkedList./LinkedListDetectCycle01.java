package linkedList;

import java.util.HashSet;
import java.util.Scanner;

import linkedList.LinkedListDetectLoop.Node;

class LinkedListDetectCycle01
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
  int detectLoopLength(Node head)
	 {	 int length=1;
		 Node fast_p=head;
		 Node slow_p=head;
		 while(fast_p!=null && slow_p!=null&&fast_p.next!=null)
		 {	 fast_p=fast_p.next.next;
		     slow_p=slow_p.next;
			 if(fast_p==slow_p)
				 break;
			 
		 }
		 slow_p=slow_p.next;
		 while(slow_p!=fast_p)
		 {
			 length++;
			 slow_p=slow_p.next;
		 }
		 return length;
		 
	 }
 
 



 public static void main(String args[])
{Scanner s=new Scanner(System.in);
LinkedListDetectCycle01 l1=new LinkedListDetectCycle01();
 
 Node n1=new Node(1);
 
 
 Node n2=new Node(2);
 Node n3=new Node(3);
 Node n4=new Node(4);
 Node n5=new Node(5);
 Node n6=new Node(6);
 Node n7=new Node(7);
 
 l1.head=n1;
 n1.next=n2;
 n2.next=n3;
 n3.next=n4;
 n4.next=n5;
 n5.next=n6;
 n6.next=n2;

 int l=l1.detectLoopLength(l1.head);
 System.out.println(l);
}

}
