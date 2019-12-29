package linkedList;

public class LinkedListDetectLoop
{	Node head;
 	 static class Node
	 {
		 int data;
		 Node next;
		 Node(int d)
		 {data=d;
		 next=null;
		 }
		 
		 public void finalize()
		 {
			 System.out.println("object Destroyed");
		 }
	 }
 	 void push(int data)
 	 {
 		 Node n=new Node(data);
 		 n.next=head;
 		 head=n;
 	 }
 	 
 	 boolean detectLoop(Node head)
 	 {
 		 Node fast_p=head;
 		 Node slow_p=head;
 		 while(fast_p!=null && slow_p!=null&&fast_p.next!=null)
 		 {	 fast_p=fast_p.next.next;
 		     slow_p=slow_p.next;
 			 if(fast_p==slow_p)
 				 return true;
 			 
 		 }
 		 return false;
 	 }
 	 public static void main(String[] args)
 	 {
 		 LinkedListDetectLoop l1=new LinkedListDetectLoop();
 		 l1.push(10);
 		 l1.push(10);
 		 l1.push(10);
 		l1.push(10);
 		boolean result= l1.detectLoop(l1.head);
 		 if(result==true)
 		 {
 			 System.out.println("Cycle ocuurs");
 		 }
 		 else
 			 System.out.println("No cycle ");
 		 
 		 
		
	}
	
}
